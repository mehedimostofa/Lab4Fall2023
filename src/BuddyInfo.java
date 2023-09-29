public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Mehedi", "Carleton", 613);
        System.out.println("Hello " + buddyInfo.getName());
    }
}
