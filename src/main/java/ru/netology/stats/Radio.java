package ru.netology.stats;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume<0){
            return;
        }
        if(currentVolume>100){
            return;

        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation<0){
            return;
        }
            if(currentStation>9){
                return;
            }

        this.currentStation = currentStation;
    }
}
