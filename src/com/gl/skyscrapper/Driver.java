package com.gl.skyscrapper;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int noOfFloors = obj.nextInt();
		int[] floors = new int[noOfFloors];
		for(int i=0;i<noOfFloors;i++) {
			System.out.println("enter the floor size given on day : "+(i+1));
			floors[i] = obj.nextInt();
		}
		ConstructionBuilding.skyscrapper(noOfFloors,floors);
		obj.close();
		
	}

}
