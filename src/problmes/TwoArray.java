import java.util.Scanner;
class TwoArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of batches:");
        int noBatch = sc.nextInt();
        System.out.println("Enter the number of students:");
        int noStudent = sc.nextInt();
        int arr[][] = new int[noBatch][noStudent];
        for(int i=0;i<noBatch;i++){
            System.out.println("Enter the age of students in batch "+(i+1)+":");
            for(int j=0;j<noStudent;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The ages of students are:");
        for(int i=0;i<noBatch;i++){
            System.out.print("Batch "+(i+1)+": ");
            for(int j=0;j<noStudent;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}