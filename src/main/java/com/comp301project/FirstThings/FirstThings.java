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
		wm3H.add(23);
		ArrayList<Integer> wm4H=new ArrayList<Integer>();
		wm4H.add(7);
		wm4H.add(1);
		wm4H.add(15);
		wm4H.add(22);
		ArrayList<Integer> wm5H=new ArrayList<Integer>();
		wm5H.add(21);
		wm5H.add(9);
		wm5H.add(10);
		wm5H.add(11);
		wm5H.add(14);
		wm5H.add(17);
		wm5H.add(4);
		wm5H.add(6);

		ArrayList<Integer> wm6H=new ArrayList<Integer>();
		wm6H.add(8);
		
		ArrayList<Integer> wm7H=new ArrayList<Integer>();
		wm7H.add(6);
		wm7H.add(11);
		wm7H.add(13);
		wm7H.add(24);
		ArrayList<Integer> wm8H=new ArrayList<Integer>();
		wm8H.add(6);
		wm8H.add(11);
		wm8H.add(13);
		wm8H.add(24);
		
		WashingMachine wm1=new WashingMachine("1",5,wm1H);
		WashingMachine wm2=new WashingMachine("2",10,wm2H);
		WashingMachine wm3=new WashingMachine("3",20,wm3H);
		WashingMachine wm4=new WashingMachine("4",5,wm4H);
		WashingMachine wm5=new WashingMachine("5",10,wm5H);
		WashingMachine wm6=new WashingMachine("6",20,wm6H);
		WashingMachine wm7=new WashingMachine("7",5,wm7H);
		WashingMachine wm8=new WashingMachine("8",10,wm8H);
	}
}
