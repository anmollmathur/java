


class Sorting {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    /* 

   public static void main(String args[]) {
       int arr[] = {2,6,1,5,3,8};


       //bubble sort
       for(int i=0; i<arr.length-1; i++) {
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }


       printArray(arr);
   }
}
*/
    public static void main(String args[]) {/* 
        int arr[]={4,9,6,2,8,5,6,78,445,44};
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;

                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }


      printArray(arr);
*/
    int arr[]={6,9,7,4,8};
    for (int i=1;i<arr.length;i++){
        int current=i;
        int j=i-1;
        while(j >=0||current<arr[j]){
            arr[j+1]=arr[j];
            j--;

        }
        arr[j+1]=current;
        
    }
    printArray(arr);

    }

    }

