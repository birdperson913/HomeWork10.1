public class Radio {
    public int volume;
    public int station;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void upVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }


    }

    public void downVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }

    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }


    public void next() {
        if (station < 9) {
            station = station + 1;
        }
        else station=0;

    }

    public void prev() {
        if (station > 0){
            station = station - 1;}
        else station =9;


    }
}
