This is a basic cricket quiz application made using java swings.
FinalQuiz Java Application
This project is a simple login and quiz application built using Java Swing. The app consists of a login screen where users can log in with predefined credentials or create a new account. Upon successful login, the user is presented with a set of multiple-choice questions (MCQs) related to the ICC Cricket World Cup 2023.

Features
Login Screen: Users can log in with a username and password.
Account Creation: Users can create a new account with a username and password.
MCQ Page: After logging in, the user is directed to a quiz page with multiple-choice questions related to cricket.
User Authentication: User credentials are stored and validated using a HashMap.
MCQs: The quiz consists of multiple questions, each with three answer choices.
Setup Instructions
Clone the repository or download the project files.
Compile the Java files using a Java compiler.
Run the FinalQuiz class to start the application.
Prerequisites
Java Development Kit (JDK) 8 or higher.
Usage
Login Screen:

Enter your username and password.
If the username and password match the predefined account (user / password), you will be logged in.
If you do not have an account, you can create one by clicking on the "Create Account" button.
Newly created accounts are stored in a HashMap.
MCQ Page:

After successful login, you will be redirected to the quiz page.
The quiz contains 5 multiple-choice questions.
Each question has three answer options.
Users can select their answers using radio buttons.
How It Works
Login Form:
The user is prompted to enter a username and password.
If the credentials match, the user is logged in and redirected to the quiz page.
If the credentials do not match, an error message is displayed.
Account Creation:
Users can create a new account by entering a username and password.
If the username is already taken, an error message is displayed.
If the username is available, the new account is created and stored in the userAccounts HashMap.
MCQ Page:
After logging in, the user is presented with five multiple-choice questions related to cricket.
The questions and options are displayed, and the user can select one of the options for each question.
The interface is created using JRadioButton components for each option.
Code Overview
Login and Account Creation:
The FinalQuiz class creates the login form using JTextField and JPasswordField for user input.
Two buttons, Login and Create Account, trigger the respective actions when clicked.
The HashMap<String, String> stores the user credentials (username, password).
MCQ Page:
The openMCQPage() method creates a new frame for displaying the multiple-choice questions.
Each question is displayed with three options, and a ButtonGroup is used to group the radio buttons together, ensuring only one option can be selected at a time.

