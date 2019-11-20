import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int[] myarry = new int[n];
		for(int i = 0;i < n;i++) {
			myarry[i]=console.nextInt();
		}
		int find = console.nextInt();
		boolean isFound = false;
		System.out.println("Enter number of elements in array: Enter "+n+" integers and the element to be searched: ");
		for(int i = 0;i < myarry.length;i++) {
			if(myarry[i] == find) {
				System.out.println("value "+myarry[i] +" found at index "+i);
				isFound = true;
			}
		}
		if(isFound == false) {
			System.out.println("value "+find +" not found");
		}
		
	}

}
