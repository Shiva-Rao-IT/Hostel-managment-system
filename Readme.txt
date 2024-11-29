Hostel Management System
This Hostel Management System is a desktop application developed using NetBeans IDE, with a user-friendly GUI built using JFrame for the frontend, Java for backend functionality, and MySQL for database management. Additionally, it includes chatbot functionality powered by Assembly AI and GPT APIs.
________________


Prerequisites
1. Install Java
Ensure Java is installed on your system. Download Java.
2. Install NetBeans IDE
Download and install the NetBeans IDE. Download NetBeans.
3. Install MySQL Workbench
Set up MySQL Workbench for managing the database. Download MySQL.
4. Install Python Plugin for NetBeans
Install the Python plugin in NetBeans IDE to enable chatbot functionality.
________________


Features
   * Run the Project:
   * Execute the project directly by pressing F6 in NetBeans IDE.
   * Alternatively, run Homepage.java without opening other files.
   * Admin Login:
   * Username: hostel
   * Password: admin
   * Database Setup:
   * Predefined schema and data import options available via the SQL dump file.
   * Chatbot Functionality:
   * Internet-based chatbot using Assembly AI and GPT APIs.
________________


Setup Instructions
1. Running the Application
   1. Open the project in NetBeans IDE.
   2. Press F6 to execute the project, or manually run the Homepage.java file.
________________


2. Database Configuration
   1. Import Database Schema:
   * Locate the dump20241128 folder in the project directory.
   * Import the provided SQL dump file into MySQL Workbench to create the database schema.
   * Populate the database through SQL queries or the application's user interface.
   2. Update Connection Details:
   * Navigate to ConnectionProvider.java in src/packages/project.
   * Modify the database credentials as shown below:
java
Copy code
// ConnectionProvider.java
String user = "your-database-username";
String password = "your-database-password";


________________


3. Chatbot Configuration
   1. File Paths:
   * Open Chatbot.java and provide the file paths for resources used by the chatbot.
   2. API Keys:
   * Obtain free API keys from:
   * Assembly AI
   * GPT (via RapidAPI)
   * Update the API keys in:
   * Chatbot.java
   * Python files for chatbot integration.
   3. Python Path Configuration:
   * Ensure correct file paths are set in the Python scripts for the Assembly AI and GPT API integrations.
   4. Internet Requirement:
   * An active internet connection is required for the chatbot to function.
________________


Tools & Technologies
   * Frontend: JFrame (Java Swing)
   * Backend: Java
   * Database: MySQL
   * IDE: NetBeans
   * APIs:
   * Assembly AI
   * GPT (via RapidAPI)
________________


Notes
   * Assembly AI and GPT API are free to use and do not require credit card details for account creation.
   * Ensure all required plugins, libraries, and dependencies are installed before running the project.
________________


Contribution and Support
Contributions are welcome! Feel free to submit pull requests or open issues to suggest improvements or report bugs. For further assistance, use the project’s discussions tab.
________________


License
This project is licensed under the MIT License.