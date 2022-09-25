public class Main {
    public static void main(String[] args) {
        int numbers[] =new int[]{1,2,5,7,9};
        int find = 6;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == find) {
                isThere = true;
                break;
            }
        }
        if (isThere == true) {
            System.out.println("There is like that number");
        }else {
            System.out.println("There is not like that number");
        }
    }
}