package Ass;

public class DSA5 {

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 4, 0, 0, 0 }, nums2[] = { 4, 5, 7 }, m = 4, n = 3;
		int n2 = m + n, temp = 0;
		for (int i = m, j = 0; i < (m + n); i++, j++) {
			nums1[i] = nums2[j];
		}
		for (int i = 0; i < n2; i++) {
			for (int j = 1; j < (n2 - i); j++) {
				if (nums1[j - 1] > nums1[j]) {
					// swap elements
					temp = nums1[j - 1];
					nums1[j - 1] = nums1[j];
					nums1[j] = temp;
				}

			}

		}
		for (int y : nums1) {
			System.out.print(y);
		}
	}
}