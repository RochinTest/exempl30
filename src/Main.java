import java.util.Random;

public class Main {

    public static void main(String[] args){
        final Random random= new Random();
        String[][] array= new String[8][8];
        int count=15;
        for(int i=2; i<10;i++){
            for(int j=2; j<i+1;j++){
                array [i-2][j-2]=i+"x"+j;
               // count ++;
            }
            }while (count!=0){
            String value ;
            int i;
            int j;
            do {
                i = random.nextInt(8);
                j = random.nextInt(8);
                value = array[i][j];
            }while (value==null);
            System.out.println("Чему будет равно выражение " +value+" ");
            array[i][j]=null;
            count--;
            }
        }
        }

