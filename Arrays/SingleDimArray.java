package Arrays;

public class SingleDimArray {
    public static void main(String[] args) {
        // declaring array
        int[] marks = new int[5];

        // way 1 
        int[] newMarks = new int[] {1, 4, 6, 7, 8, 9};
        marks[0] = 54;
        marks[1] = 79;
        marks[2] = 89;
        marks[3] = 69;
        marks[4] = 59;

        // System.out.println(marks[0]);
        // System.out.println(newMarks[4]);

        System.out.println("Using for each loop---");
        for(int mark: marks){
            System.out.print(mark + " ");
        }

        System.out.println("\nUsing Normal Loop....");
        for(int i=0; i<newMarks.length; i++){
            System.out.print(newMarks[i] + " ");
        }

    }
}
