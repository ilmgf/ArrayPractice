package arrayExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records and elements in the data set: ");
		int rec = sc.nextInt();
		int ele = sc.nextInt();
		DataProcessing(rec,ele);
	}
	
	public static void DataProcessing (int records, int elements) {
		double pi = 3.14;
		double psi = 6.84845;
		double zeta = 4.26;
		double a = 3.21;
		double b = 5.1;
		double c = 6.8;
		double result = 0.0;
		double result2 = 0.0;
		double result3 = 0.0;
		double result4 = 0.0;
		double[][] data = new double[99][99];
		int count = 0;
		int recCount = 0;
		try {
		System.out.println("Enter " + records + " records with " + elements + " elements: ");
		System.out.println("ENTER 999 WHEN DONE!");
		Scanner sc = new Scanner(System.in);
		//LOOP THAT ENTERS NUMBERS INTO DATA ARRAY AND COUNTS HOW MANY NUMBERS ARE ENTERED
		//IF COUNT IS GREATER THAN THE NUMBER OF ELEMENTS THAT SHOULD BE PRESENT THEN EXCEPTION IS THROWN
		//LOOP WILL END WHEN THE NUMBER 999 IS ENTERED
		for(int i = 0; i < 99; i++) {
			double enteredNum = 1;
			
			for(int j = 0; j < 99; j++) {
				enteredNum = sc.nextDouble();
				if(enteredNum != 999)
				data[i][j] = enteredNum;
				count++;
				if(enteredNum == 999 || j == elements-1)
					break;
				if(count > elements*records)
				throw new ArrayIndexOutOfBoundsException();
			}
			if(enteredNum == 999)
				break;
			recCount++;
		}
		if(recCount < records)
			throw new Exception();
		if(count < elements*records)
			throw new Exception();
		if(recCount > records)
			throw new Exception();
		//CODE TO EXECUTE IF THERE ARE ONLY 2 ELEMENTS
		if(elements == 2) {
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			double avg1 = 0;
			double avg2 = 0;
			double avg3 = 0;
			double avg4 = 0;
			
			for(int i = 0; i < records; i++) {
				for(int j = 0; j < elements; j++) {
					//CALCULATE SUM FOR EACH ROW OF 2 RECORDS
					if(records == 2 && i == 0) {
					sum1+=data[i][j];
					}
					if(records == 2 && i == 1) {
						sum2+=data[i][j];
					}
					//CALCULATE SUM FOR EACH ROW OF 3 RECORDS
					if(records == 3 && i == 0) {
						sum1+=data[i][j];
						}
						if(records == 3 && i == 1) {
							sum2+=data[i][j];
						}if(records == 3 && i == 2) {
							sum3+=data[i][j];
						}
					//CALCULATE SUM FOR EACH ROW OF 4 RECORDS
						if(records == 4 && i == 0) {
							sum1+=data[i][j];
						}
						if(records == 4 && i == 1) {
							sum2+=data[i][j];
							}
							if(records == 4 && i == 2) {
								sum3+=data[i][j];
							}
							if(records == 4 && i == 3) {
								sum4+=data[i][j];
								}
				}
			}
			//CALCULATE AND ROUND AVERAGES
			avg1=(double)sum1/2;
			avg2 = (double)sum2/2;
			avg3 = (double)sum3/2;
			avg4 = (double)sum4/2;
			double roundAVG1 = (double)(Math.round(avg1*1000.0)/1000.0);
			double roundAVG2 = (double)(Math.round(avg2*1000.0)/1000.0);
			double roundAVG3 = (double)(Math.round(avg3*1000.0)/1000.0);
			double roundAVG4 = (double)(Math.round(avg4*1000.0)/1000.0);
			
			//ARRAY OF ROUNDED AVERAGES (ONLY ADDS TO ARRAY IF AVERAGES ARE NOT 0)
			double averages[] = new double [4];
			averages[0] = roundAVG1;
			averages[1] = roundAVG2;
			averages[2] = roundAVG3;
			averages[3] = roundAVG4;
			
			//LOOP TO PRINT AVERAGES
			for(int i = 0; i < averages.length; i++) {
				System.out.println("AVG= " + averages[i]);
			}
			//LOOP TO CALCULATE RESULTS DEPENDING ON THE NUMBER OF RECORDS PRESENT
			for(int i = 0; i < records; i++) {
						if(i == 0) 
						result = pi * pi * data[i][0] + psi * (3.44 + Math.pow(data[i][1], 1.5)) * 3;
						if(i==1) 
						result2 = pi * pi * data[i][0] + psi * (3.44 + Math.pow(data[i][1],1.5)) * 3;
						if(i==2)
						result3 = pi * pi * data[i][0] + psi * (3.44 + Math.pow(data[i][1],1.5)) * 3;
						if(i==3)
						result4 = pi * pi * data[i][0] + psi * (3.44 + Math.pow(data[i][1],1.5)) * 3;					
			}
			

			double round = (double)(Math.round(result*1000.0)/1000.0);
			double round2 = (double)(Math.round(result2*1000.0)/1000.0);
			double round3 = (double)(Math.round(result3*1000.0)/1000.0);
			double round4 = (double)(Math.round(result4*1000.0)/1000.0);
			double avgOfRes = (round + round2 + round3 + round4)/records;
			double roundedAvgOfRes = Math.round(avgOfRes*1000.0)/1000.0;
			//ARRAY OF RESULTS (ONLY ADDS TO ARRAY IF RESULT IS GREATER THAN 0)
			double[] results = new double[records];
			results[0] = round;
			if(round2 != 0)
				results[1] = round2;
			if(round3 != 0)
				results[2] = round3;
			if(round4 != 0)
				results[3] = round4;
			for(int i = 0; i < results.length; i++) {
				System.out.println("FORM= " + results[i]);
			}
			System.out.println("AVERAGE OF RESULTS= " + roundedAvgOfRes);
			System.out.println("Total # of records read: " + records);
		}
		
		//CODE TO EXECUTE IF THERE ARE 3 OR MORE ELEMENTS
		if(elements >= 3) {
			double sum1 = 0;
			double sum2 = 0;
			double sum3 = 0;
			double sum4 = 0;
			double avg1 = 0;
			double avg2 = 0;
			double avg3 = 0;
			double avg4 = 0;
			
			for(int i = 0; i < records; i++) {
				for(int j = 0; j < elements; j++) {
					//CALCULATE SUM FOR EACH ROW OF 2 RECORDS
					if(records == 2 && i == 0) {
					sum1+=data[i][j];
					}
					if(records == 2 && i == 1) {
						sum2+=data[i][j];
					}
					//CALCULATE SUM FOR EACH ROW OF 3 RECORDS
					if(records == 3 && i == 0) {
						sum1+=data[i][j];
						}
						if(records == 3 && i == 1) {
							sum2+=data[i][j];
						}if(records == 3 && i == 2) {
							sum3+=data[i][j];
						}
					//CALCULATE SUM FOR EACH ROW OF 4 RECORDS
						if(records == 4 && i == 0) {
							sum1+=data[i][j];
						}
						if(records == 4 && i == 1) {
							sum2+=data[i][j];
							}
							if(records == 4 && i == 2) {
								sum3+=data[i][j];
							}
							if(records == 4 && i == 3) {
								sum4+=data[i][j];
								}
				}
			}
			
			avg1=(double)sum1/elements;
			avg2 = (double)sum2/elements;
			avg3 = (double)sum3/elements;
			avg4 = (double)sum4/elements;
			double roundAVG1 = (double)(Math.round(avg1*1000.0)/1000.0);
			double roundAVG2 = (double)(Math.round(avg2*1000.0)/1000.0);
			double roundAVG3 = (double)(Math.round(avg3*1000.0)/1000.0);
			double roundAVG4 = (double)(Math.round(avg4*1000.0)/1000.0);
			
			//ARRAY FOR AVERAGES OF DATA POINTS
			double averages[] = new double [4];
			averages[0] = roundAVG1;
			averages[1] = roundAVG2;
			averages[2] = roundAVG3;
			averages[3] = roundAVG4;
			for(int i = 0; i < averages.length; i++) {
				if(averages[i] != 0)
			System.out.println("AVG 33= " + averages[i]);
			}
			
			for(int i = 0; i < records; i++) {
				if(i == 0)
				result = pi * pi * data[i][0] * pi +  psi * (3.44 + Math.pow(data[i][1],1.5)) * 3 + (zeta /data[i][1]) * Math.log(data[i][2]);
				if(i == 1)
					result2 =  pi * pi * data[i][0] * pi +  psi * (3.44 + Math.pow(data[i][1],1.5)) * 3 + (zeta /data[i][1]) * Math.log(data[i][2]);
				if(i == 2)
					result3 =  pi * pi * data[i][0] * pi +  psi * (3.44 + Math.pow(data[i][1],1.5)) * 3 + (zeta /data[i][1]) * Math.log(data[i][2]);
				if(i == 4)
					result4 = pi * pi * data[i][0] * pi +  psi * (3.44 + Math.pow(data[i][1],1.5)) * 3 + (zeta /data[i][1]) * Math.log(data[i][2]);
			}
			
			double round = (double)(Math.round(result*1000.0)/1000.0);
			double round2 = (double)(Math.round(result2*1000.0)/1000.0);
			double round3 = (double)(Math.round(result3*1000.0)/1000.0);
			double round4 = (double)(Math.round(result4*1000.0)/1000.0);;
			double avgOfRes = (round + round2 + round3 + round4)/records;
			double roundedAvgOfRes = Math.round(avgOfRes*1000.0)/1000.0;
			
			//ARRAY OF RESULTS (ONLY ADDS TO ARRAY IF RESULT IS GREATER THAN 0)
			double[] results = new double[4];
			results[0] = round;
				results[1] = round2;
				results[2] = round3;
				results[3] = round4;
			for(int i = 0; i < results.length; i++) {
				if(results[i] != 0)
				System.out.println("FORM33= " + results[i]);
			}
			System.out.println("AVERAGE OF RESULTS: " + roundedAvgOfRes);
			System.out.println("Total # of records read: " + records);
		}
		
		
		}
		
		//CATCH BLOCK THAT EXECUTES WHEN THERE IS A DISCREPANCY IN THE DATA
		catch(InputMismatchException e) {
			for(int i = 0; i < records; i++) {
				boolean flag = false;
				for(int j = 0; j < elements; j++) {
					double current = data[i][j];
					if(data[i][j] == 0) {
					flag = true;
					System.err.println(e);
					System.out.println("ERROR IN RECORD " + i + " ELEMENT " + j);
					break;
					}
				}
				if(flag)
					break;
			}
		}
		
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("TOO MANY ELEMENTS");
			System.err.println(aie);
		}
		
		catch(Exception x) {
			if(count < elements*records)
			System.out.println("NOT ENOUGH ELEMENTS");
			if(recCount > records)
				System.out.println("TOO MANY RECORDS");
			if(recCount < records)
				System.out.println("NOT ENOUGH RECORDS");
		}
		
	}
}
