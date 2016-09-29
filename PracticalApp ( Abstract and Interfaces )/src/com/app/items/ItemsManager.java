package com.app.items;

import com.app.colln.Collection;

public class ItemsManager {

	private Collection list;

	public ItemsManager(Collection list) {
		this.list = list;
	}

	public void addItem(String item) {
		// ......
		list.add(item);
	}

	// ...

}
