public class Main {
    public static void main(String[] args) {
        String message = "Weather is really good today";
        String newMessage = giveCity();
        message.substring(0, 2);
        int number = gather(4,8);
        int multipleNumbers = gather2(3,5,12,3,6);
        System.out.println(multipleNumbers);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int gather(int number1, int number2) {
        return number1 + number2;
    }

    public static int gather2(int... numbers) {
        int toplam = 0;
        for (int number : numbers) {
            toplam += number;
        }
        return toplam;
    }

    public static String giveCity() {
        return "Ankara";
    }

}