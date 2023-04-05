public class Main {
    public static void main(String[] args) {



        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        int[][] transpoz=new int[3][3];
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++){
                System.out.print("Matris"+array[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++) {
                transpoz[i][j]=array[j][i];
                System.out.print(transpoz[i][j]+" ");
            }
            System.out.println();



            }}

}