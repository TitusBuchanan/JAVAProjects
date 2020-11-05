package com.Hotel;

public class Room {

        private  int idRoom;
        private  int eta;
        private boolean empty;


        public Room(int idRoom, int eta, boolean empty) {
            this.idRoom = idRoom;
            this.eta = eta;
            this.empty = empty;
        }
        public int getEta() {
            return eta;
        }
        public void setEta(int eta) {
            this.eta = eta;
        }
        public boolean isEmpty() {
            return empty;
        }
        public void setEmpty(boolean empty) {
            this.empty = empty;
        }
        public int getIdRoom() {
            return idRoom;
        }
        public void setIdRoom(int idRoom) {
            this.idRoom = idRoom;
        }

}
