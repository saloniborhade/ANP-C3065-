package com.mygame.view;
import com.mygame.service.*;
public class GameView {
	GameService serviceObj=new GameService();
	String[] displayCityNamesWithBlanks() {
		String[] c=serviceObj.getCityNamesService();
		
		for(int i=0;i<c.length;i++) {
			char arr[]=c[i].toCharArray();
			
			for(int j=0;j<arr.length;j++) {
				arr[i]=(char)(arr.length * Math.random());
			}
		}
		return c;
		
	}

}
