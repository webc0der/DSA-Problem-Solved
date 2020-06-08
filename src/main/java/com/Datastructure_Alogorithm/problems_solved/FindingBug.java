package com.Datastructure_Alogorithm.problems_solved;

public class FindingBug {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 3, 1, 3, 1,0,0,0,0};
		System.out.println(solution(3,arr));
	}


	static int solution(int M, int[] A) {
		int N = A.length-1;
		int[] count = new int[M + 1];

		for (int i = 0; i <= M; i++)
			count[i] = 0;

		int maxOccurence = 1;
		int index = -1;

		for (int i = 0; i <= N; i++) {
			if (count[A[i]] > 0) {

				int tmp = count[A[i]];
				if (tmp > maxOccurence) {

					maxOccurence = tmp;
					index = i;
				}
				count[A[i]] = tmp + 1;
			} else {
				count[A[i]] = 1;
			}
		}
		return A[index];
	}
}

