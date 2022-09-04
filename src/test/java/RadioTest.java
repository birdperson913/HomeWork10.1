import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/amountVolume.csv")
    public void amountStationTest(int sStation, int actualSt, int amountStation)
    {
        Radio radio = new Radio(amountStation);
        radio.setStation(sStation);
        int actual= actualSt;
        radio.next();
        int extend = radio.getStation();
        Assertions.assertEquals(extend, actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/upVolume.csv")
    public void upVolumeTest(int sVol, int actualv) {
        Radio radio =  new Radio();
        radio.setVolume(sVol);
        radio.upVolume();
        int actual = actualv;
        int extend = radio.getVolume();
        Assertions.assertEquals(extend, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/downVolume.csv")
    public void downVolumeTest(int sVol, int actualv) {
        Radio radio = new Radio();
        radio.setVolume(sVol);
        radio.downVolume();
        int actual = actualv;
        int extend = radio.getVolume();
        Assertions.assertEquals(extend, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void nextStation(int sStat, int actualv) {
        Radio radio = new Radio();
        radio.setStation(sStat);
        radio.next();
        int actual = actualv;
        int extend = radio.getStation();
        Assertions.assertEquals(extend, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/revStation.csv")
    public void prevStation(int sStat, int actualv) {
        Radio radio = new Radio();
        radio.setStation(sStat);
        radio.prev();
        int actual = actualv;
        int extend = radio.getStation();
        Assertions.assertEquals(extend, actual);
    }

}
