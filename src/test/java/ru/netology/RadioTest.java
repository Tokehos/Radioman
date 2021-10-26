package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldCurrentRadioStation() { // Поставить новую радиостанцию
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(2);
        int actual = Radio.getCurrentRadioStation();
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentRadioStationUnderMin() { // Поставить новую радиостанцию ниже допустимой
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(-1);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentRadioStationOverMax() { // Поставить новую радиостанцию ниже допустимой
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(10);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextRadioStation() {  // Поставить следующую станцию с допустимыми значениями
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(2);
        Radio.NextRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 3;
        assertEquals(expected, actual);
    }


    @Test
    void shouldNextRadioStationMaximumToMinimum() { // Поставить следующую радиостанцию с последней на первую
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(9);
        Radio.NextRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldPrevRadioStation() { // Поставить предыдущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(5);
        Radio.PrevRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 4;
        assertEquals(expected, actual);
    }


    @Test
    void shouldPrevRadioStationOnMaximum() { // Поставить предыдущую радиостанцию с первую на последнюю
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(0);
        Radio.PrevRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentRadioVolume() { // Поставить текущую громкость в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(7);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioVolumeUnderMin() { // Поставить текущую громкость ниже допустимой
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(-1);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentRadioVolumeOverMax() { // Поставить текущую громкость выше допустимой
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(11);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentUpRadioVolume() { // Повысить громкость в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(5);
        Radio.UpRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentUpRadioVolumeMax() { // Повысить громкость с максимальным значением
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(10);
        Radio.UpRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentUpRadioVolumeOverMax() { // Повысить громкость указав c минимального значения
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(0);
        Radio.UpRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolume() { // Понизить громкость в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(6);
        Radio.DownRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolumeMin() { // Понизить громкость с минимальным значением
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(0);
        Radio.DownRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolumeUnderMin() { // Понизить громкость указав значение ниже минимального
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(10);
        Radio.DownRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }
}