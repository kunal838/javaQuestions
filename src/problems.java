import java.util.Scanner;

public class problems {
    public static boolean isAutomorphica(int N)
    {
        
        int sq = N * N;
 
       
        while (N > 0) {
           
            if (N % 10 != sq % 10)
                return false;
 
           
            N /= 10;
            sq /= 10;
        }
 
        return true;
    }




    public static boolean isSunny(int number) {
        if(Math.sqrt(number+1)%1 == 0)
           return true;
        else return false;
     }


  public void reverseanumber(int n){
      while(n!=0){
          int num = n % 10;
          System.out.print(num);
          n/=10;

      }

  }

  public void addNumber(int n){
      int i=0;
      int sum = 0;
      while(i<=n){
       sum = sum+i;
        i++;
      }
      System.out.println(sum);


  }

  public void addSqnumber(int n){

    int i=0;
      int sum = 0;
      while(i<=n){
       sum = sum+(i*i);
        i++;
      }
      System.out.println(sum);

  }


  public void addOddnumber(int n){

    int i=1;
    int sum = 0;
    while(i<=n){
     sum = sum+i;
      i += 2;
    }
    System.out.println(sum);

  }
  public void addSqOddnumber(int n){

    int i=1;
    int sum = 0;
    while(i<=n){
     sum = sum+(i*i);
      i += 2;
    }
    System.out.println(sum);

  }

  public void subSqOddnumber(int n){

    int i=0;
    int sum = 0;
    while(i<n){
     if(i%2==0){
         sum=sum+(i*i);
     }else{
        sum=sum+((-1)*(i*i));
     
     }
     i += 2;
     
    }
    System.out.println(sum);

  }



  public void pattern1(int m){
      for(int i=0;i<m;i++){
          for(int j=0;j<=i;j++){
              System.out.print("*  ");
          }
          System.out.println(" ");
      }
  }

  public void pattern2(int m){
    for (int i = 1; i <= m; i++) {
  
        
        for (int j = m; j >= i; j--) {
            System.out.print(" ");
        }

      
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        
        System.out.println();
}

}



public void pattern3(int m){
    for (int i = 1; i <= m; i++) {
  
        
        for (int j = m; j >= i; j--) {
            System.out.print("  ");
        }

      
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        
        System.out.println();
}

}

public static void printA(int arr[]){
    for(int m=0;m<arr.length;m++){
       System.out.print(arr[m] + " ");
   }
    
}

public static void swap(int arr[],int i,int j){
    int temp;
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    
}
public static void positivenegetiveseparate(){


    int arr[]={-1,-3,8,-8,9};
  
  
  

  
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            if (i != j) {
                swap(arr,i,j);
            }
            j++;
        }
    }

   printA(arr);
}
    



public void pattern5(int m){
    for (int i = 1; i <= m; i++) {
  
        
        for (int j = m; j >= i; j--) {
            System.out.print(" ");
        }

      
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        
        System.out.println();
}
for (int i = 1; i <= m; i++) {
  
        
    for (int j = 1; j <= i; j++) {
        System.out.print(" ");
    }

  
    for (int j = m; j >= i; j--) {
        System.out.print("* ");
    }

    
    System.out.println();
}
}



public void pattern6(int m){
    for(int i=0;i<=m;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println(" ");
    }
}


public void pattern7(int m){
    int alphabet = 65;
    for(int i=0;i<=m;i++){
        for(int j = 0;j<=i;j++){
            System.out.print((char) (alphabet + j) + " ");
        }
        System.out.println(" ");
    }
}

public void pattern8(){
    for(int i=4;i>=1;i--) {
        for(int j=1;j<=i;j++) {
        System.out.print(j+" ");
        }
        for(int k=i;k<4;k++) {
        System.out.print("* * ");
        }
        for(int m=i;m>=1;m--) {
        System.out.print(m+" ");
        }
        System.out.println();
        }
        

}

public void pattern9(){
    int m = 5;
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= m; j++) {
            if (i == 1 || i == m)
                System.out.print(j);
            else if (j == 1 || j == m){
            
                int sum =0;
                sum += m;
                System.out.print(sum);
            }
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    
   
}
public static void pattern11(){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=in.nextInt();
 
    for(int i=1;i<=n;i++) {
      for(int j=i;j<=n-1;j++) {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++) {
        System.out.print(j);
      }
      for(int j=i-1;j>=1;j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  
}

public void pattern10(){
    int n= 10;
    for (int i = 0; i < n; i++) {
             
        // Loop denoting columns
        for (int j = 0; j < n; j++) {
             
            
            if ( i == j || i + j == n - 1)
                    System.out.print(i);
            else
                    System.out.print(" ");
            }
            System.out.println();
        }

}


public void Devide(){
    //without using / operatror
    int x=10;
    int y =4;
    while(x>y){
        x=x-y;
    }
    System.out.println("the number is " + x);
}

public void removeDuplicate(){
    int arr[] = new int[]{1,2,4,4,5,5,6,6,10};
    int temp[]= new int[arr.length];
    int j=0;

    for(int i=0;i<=arr.length-1;i++){
        if(arr[i]!=arr[i+1]){
            temp[j++] = arr[i];
            
        }


    }



for(int i = 0;i<arr.length-1;i++){
    System.out.println(temp[i]);
}
 }
}
