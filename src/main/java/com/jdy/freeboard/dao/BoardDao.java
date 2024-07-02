package com.jdy.freeboard.dao;

import java.util.ArrayList;

import com.jdy.freeboard.dto.BoardDto;

public interface BoardDao {
	
	public void writeDao(String bname, String btitle, String bcontent);//글쓰기
	public ArrayList<BoardDto> listDao();	
	
}


