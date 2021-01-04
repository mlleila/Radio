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
    public void shouldCheckChangeCurrentRadioStationNext() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckChangeCurrentRadioStationPrev() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckChangeCurrentVolumePlus() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckChangeCurrentVolumeMinus() {
        Radio radio = new Radio();
        int expected;
        radio.setCurrentVolume(-1);
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
}


