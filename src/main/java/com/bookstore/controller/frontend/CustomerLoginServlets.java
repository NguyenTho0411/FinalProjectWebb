/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package com.bookstore.controller.frontend;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebFilter(filterName = "CustomerLoginServlets", urlPatterns = {"/*"})
public class CustomerLoginServlets implements Filter {
  
    public CustomerLoginServlets() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) sr;
        HttpSession session = request.getSession(false);
        String path = request.getRequestURI().substring(request.getContextPath().length());
        if (path.startsWith("/admin/")) {
            fc.doFilter(sr, sr1);
        }
        boolean t = session != null && session.getAttribute("loggedCustomer")!=null;
        if(!t && path.startsWith("/view_profile")){
            String url ="frontend/login.jsp";
            RequestDispatcher requestDis = request.getRequestDispatcher(url);
            requestDis.forward(sr, sr1);
        }
        else{
            fc.doFilter(sr, sr1);
        }
    }

        @Override
        public void destroy
        
            () {
        Filter.super.destroy(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

    }
