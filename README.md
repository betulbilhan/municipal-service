
# 🏛️ State Service Tracking System

## Overview

State Service Tracking System is a multi-functional desktop application developed in Java using NetBeans and MySQL. 
It enables citizens to access a variety of public services such as hospital appointments, complaint submission (CIMER), 
sports activity registration, and city-specific municipal services — all within a single, user-friendly interface.

## Features

* 👤 **User Management**: Registration, login, account deletion, and password recovery
* 🏥 **Hospital Appointments**: Book and view appointments stored in the `health_table`
* 📢 **Complaint System (CIMER)**: Submit and track complaints
* 🏃 **Sports Activities**: Register and monitor participation in sports events
* 🏙️ **Municipal Services**: Access city-specific services and information for Istanbul, Samsun, and Nevşehir
* 📊 **Data Display**: Visual presentation of data using `JTable` and `JList` components
* 🔒 **Secure Data Handling**: All user data is validated (regex) and securely stored in MySQL

## Technologies Used

* **Java (NetBeans IDE)**
* **Java Swing**
* **MySQL (JDBC)**
* **Regex for input validation**
* **Multi-frame architecture**

## How It Works

1. User registers with basic information and credentials.
2. After login, the main menu provides access to all available services.
3. Each module interacts with a MySQL database to store, retrieve, and update user-related data.
4. Interfaces are separated by cities to simulate municipal service segmentation.
5. Users can view their history, registrations, and submitted complaints via tables and lists.


## License

This project is developed for academic purposes and is free to use and modify.

