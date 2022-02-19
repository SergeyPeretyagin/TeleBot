package Servlet;

import Bot.Bot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Bot.start();
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("AAAAAAAAAAAAAAAA");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
