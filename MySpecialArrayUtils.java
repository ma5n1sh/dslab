public class MySpecialArrayUtils {


        public static void reverse(int[] arr){
            int size = arr.length;
            int i;
            for(i=0;i<size/2;i++){arr[i]=arr[i]^arr[size-1-i];arr[size-1-i]=arr[i]^arr[size-1-i];arr[i]=arr[i]^arr[size-1-i];}

        }
        public static int[] sumEvenOdd(int[] arr){
            int sum[]={0,0};
            int size = arr.length;
            int i;
            for(i=0;i<size;i++){if(arr[i] % 2==0){sum[0]+=arr[i];}
            else {sum[1]+=arr[i];}}
            return sum;
        }

        public static double average(int[] arr){
            double average=0;
            int i;
            for(i=0;i<arr.length;i++){average+=((double)arr[i]/(double)arr.length);}
            return average;

        }
        public static void moveValue(int[] arr, int val){
            int i,j,temp,c=0;
            for(i=0;i<arr.length-c;i++){
                if(arr[i]==val){c++;
                    for(j=0;i+j+1<arr.length;j++){temp=arr[i+j];arr[i+j]=arr[i+j+1];arr[i+j+1]=temp;}
                }
                if(arr[i]==val){i--;}
            }
        }


        public static int [][] transpose(int[][] arr){
            int r=arr.length;
            int c=arr[0].length;
            int[][] x=new int[c][r];
            int i,j;
            for(i=0;i<c;i++){
                for(j=0;j<r;j++){
                    x[i][j]=arr[j][i];
                }
            }
            return x;

        }






    }






