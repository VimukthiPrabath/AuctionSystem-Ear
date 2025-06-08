package lk.javainstitute.ee.servlets;

import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.javainstitute.ee.ejb.BidManager;
import lk.javainstitute.ee.ejb.SessionManager;

import java.io.IOException;

@WebServlet
public class BidServlet extends HttpServlet {
    @Inject
    private BidManager bidManager;
    @Inject private SessionManager sessionManager;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String itemId = req.getParameter("itemId");
        double bid = Double.parseDouble(req.getParameter("amount"));
        String user = sessionManager.getCurrentUser();

        bidManager.placeBid(itemId, bid, user);
        resp.getWriter().write("Bid placed successfully");
    }
}
