package com;

import com.app.colln.ArrayList;
import com.app.colln.LinkedList;
import com.app.items.ItemsManager;

public class App {
	
	public static void main(String[] args) {
		
		ItemsManager itemsManager=new ItemsManager(new ArrayList());
		itemsManager.addItem("ARRAY");
		
		
		ItemsManager itemsManager2=new ItemsManager(new LinkedList());
		itemsManager.addItem("LINKEDLIST");
		
	}

}
