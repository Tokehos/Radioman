package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getMaxStation() {
        return 9;
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
        return 10;
    }

    public int getMinVolume() {
        return 0;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }


    public void NextRadioStation() {

        if (currentRadioStation == getMaxStation()) {
            currentRadioStation = getMinStation();
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }

    }


    public void PrevRadioStation() {

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