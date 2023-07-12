import java.util.Scanner;

class MinMax{
    public int sumMinMAx(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }

        }
        return max+min;
    }

    public static void main(String[] args) {
       MinMax minMax=new MinMax();
        System.out.println("Enter size of the array");
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Sum of MinMax:");
        System.out.println(minMax.sumMinMAx(arr));
    }

        }