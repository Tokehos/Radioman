package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldCurrentRadioStation() { // Поставить новую радиостанцию
        Radio Radio = new Radio(3, 5);
        Radio.setCurrentRadioStation(2);
        int actual = Radio.getCurrentRadioStation();
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentRadioStationUnderMin() { // Поставить новую радиостанцию ниже допустимой
        Radio Radio = new Radio(3, 5);
        Radio.setCurrentRadioStation(-1);
        int actual = Radio.getCurrentRadioStation();
        int expected = 3;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentRadioStationOverMax() { // Поставить новую радиостанцию выше допустимой
        Radio Radio = new Radio(3, 5);
        Radio.setCurrentRadioStation(5);
        int actual = Radio.getCurrentRadioStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationWoParams() { // Поставить новую радиостанцию,в пределах допустимого значения, используем конструктор без параметров
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(8);
        int actual = Radio.getCurrentRadioStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationOverMaxWoParams() { // Поставить новую радиостанцию указав значение выше допустимого, используем конструктор без параметров
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(10);
        int actual = Radio.getCurrentRadioStation();
        int expected = 5;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextRadioStation() {  // Поставить следующую станцию с допустимыми значениями
        Radio Radio = new Radio(3, 5);
        Radio.setCurrentRadioStation(2);
        Radio.nextRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationWoParams() {  // Поставить следующую станцию, в пределах допустимого значения, используем конструктор без параметров
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(6);
        Radio.nextRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 7;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextRadioStationMaximumToMinimum() { // Поставить следующую радиостанцию с последней на первую
        Radio Radio = new Radio(3, 5);
        Radio.setCurrentRadioStation(4);
        Radio.nextRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextRadioStationMaximumToMinimumWoParams() { // Поставить следующую радиостанцию с последней на первую, используем конструктор без параметров
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(9);
        Radio.nextRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() { // Поставить предыдущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio(3, 5);
        Radio.setCurrentRadioStation(2);
        Radio.prevRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationWoParams() { // Поставить предыдущую радиостанцию в пределах допустимых значений, используем конструктор без параметров
        Radio Radio = new Radio();
        Radio.setCurrentRadioStation(9);
        Radio.prevRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationOnMaximum() { // Поставить предыдущую радиостанцию с первую на последнюю
        Radio Radio = new Radio(3, 5);
        Radio.setCurrentRadioStation(0);
        Radio.prevRadioStation();
        int actual = Radio.getCurrentRadioStation();
        int expected = 4;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentRadioVolume() { // Поставить текущую громкость в пределах допустимых значений
        Radio Radio = new Radio(50);
        Radio.setCurrentRadioVolume(60);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioVolumeUnderMin() { // Поставить текущую громкость ниже допустимой
        Radio Radio = new Radio(50);
        Radio.setCurrentRadioVolume(-1);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 50;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentRadioVolumeOverMax() { // Поставить текущую громкость выше допустимой
        Radio Radio = new Radio(50);
        Radio.setCurrentRadioVolume(101);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentUpRadioVolume() { // Повысить громкость в пределах допустимых значений
        Radio Radio = new Radio(50);
        Radio.setCurrentRadioVolume(55);
        Radio.UpRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 56;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentUpRadioVolumeWoParams() { // Повысить громкость в пределах допустимых значений, используем конструктор без параметров
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(45);
        Radio.UpRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 46;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentUpRadioVolumeMax() { // Повысить громкость с максимальным значением
        Radio Radio = new Radio(50);
        Radio.setCurrentRadioVolume(100);
        Radio.UpRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentUpRadioVolumeOverMax() { // Повысить громкость указав c минимальное значение
        Radio Radio = new Radio(50);
        Radio.setCurrentRadioVolume(0);
        Radio.UpRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentDownRadioVolume() { // Понизить громкость в пределах допустимых значений
        Radio Radio = new Radio(50);
        Radio.setCurrentRadioVolume(45);
        Radio.DownRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 44;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentDownRadioVolumeWoParams() { // Понизить громкость в пределах допустимых значений, используем конструктор без параметров
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(55);
        Radio.DownRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 54;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentDownRadioVolumeMin() { // Понизить громкость с минимальным значением
        Radio Radio = new Radio(50);
        Radio.setCurrentRadioVolume(0);
        Radio.DownRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentDownRadioVolumeUnderMin() { // Понизить громкость указав значение в пределах допустимого значения, используем конструктор без параметров
        Radio Radio = new Radio();
        Radio.setCurrentRadioVolume(44);
        Radio.DownRadioVolume();
        int actual = Radio.getCurrentRadioVolume();
        int expected = 43;
        assertEquals(expected, actual);
    }
}