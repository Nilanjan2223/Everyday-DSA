class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
		int i = 0, j = 0;
		if (n < m )
			return "No";
		Arrays.sort(a1); // sorts arr1
		Arrays.sort(a2); // sorts arr2

		while (i < m && j < n) {
			if (a1[j] < a2[i])
				j++;
			else if (a1[j] == a2[i]) {
				j++;
				i++;
			}
			else if (a1[j] > a2[i])
				return "No";
		}

		if (i < m)
			return "No";
		else
			return "Yes";
	}
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) 
        {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
 
        return i + 1;
    }
        
        static void sort(int arr[],int low,int high){
            if (low<high){
                int pi = partition(arr,low,high);
                sort (arr,low,pi-1);
                sort(arr,pi+1,high);
                
            }
        }
    }
        
        
