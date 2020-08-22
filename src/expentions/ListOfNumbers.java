package expentions;
	import java.io.*;
	import java.util.List;
	import java.util.ArrayList;

import java.util.Scanner;

	public class ListOfNumbers {
	    public List<Integer> list;
	    private static final int SIZE = 10;

	    public ListOfNumbers () {
	        list = new ArrayList<Integer>(SIZE);
	        for (int i = 0; i < SIZE; i++)
	            list.add(new Integer(i));
	    }
	    public void writeList() {
	        PrintWriter out = null;

	        try {
	            System.out.println("Entering try statement");
	            out = new PrintWriter(new FileWriter("numbers.txt"));
	        
	            for (int i = 0; i < SIZE; i++)
	                out.println("Value at: " + i + " = " + list.get(i));
	        } catch (IndexOutOfBoundsException e) {
	            System.err.println("Caught IndexOutOfBoundsException: " +
	                                 e.getMessage());
	        } catch (IOException e) {
	            System.err.println("Caught IOException: " + e.getMessage());
	        } finally {
	            if (out != null) {
	                System.out.println("Closing PrintWriter");
	                out.close();
	            } else {
	                System.out.println("PrintWriter not open");
	            }
	        }  
	    }
	    
	    public void readList(String file) {
	    	
	    	try{
	    		File f = new File(file);
	    		Scanner scan= new Scanner(f);
	    		List<Integer> array = new ArrayList<Integer>();
	    		
	    		while (scan.hasNextInt()) {
	    			array.add(scan.nextInt());
	    		}
	    		
	    		list.addAll(array);
	    		System.out.println(list.toString());
	    		scan.close();
	    	}catch (IndexOutOfBoundsException e) {
	            System.err.println("Caught IndexOutOfBoundsException: " +
	                                 e.getMessage());
	        } catch (IOException e) {
	            System.err.println("Caught IOException: " + e.getMessage());
	        }
	       
	}
	}
