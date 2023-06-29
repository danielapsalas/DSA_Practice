package datastructures;

public class bigO {

    public static void main(String[] args) {

    }

    //O(n) - in Java coding represents a linear time complexity, where the runtime of an algorithm grows proportionally to the size of the input.
    public static void printItems(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    //O(n^2) - in Java coding represents a quadratic time complexity, where the runtime of an algorithm grows exponentially with the size of the input. It typically involves nested loops or nested iterations over the input data.
    public static void printItems2(int n){
        for(int i = 0; i < n; i++){
            for(int x = 0; x < n; x++){
                System.out.println(i + " " + x);
            }
        }
    }

    //O(1) - in Java coding represents constant time complexity, where the algorithm's runtime remains constant regardless of the size of the input. It is considered highly efficient and desirable.
    public static int printItems3(int n){
        return n + n;
    }

    //O(log n)  in Java coding represents logarithmic time complexity, where the runtime of an algorithm increases logarithmically with the size of the input. It often occurs in algorithms that repeatedly divide the input in half or perform binary search-like operations.

}
