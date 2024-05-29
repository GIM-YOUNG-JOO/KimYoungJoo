import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double d = Double.parseDouble(st.nextToken());
		double h = Double.parseDouble(st.nextToken());
		double w = Double.parseDouble(st.nextToken());

		double tvd = Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2));

		double a = d / tvd;

		int height = (int) Math.floor(a * h);
		int width = (int) Math.floor(a * w);

		System.out.println(height + " " + width);
	}
}
