//Brute force methods_______
public class setmatrix {
    //we are changing the value int the column from zero to -1
    public static void col(int arr[][],int n,int m,int j){
         for (int i=0;i<n;i++){
            if (arr[i][j]!=0)
            arr[i][j]=-1;
         }
    }
    // we are changing the value in the row from zero to -1
 public static void row(int arr[][],int n ,int m , int i){
    for (int j=0;j<m;j++){
        if (arr[i][j]!=0)
        arr[i][j] = -1;
    }
 }
    public static void main(String[]args){
        // we are taking the matrix input
        int arr[][] = {{1,2,3},{3,5,0},{0,4,5}};
        int n = arr.length;//length of the row
        int m = arr[0].length;//length of the column
       //we are finding the zero values in the matrix and sending the value to the above col and row method
        for(int i = 0;i<n;i++){
             for (int j =0;j<m;j++){
                     if (arr[i][j]==0){
                        col(arr, n, m, j);
                        row(arr, n, m, i);
       
                    }
                }
            }
        // now we convert the -1 value to 0
        for (int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if (arr[i][j]== -1){
                    arr[i][j]=0;
                }

            }
        }
        //printing the array
        for (int i =0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//better approach
public class setmatrixbetter {
    public static void main(String []args){
        int arr[][]={{2,3,4},{1,6,9},{0,2,9}};
        int n = arr.length;
        int m = arr[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
        for (int i =0;i<n;i++){
            for (int j =0;j<m;j++){
                if (arr[i][j]==0){
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if ((row[i]==-1)|| (col[j]==-1)){
                    arr[i][j]=0;

                }
            }
        }
        for(int[] a:arr){
            for(int val:a){
                System.out.print(val+" ");
            }
            System.out.println();

        }

    }
    
}
