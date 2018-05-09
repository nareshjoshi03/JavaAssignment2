package core_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * AssignTwo
 */
public class AssignTwo {

    public static void main(String[] args) {
        
        String title[]  =  new String[10];
        String author[]  =  new String[10];
        String publisher[] = new String[10];
        
        float  price[] = new float[10];
        long isbn[] = new long[10];

        String stopInput =  "" ;

        int count = 0;
        

        System.out.println("Enter the details of Book");

        Scanner sc = new Scanner(System.in);
        
      

          
        for (int i = 0; i <10 && !("endInput".equalsIgnoreCase(stopInput)); i++) {

          System.out.println("Enter title of Book");
          title[i]  =sc.nextLine();
          	
          System.out.println("Enter author of Book");
          author[i] =sc.nextLine();

         System.out.println("Enter publisher of Book");
         publisher[i] =sc.nextLine();

         System.out.println("Enter price  of Book");
          price[i] =sc.nextFloat();
        
         System.out.println("Enter  ISBN of Book");
          isbn[i] =   sc.nextLong();

          sc.nextLine();

          System.out.println("Do you want Input to Continue:");
          stopInput = sc.nextLine();
        
              }
        sc.close();
    
          System.out.println();

        System.out.println("\t"+"Title"+ "\t\t\t" + " Author" +"\t\t\t" +"Publisher"+"\t\t"+ "Price"+"\t\t" +"\t"+"ISBN");
              
        System.out.println("\t" +"====="+ "\t\t\t" + " =====" + "\t\t\t" +"======"+"\t\t\t"+ "====="+"\t\t" +"\t"+"=====");
        
        for (int i = 0; i < title.length; i++) {

        if (title[i]!=null) {
          
        System.out.println(title[i]+ "\t\t\t" + author[i] +"\t\t\t" + publisher[i]+"\t\t\t"+"$"+ price[i]+"\t" +"\t"+isbn[i]);
        count++;
                
        }
        }

         float totalPrice = 0;
         float averagePrice = 0;
         
       
         for (int i = 0; i <price.length; i++) {
        	 
           if(price[i]!= 0.0){
         totalPrice = totalPrice + price[i];
           }
         }
         
         
         averagePrice = totalPrice/count;

         List<Float> values = new ArrayList<Float>();

         for(float data : price) {
        	 if(data!= 0.0) {
        		 
        		 values.add(data);
        		 
        	 }
         }
         
         Collections.sort(values);
         
       

        
System.out.println("\n\n");
System.out.println("Totals");
System.out.println("---------------------------");

System.out.println("Total number of books:"+count); 

System.out.println("Total cost of books:"+ "\t"+totalPrice);

System.out.println("Minimum cost of a book:"+values.get(0));

System.out.println("Maximum cost of a book:"+(values.get(values.size()-1)));

System.out.println("Average cost of a book:" +averagePrice);


//Creating file and feeding data to file
/*
try {
	
    Formatter f = new Formatter("D:\\JavaProg\\book.txt");
    
    for (int i = 0; i < values.get(values.size()-1); i++) {
		
    f.format("%s %s %f %s %l",title[i],author[i], price[i], publisher[i],isbn[i]);
   
    }

} 
catch (Exception e) {
    //TODO : handle exception

    System.out.println("Error Creating file");
}



// Assigning data to file
			try {
			    
			    File file = new File("D:\\JavaProg\\book.txt");
			
			    Scanner scan = new Scanner(file);
			    while(scan.hasNext()) {
			        System.out.println(scan.next());
			    }
			} catch (Exception e) {
			    //TODO: handle exception
			    
			
			}
			
			
*/

    

  }
    



}
    
