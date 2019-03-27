import java.util.Scanner;

public class searchMaxValueInArrayTwoDimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers rows for Matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter numbers cols for Matrix:");
        int cols = scanner.nextInt();
        // Enter element for matrix
        double [][] matrix = new double[rows][cols];
        for (int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter Element for row "+ (i+1)+" - col "+(j+1)+" is: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        //Show matrix
        System.out.print("Matrix is: ");
        for (int i=0; i<rows;i++){
            System.out.println(" ");
            for (int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
        }
        //Search element max
        double max = matrix[0][0];
        int indexRows = 1, indexClos = 1;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                    indexRows = i+1;
                    indexClos = j+1;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Element has value Max in Matrix is: "+ max);
        System.out.println("Element value Max in Matrix at row : "+ indexRows +", col : "+indexClos);
    }
}
