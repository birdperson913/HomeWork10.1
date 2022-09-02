public class Radio {
    public int maxVolume;
    public int maxSation;

    public Radio(int maxVolume, int maxSation) {
        this.maxVolume = maxVolume;
        this.maxSation = maxSation;
    }

    public Radio() {
        this.maxSation = 10;
        this.maxVolume = 100;


    }


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxSation() {
        return maxSation;
    }

    public void setMaxSation(int maxSation) {
        this.maxSation = maxSation;
    }

    public void next() {
        if (maxSation < 10) {
            maxSation = maxSation + 1;
        } else maxSation = 0;

    }

    public void prev() {
        if (maxSation > 0) {
            maxSation = maxSation - 1;
        } else maxSation = 9;
    }

    public void upVolume() {
        if (maxVolume < 100) {
            maxVolume = maxVolume + 1;
        }


    }

    public void downVolume() {
        if (maxVolume > 0) {
            maxVolume = maxVolume - 1;
        }
    }
}
