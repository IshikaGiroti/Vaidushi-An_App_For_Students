# Vaidushi-An_App_For_Students

With the rise of the pandemic, the need for a user-friendly application where the student has easy access to college related resources increases. Our application solves this by giving a common ground which focuses on a student's everyday requirement and helps the student have easy access to the necessary information.

The proposed system is a handy application that can be used by all the users to facilitate communication. The application introduces portability as it is used on a mobile device which can be carried anywhere. 

## Technologies Used
- Android Studio
- Firebase

## Backend: Firebase
- Authentication module
- Cloud Firestore
- Storage

## Dependencies
- implementation 'androidx.appcompat:appcompat:1.3.1'
- implementation 'com.google.android.material:material:1.4.0'
- implementation 'androidx.constraintlayout:constraintlayout:2.1.1'
- implementation 'com.github.denzcoskun:ImageSlideshow:0.1.0'
- implementation 'com.google.firebase:firebase-auth:21.0.1'
- implementation 'com.google.firebase:firebase-firestore:23.0.4'
- implementation 'com.google.firebase:firebase-storage:20.0.0'
- implementation 'com.firebaseui:firebase-ui-firestore:6.2.1'
- implementation 'com.github.MikeOrtiz:TouchImageView:1.4.1'
- testImplementation 'junit:junit:4.+'
- androidTestImplementation 'androidx.test.ext:junit:1.1.3'
- androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

## Module wise breakdown

### App logo
![image](https://user-images.githubusercontent.com/75370975/150101954-f840aa3a-e1b7-4df3-9d0d-1f9ec75aa5c0.png)

### Loading Screen
<img src="https://user-images.githubusercontent.com/75370975/150102041-5743168e-1b00-4aa3-810d-a0f6b383f690.png" height="450"/>

### Main Page. 
#### This module consists of information about the college along with options to login and signup. 
<img src="https://user-images.githubusercontent.com/75370975/146675003-07027363-cc0e-466a-ba0e-5bdcb4f13e28.png" height="450"/>


### Signup Page
#### This module prompts the student to enter their credentials such as their USN, phone number, year of study etc. This information is then stored onto the firebase, which will be used further to validate the students' identity.
<img src="https://user-images.githubusercontent.com/75370975/146675020-a9db7ad6-85de-450b-b3ce-f9ff8a8b4baf.png" height="450"/>


### Login Page
#### The authentication system on the firebase authenticates using the email ID of the student and the password that they'd entered on singing up. Once the student logs in with the correct credentials, they will be directed to their dashboard and can continue using the application to its best use.
<img src="https://user-images.githubusercontent.com/75370975/146675029-a7bdffc6-d9e0-4b3f-b187-1f9c2588e625.png" height="450"/>


### Dashboard
#### The dashboard module will consist of all the ongoing events and important notices such as exams, ongoing seminars etc.
<img src="https://user-images.githubusercontent.com/75370975/146675040-d2008461-697d-4c1f-ad66-e672cd216c97.png" height="450"/>


### Navigation Drawer
#### The navigation bar module gives the student the ability to navigate around different sections in the application.
<img src="https://user-images.githubusercontent.com/75370975/146675062-9889bf49-9f73-4a21-a35f-5c039f58b59e.png" height="450"/>

### Notice Board
#### This module redirects the user back to the dashboard.
<img src="https://user-images.githubusercontent.com/75370975/146675040-d2008461-697d-4c1f-ad66-e672cd216c97.png" height="450"/>

### Time Table
#### Students have easy access to their time table by entering their semester followed by their section.
<img src="https://user-images.githubusercontent.com/75370975/146675086-4697bc82-e94b-45f0-abe3-5ceffb9a7082.png" height="450"/>


### Attendance
#### The user can view their attendance once it has been updated by the faculty at the end of the semester.
<img src="https://user-images.githubusercontent.com/75370975/146725892-10c9b74d-0216-4f68-adfc-81063e631489.jpg" height="450"/>


### Subject Resources
#### Easy access to subject resources such as notes, previous year question papers etc.
<img src="https://user-images.githubusercontent.com/75370975/146675118-d3e7065a-8060-4abc-ada9-ddae9d16acaf.png" height="450"/>

<img src="https://user-images.githubusercontent.com/75370975/146677162-34c46479-7e69-4514-bf22-a5e5910e1e66.png" height="450"/>

<img src="https://user-images.githubusercontent.com/75370975/146677189-fafb577f-2c08-4b06-a4ff-b363e1391e01.png" height="450"/>


### Academic Calendar
#### The academic Calendar can be viewed semester wise.
<img src="https://user-images.githubusercontent.com/75370975/146677252-27911497-bd5c-44ce-b65a-00bec40b052d.png" height="450"/>


### Faculty Details
#### Faculty details such as their phone number, email and cabin number can be easily found here.
<img src="https://user-images.githubusercontent.com/75370975/146677497-5829cc11-1230-40a5-b449-7abfa2e251ec.png" height="450"/>


### About us
#### This section gives information about the developers who worked on this application.
<img src="https://user-images.githubusercontent.com/75370975/146677517-73539a0a-8fc5-4ccd-8b60-b25e85648de7.png" height="450"/>


### Logout Option:
#### This option lets the student logout of their occount on their device.
