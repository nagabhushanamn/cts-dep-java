package com.pattern.listener;

import java.util.ArrayList;
import java.util.List;

class DoorEvent {

	private int doorNum;

	public DoorEvent(int doorNum) {
		super();
		this.doorNum = doorNum;
	}

	public int getDoorNum() {
		return doorNum;
	}

}

interface DoorListener {
	void on(DoorEvent event);

	void off(DoorEvent event);
}


class Door {

	private List<DoorListener> doorListeners = new ArrayList<>();

	public void addDoorListener(DoorListener doorListener) {
		doorListeners.add(doorListener);
	}

	public void removeDoorListener(DoorListener doorListener) {
		doorListeners.remove(doorListener);
	}

	public void open() {
		System.out.println("door opened..");
		DoorEvent event = new DoorEvent(8);
		for (DoorListener doorListener : doorListeners) {
			doorListener.on(event);
		}
	}

	public void close() {
		System.out.println("door closed...");
		DoorEvent event = new DoorEvent(8);
		for (DoorListener doorListener : doorListeners) {
			doorListener.off(event);
		}
	}

}

class Light implements DoorListener {

	public void on(DoorEvent event) {
		System.out.println("Light on...in door num - " + event.getDoorNum());
	}

	public void off(DoorEvent event) {
		System.out.println("Light off...in door num - " + event.getDoorNum());
	}

}

class AC implements DoorListener {

	public void on(DoorEvent event) {
		System.out.println("AC on...");
	}

	public void off(DoorEvent event) {
		System.out.println("AC off...");
	}

}

// listener / observer pattern
public class Pattern_Demo {

	public static void main(String[] args) throws InterruptedException {

		Door door = new Door();

		Light light = new Light();
		AC ac = new AC();

		door.addDoorListener(light);
		door.addDoorListener(ac);

		Thread.sleep(3000);
		door.open();

		Thread.sleep(3000);
		door.close();

		door.removeDoorListener(ac);
		
		Thread.sleep(3000);
		door.open();
		
		
		
	}

}
