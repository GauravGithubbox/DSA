public class BinarySearch {
    public static int binarySearch(int[] input,int element){
        int startIndex=0;
        int endIndex=input.length-1;
        while(startIndex<=endIndex){
            int midIndex=(startIndex+endIndex)/2;
            if(element==input[midIndex]){
                return midIndex;
            }if (element>input[midIndex]) {
                startIndex=midIndex+1;
            }if(element<input[midIndex]){
                endIndex=midIndex-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] input = {2,10,21,22,26,65};
        int index = binarySearch(input,65);
        System.out.println("Index value is = "+index);
    }
}