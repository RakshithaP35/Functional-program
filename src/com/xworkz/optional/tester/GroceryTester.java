package com.xworkz.optional.tester;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.optional.dao.GroceryDAO;
import com.xworkz.optional.dao.GroceryDAOimpl;
import com.xworkz.optional.dto.GroceryDTO;

public class GroceryTester {

	public static void main(String[] args) {

		GroceryDTO dto = new GroceryDTO("Horlicks", 45f, "Milk Mixture", 1, true, "Classic", "25/12/2021", "31/03/2015", true,
				true, "789122331");

		GroceryDTO dto1 = new GroceryDTO("Maggie", 450f, "Snaks", 50, true, "Family Pack", "25/12/2021", "1/03/2015", true,
				true, "789126331");

		GroceryDTO dto2 = new GroceryDTO("Rice bag", 25f, "Rice", 1, true, "Bullet Rice", "5/12/2021", "3/03/2015", true,
				true, "78914569");

		GroceryDTO dto3 = new GroceryDTO("Sugar", 55f, "Sugar", 1, true, "Tata Sugar", "13/12/2020", "1/03/2017",
				true, true, "91223233");

		GroceryDAO dao = new GroceryDAOimpl();
		dao.create(dto);
		dao.create(dto1);
		dao.create(dto2);
		dao.create(dto3);

		Collection<GroceryDTO> list = Arrays.asList(dto, dto1, dto2);
		System.out.println("***");

		System.out.println("Find One");
		Optional<GroceryDTO> dtoFound = list.stream().filter(t -> t.getName().equals("Horlicks")).findFirst();
		if (dtoFound.isPresent()) {
			GroceryDTO opt = dtoFound.get();
			System.out.println("dto" + opt);
		} else {
			System.out.println("Grocery not found");
		}

		System.out.println("***");
		System.out.println("Find All");
		Collection<GroceryDTO> coll = dao.findAll(b -> b.getName().equals("Maggie"));
		for (GroceryDTO gro : coll) {
			System.out.println(gro);
		}

		System.out.println("***");
		System.out.println("Find by manufacturing date");

		Optional<GroceryDTO> dtofound1 = list.stream().filter(q -> q.getManufactureDate().equals("5/12/2021"))
				.findAny();
		if (dtofound1.isPresent()) {
			GroceryDTO opt1 = dtofound1.get();
			System.out.println(opt1);
		} else {
			System.out.println("Grocery not found");
		}

		System.out.println("***");

		System.out.println("Find by max Quantity");
		System.out.println(dao.findbyMaxQuantity());

		System.out.println("***");
		System.out.println("Find by expiry date");

		Optional<GroceryDTO> dtofound2 = list.stream().filter(s -> s.getExpireDate().equals("25/12/2021")).findAny();
		if (dtofound2.isPresent()) {
			GroceryDTO opt1 = dtofound2.get();
			System.out.println(opt1);
		} else {
			System.out.println("Grocery not found");
		}

	}

}
