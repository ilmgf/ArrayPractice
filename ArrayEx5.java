package arrayExercises;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] time = {"9:30:00 AM", "9:40:00 AM", "9:50:00 AM", "10:00:00 AM", "10:10:00 AM", "10:20:00 AM", "10:30:00 AM", "10:40:00 AM", "10:50:00 AM", "11:00:00 AM", "11:10:00 AM",
        				 "11:20:00 AM", "11:30:00 AM", "11:40:00 AM", "11:50:00 AM", "12:00:00 PM", "12:10:00 PM", "12:20:00 PM", "12:30:00 PM", "12:40:00 PM", "12:50:00 PM", "1:00:00 PM",
        				 "1:10:00 PM", "1:20:00 PM", "1:30:00 PM", "1:40:00 PM", "1:50:00 PM", "2:00:00 PM", "2:10:00 PM", "2:20:00 PM", "2:30:00 PM", "2:40:00 PM", "2:50:00 PM", "3:00:00 PM",
        				 "3:10:00 PM", "3:20:00 PM", "3:30:00 PM", "3:40:00 PM", "3:50:00 PM", "4:00:00 PM",};
        double[] price = {227.95, 224.79, 223.82, 221, 219.75, 216.82, 220.78, 220.24, 218.5, 217.79, 222.15, 222.75, 223.52, 224.94, 218.01, 220.95, 221.85, 226.23, 228.99, 228.41, 226.51, 226.51,
        				  223.25, 220.15, 219.01, 217.15, 216.6, 214.65, 214.1, 216.8, 218.1, 213.44, 211.75, 209.22, 210.155, 207.7, 207.36, 207.28, 206.05, 209.32};
        
        for(int i = 0; i < price.length; i++) {
        	double buyPrice = price[i];
        	double sellPrice = price[i];
        	String buyTime = time[i];
        	String sellTime = time[i];
        	for(int j = i+1; j < price.length; j++) {
        		if(buyPrice > price[j]) {
        			buyPrice = price[j];
        			buyTime = time[j];
        		}
        		if(sellPrice < price[j]) {
        			sellPrice = price[j];
        			sellTime = time[j];
        		}
        		
        	}
        	System.out.println("Buy stock at " + buyTime + " at " + buyPrice + " and Sell at " + sellTime + " at " + sellPrice);
        }
	
	}

}
