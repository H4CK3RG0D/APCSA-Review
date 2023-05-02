import java.lang.ProcessBuilder.Redirect;

public class ArrayTester
{
    /** Returns an array containing the elements of column c of arr2D in the same order as
     *  they appear in arr2D.
     *  Precondition: c is a valid column index in arr2D.
     *  Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[][] arr2D, int c) {  
        // a
        int[] result = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            result[i] = arr2D[i][c];
        }
        return result;
    }

    public static void main(String[] args)
    {
         int [] [] arr2D = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 }};
         boolean test = isLatin(arr2D);
         System.out.println("If isLatin is implemented correctly, then test should be true:" + test);
         if (!test)
         {
             System.out.print("Uh oh! isLatin(test) was false, but it should be true.");
         }
         else {
          System.out.println("Correct!");
        }
    }

    /** Returns true if and only if every value in arr1 appears in arr2.
      * Precondition: arr1 and arr2 have the same length.
      * Postcondition: arr1 and arr2 are unchanged.
      */
    public static boolean hasAllValues(int [] arr1, int [] arr2) {
        boolean[] flags = new boolean[arr1.length]; // default values false

        for(int i = 0; i < arr1.length; i++){
          for(int j = 0; j < arr2.length; j++){
            if(arr1[i] == arr2[j]){
              flags[i] = true;
            }
          }
        }
        for(boolean b: flags){
          if(b == false){
            return false;
          }
        }
        return true;
    }

    /** Returns true if arr contains any duplicate values;
      * false otherwise.
      */
    public static boolean containsDuplicates(int [] arr) { 
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false; 
    }

    /** Returns true if square is a Latin square as described in part (b);
      * false otherwise.
      * Precondition: square has an equal number of rows and columns.
      * Precondition: square has at least one row.
      */
    public static boolean isLatin(int[][] square) {
        // b
        if (containsDuplicates(square[0])) {
            return false;
        }
        for (int i = 0; i < square.length; i++) {
            if (!hasAllValues(square[0], square[i])) {
                return false;
            }
        }
        for (int j = 0; j < square[0].length; j++) {
            if (!hasAllValues(square[0], getColumn(square, j))) { 
                return false;
            }
        }
        return true;
    }
}