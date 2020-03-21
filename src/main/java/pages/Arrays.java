package pages;

public class Arrays {

	public static void sort(int[] a) {
		int size = a.length;
		int temp=0;
		for (int i = 0; i < size; i++) {
			for(int j=i+1;j<size;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}
			}
		for(int aeach:a) {
			System.out.print(aeach+"\t");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {25,12,46,10,78,82,42};
		
		Arrays.sort(a);
		}
		

}
