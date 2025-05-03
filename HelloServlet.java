package com.fawry.product_manager_servelts;

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.ws.rs.core.MediaType;

@WebServlet("/api/product-manager")
public class HelloServlet extends HttpServlet {
    private ObjectMapper mapper = new ObjectMapper();
    public ProductService productService = ProductService.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.APPLICATION_JSON);
        Product product = mapper.readValue(request.getReader(), Product.class);
        productService.addProduct(product);
        PrintWriter out = response.getWriter();
        out.println(mapper.writeValueAsString("Product with ID " + product.getId() + " added successfully."));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.APPLICATION_JSON);
        String idString = request.getParameter("id");

        if(idString == null || idString.isEmpty()) {
            PrintWriter out = response.getWriter();
            out.println(mapper.writeValueAsString(productService.getAllProducts()));
            return;
        }
        int id = Integer.parseInt(idString);
        Product product = productService.getProduct(id);
        PrintWriter out = response.getWriter();
        out.println(mapper.writeValueAsString(product));
        out.println(mapper.writeValueAsString("Product with ID " + id + " retrieved successfully."));
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.APPLICATION_JSON);
        int id = Integer.parseInt(request.getParameter("id"));

        productService.deleteProduct(id);
        PrintWriter out = response.getWriter();
        out.println(mapper.writeValueAsString("Product with ID " + id + " deleted successfully."));
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType(MediaType.APPLICATION_JSON);
        int id = Integer.parseInt(request.getParameter("id"));

        Product product = mapper.readValue(request.getReader(), Product.class);
        productService.updateProduct(id, product);
        PrintWriter out = response.getWriter();
        out.println(mapper.writeValueAsString("Product with ID " + id + " updated successfully."));
    }
}