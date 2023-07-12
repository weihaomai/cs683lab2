# Find burger shop 

## Name : weihao Mai


## Overview 

Find burger shop is a mobile app that helps burger enthusiasts locate their preferred stores. The main feature of Find burger shop is that it uses real-time location data to show the food stores near the user’s location dynamically.

## Related Work

- Java is the default language for Android App development, and the Android Framework also uses Java by default. Proficiency in Java language is an essential skill for Android developers . 

- Jetpack Compose: Jetpack Compose is a tool for simplifying and speeding up interface development on Android, reducing the amount of code to write, and using powerful tools and intuitive Kotlin API. 
- Flutter: Flutter is a cross-platform development framework from Google that enables the development of high-performance, high-fidelity Android and iOS apps using the Dart language.
-  I will use the above knowledge and API to complete this project

## Requirement Analysis and Testing 

iteration 0 completes only the necessary functional analysis

|Essential | Description |
|---|---|
|Signup| Users register an account with the software in order to use other features of the software. Users are required to provide some basic information, such as user name, password, email address, etc., and agree to the software's terms of service and privacy policy. After successful registration, users can receive a confirmation email and click on the link to activate the account. |
|Settings| Users can modify their user name, password, email address, profile picture and other information. Notifications: Users can turn on or off push notifications for the software, as well as choose the type and frequency of notifications. |
|Login| Users log in to existing accounts on the software in order to access other features of the software. Users need to enter the correct username and password, or use a third-party platform (such as google, QQ, etc.) authorization to log in. After successful login, users can see their personal information and Settings, as well as the main interface of the software. |
|View a map of burger shops| Users can view the location and information of nearby burger restaurants on the software.  The software will display an icon of the eligible burger restaurant on the map, and users can click on the icon to view the details of the burger shops, such as name, address, phone number, rating, reviews, etc. |
|Search for burger shops| Users can search for burger restaurants by entering keywords, selecting categories or swiping a map. |
|Add a burger shops| Burger shop owners can add their own location to the app and set an address on the map |
|place an order| Users can also make calls, navigate or place orders directly through the software. |

## Design and Implementation

•	Databases – saved app information,such as user information and shop information

•	Activities –  Various interactions with the app

•	Settings – Users can modify their user name, password, email address, profile picture and other information.

•	Map: The user can choose the display mode of the map (such as satellite, street, etc.)
•	GPS – Determine the geographic location of the user
•	Google APIs – maps and geolocating

​    

## Timeline

| Iteration | Application Requirements (E/D/O) | Android Components and Features |
| --------- | -------------------------------- | ------------------------------- |
| 1         | 1. Signup (E), 2. Login (E)      | Activities, Database            |
| 2         | 3.View a map of burger shops(E)  | Activities, Services,           |
| 3         | 4.Search for burger shops(E)     | Database, Google maps API       |
| 4         | 5.place an order(E)              | bank API                        |
| 5         | 6.update user information(E)     | Settings, Database              |

