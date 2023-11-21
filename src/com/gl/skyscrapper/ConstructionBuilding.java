package com.gl.skyscrapper;

import java.util.PriorityQueue;
import java.util.Collections;

public class ConstructionBuilding {
	public static void skyscrapper(int n, int[] floors) {
		PriorityQueue<Integer> constructFloors = new PriorityQueue<>(Collections.reverseOrder());
		System.out.println();
		System.out.println("The order of construction is as follows");
		int m = n;
		for (int i = 0; i < n; i++) {
			int currentFloor = floors[i];
			while (!constructFloors.isEmpty() && constructFloors.peek() == m) {
				System.out.print(constructFloors.poll() + " ");
				m -= 1;
			}
			constructFloors.add(currentFloor);
			System.out.println();
			System.out.println("Day: " + (i + 1));
		}
		while (!constructFloors.isEmpty()) {
			System.out.print(constructFloors.poll() + " ");
		}

	}

}
