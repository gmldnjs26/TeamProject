package com.jsl.team.service;

import java.util.List;

import com.jsl.team.dto.SpaInVO;
import com.jsl.team.dto.SpaOutVO;

public interface SpaService {
	public List<SpaInVO>getSpanInList();

	public List<SpaOutVO>getSpanOutList();
}
