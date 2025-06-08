package lk.javainstitute.ee.ejb;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.ejb.Stateless;
import lk.javainstitute.ee.core.model.AuctionItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
@Startup
@LocalBean
public class AuctionManager {
    private Map<String, AuctionItem> auctionItems = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        auctionItems.put("1", new AuctionItem("1", "Laptop", 100.0));
        auctionItems.put("2", new AuctionItem("2", "Phone", 50.0));
    }

    public List<AuctionItem> getAllAuctions() {
        return new ArrayList<>(auctionItems.values());
    }

    public AuctionItem getAuctionItem(String id) {
        return auctionItems.get(id);
    }

    public void updateBid(String itemId, double bid) {
        AuctionItem item = auctionItems.get(itemId);
        if (item != null && bid > item.getCurrentBid()) {
            item.setCurrentBid(bid);
        }
    }
}
