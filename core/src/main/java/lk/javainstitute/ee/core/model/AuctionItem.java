package lk.javainstitute.ee.core.model;

public class AuctionItem {
    private String id;
    private String name;
    private double currentBid;

    public AuctionItem(String number, String laptop, double v) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(double currentBid) {
        this.currentBid = currentBid;
    }
}
