import java.util.*;
public class ArrayQ1 {


    
    //reverse an array
    public void ReverseArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter all the  array values");
        for(int i=0;i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("array is");
    
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        }
        //now reversing the array
        int start=0;
        int end = n-1;
        int temp;
    
       while(start<end){
            
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    
            start++;
            end--;
    
        } 
        
    
        System.out.println("Reversed array is");
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        } 
    }


    //find max of array
    public void FindMaxMin(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter all the  array values");
        for(int i=0;i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("array is");
    
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        for(int k = 0;k<n;k++){
            if(max<arr[k]){
                max=arr[k];
            }
            if(min>arr[k]){
                min=arr[k];
            }
        }
       
        System.out.println("max is "+max);
        System.out.println("min "+min);
    }



    public static void printA(int arr[]){
        for(int m=0;m<arr.length;m++){
           System.out.print(arr[m] + " ");
       }
        
    }


   


    public static void searchanddelete(){
        int arr[] = {1,4,2,5,6};
        
        
        int search=5;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==search){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                
            }
            if(i==arr.length-1){
                arr[i]=0;

            }
         
        }

        for(int m=0;m<arr.length;m++){
            System.out.print(arr[m] + " ");
        }
        

    }

    public static void factorial(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a= in.nextInt();

        
        int p=1;
        for(int i=1;i<=a;i++){
            p*=i;
        }
       
        System.out.println(p==a?"factorial number":"not a factorial number");
    in.close();
    }



    public static void frequencyunique(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        char ch[] = word.toCharArray();

        int count[]=new int[ch.length];
    
        Arrays.fill(count, 1);
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                   count[i]++;
                   ch[j]=' ';
                }
                
            }
            if(ch[i]!=' '){
                System.out.println(ch[i] +" character frequency is"+" "+ count[i]);
            }
            
        }
        in.close();
    }

    //pattern 1,2,1,3,2,5,3,7,5,11,8,13,13,17.....
    public static void upperpattern(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt(); 
        int a[] =new int[n];
        for(int i = 0;i<n;i++){
            
            if(i%2==0){
                // logic to print even numbers
                a[i]=90;
            }
            else if(i == 1 || i == 3 ){
                a[i]=1;
            }
            else{
                a[i]=a[i-2]+a[i-4];
            }

        }
        for(int j=1;j<n;j++){
            System.out.print(a[j]+" ");
        }
        in.close();
    }



    public static void Kthelement(){
        int arr[] = {9,6,5,7,8};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int l = 0;
        int k = in.nextInt()-1;
        Arrays.sort(arr);
        System.out.println("the kth smallest element is "+ arr[l+k]);

        printA(arr);


      


  }

  //merge two sorted array
  //space complexity o(1)
  //time complexsity o(n1*m1)
  public static void mergesortedarray(){
      int a[] = {1,4,6,8,10};
      int b[] = {2,9,11};
        int j=0;
        int temp;
        for(int i=0;i<a.length;i++){
            if(a[i]>b[j]){
                temp=a[i];
                a[i]=b[j];
                b[j]=temp;

                Arrays.sort(b);
            }
        }
        System.out.println(" hence the merged sorted array is");
        printA(a);
        printA(b);

  }



       }
   

