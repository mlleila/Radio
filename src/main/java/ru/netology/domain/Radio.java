package ru.netology.domain;

public class Radio {
    private String name;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int currentRadioStation;
    private boolean on;

    // название радио
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // номер радио станции
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    //максимальная громкость звука
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = 10;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    //минимальная громкость звука
    public void setMinVolume(int minVolume) {
        this.minVolume = 0;
    }
    public int getMinVolume() {
        return minVolume ;
    }

    // текущая громкость звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //переключение громкости Next
    public void setCurrentVolumeNext() {
      int currentVolumeNext = currentVolume + 1;
        if (currentVolumeNext > maxVolume) {
            return;
        }
        this.currentVolume = currentVolumeNext;
    }

    public int getCurrentVolumeNext() {
        return currentVolume;
    }
    //переключение громкости Prev
    public void setCurrentVolumePrev() {
      int currentVolumePrev = currentVolume - 1;
        if (currentVolumePrev < minVolume) {
            return;
        }
        this.currentVolume = currentVolumePrev;
    }

    public int getCurrentVolumePrev() {
        return currentVolume;
    }

    //переключение станции Next
    public void setCurrentRadioStationNext() {
      int  currentRadioStationNext = currentRadioStation + 1;
        if (currentRadioStationNext > 9) {
            currentRadioStationNext = 0;
        }
        this.currentRadioStation = currentRadioStationNext;
    }

    public int getCurrentRadioStationNext() {
        return currentRadioStation;
    }

    //переключение станции Prev
    public void setCurrentRadioStationPrev() {
        int currentRadioStationPrev = currentRadioStation - 1;
        if (currentRadioStationPrev < 0) {
            currentRadioStationPrev = 9;
        }
        this.currentRadioStation = currentRadioStationPrev;
    }

    public int getCurrentRadioStationPrev() {
        return currentRadioStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

