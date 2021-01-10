package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldGetAndSetNumberOfStations() {
        Radio radio = new Radio();
        int expected;
        radio.setNumberOfStations(15);
        assertEquals(15, radio.getNumberOfStations());
    }

    @Test
    public void shouldGetAndSetName() {
        Radio radio = new Radio();
        String expected = "Радио";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void shouldGetAndSetCurrentRadioStation() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentRadioStation(-1);
        assertEquals(15, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldGetAndSetCurrentRadioStation2() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentRadioStation(16);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetCurrentVolume() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldGetAndSetCurrentVolume2() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetAndSetMaxVolume() {
        Radio radio = new Radio();
        int expected;
        radio.setMaxVolume(100);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldGetAndSetMinVolume() {
        Radio radio = new Radio();
        int expected;
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldCheckIsOn() {
        Radio radio = new Radio();
        boolean on;
        radio.setOn(true);
        assertEquals(true, radio.isOn());
    }

    @Test
    public void shouldCheckCurrentVolumeNext() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolumeNext();
        assertEquals(100, radio.getCurrentVolumeNext());
    }

    @Test
    public void shouldCheckCurrentVolumeNext2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentVolumeNext();
        assertEquals(3, radio.getCurrentVolumeNext());
    }

    @Test
    public void shouldCheckCurrentVolumePrev() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
       radio.setCurrentVolumePrev();
        assertEquals(0, radio.getCurrentVolumePrev());
    }
    @Test
    public void shouldCheckCurrentVolumePrev2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolumePrev();
        assertEquals(0, radio.getCurrentVolumePrev());
    }

    @Test
    public void shouldCheckCurrentRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStationNext();
        assertEquals(1, radio.getCurrentRadioStationNext());
    }
    @Test
    public void shouldCheckCurrentRadioStationNext2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(15);
       radio.setCurrentRadioStationNext();
        assertEquals(0, radio.getCurrentRadioStationNext());
    }
    @Test
    public void shouldCheckCurrentRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
       radio.setCurrentRadioStationPrev();
        assertEquals(0, radio.getCurrentRadioStationPrev());
    }
    @Test
    public void shouldCheckCurrentRadioStationPrev2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStationPrev();
        assertEquals(15, radio.getCurrentRadioStationPrev());
    }

}


