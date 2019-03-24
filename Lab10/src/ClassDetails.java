public class ClassDetails {
    private String name;  //e.g. Algorithms
    private String roomNumber;   //e.g. R203

    @Override
    public String toString() {
        return "ClassDetails" +
                "\nName: " + name +
                "\nRoom Number: " + roomNumber ;
    }

    public ClassDetails(String name, String roomNumber) {
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
