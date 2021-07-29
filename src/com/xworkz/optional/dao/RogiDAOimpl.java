package com.xworkz.optional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.*;

import com.xworkz.optional.dto.RogiDTO;
import com.xworkz.optional.search.RogiSearch;

public class RogiDAOimpl implements RogiDAO {
	private List<RogiDTO> list = new ArrayList<RogiDTO>();

	@Override
	public boolean save(RogiDTO dto) {
		return list.add(dto);
	}

	@Override
	public Optional<RogiDTO> findOne(RogiSearch search) {
		Iterator<RogiDTO> itr = this.list.iterator();
		Optional<RogiDTO> opt = Optional.empty();
		while (itr.hasNext()) {
			RogiDTO dto = itr.next();
			if (search.huduku(dto)) {
				opt = Optional.of(dto);
			}
		}
		System.out.println("\nFind one :");
		return opt;
	}

	@Override
	public Optional<Integer> totalSize() {
		System.out.println("\nTotal size :");
		return Optional.of(list.size());
	}

	

	@Override
	public Collection<RogiDTO> findAll() {
		System.out.println("\nFind all :");
		return this.list;
	}

	@Override
	public Collection<RogiDTO> findAll(RogiSearch search) {
		Collection<RogiDTO> collection = new ArrayList<>();
		list.forEach((dto) -> {
			if (search.huduku(dto))
				collection.add(dto);
		});
		System.out.println("\nFind all search :");
		return collection;
	}

}
