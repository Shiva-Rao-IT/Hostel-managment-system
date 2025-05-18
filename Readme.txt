# 🏢 Hostel Management System

The **Hostel Management System** is a desktop-based Java application designed to streamline hostel administration. It enables wardens and admins to manage room allocation, track student information, handle complaints, log visitors, and automate fee collection — all from a user-friendly interface. It also integrates a chatbot and speech interface for enhanced accessibility.

---

## ✅ Features

- Room allocation and status management  
- Visitor logging and verification  
- Fee submission tracking and report generation  
- Student complaint registration and resolution  
- Role-based login for admin, student, and warden  
- GPT-powered chatbot for automated query handling  
- Voice command support using AssemblyAI  
- Student profile and attendance overview  

---

## 🛠️ Technologies Used

- **Frontend / UI:** Java Swing (JFrame-based GUI)  
- **Backend:** Core Java, JDBC  
- **Database:** MySQL  
- **AI Integration:** GPT API (Chatbot), AssemblyAI (Speech-to-text)  
- **Reporting:** PDF generation, fee and complaint summary  
- **Tools:** NetBeans / Eclipse IDE, MySQL Workbench  

---

## 🧪 How It Works

1. Admins and students log in via role-based authentication.  
2. Admins can allocate rooms, log visitors, and view fee/complaint status.  
3. Students can submit complaints, view fee dues, and ask queries to the chatbot.  
4. GPT and AssemblyAI APIs power the chatbot and voice interface.  
5. Data is stored and retrieved securely from MySQL.

---

## ⚙️ Setup Instructions

### Prerequisites

- Java JDK (version 8 or later)  
- MySQL Server and Workbench  
- NetBeans or Eclipse IDE  
- Internet access for GPT/AssemblyAI APIs

### Steps

1. Clone or download the project folder.
2. Import the project into your IDE (NetBeans/Eclipse).
3. Set up the MySQL database using the provided `.sql` file.
4. Update your DB connection settings in the Java code:
   ```java
   String url = "jdbc:mysql://localhost:3306/your_db";
   String user = "root";
   String password = "your_password";
Add your GPT and AssemblyAI API keys to the chatbot and voice module.

Chatbot Configuration
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

Compile and run the project.

Notes
   * Assembly AI and GPT API are free to use and do not require credit card details for account creation.
   * Ensure all required plugins, libraries, and dependencies are installed before running the project.


💡 Future Enhancements
--Biometric integration for attendance tracking
--Mobile app companion (Android)
--Advanced analytics dashboard for warden
--Online payment gateway integration

🧑‍💻 Author
Shiva Yadav
MCA Student – GGSIPU

Contribution and Support
Contributions are welcome! Feel free to submit pull requests or open issues to suggest improvements or report bugs. For further assistance, use the project’s discussions tab.

📄 License
This project is licensed under the MIT License. See the LICENSE file for more details.
