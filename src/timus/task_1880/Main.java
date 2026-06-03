package timus.task_1880;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = readArray(br);
        int[] b = readArray(br);
        int[] c = readArray(br);

        int i = 0, j = 0, k = 0;
        int count = 0;

        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                count++;
                i++;
                j++;
                k++;
            } else {
                int min = Math.min(a[i], Math.min(b[j], c[k]));

                if (a[i] == min) i++;
                if (b[j] == min) j++;
                if (c[k] == min) k++;
            }
        }

        System.out.println(count);
    }

    static int[] readArray(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        return arr;
    }
}
