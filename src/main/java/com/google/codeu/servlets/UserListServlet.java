package com.google.codeu.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;
import com.google.codeu.data.Datastore;
import java.util.Arrays;
/**
 * Handles fetching all users for the community page.
 */
@WebServlet("/user-list")
public class UserListServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    response.getOutputStream().println("this will be my user list");
    Datastore ds = new Datastore();
    Set<String> users = ds.getUsers();
    response.getOutputStream().println(Arrays.toString(users.toArray()));
    //response.getOutputStream().println(users);
  }




}