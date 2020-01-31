package MyFirstList;

import java.util.*;

public class MyFirstList {

	public static void main(String[] args) {

		List <NUM> list = new LinkedList <NUM>();
		
		NUM NUM1 = new NUM (33);
		NUM NUM2 = new NUM (45);
		NUM NUM3 = new NUM (55);
		NUM NUM4 = new NUM (55);
		
		list.add(NUM1);
		list.add(NUM2);
		list.add(NUM3);
		list.add(0, NUM3);
		list.add(1, NUM4);
		
		for (int i = 0; i < list.size(); i++) {
			
			NUM a = list.get(i);
			
			int b = a.getNum();
			
			System.out.println(b);
			
		}
			
}
}
