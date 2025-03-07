// Task 04: Matrix Compression
class Task4{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        //For this task you'll need to create new 2D array
        
        //TO DO
        int row = matrix.length, col = matrix[0].length;
        int len = (row * col)/(2*4);
        Integer[][] new_matrix = new Integer[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                new_matrix[i][j] = matrix[len*i][len*j] + matrix[len*i][len*j+1] + matrix[len*i+1][len*j] + matrix[len*i+1][len*j+1];
            }
        }
        //remove the line below and return the newly created Compressed 2D matrix
        return new_matrix;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}