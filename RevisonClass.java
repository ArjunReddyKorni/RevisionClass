import java.lang.reflect.Array;


public class RevisonClass {
    public static void main(String[] args) {

        int sum =0;

        int [][] array2D = {{1,2,3,4,5},{5,4,3,2,1},{1,2,3,4,5},{5,4,3,2,1},{1,2,3,4,5}};

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]);
                sum = sum + array2D[i][j];
            }
            System.out.println();

        }
        System.out.println(sum);

    }
    public int addition(int num1,int num2){


        return num1=num2;
    }
    public boolean isPrime(int number){
        boolean responce = true;
        for (int i = 2; i <number ; i++) {
            if(number % i == 0){
                responce = false;
                break;
            }

        }
        return responce;
    }
}
