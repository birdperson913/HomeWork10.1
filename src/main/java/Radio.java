public class Radio {
    private int volume;
    private int station;
    private  int amountStation;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }
    public Radio(){
this.amountStation=10;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void upVolume() {
        if (volume < 100) {
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
        if (station < amountStation) {
            station = station + 1;
        } else station = 0;

    }

    public void prev() {
        if (station > 0) {
            station = station - 1;
        } else station = amountStation-1;


    }
}
