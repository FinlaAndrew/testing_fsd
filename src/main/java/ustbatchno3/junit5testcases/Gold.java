package ustbatchno3.junit5testcases;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Gold {

	
	

	public String  findcoins(LocalDate date) {
		int day= date.getDayOfYear();
		if(day<80 || day>365) {
			return "5";
		}
		else if(day<172) {
			return "3";
		}
		else if(day<266) {
			return "1";
		}
		else {
		 return  null;
		}
	}
}

