package com.comp301project.FirstThings;

import java.util.ArrayList;

import com.comp301project.Entity.WashingMachine;


public class FirstThings {

	public void doFirstThings() {
		ArrayList<Integer> wm1H=new ArrayList<Integer>();
		wm1H.add(5);
		wm1H.add(8);
		wm1H.add(12);
		wm1H.add(20);
		wm1H.add(11);
		ArrayList<Integer> wm2H=new ArrayList<Integer>();
		wm2H.add(1);
		wm2H.add(0);
		wm2H.add(2);
		wm2H.add(3);
		wm2H.add(4);
		ArrayList<Integer> wm3H=new ArrayList<Integer>();
		wm3H.add(6);
		wm3H.add(11);
		wm3H.add(13);
		wm3H.add(24);
		WashingMachine wm1=new WashingMachine(1,5,wm1H);
		WashingMachine wm2=new WashingMachine(2,10,wm2H);
		WashingMachine wm3=new WashingMachine(3,20,wm3H);
	}
}
