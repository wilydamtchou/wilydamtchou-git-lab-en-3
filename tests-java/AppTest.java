public class AppTest {
    public static void main(String[] args) {
        testAdd();
        testDisplayWeather();
    }

    public static void testDisplayWeather() {
        System.out.println("Testing displayWeather method...");
        App.displayWeather();
    }

    public static void testAdd() {
        System.out.println("Testing add method...");
        int sum = App.add(15, 25);
        if (sum == 40) {
            System.out.println("add method works correctly.");
        } else {
            System.exit(1);
            System.out.println("add method failed.");
        }
    }
}