package com.jsl.team.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsl.team.dto.SpaInVO;
import com.jsl.team.dto.SpaOutVO;
import com.jsl.team.service.SpaService;

@Service(value = "spaService")
public class SpaServiceImpl implements SpaService{
	@Autowired
	private SpaDAO spaDAO;
	
	@Override
	public List<SpaInVO> getSpanInList() {
		return spaDAO.getSpaInList();
	}
	@Override
	public List<SpaOutVO> getSpanOutList() {
		return spaDAO.getSpaOutList();
	}
}	
