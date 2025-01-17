
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Result {

	public static void miniMaxSum(List<Integer> arr) {
		// Sort the list to easily find min and max sums
		Collections.sort(arr);

		// Calculate the minimum sum (sum of the first 4 elements)
		long minSum = 0;
		for (int i = 0; i < 4; i++) {
			minSum += arr.get(i);
		}

		// Calculate the maximum sum (sum of the last 4 elements)
		long maxSum = 0;
		for (int i = 1; i < 5; i++) {
			maxSum += arr.get(i);
		}

		// Print the result
		System.out.println(minSum + " " + maxSum);

	}

}

public class Resolution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Result.miniMaxSum(arr);

		bufferedReader.close();
	}
}
