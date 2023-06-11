public class task00 {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,4,3,2,2};
        System.out.println("palindrom(myArray) = " + palindrom(myArray));
    }

    /**
     * @param array входной массив
     * @return симметричен или нет в виде строки
     */
    private static String palindrom(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if(array[i]!=array[array.length-i-1]){
                return "Не симметричный ! ";
            }
        }
        return "Симметричный ! ";
    }
}
