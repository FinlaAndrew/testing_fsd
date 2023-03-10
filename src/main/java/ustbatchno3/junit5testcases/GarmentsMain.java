package ustbatchno3.junit5testcases;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GarmentsMain {

	public static void main(String[] args) {
		Garments g11 =new Garments("tshirt",30,200,6000);
		Garments g21=new Garments("shirt",25,250,6250);
		Garments g31=new Garments("Shorts",13,200,2600);
		Garments g41=new Garments("Pants",10,200,2000);
		List<Garments> garments1=Arrays.asList(g11,g21,g31,g41);
		
		Garments g12 =new Garments("tshirt",30,200,6000);
		Garments g22=new Garments("shirt",25,250,6250);
		Garments g32=new Garments("Shorts",13,200,2600);
		Garments g42=new Garments("Pants",10,200,2000);
		List<Garments> garments2=Arrays.asList(g12,g22,g32,g42);
		
		Garments g13 =new Garments("tshirt",30,200,6000);
		Garments g23=new Garments("shirt",25,250,6250);
		Garments g33=new Garments("Shorts",13,200,2600);
		Garments g43=new Garments("Pants",10,200,2000);
		List<Garments> garments3=Arrays.asList(g13,g23,g33,g43);
		Map<LocalDate,List<Garments>>e1=new HashMap<>();
//		Map<LocalDate,List<Garment>>e2=new HashMap<>();
//		Map<LocalDate,List<Garment>>e3=new HashMap<>();
		LocalDate d1=LocalDate.of(2023, 1, 1);
		LocalDate d2=LocalDate.of(2023, 2, 2);
		LocalDate d3=LocalDate.of(2023, 3, 3);
		List<LocalDate> dates=Arrays.asList(d1,d2,d3);
		e1.put(d1,garments1);
		e1.put(d2,garments2);
		e1.put(d3,garments3);
		int y=2023,m=1,d=1;
		LocalDate test=LocalDate.of(y, m, d);
		
		List<Garments> result=Test(test,e1,dates);
		System.out.println(result);

	}
	public static List<Garments> Test(LocalDate test,Map<LocalDate, List<Garments>> e1,List<LocalDate> dates){
		for(LocalDate d: dates) {
			if(test.isEqual(d)) {
				return e1.get(d);
			}
		}return null;

		
	}
}
