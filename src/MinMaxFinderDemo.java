import java.util.Arrays;

// Generic class function implemented to find min and max for int,array, Lexicographical
class MinMaxFinder<T extends Comparable<T>> {
    private T[] elements;

    public MinMaxFinder(T[] elements) {
        this.elements = elements;
    }
// to find the minimum value
    public T findMin() {
        T min = elements[0];
        for (T element : elements) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
// to find the max value
    public T findMax() {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

public class MinMaxFinderDemo {
    public static void main(String[] args) {
        // Integer array test.
        // So here the logic we converting the given integer ti the arrays.to string.
        // then comparing it function min and max, that check the given input and call the minimum value from finmin() and max value from findMax().
        // same logic applied and called for min max for integer, double array, Lexicographical order.
        Integer[] intArray = {6,2,3,8,9,5};
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(intArray);
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Min: " + intFinder.findMin() + ", Max: " + intFinder.findMax() + "\n");

        // Double array test
        Double[] doubleArray = {3.5, 7.2, 1.8, 9.0};
        MinMaxFinder<Double> doubleFinder = new MinMaxFinder<>(doubleArray);
        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Min: " + doubleFinder.findMin() + ", Max: " + doubleFinder.findMax() + "\n");

        // String array test (Lexicographical order)
        String[] stringArray = {"Apple", "Mango", "Banana", "Cherry"};
        MinMaxFinder<String> stringFinder = new MinMaxFinder<>(stringArray);
        System.out.println("String Array: " + Arrays.toString(stringArray));
        System.out.println("Min: " + stringFinder.findMin() + ", Max: " + stringFinder.findMax());
    }
}