
# EI_CODING_ASSESMENT (DARSHINI S B-21C020)

# Exercise1
## *Behavioural pattern*

## Chain of Responsibility Pattern
**SupportHandler.java**: Defines the interface for handling requests.

**SupportRequest.java**: Defines the request class.

**LevelOneSupport.java**: Concrete handler for level one support.

**LevelTwoSupport.java**:
Concrete handler for level two support.

**LevelThreeSupport.java**: 
Concrete handler for level three support.

**SupportSystem.java**: 
Client class to demonstrate the chain of responsibility pattern with user input.

![WhatsApp Image 2024-07-28 at 16 57 10_63e8bde3](https://github.com/user-attachments/assets/117484a8-8c52-4759-b851-2ce519849892)

## Observer Pattern

**Subject.java**: Interface that defines methods to attach, detach, and notify observers.

**Observer.java**: Interface that defines the update method for receiving updates from the subject.

**CurrentConditionsDisplay.java**: Concrete observer that displays the current weather conditions.

**StatisticsDisplay.java**: Concrete observer that displays weather statistics.

**WeatherData.java**: Concrete subject that holds weather data and notifies observers of changes.

**WeatherStation.java**: Main class that demonstrates the use of the Observer pattern by simulating weather data changes and displaying the results.

![WhatsApp Image 2024-07-28 at 17 10 44_73699ad2](https://github.com/user-attachments/assets/a79ea570-147f-4c30-a9a2-a226ee7e0408)

## *Creational Pattern*

## Factory Method Pattern

**Notification.java**: Interface for the notification types.

**EmailNotification.java**: Implements Notification for email notifications.

**SMSNotification.java**: Implements Notification for SMS notifications.

**NotificationFactory.java**: Abstract factory class to create notifications.

**EmailNotificationFactory.java**: Factory class to create email notifications.

**SMSNotificationFactory.java**: Factory class to create SMS notifications.

**Main.java**: Demonstrates the usage of the factory method pattern to create different types of notifications based on user input.

![WhatsApp Image 2024-07-28 at 17 20 59_2b891685](https://github.com/user-attachments/assets/b5fdf0ec-2f5c-4f7b-a532-c3f3e90b5d10)

## Singleton Pattern

**Logger.java**: Contains the singleton implementation for the logger class.

**Main.java**: Demonstrates the usage of the singleton logger and ensures only one instance is created.

![WhatsApp Image 2024-07-28 at 17 47 33_cb4ad064](https://github.com/user-attachments/assets/ff0491e9-de97-4dbd-be92-1202e1425923)

## *Structural Pattern*

## Bridge Pattern

**Shape.java**: Defines the abstraction for shapes and uses a DrawingAPI to perform drawing operations.

**DrawingAPI.java**: The interface for drawing APIs. It is the "implementor" in the Bridge pattern.

**Circle.java & Square.java**: Refined abstractions that implement the shape interface using different implementations of the drawing API.

**WindowsAPI.java & LinuxAPI.java**: Concrete implementations of the DrawingAPI that handle the actual drawing logic for different platforms.

**ShapeDrawer.java**: Implements a Swing JPanel where the actual drawing happens. It uses methods to draw circles and squares.

**Main.java**: Sets up a JFrame with a ShapeDrawer panel and creates instances of Circle and Square with drawing APIs. It then calls draw() to render the shapes on the panel.

![WhatsApp Image 2024-07-28 at 17 31 27_c75026ed](https://github.com/user-attachments/assets/93e46c7b-dcbc-419b-b841-463b99dab845)

## Decorator Pattern

**BoldText.java**: A concrete decorator class that extends TextDecorator and adds bold formatting to the Text object it wraps.

**ConcreteText.java**: A concrete class implementing the Text interface, representing the core text content.

**Decorator.java**: An abstract class implementing the Text interface and holding a reference to a Text object. It forwards the render operation to the contained Text object.

**ItalicText.java**: A concrete decorator class that extends TextDecorator and adds italic formatting to the Text object it wraps.

**Main.java**: Sets up a JFrame with input fields for text content and decoration options, applies the selected decorators based on user input, and displays the decorated text in a new JFrame.

**Text.java**: The interface for the text component that defines the basic operation (render).

**UnderlineText.java**: A concrete decorator class that extends TextDecorator and adds underline formatting to the Text object it wraps.

![WhatsApp Image 2024-07-28 at 17 42 52_104aa5ab](https://github.com/user-attachments/assets/0c24143a-1b5d-41df-b92e-b3a8c21ba532)

![WhatsApp Image 2024-07-28 at 17 43 21_dd347e1f](https://github.com/user-attachments/assets/9bab1b0b-362c-4f2f-bb05-fb6528df668a)

# Exercise2

# Satellite Command System Programming Exercise

The Satellite Command System is a simulation that allows users to control a satellite's orientation, solar panel status, and data collection through a command-line interface or GUI. The system initializes the satellite with default attributes and allows the user to issue commands to modify the satellite's state.

## Features

Initialization: The satellite starts with default attributes: Orientation: "North", Solar Panels: "Inactive", Data Collected: 0.

Command Execution: Users can execute commands to change the satellite's state.

GUI Interaction: A simple GUI for inputting commands and displaying the satellite's status.

Status Display: The current state of the satellite can be displayed at any time.

## Design Patterns Used

Command Pattern: Encapsulates each command (e.g., rotate, activatePanels, deactivatePanels, collectData) as an object, allowing for parameterization, queuing, and logging of requests.

Singleton Pattern: Ensures a single instance of the Satellite class, allowing centralized control of the satellite state.

Observer Pattern: (Optional) Can be used to notify observers of the satellite's status changes

## Classes

**Command.java**: Interface for commands.

**RotateCommand.java**: Concrete command for rotating the satellite.

**ActivatePanelsCommand.java**: Concrete command for activating solar panels.

**DeactivatePanelsCommand.java**: Concrete command for deactivating solar panels.

**CollectDataCommand.java**: Concrete command for collecting data.

**Satellite.java**: The Satellite class (Singleton) that holds the state and behaviors.

**Main.java**: The Main class that provides the user interface for input and execution.

## Commands

Rotate: Change the orientation of the satellite.

![WhatsApp Image 2024-07-28 at 18 03 44_ce56312e](https://github.com/user-attachments/assets/94aae567-3e04-4b86-b45f-a0daa63dd3a1)

![WhatsApp Image 2024-07-28 at 18 04 31_42ba6222](https://github.com/user-attachments/assets/4ecd2c74-7e18-4edb-bb51-9a4a7b44b428)

![WhatsApp Image 2024-07-28 at 18 04 41_10fa2afd](https://github.com/user-attachments/assets/5a2e1dd0-1ce5-4a12-b7d9-f909870c2af4)

Activate/Deactivate Panels: Control the solar panels' status.

![WhatsApp Image 2024-07-28 at 18 05 23_a4276296](https://github.com/user-attachments/assets/c103cbe9-ffb9-4e55-86f9-882e0583b3b8)

![WhatsApp Image 2024-07-28 at 18 05 33_26155c3e](https://github.com/user-attachments/assets/7a8468c3-e279-4182-9e5d-7cc870fe135c)

Collect Data: Collect data if solar panels are active.

![WhatsApp Image 2024-07-28 at 18 05 58_1734c61b](https://github.com/user-attachments/assets/d45450ba-842a-4151-a92f-453e41690fbd)

![WhatsApp Image 2024-07-28 at 18 06 09_b50d58b4](https://github.com/user-attachments/assets/26091583-2e8c-4d20-8865-9730e463991f)

Display Status: Show the satellite's current state.

![WhatsApp Image 2024-07-28 at 18 06 09_26c97660](https://github.com/user-attachments/assets/96edd9a0-c7a5-4e94-8f5d-4da62217c9c2)


