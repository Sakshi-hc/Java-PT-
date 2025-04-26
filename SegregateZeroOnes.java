
package javahw;

public class SegregateZeroOnes {
    public static void segregateZeroOnes(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]==0){
                left++;
                
            }
            else if(arr[right]==1){
                right--;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={0, 1, 0, 1, 0, 1, 1};
        segregateZeroOnes(arr);
        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}

   
