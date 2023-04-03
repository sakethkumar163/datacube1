/**
 * sdfgh
 */
public class sdfgh {

    public static void main(String[] args) {
        for(int i=9;i>0;i--){
            System.out.println("");
            for(int k=0;k<10-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                if((j==1||j==i)&&i!=9){

                    System.out.print("* ");
                }
                else if(i==9){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k=0;k<10-i;k++){
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){
                if((j==1||j==i)&&i!=9){

                    System.out.print("* ");
                }
                else if(i==9){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
        
        
        
        for(int i=0;i<10;i++){
            for(int k=10-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j =0;j<i;j++){
                if((j==0||j==i-1)&&i!=9){

                    System.out.print("* ");
                }
                else if(i==9){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k=10-i;k>0;k--){
                System.out.print("  ");
            }
            for(int j =0;j<i;j++){
                if((j==0||j==i-1)&&i!=9){

                    System.out.print("* ");
                }
                else if(i==9){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}