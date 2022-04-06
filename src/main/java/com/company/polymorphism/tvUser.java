package com.company.polymorphism;

public class tvUser {

	//다형성을 이용해서 결합도를 낮춰서, 공통적인 특징을 담을수 있는 상위 클래스를 만들어야 함.
 public static void main(String[] args) {
	
	 	
		 TV tv = new lgTV();    //new 엘쥐를 삼성으로만 변경하면 , 메소드는 바꿀필요가 없다. (다형성의 예)
			/*
			 * TV lgtv = new lgTV(); 
			 * TV samsungtv= new samsungTV();
			 */
	 	tv.powerOn();
	 	tv.powerOff();
	 	tv.volumeUp();
	 	tv.volumeDown();

	 		
	 /*
		 * tv.poweron();
		 * 
		 * tv.volumeUp();
		 * 
		 * tv.volumeDown();
		 * 
		 * tv.poweroff();
		 */
	 
}
}
