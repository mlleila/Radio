package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
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
        assertEquals(9, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldGetAndSetCurrentRadioStation2() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetCurrentVolume() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }
    @Test
    public void shouldGetAndSetCurrentVolume2() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetAndSetMaxVolume() {
        Radio radio = new Radio();
        int expected;
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
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
        radio.setCurrentVolume(10);
        radio.setCurrentVolumeNext(11);
        assertEquals(10, radio.getCurrentVolumeNext());
    }
    @Test
    public void shouldCheckCurrentVolumeNext2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setCurrentVolumeNext(0);
        assertEquals(0, radio.getCurrentVolumeNext());
    }

    @Test
    public void shouldCheckCurrentVolumePrev() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentVolumePrev(1);
        assertEquals(1, radio.getCurrentVolumePrev());
    }
    @Test
    public void shouldCheckCurrentVolumePrev2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolumePrev(-1);
        assertEquals(0, radio.getCurrentVolumePrev());
    }

    @Test
    public void shouldCheckCurrentRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setCurrentRadioStationNext(0);
        assertEquals(0, radio.getCurrentRadioStationNext());
    }
    @Test
    public void shouldCheckCurrentRadioStationNext2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStationNext(6);
        assertEquals(6, radio.getCurrentRadioStationNext());
    }
    @Test
    public void shouldCheckCurrentRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        radio.setCurrentRadioStationPrev(1);
        assertEquals(1, radio.getCurrentRadioStationPrev());
    }
    @Test
    public void shouldCheckCurrentRadioStationPrev2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStationPrev(-1);
        assertEquals(9, radio.getCurrentRadioStationPrev());
    }

}


