class App{
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
    public static void pn(){


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
        
    
   public static void main(String[] args)
    {
       StringQ.Kthelement();
     
       
}
}