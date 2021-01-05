package ru.netology.domain;

public class Radio {
    private String name;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int currentVolumeNext;
    private int currentVolumePrev;
    private int currentRadioStation;
    private int currentRadioStationNext;
    private int currentRadioStationPrev;
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
        return minVolume;
    }

    // текущая громкость звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = currentVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //переключение громкости Next
    public void setCurrentVolumeNext(int currentVolumeNext) {
      currentVolumeNext = currentVolume + 1;
        if (currentVolumeNext > maxVolume) {
            currentVolumeNext = currentVolume;
        }
        this.currentVolumeNext = currentVolumeNext;
    }

    public int getCurrentVolumeNext() {
        return currentVolumeNext;
    }
    //переключение громкости Prev
    public void setCurrentVolumePrev(int currentVolumePrev) {
        currentVolumePrev = currentVolume - 1;
        if (currentVolumePrev < minVolume) {
            return;
        }
        this.currentVolumePrev = currentVolumePrev;
    }

    public int getCurrentVolumePrev() {
        return currentVolumePrev;
    }

    //переключение станции Next
    public void setCurrentRadioStationNext(int currentRadioStationNext) {
        currentRadioStationNext = currentRadioStation + 1;
        if (currentRadioStationNext > 9) {
            currentRadioStationNext = 0;
        }
        this.currentRadioStationNext = currentRadioStationNext;
    }

    public int getCurrentRadioStationNext() {
        return currentRadioStationNext;
    }

    //переключение станции Prev
    public void setCurrentRadioStationPrev(int currentRadioStationPrev) {
        currentRadioStationPrev = currentRadioStation - 1;
        if (currentRadioStationPrev < 0) {
            currentRadioStationPrev = 9;
        }
        this.currentRadioStationPrev = currentRadioStationPrev;
    }

    public int getCurrentRadioStationPrev() {
        return currentRadioStationPrev;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

