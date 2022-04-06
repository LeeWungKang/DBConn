package com.company.polymorphism;

public class samsungTV implements TV{

	public void powerOn() {
		System.out.println("samsungTV 전원 키기.");
	}
	
	public void powerOff() {
		System.out.println("samsungTV 전원 끄기");
	}
	
	
	public void volumeUp() {
		System.out.println("samsungTV 소리 증가");
	}
	
	
	public void volumeDown() {
		System.out.println("samsungTV 소리 감소");
	}
	
}
