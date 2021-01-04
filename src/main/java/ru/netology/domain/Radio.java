package ru.netology.domain;

public class Radio {
    private String name;
    private int maxVolume;
    private int minVolume;
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
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    //минимальная громкость звука
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }

    // текущая громкость звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

