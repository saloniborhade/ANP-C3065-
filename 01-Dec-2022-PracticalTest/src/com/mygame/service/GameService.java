package com.mygame.service;
import com.mygame.dao.GameDAO;
public class GameService {

	public String[] getCityNamesService() {
		GameDAO daoObj=new GameDAO();
		
		String s[]=daoObj.getCityName();
		return s;
		
	}
}
