package webec

class Room {

    String name;
    int capacity;

    static constraints = {

    }

    @Override
    String toString() { "$name ($capacity)" }
}
