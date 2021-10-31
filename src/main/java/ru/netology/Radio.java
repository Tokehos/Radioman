package ru.netology;

public class Radio {
    private int currentRadioStation = 5;
    private int amountStation = 10;


    private int currentRadioVolume = 70;


    public Radio() {
    }

    public Radio(int currentRadioStation, int amountStation) {
        this.currentRadioStation = currentRadioStation;
        this.amountStation = amountStation;
    }

    public Radio(int currentRadioVolume) {
        this.currentRadioVolume = currentRadioVolume;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getMaxStation() {
        return amountStation - 1;
    }

    public int getMinStation() {
        return 0;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > getMaxStation()) {
            return;
        }
        if (currentRadioStation < getMinStation()) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxVolume() {
        return 100;
    }

    public int getMinVolume() {
        return 0;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }


    public void nextRadioStation() {

        if (currentRadioStation == getMaxStation()) {
            currentRadioStation = getMinStation();
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }

    }


    public void prevRadioStation() {

        if (currentRadioStation == getMinStation()) {
            currentRadioStation = getMaxStation();
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume < getMinVolume()) {
            return;
        }
        if (currentRadioVolume > getMaxVolume()) {
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }

    public void UpRadioVolume() {

        if (currentRadioVolume == getMaxVolume()) {
            currentRadioVolume = getMaxVolume();
        } else {
            this.currentRadioVolume = currentRadioVolume + 1;
        }

    }

    public void DownRadioVolume() {

        if (currentRadioVolume == getMinVolume()) {
            currentRadioVolume = getMinVolume();
        } else {
            this.currentRadioVolume = currentRadioVolume - 1;
        }
    }
}