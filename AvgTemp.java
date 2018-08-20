package testing;

import java.util.ArrayList;
import java.util.List;

public class AvgTemp {
	
	public static void main(String ar[]) {
		
		List<String> datalist = new ArrayList<String>();
		//inserting the test data
		datalist.add("1,10000,40");
		datalist.add("1,10002,45");
		datalist.add("1,11015,50");
		datalist.add("2,10005,42");
		datalist.add("2,11051,45");
		datalist.add("2,12064,42");
		datalist.add("2,13161,42");
		int i;
		//for processing every second , to read avg temperature
		for(i=0;i<60;i++) {
			int count = 0;
			float avg = 0;
			for(String indData:datalist) {
				String sepData[]=indData.split(",");
				int k=Integer.parseInt(sepData[1]);
				int t=k/1000;
				if(t==i) {
					count+=1;
					avg+=Integer.parseInt(sepData[2]);
				}
			}
			float result = avg/count;
			//to display final result
			if(result>0)
			System.out.println(i+"000-"+i+"999:"+result);
		}
		
	}

}
