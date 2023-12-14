public class BubbleSort {
    //-------brute force approach-------------
   /* public static void bubbleSort(int[] input){
        for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-1;j++){
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
    }*/
    public static void bubbleSort(int[] input){
        for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-i-1;j++){
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }

}
    public static void main(String[] args){
        int[] input = {6,9,4,8,3,1};
        bubbleSort(input);
        System.out.println("**********Bubble Sort**************");
        for (int i=0;i<input.length-1;i++){
            System.out.println(input[i]+" ");
        }
    }
}
