package com.company.polymorphism;

public class lgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("lgTv  -- 전원 키기.");
	}

	@Override
	public void powerOff() {
		 System.out.println("lgTv  -- 전원 끄기.");
	}

	@Override
	public void volumeUp() {
		 System.out.println("lgTv  -- 소리 키우기.");
	}

	@Override
	public void volumeDown() {
		 System.out.println("lgTv  -- 소리 내리기.");
	}

	/*
	 * public void turnOn() { System.out.println("lgTv  -- 전원 키기."); }
	 * 
	 * public void turnOff() { System.out.println("lgTv  -- 전원 끄기."); }
	 * 
	 * public void soundUp() { System.out.println("lgTv  -- 소리 키우기."); }
	 * 
	 * public void soundDown() { System.out.println("lgTv  -- 소리 내리기."); }
	 */
	
	
	
	
}
