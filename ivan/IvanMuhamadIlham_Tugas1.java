public class IvanMuhamadIlham_Tugas1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int sum = 0, avg = 0;


		System.out.println("\nIsi Array :");
			for (int i=0; i<arr.length; i++ ){
				System.out.println(arr[i]);
			}

		System.out.println("\nJumlah Semua Array :");
			for (int i=0; i<arr.length; i++ ){
				sum += arr[i];
			}
			System.out.println(sum);

		System.out.println("\nRata-Eata Semua Array :");
			avg = sum/arr.length;
			System.out.println(avg);
	}
}