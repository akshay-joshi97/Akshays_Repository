import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int N = 1_000_000;

        // Test MyHashSet
        MyHashSet mySet = new MyHashSet();
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            mySet.add(i);
        }
        long end = System.nanoTime();
        System.out.println("MyHashSet add time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            mySet.contains(i);
        }
        end = System.nanoTime();
        System.out.println("MyHashSet contains time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            mySet.remove(i);
        }
        end = System.nanoTime();
        System.out.println("MyHashSet remove time: " + (end - start) / 1e6 + " ms");

        // Test Java's built-in HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            hashSet.add(i);
        }
        end = System.nanoTime();
        System.out.println("HashSet add time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            hashSet.contains(i);
        }
        end = System.nanoTime();
        System.out.println("HashSet contains time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            hashSet.remove(i);
        }
        end = System.nanoTime();
        System.out.println("HashSet remove time: " + (end - start) / 1e6 + " ms");
    }
}