package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Fer on 12/21/16.
 */
@WebServlet(name = "EditAdServlet", urlPatterns = "/ads/delete")
public class DeleteAdServlet extends HttpServlet {

    Ads dao = DaoFactory.getAdsDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id"));
        dao.delete(id);
        response.sendRedirect("/ads");
    }

}
