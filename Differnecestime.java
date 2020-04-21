package dareAndtime;

import java.time.LocalDate;
import java.time.Period;

public class Differnecestime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1= LocalDate.of(1947,8,15);
		Period p = Period.between(d1,LocalDate.now());
		System.out.println(p.getYears()+"  "  +p.getMonths());
		

	}

}
