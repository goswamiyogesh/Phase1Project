package com.simplilearn.phase1project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Project {

	public static void main(String[] args)throws IOException  {
	
		Scanner sc =new Scanner(System.in);
	     String filePath="E:\\abc\\";
	     System.out.println("Project Name: LockedMe.com\nDeveloper Name: Yogesh Goswami");
	    while(true)
	    {
	     System.out.println("Enter the Menu\n 1.Display\n 2.SubMenu\n 3.exit");
	     int i=sc.nextInt();
				switch(i) {
	    	 case 1:
	    		 System.out.println("Display all files present in the path"+filePath);
	    		      File f=new File(filePath);
	    			  File filenames[]=f.listFiles();
	    			  for(File ff: filenames) {
	    				     System.out.println(ff.getName());
	    			  }
	    	          break;
	    	 case 2: 
	    		boolean j=true;
	            while(j==true) {
	    		
	    		 System.out.println("Enter SubMenu\n 1:Create\n 2:Delete\n 3:Search\n 4:exit submenu");
	    	      int k = sc.nextInt();
	    	      switch(k) {
	    	      case 1:{
	    	    	  System.out.println("enter the file name in the directory to create "+filePath);
	    	    		String filename1=sc.next();  
	    	    	    File fn1=new File(filePath+filename1);
	    	    		//create a new file
	    	    		boolean b=fn1.createNewFile();
	    	    		if(b!=true) {
	    	    			System.out.println("file not created in the path");
	    	    		}else {
	    	    			System.out.println("file created in the path" +filePath);
	    	    		}
	                    break;
	    	      }
	    	      case 2:{
	    	    	 System.out.println("enter the file name in the directory to delete "+filePath);
	 	    		 String filename2=sc.next(); 
	    	    	  File fn2=new File(filePath+filename2);
	    	    		//delete a file
	    	    		boolean a=fn2.delete();
	    	    		if(a) {
	    	    			System.out.println("file has been deleted");
	    	    		}
	    	    		else {
	    	    			System.out.println("file not found/can't be deleted  ");
	    	    		}
	    	    		break;
	    	      }
	    	      case 3:
	    	      {
	    	    	  System.out.println("enter the file name in the directory to search "+filePath);
	  	    		   String filename3=sc.next();  
	    	    	    File fn3=new File(filePath);
	    	    	  // Search a file
	    	    		File []filesearch=fn3.listFiles();
	    	    		int flag=0;
	    	    		for(File ff: filesearch) {
	    	    			if(ff.getName().equals(filename3)) {
	    	    				flag=1;
	    	    				break;
	    	    			}
	    	    		}
	    	    			if(flag==1) {
	    	    			System.out.println("the file is found");
	    	    		}
	    	    		else {
	    	    			System.out.println("file is not found");
	    	    		}
	    	    		break;
	    	      }
	    	      case 4:{
	    	    	  j =false;
	    	    	  break;
	    	      }
    	          default:
    	    	           System.out.println("Invalid Submenu");
    	    	          break;
    	    	   }
    	           }
                   break;
                   
    	     case 3 :
                     System.exit(0);
                     break;
    	     default:
  	           System.out.println("Invalid Menu");
  	          break;
  	         }
    	    	    
	    }


	}

}
