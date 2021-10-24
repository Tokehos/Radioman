package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldCurrentRadioStation() { // Поставить текущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(5);
        int actual = Radio.getCurrentRadioStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationUnderMin() { // Поставить текущую радиостанцию ниже допустимой
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(-1);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentRadioStationOverMax() { // Поставить текущую радиостанцию выше допустимой
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(10);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationInRange() {
        Radio Radio = new Radio();
        Radio.setNextRadioStation(5);
        int actual = Radio.getCurrentRadioStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnMinimum() {
        Radio Radio = new Radio();

        Radio.setNextRadioStation(-1);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnMaximum() {
        Radio Radio = new Radio();

        Radio.setNextRadioStation(9);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOverMaximum() {
        Radio Radio = new Radio();

        Radio.setNextRadioStation(10);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldPrevStationInRange() {
        Radio Radio = new Radio();
        Radio.setPrevRadioStation(5);
        int actual = Radio.getCurrentRadioStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnMinimum() {
        Radio Radio = new Radio();

        Radio.setPrevRadioStation(-1);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnMaximum() {
        Radio Radio = new Radio();

        Radio.setPrevRadioStation(0);
        int actual = Radio.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOverMaximum() {
        Radio Radio = new Radio();

        Radio.setPrevRadioStation(10);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioVolume() { // Поставить текущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(7);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioVolumeUnderMin() { // Поставить текущую радиостанцию ниже допустимой
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(-1);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentRadioVolumeOverMax() { // Поставить текущую радиостанцию выше допустимой
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(11);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentUpRadioVolume() { // Поставить текущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setUpRadioVolume(7);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentUpRadioVolumeMaxToMin() { // Поставить текущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setUpRadioVolume(10);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentUpRadioVolumeUnderMin() { // Поставить текущую радиостанцию ниже допустимой
        Radio Radio = new Radio();
        Radio.setUpRadioVolume(-1);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentUpRadioVolumeOverMax() { // Поставить текущую радиостанцию выше допустимой
        Radio Radio = new Radio();
        Radio.setUpRadioVolume(11);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolume() { // Поставить текущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setDownRadioVolume(7);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolumeMaxToMin() { // Поставить текущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setDownRadioVolume(0);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolumeUnderMin() { // Поставить текущую радиостанцию ниже допустимой
        Radio Radio = new Radio();
        Radio.setDownRadioVolume(-1);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentDownRadioVolumeOverMax() { // Поставить текущую радиостанцию выше допустимой
        Radio Radio = new Radio();
        Radio.setDownRadioVolume(11);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}