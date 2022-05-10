package com.zhou.homework01.Door;

public class Door {
    public static final boolean DOOR_ON = true;
    public static final boolean DOOR_OFF = false;
    private Bell bell;
    private boolean doorState = DOOR_OFF;

    public Door() {
    }

    public Door(Bell bell) {
        this.bell = bell;
    }

    public Bell getBell() {
        return bell;
    }

    public void setBell(Bell bell) {
        this.bell = bell;
    }

    public boolean isDoorState() {
        return doorState;
    }

    public void setDoorState(boolean doorState) {
        this.doorState = doorState;
    }
    public void openDoor() {
        setDoorState(DOOR_ON);
        bell.setBellOff();
    }

    public void offDoor() {
        setDoorState(DOOR_OFF);
    }

    public static class Bell {
        public static final boolean BELL_ON = true;
        public static final boolean BELL_OFF = false;
        private boolean state = BELL_OFF;

        public boolean isState() {
            return state;
        }

        public void setState(boolean state) {
            this.state = state;
        }

        public void setBellOn() {
            setState(BELL_ON);
        }

        public void setBellOff() {
            setState(BELL_OFF);
        }


    }


}
