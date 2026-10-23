
import java.util.Arrays;


class Searchin2dArray{
	public static void main(String []args) {
        int target=202;
		int [][] arr={ {1,22,33},
					   {22,11,202,21,21},
					   {11,22,44,56,22} 
					 };
        int []arrtemp=search(arr);
		System.err.println(Arrays.toString(arrtemp));
	}
    static int[] search(int [][]arr){
        for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==44) {
					return new int[]{i,j};
				}
			}
		}
        return  new int[]{-1,-1};
    }
}