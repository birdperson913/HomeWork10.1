public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStation(15);
        radio.volume=5;
        radio.downVolume();
        radio.next();
        System.out.println(radio.getStation() +" "+ radio.getVolume());
    }
}
