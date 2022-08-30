public class Main {
    public static void main(String[] args) {

        Radio radio1 = new Radio();
        radio1.setStation(0);
        radio1.prev();

        System.out.println(radio1.getStation());
    }
}
