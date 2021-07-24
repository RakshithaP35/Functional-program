package com.xworkz.features.funtional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FishTester {

	public static void main(String[] args) {
		FishDTO dto1 = new FishDTO("Mandarin", "Rainbow", "Mandarin", "2", "5000", "female");

		FishDTO dto2 = new FishDTO("Sword Fish", "Green", "SwordFish", "3", "2000", "male");

		FishDTO dto3 = new FishDTO("European perch", "Transperent Green", "Fresh Water Fish", "4", "9000", "male");

		List<FishDTO> collection = new ArrayList<FishDTO>();
		collection.add(dto3);
		collection.add(dto1);
		collection.add(dto2);

		System.out.println("\nsorted by name");
		Comparator<FishDTO> sortByName = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(collection, sortByName);
		Iterator<FishDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			FishDTO fishdto = (FishDTO) itr.next();
			System.out.println(fishdto.getName());
		}
		System.out.println("\nsort by color");
		Comparator<FishDTO> sortByColor = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getColor().compareTo(o2.getColor());

			}

		};
		Collections.sort(collection, sortByColor);
		Iterator<FishDTO> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			FishDTO fishdto1 = (FishDTO) itr1.next();
			System.out.println(fishdto1.getColor());
		}
		System.out.println("\nsort by lifespan");
		Comparator<FishDTO> sortByLifeSpan = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return o1.getLifeSpan().compareTo(o2.getLifeSpan());
			}

		};
		Collections.sort(collection, sortByLifeSpan);
		Iterator<FishDTO> itr2 = collection.iterator();
		while (itr2.hasNext()) {
			FishDTO fishdto3 = (FishDTO) itr2.next();
			System.out.println(fishdto3.getLifeSpan());

		}
		System.out.println("\nsort by lifespan desc");
		Comparator<FishDTO> fishlife = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return o2.getLifeSpan().compareTo(o1.getLifeSpan());
			}

		};
		Collections.sort(collection, fishlife);
		Iterator<FishDTO> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			FishDTO fishdto4 = (FishDTO) itr3.next();
			System.out.println(fishdto4.getLifeSpan());
		}
		System.out.println("\nsort by name desc");
		Comparator<FishDTO> sorByNameDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return o2.getName().compareTo(o1.getName());
			}
		};
		Collections.sort(collection, sorByNameDesc);
		Iterator<FishDTO> itr4 = collection.iterator();
		while (itr4.hasNext()) {
			FishDTO fishdto5 = (FishDTO) itr4.next();
			System.out.println(fishdto5.getName());
		}

		System.out.println("\nsort by cost desc");
		Comparator<FishDTO> sortByCostdesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return o2.getCost().compareTo(o1.getCost());

			}

		};
		Collections.sort(collection, sortByCostdesc);
		Iterator<FishDTO> itr5 = collection.iterator();
		while (itr5.hasNext()) {
			FishDTO fishdto6 = (FishDTO) itr5.next();
			System.out.println(fishdto6.getCost());
		}

	}

}
