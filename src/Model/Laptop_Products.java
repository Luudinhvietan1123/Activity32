package Model;

public class Laptop_Products {
    private int laptoID;
    private String laptopName;
    private String laptopUrl;
    private String laptopMaker;
    private String laptopType;
    private String laptopRam;
    private String laptopCPU;
    private String laptopSsd;
    private String laptopHdd;
    private int laptopPrice;
    private String laptopCard;
    private String laptopScreenResolution;
    private float laptopScreenSize;
    private int laptopSold;
    private String created_timestamp;
    private String last_updated_timestamp;

    public Laptop_Products(){}

    public String getLast_updated_timestamp() {
        return last_updated_timestamp;
    }

    public void setLast_updated_timestamp(String last_updated_timestamp) {
        this.last_updated_timestamp = last_updated_timestamp;
    }

    public String getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(String created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public int getLaptopSold() {
        return laptopSold;
    }

    public void setLaptopSold(int laptopSold) {
        this.laptopSold = laptopSold;
    }

    public float getLaptopScreenSize() {
        return laptopScreenSize;
    }

    public void setLaptopScreenSize(float laptopScreenSize) {
        this.laptopScreenSize = laptopScreenSize;
    }

    public String getLaptopScreenResolution() {
        return laptopScreenResolution;
    }

    public void setLaptopScreenResolution(String laptopScreenResolution) {
        this.laptopScreenResolution = laptopScreenResolution;
    }

    public String getLaptopCard() {
        return laptopCard;
    }

    public void setLaptopCard(String laptopCard) {
        this.laptopCard = laptopCard;
    }

    public int getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(int laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public String getLaptopHdd() {
        return laptopHdd;
    }

    public void setLaptopHdd(String laptopHdd) {
        this.laptopHdd = laptopHdd;
    }

    public String getLaptopSsd() {
        return laptopSsd;
    }

    public void setLaptopSsd(String laptopSsd) {
        this.laptopSsd = laptopSsd;
    }

    public String getLaptopCPU() {
        return laptopCPU;
    }

    public void setLaptopCPU(String laptopCPU) {
        this.laptopCPU = laptopCPU;
    }

    public String getLaptopRam() {
        return laptopRam;
    }

    public void setLaptopRam(String laptopRam) {
        this.laptopRam = laptopRam;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public String getLaptopMaker() {
        return laptopMaker;
    }

    public void setLaptopMaker(String laptopMaker) {
        this.laptopMaker = laptopMaker;
    }

    public String getLaptopUrl() {
        return laptopUrl;
    }

    public void setLaptopUrl(String laptopUrl) {
        this.laptopUrl = laptopUrl;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getLaptoID() {
        return laptoID;
    }

    public void setLaptoID(int laptoID) {
        this.laptoID = laptoID;
    }

    public Laptop_Products(int ID, String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd,
                    int price, String card, String screenResolution, float size, int sold, String created_timestamp, String last_updated_timestamp){
        this.laptoID = ID;
        this.laptopName = name;
        this.laptopUrl = url;
        this.laptopMaker = maker;
        this.laptopType = type;
        this.laptopRam = ram;
        this.laptopCPU = cpu;
        this.laptopSsd = ssd;
        this.laptopHdd = hdd;
        this.laptopPrice = price;
        this.laptopCard = card;
        this.laptopScreenResolution = screenResolution;
        this.laptopScreenSize = size;
        this.laptopSold = sold;
        this.created_timestamp = created_timestamp;
        this.last_updated_timestamp = last_updated_timestamp;
    }
}
