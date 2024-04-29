import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] stack = new int[20];
		int top = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
				case "push":
					top++;
					stack[top] = Integer.parseInt(st.nextToken());
					break;
					
				case "pop":
					if(top > 0) {
						System.out.println(stack[top]);
						top--;
					}
					else
						System.out.println(-1);
					break;
					
				case "top":
					if(top == 0)
						System.out.println(-1);
					else
						System.out.println(stack[top]);
					break;
					
				case "size":
					System.out.println(top);
					break;
					
				case "empty":
					if(top == 0)
						System.out.println(1);
					else
						System.out.println(0);
					break;				
			}
			if(top > stack.length/2)
				stack = Arrays.copyOf(stack, stack.length*2);
		}
	}
}