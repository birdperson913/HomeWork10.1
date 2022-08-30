import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeatRadio {

    @Test
            public void upVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.upVolume();
        int actual = 2;
        int extend= radio.getVolume();
        Assertions.assertEquals(actual,extend);
    }
    @Test
    public void upCriticalVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.upVolume();
        int actual = 10;
        int extend= radio.getVolume();
        Assertions.assertEquals(actual,extend);
    }
    @Test
    public void downVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.downVolume();
        int actual = 7;
        int extend= radio.getVolume();
        Assertions.assertEquals(actual,extend);
    }
    @Test
    public void downCriticalCriticalVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.downVolume();
        int actual = 0;
        int extend= radio.getVolume();
        Assertions.assertEquals(actual,extend);
    }
}
