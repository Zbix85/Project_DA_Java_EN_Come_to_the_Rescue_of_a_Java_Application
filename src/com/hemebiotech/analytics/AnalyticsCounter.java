package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.TreeMap;

public class AnalyticsCounter {
//	private static int headacheCount = 0;	// initialize to 0
//	private static int rashCount = 0;		// initialize to 0
//	private static int pupilCount = 0;		// initialize to 0 
	
	public static void main(String args[]) throws Exception {
		// first get input
		ArrayList<String> res = new ArrayList();
		ReadSymptomDataFromFile lecture = new ReadSymptomDataFromFile("symptoms.txt");
		res = lecture.GetSymptoms();
		countFrequencies(res);
		//SaveOutput();
		 
		//BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		//String line = reader.readLine();
//
//		int i = 0;	// set i to 0
//		int headCount = 0;	// counts headaches
//		while (line != null) {
//			i++;	// increment i
//			System.out.println("symptom from file: " + line);
//			if (line.equals("headache")) {
//				headCount++;
//				System.out.println("number of headaches: " + headCount);
//			}
//			else if (line.equals("rush")) {
//				rashCount++;
//			}
//			else if (line.contains("pupils")) {
//				pupilCount++;
//			}
//			
//			line = reader.readLine();	// get another symptom
	}
//		
		// next generate output
//		FileWriter writer = new FileWriter ("result.out");
//		writer.write("headache: " + headacheCount + "\n");
//		writer.write("rash: " + rashCount + "\n");
//		writer.write("dialated pupils: " + pupilCount + "\n");
//		writer.close();
	
	
	 public static void countFrequencies(ArrayList<String> res)
	    {
	        // hashmap to store the frequency of element
	        Map<String, Integer> hm = new HashMap<String, Integer>();
	        //Collections.sort(res);
	        for (String i : res) {
	            Integer j = hm.get(i);
	            hm.put(i, (j == null) ? 1 : j + 1);
	        }
	  
//	        // displaying the occurrence of elements in the arraylist
//	        for (Map.Entry<String, Integer> val : hm.entrySet()) {
//	            System.out.println("Element " + val.getKey() + " "
//	                               + "occurs"
//	                               + ": " + val.getValue() + " times");
//	        }
//	       
	        // TreeMap to store values of HashMap
	        TreeMap<String, Integer> sorted = new TreeMap<>();
	 
	        // Copy all data from hashMap into TreeMap
	        sorted.putAll(hm);
	 
	        // Display the TreeMap which is naturally sorted
	        for (Map.Entry<String, Integer> entry : sorted.entrySet())
	            System.out.println("Symptom " + entry.getKey() +
	                         ", occurs = " + entry.getValue()+ " times");
	        
	        
	        
	
	    }
}
