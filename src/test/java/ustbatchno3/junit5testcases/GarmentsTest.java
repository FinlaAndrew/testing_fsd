package ustbatchno3.junit5testcases;


import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class GarmentsTest {
	@Test
	
		
		public void garment() {
		Garments g11 =new Garments("tshirt",30,200,6000);
		Garments g21=new Garments("shirt",25,250,6250);
		Garments g31=new Garments("Shorts",13,200,2600);
		Garments g41=new Garments("Pants",10,200,2000);
			List<Garments> garments1=Arrays.asList(g11,g21,g31,g41);
			Map<LocalDate, List<Garments>> m=new HashMap<>();
			LocalDate date=LocalDate.of(2023, 1, 1);
			List<LocalDate> l=Arrays.asList(date);
			m.put(date, garments1);
			assertEquals(garments1, GarmentsMain.Test(date,m,l));
		}
	
}

