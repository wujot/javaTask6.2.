public class MultiArrayTest {

    public static void main(String[] args) {

        // create two dimensional array
        MultiArray array = new MultiArray(10,10);
        System.out.println("Multidimensional array was created.\n");

        System.out.println("Array looks like that:\n");
        // print array
        array.print(array);

        System.out.println("Array was filled up by new random numbers.\n");
        // fill up array with new random numbers
        array.randomize(array);

        System.out.println("Now array looks like that:\n");
        // print array
        array.print(array);

        // find min value and print it
        System.out.printf("The minimum value in array is: %d\n", array.findMin(array));

        // find max value and print it
        System.out.printf("The maximum value in array is: %d\n", array.findMax(array));
    }
}
