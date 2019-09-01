package com.jsl.team.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsl.team.dto.ReserveVO;
import com.jsl.team.service.ReserveService;
import com.jsl.team.service.RoomService;


@Controller
public class RoomController {
	final static String DATE_PATTERN = "yyyy-MM-dd";
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private ReserveService reserveService;
	
	@RequestMapping("room_list.do")
	public String room_list(Model model) {
		model.addAttribute("roomList", roomService.getRoomList());
		return "rooms/room_list";
	}
	
	@RequestMapping("room_sub.do")
	public String room_sub(Model model,@RequestParam(value="r_code")int r_code, 
							@RequestParam(value="check_in", required = false)String check_in,
							@RequestParam(value="check_out", required = false)String check_out) throws ParseException {
		model.addAttribute("roomVO", roomService.getRoomSub(r_code));
		model.addAttribute("check_in", check_in);
		model.addAttribute("check_out", check_out);
		model.addAttribute("dateList", reserved_room_days(reserveService.getRoomReservedList(r_code)));
		return "rooms/room_sub";
	}
	
	public static List<String> reserved_room_days(List<ReserveVO>list) throws ParseException{
		List<String>d_list = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			String inputStartDate = String.valueOf(list.get(i).getCheck_in());
			String inputEndDate = String.valueOf(list.get(i).getCheck_out());
			SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
			Date startDate = sdf.parse(inputStartDate);
			Date endDate = sdf.parse(inputEndDate);
			Date currentDate = startDate;
			while (currentDate.compareTo(endDate) <= 0) {
				d_list.add(sdf.format(currentDate));
				Calendar c = Calendar.getInstance();
				c.setTime(currentDate);
				c.add(Calendar.DAY_OF_MONTH, 1);
				currentDate = c.getTime();
			}
		}
		return d_list;
	}
}
