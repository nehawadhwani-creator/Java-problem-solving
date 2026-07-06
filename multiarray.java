public class multiarray {
    public static void main(String[] args){
        int[][] marks = new int[3][3];
        marks[0][0]=10;
        marks[0][1]=99;
        marks[0][2]=69;
        marks[1][0]=35;
        marks[2][0]=63;
        marks[1][1]=67;
        marks[2][2]=59;
        marks[2][1]=27;
        marks[1][2]=14;
       for(int i = 0 ; i < 3 ; i++){
        for(int j = 0 ; j < 3 ; j++){
            System.out.print(marks[i][j]+" ");
        }
        System.out.println();
            
        }
      
    }
    
}
