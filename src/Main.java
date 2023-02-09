public class Main {
    public static void main(String[] args) {

        long [] sales = {34, 54, 21, 76, 345, 643, 12, 456, 68};

        SalesManager salesManager = new SalesManager(sales);

        System.out.println(salesManager.max());
        System.out.println(average(sales));
    }
    public static long average(long [] array){
        long sum = 0;
        long min = array[0] + 1;
        long max = array[0] - 1;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
            sum += array[i];
        }
        return (sum - min - max) / array.length;

    }
}
