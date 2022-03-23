import java.util.Arrays;
import java.util.Scanner;

import javax.management.openmbean.ArrayType;

public  class StringQ{
    public static String reversestring(String s){
        
        
        String reverse  = "";

        int length = s.length();

        for(int i=length-1;i>=0;i--){
            reverse += s.charAt(i);

        }
        return reverse;

        //System.out.println(reverse.equals(name)?"palimdrome":"not palimdrome");
    }

    public static void reverseWord(){
        Scanner in = new Scanner(System.in);
        String newrev = "";
        
        System.out.println("enter a string");
       String name = in.nextLine(); 

       String []str = name.split(" ");
       for(int i=0;i<str.length;i++){
          newrev+=reversestring(str[i]+ " ");
       }
      
        System.out.println(newrev);
    }

    public static void printA(int arr[]){
        for(int m=0;m<arr.length;m++){
           System.out.print(arr[m] + " ");
       }
        
    }
  public static void deleteduplicate(){
      String str = "tommmmmttty";
      String output=new String() ;
      
      for(int i=0;i<str.length();i++){
          for(int j=0;j<output.length();j++){
              if(str.charAt(i)!=output.charAt(j)){
               output+=str.charAt(i);

              }
              
          }
      }
      System.out.println(output);
  }



  public static void findpair(){
      Scanner in = new Scanner(System.in);
      int arr[] = {9,5,8,6,4,3,6,9,5,3,2,4,1,2,4,5};
      System.out.println("Enter a number");
      int input = in.nextInt();
      Arrays.sort(arr);
      int i=0;
      int j = arr.length-1;
      while(i<=j){
        if(arr[i]+arr[j]< input){
            i++;
            
        }else if(arr[i]+arr[j]>input){
            j--;
        } else {
            System.out.println(arr[i]+ " " + arr[j]);
            i++;
            j--;
            
        }
        

      }

     

      
  }




  



}