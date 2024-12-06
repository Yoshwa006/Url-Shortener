URL Shortener
This project is a simple URL shortener built with Spring Boot and Java. It allows users to shorten long URLs, store them, and retrieve the original URL using a short identifier.

Features
Add a new URL mapping (original URL and short URL).
Retrieve the original URL using the short URL.
View all stored URL mappings.
Health check endpoint to check if the application is running.
Requirements
Java 17 or later.
Maven for building the project.
Postman or any HTTP client for testing.
Project Setup
1. Clone the Repository
   Clone the project to your local machine using Git.

bash
Copy code
git clone https://github.com/yourusername/url-shortener.git
cd url-shortener
2. Build the Project
   Use Maven to build the project.

bash
Copy code
mvn clean install
3. Run the Application
   You can run the Spring Boot application with the following command:

bash
Copy code
mvn spring-boot:run
The application will start at http://localhost:8080.

Endpoints
1. Health Check
   Endpoint: /api/status
   Method: GET
   Description: Check if the application is running.
   Response:
   json
   Copy code
   "Application is running"
2. Add a URL Mapping
   Endpoint: /api/url
   Method: POST
   Description: Add a new URL mapping. Provide both the original URL and short URL in the request body.
   Request Body:
   json
   Copy code
   {
   "originalUrl": "https://example.com/long-url",
   "shortUrl": "ex"
   }
   Response:
   json
   Copy code
   "URL added successfully!"
3. Retrieve the Original URL
   Endpoint: /api/url/{shortId}
   Method: GET
   Description: Retrieve the original URL using the short URL (shortId).
   Example:
   If shortId is ex, the URL will be: http://localhost:8080/api/url/ex
   Response:
   If found:
   json
   Copy code
   "https://example.com/long-url"
   If not found:
   json
   Copy code
   "Short URL not found!"
4. View All Stored URLs
   Endpoint: /api/urls
   Method: GET
   Description: View all stored URL mappings.
   Response:
   json
   Copy code
   {
   "ex": "https://example.com/long-url"
   }
   Testing the Application
   You can test the endpoints using Postman, curl, or your browser.

Example Using Postman
POST request to add a URL mapping:

URL: http://localhost:8080/api/url
Body (JSON):
json
Copy code
{
"originalUrl": "https://google.com",
"shortUrl": "gg"
}
GET request to retrieve the original URL:

URL: http://localhost:8080/api/url/gg
GET request to view all URLs:

URL: http://localhost:8080/api/urls
License
This project is licensed under the MIT License - see the LICENSE file for details.