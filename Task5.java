import java.lang.module.FindException;

// Task 05: Game Arena
class Task5{

    //Complete this method so that it gives the Expected Output
    public static void playGame( Integer[][] arena ){
        int row = arena.length, col = arena[0].length;
        int points = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(check_multiple(arena[i][j])){
                    if(check_left(arena, i, j, row, col)){
                        points+=2;
                    }
                    if(check_right(arena, i, j, row, col)) {
                        points+=2;
                    }
                    if(check_up(arena, i, j, row, col)){
                        points+=2;
                    }
                    if(check_down(arena, i, j, row, col)){
                        points+=2;
                    }
                }
            }
        }
        if(points>=10){
            System.out.println("Points Gained: "+points+". Your team has survived the game.");
        }
        else{
            System.out.println("Points Gained: "+points+". Your team is out.");
        }
    }
    public static boolean check_multiple(int num){
        if(num>=50 && num%50==0){
            return true;
        }
        return false;
    }
    public static boolean check_left(Integer[][] arena, int i, int j, int row, int col){
        if(j-1>=0 &&arena[i][j-1]==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean check_right(Integer[][] arena, int i, int j, int row, int col){
        if(j+1<col &&arena[i][j+1]==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean check_up(Integer[][] arena, int i, int j, int row, int col){
        if(i-1>=0 &&arena[i-1][j]==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean check_down(Integer[][] arena, int i, int j, int row, int col){
        if(i+1<row &&arena[i+1][j]==2){
            return true;
        }
        else{
            return false;
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}