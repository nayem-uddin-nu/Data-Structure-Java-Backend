package Arrays;

public class MultiDimArray {
    public static void main(String[] args) {
        int[][] marks = {
            {76, 23, 54, 54, 34, 58},
            { 65, 34, 76, 43, 64},
            {76, 98, 76, 45}
        };

        for(int[] mark: marks){
            for(int mark1: mark){
                System.out.print(mark1 + " ");
            }
            System.out.println();
        }
    }
}
