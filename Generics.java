package scd;

public class Generics {

    // Generic method for subtracting array elements
    public static <T extends Number> void subtractArray(T[] arr) {

        System.out.print("Result : [");

        for (int i = 0; i < arr.length - 1; i++) {
            double result = arr[i + 1].doubleValue() - arr[i].doubleValue();
            System.out.print(result);

            if (i != arr.length - 2) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 7, 3, 9, 19};
        subtractArray(intArray);

        Double[] doubleArray = {5.5, 6.0, 2.5, 8.0};
        subtractArray(doubleArray);

        Float[] floatArray = {3.5f, 1.2f, 7.3f};
        subtractArray(floatArray);
    }
}
