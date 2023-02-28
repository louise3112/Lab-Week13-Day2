package cars;

public enum Size {

    COMPACT (2, 4),
    MIDSIZE (4, 5),
    FAMILY (4, 7);

    private final int doorNum;
    private final int seatNum;

    Size(int doorNum, int seatNum) {
        this.doorNum = doorNum;
        this.seatNum = seatNum;
    }

    public int getDoorNum() {
        return this.doorNum;
    }

    public int getSeatNum() {
        return this.seatNum;
    }
}
