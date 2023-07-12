package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		list.add("Vitor");
		list.add(2, "Antonio");
		
		System.out.println(list.size());
		
		list.remove("Ana");
		list.remove(1);
		
		System.out.println("Index of Vitor: " + list.indexOf("Vitor"));
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
	}

}
