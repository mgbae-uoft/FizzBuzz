public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        for(int j = 1; j <= 1000; j++){
            if (j % 3 == 0 && j % 5 == 0){
                i++;
            }
        }
        System.out.println(i);
    }
}
