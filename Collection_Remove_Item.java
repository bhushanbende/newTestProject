package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Remove_Item {

	public static void main(String[] args) {
		
					String removeElem = "Testing";
			ArrayList myList = new ArrayList();
			
			myList.add("JAVA");
			myList.add("Testing");
			myList.add("Selenium");
			myList.add("Webdriver");
			myList.add("TestNG");
			
			
			System.out.println("Before Remove");
			System.out.println(myList);
			Iterator itr = myList.iterator();
		
			
			while(itr.hasNext()) {
				if(removeElem.equals(itr.next())) {itr.remove();}
		}
	System.out.println("After Remove");
	System.out.println(myList);
	}
}
