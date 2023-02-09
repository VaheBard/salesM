public class Main {
    public static void main(String[] args) {

        int [] sales = {1,2,3,4,5,6};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println(salesManager.max());
        System.out.println(average(sales));
    }
    public static long average(int [] array){
        int sum = 0;
        int min = array[0] + 1;
        int max = array[0] - 1;
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
