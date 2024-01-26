public class Device {
    public String name;
    public int modelNumber;

    public Device(String name, int modelNumber) {
        this.name = name;
        this.modelNumber = modelNumber;
    }
    public Device(int modelNumber, String name) {
        this.name = name;
        this.modelNumber = modelNumber;
    }

    public Device(String name) {
        this.name = name;
    }

    public Device(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Device() {
    }
}
