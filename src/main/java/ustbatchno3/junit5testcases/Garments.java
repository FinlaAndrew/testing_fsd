package ustbatchno3.junit5testcases;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Garments{
	private String item;
	private int prize;
	private int count;
	private double sales;
	public Garments(String item,int prize, int count,double sales) {
		this.item=item;
		this.prize = prize;
		this.count = count;
		this.sales=sales;
	}
	public void setItem(String item) {
		this.item=item;
	}
	public String getItem() {
		return item;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Garments [item=" + item + ", prize=" + prize + ", count=" + count + ", sales=" + sales + "]";
	}
	public static Object sasi(LocalDate date, Map<LocalDate, List<Garments>> m, List<LocalDate> l) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

