package lk.javainstitute.ee.core.model;

import java.io.Serializable;

public class AuctionItem implements Serializable {
    private String id;
    private String name;
    private double currentBid;

    public AuctionItem() {}

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
