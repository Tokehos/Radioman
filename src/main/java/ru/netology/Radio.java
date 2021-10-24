package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;

    public int getMaxStation() {

        return 9;
    }

    public int getMinStation() {

        return 0;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
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
    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation > getMaxStation()) {
            return;
        }
        if (newRadioStation < getMinStation()) {
            return;
        }
        this.currentRadioStation = newRadioStation;
    }


    public void setNextRadioStation(int newRadioStation) {
        if (newRadioStation > getMaxStation()) {
            return;
        }
        if (newRadioStation < getMinStation()) {
            return;
        }
        if (newRadioStation == getMaxStation()) {
            newRadioStation = getMinStation();
        } else {
            newRadioStation = newRadioStation +1;
        }
        this.currentRadioStation = newRadioStation;
    }


    public void setPrevRadioStation(int newRadioStation) {
        if (newRadioStation > getMaxStation()) {
            return;
        }
        if (newRadioStation < getMinStation()) {
            return;
        }
        if (newRadioStation == getMinStation()) {
            newRadioStation = getMaxStation();
        } else {
            newRadioStation = newRadioStation -1;
        }
        this.currentRadioStation = newRadioStation;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < getMinVolume()) {
            return;
        }
        if (newCurrentRadioVolume > getMaxVolume()) {
            return;
        }
        this.currentRadioVolume = newCurrentRadioVolume;
    }

    public void setUpRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < getMinVolume()) {
            return;
        }
        if (newCurrentRadioVolume > getMaxVolume()) {
            return;
        }
        if (newCurrentRadioVolume == getMaxVolume()) {
            newCurrentRadioVolume = getMaxVolume();
        }
        else {
            newCurrentRadioVolume = newCurrentRadioVolume + 1;
        }
        this.currentRadioVolume = newCurrentRadioVolume;
    }

    public void setDownRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < getMinVolume()) {
            return;
        }
        if (newCurrentRadioVolume > getMaxVolume()) {
            return;
        }
        if (newCurrentRadioVolume == getMinVolume()) {
            newCurrentRadioVolume = getMinVolume();
        }
        else {
            newCurrentRadioVolume = newCurrentRadioVolume - 1;
        }
        this.currentRadioVolume = newCurrentRadioVolume;
    }
}