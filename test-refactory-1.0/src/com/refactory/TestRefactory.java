package com.refactory;

public class TestRefactory {

	public void sort(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
        	int j = 0;
            while (j < n-i-1) {
                if (arr[j] > arr[j+1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                    count++;
                    System.out.print(count + ". ["+arr[j]+","+arr[j+1]+"] -> ");
                    for (int k = 0; k < arr.length; k++) {
						System.out.print(arr[k]+" ");
					}
                    System.out.print("\n");
                    j = 0;
                } else {
                	j++;
                }
            }
        }
        System.out.println("\nJumlah swap: "+count);
    }
	
	public static void main(String[] args) {
		
		TestRefactory testRefactory = new TestRefactory();
		int arr[] = {4, 9, 7, 5, 8, 9, 3};
		testRefactory.sort(arr);

	}

}
