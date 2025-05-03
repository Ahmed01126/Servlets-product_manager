# Servlets Product Manager

A simple Java Servlet-based application for managing products.

## Features

- Add new products
- View product list
- Update existing products
- Delete products

## Technologies Used

- Java Servlet API
- JSP (JavaServer Pages)
- JDBC (Java Database Connectivity)
- MySQL Database
- Apache Tomcat Server

## Project Structure

```
Servlets-product_manager/
├── src/
│   └── com/
│       └── fawry/
│           └── product_manager/
│               ├── HelloServlet.java
│               ├── Product.java
│               ├── ProductService.java
│               └── ProductServiceInterface.java
├── WebContent/
│   ├── index.jsp
│   └── WEB-INF/
│       └── web.xml
```

## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Ahmed01126/Servlets-product_manager.git
   ```

2. **Import the project into your IDE:**

   - Use Eclipse, IntelliJ IDEA, or any Java IDE that supports web applications.

3. **Configure the server:**

   - Ensure Apache Tomcat is installed and configured in your IDE.

4. **Set up the database:**

   - Create a MySQL database named `product_db`.
   - Create a table named `products` with appropriate fields (e.g., id, name, price, quantity).

5. **Update database connection settings:**

   - Modify the JDBC URL, username, and password in the `ProductService.java` file to match your MySQL configuration.

6. **Deploy the application:**

   - Run the application on the configured Tomcat server.

7. **Access the application:**

   - Navigate to `http://localhost:8080/Servlets-product_manager/` in your web browser.

## Usage

- **Add Product:** Fill in the product details and submit the form to add a new product.
- **View Products:** The homepage displays a list of all products.
- **Update Product:** Click on the "Edit" button next to a product to modify its details.
- **Delete Product:** Click on the "Delete" button to remove a product from the list.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
