package com.xworkz.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {


	public static void main(String[] args) {

		Collection<String> watchBrand = Arrays.asList("FastTrack", "DressBerry", "Titan", "Daniel Klein", "Casio",
				"Sonata");
		System.out.println("**");
		System.out.println("Original brand" + watchBrand);
		Collection<String> watch = watchBrand.stream().filter((a) -> a.startsWith("T")).collect(Collectors.toSet());
		System.out.println(watch.size());
		System.out.println("Starts with T:" + watch);

		System.out.println("***");

		Collection<String> watch1 = watchBrand.stream().filter((c) -> c.endsWith("n")).collect(Collectors.toSet());
		System.out.println(watch1.size());

		System.out.println("Ends With n:" + watch1);

		System.out.println("***");

		Collection<String> usn = Arrays.asList("1DZ1960", "1DZ1961", "1DZ1962", "1DZ1963", "1DZ1964");
		System.out.println("Original USN:" + usn);

		Collection<String> usnMatch = usn.stream().filter((b) -> b.contains("CS")).collect(Collectors.toSet());
		System.out.println("USN Matching CS:" + usnMatch);
		System.out.println(usnMatch.size());

		System.out.println("***");
		Collection<String> pan = Arrays.asList("FCG25467DDD", "FCG25463DDD", "FCG25437DDD", "FCG22467DDD");
		System.out.println("Original PAN" + pan);
		Collection<String> panMatch = pan.stream().filter((a) -> a.startsWith("A")).collect(Collectors.toSet());
		System.out.println("Pan starts with A:" + panMatch);
		System.out.println(panMatch.size());

		System.out.println("***");
		Collection<String> panend = pan.stream().filter((a) -> a.endsWith("F")).collect(Collectors.toSet());
		System.out.println("Pan Ends With F:" + panend);

		System.out.println("***");
		List<String> brand = Arrays.asList("FastTrack", "DressBerry", "Titan", "Daniel Klein", "Casio",
				"Sonata");
		List<String> brandMat = brand.stream().sorted().collect(Collectors.toList());
		System.out.println("Brand In Sorted Order:" + brandMat);

	}
}
