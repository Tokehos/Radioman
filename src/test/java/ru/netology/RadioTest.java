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
    void shouldNextStationInRange() { // Поставить следующую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setNextRadioStation(5);
        int actual = Radio.getCurrentRadioStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnMinimum() { // Поставить следующую радиостанцию ниже допустимой
        Radio Radio = new Radio();

        Radio.setNextRadioStation(-1);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnMaximum() { // Поставить следующую радиостанцию с последней на первую
        Radio Radio = new Radio();

        Radio.setNextRadioStation(9);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOverMaximum() { // Поставить следующую радиостанцию выше допустимой
        Radio Radio = new Radio();

        Radio.setNextRadioStation(10);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldPrevStationInRange() { // Поставить предыдущую радиостанцию в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setPrevRadioStation(5);
        int actual = Radio.getCurrentRadioStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnMinimum() { // Поставить предыдущую радиостанцию ниже допустимой
        Radio Radio = new Radio();

        Radio.setPrevRadioStation(-1);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnMaximum() { // Поставить предыдущую радиостанцию с первую на последнюю
        Radio Radio = new Radio();

        Radio.setPrevRadioStation(0);
        int actual = Radio.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOverMaximum() { // Поставить предыдущую радиостанцию выше допустимой
        Radio Radio = new Radio();

        Radio.setPrevRadioStation(10);
        int actual = Radio.getCurrentRadioStation();
        int expected = 0;
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
        Radio.setUpRadioVolume(7);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentUpRadioVolumeMax() { // Повысить громкость с максимальным значением
        Radio Radio = new Radio();
        Radio.setUpRadioVolume(10);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentUpRadioVolumeUnderMin() { // Повысить громкость указав значение ниже максимального
        Radio Radio = new Radio();
        Radio.setUpRadioVolume(-1);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentUpRadioVolumeOverMax() { // Повысить громкость указав значение выше максимального
        Radio Radio = new Radio();
        Radio.setUpRadioVolume(11);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolume() { // Повысить громкость в пределах допустимых значений
        Radio Radio = new Radio();
        Radio.setDownRadioVolume(7);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolumeMin() { // Понизить громкость с минимальным значением
        Radio Radio = new Radio();
        Radio.setDownRadioVolume(0);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentDownRadioVolumeUnderMin() { // Понизить громкость указав значение ниже минимального
        Radio Radio = new Radio();
        Radio.setDownRadioVolume(-1);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldCurrentDownRadioVolumeOverMax() { // Понизить громкость указав значение выше максимального
        Radio Radio = new Radio();
        Radio.setDownRadioVolume(11);
        int actual = Radio.getCurrentRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}