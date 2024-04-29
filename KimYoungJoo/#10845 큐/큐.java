import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] stack = new int[20];
		int front = 0;
		int back = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
				case "push":
					stack[back] = Integer.parseInt(st.nextToken());
					back++;
					break;

				case "pop":
					if (back > front) {
						System.out.println(stack[front]);
						front++;
					} else
						System.out.println(-1);
					break;

				case "back":
					if (back == front)
						System.out.println(-1);
					else
						System.out.println(stack[back-1]);
					break;

				case "front":
					if (back == front)
						System.out.println(-1);
					else
						System.out.println(stack[front]);
					break;

				case "size":
					System.out.println(back - front);
					break;

				case "empty":
					if (back == front)
						System.out.println(1);
					else
						System.out.println(0);
					break;
			}
			if (back > stack.length / 2)
				stack = Arrays.copyOf(stack, stack.length * 2);
		}
	}
}