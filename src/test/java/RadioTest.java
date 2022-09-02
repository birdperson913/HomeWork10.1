import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @Test
    public void createRadioAddVolumeAddStation(){
        Radio radio = new Radio(12,4);
        int actualVol = radio.maxVolume;
        int extend = 12;
        Assertions.assertEquals(extend, actualVol);
        int actualSt = radio.maxSation;
        extend = 4;
        Assertions.assertEquals(extend, actualSt);
    }

    @Test
    public void createRadioVolume(){
        Radio radio = new Radio();
       int actual = radio.maxVolume;
       int extend = 100;
        Assertions.assertEquals(extend, actual);
    }
    @Test
    public void createRadioStation(){
        Radio radio = new Radio();
        int actual = radio.maxSation;
        int extend = 10;
        Assertions.assertEquals(extend, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/upVolume.csv")
    public void upVolumeTest(int sVol, int actualv) {
        Radio radio = new Radio();
        radio.setMaxVolume(sVol);
        radio.upVolume();
        int actual = actualv;
        int extend = radio.getMaxVolume();
        Assertions.assertEquals(extend, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/downVolume.csv")
    public void downVolumeTest(int sVol, int actualv) {
        Radio radio = new Radio();
        radio.setMaxVolume(sVol);
        radio.downVolume();
        int actual = actualv;
        int extend = radio.getMaxVolume();
        Assertions.assertEquals(extend, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void nextStation(int sStat, int actualv) {
        Radio radio = new Radio();
        radio.setMaxSation(sStat);
        radio.next();
        int actual = actualv;
        int extend = radio.getMaxSation();
        Assertions.assertEquals(extend, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/revStation.csv")
    public void prevStation(int sStat, int actualv) {
        Radio radio = new Radio();
        radio.setMaxSation(sStat);
        radio.prev();
        int actual = actualv;
        int extend = radio.getMaxSation();
        Assertions.assertEquals(extend, actual);
    }

}

