//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]

        //TO DO
        int row = matrix.length;
        int col = matrix[0].length;
        Integer[] req_array = new Integer[col-1];
        Integer[] sum = new Integer[col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sum[i]+=matrix[j][i];
            }
        }
        for (int i = 0; i < req_array.length; i++) {
            req_array[i] = sum[i+1]-sum[i];
        }
        //DELETE the following return statement when you're ready to return the 2D array
        return req_array;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}