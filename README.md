# MessangerApp
This repository contains an app built for the Software Design course from HZ University of Applied Sciences made by Laura Birau (LauraBirau) and Dawid Czuba(Dajzio).

## Cooperation

Laura started the whole Message App idea, mapping out what we needed with all those design patterns. It was like having a blueprint for what we wanted to build.

Then, Dawid took the lead and made those ideas a real thing – our messaging app. He made sure the user can actually write his/her message by adding in the console reading part. It was like turning our plans into something that could actually be used.

In the final part, we pair-programmed, working side by side to rephrase the messages and fix any issues together. We went back and forth, updating things to make the messaging experience even better for our user.

## Overview
This simple Java application is a messaging app that demonstrates the use of 6 design patterns: Singleton (Creational), Factory (Creational), Decorator (Structural), Adapter (Structural), Observer (Behavioral) and Strategy (Behavioral). The app allows users to send messages via different channels (email, SMS), encrypt messages and observe log messages.

## Design Patterns Used

1. **Singleton Pattern**
   - **Purpose:** Ensure that there is only one instance of a class, and provide a global point of access to it.
   - **Usage in Message App:** The `MessageService` class is designed as a Singleton to ensure there's only one instance responsible for sending messages. This ensures a service for managing message sending across the application.

2. **Factory Pattern**
   - **Purpose:** Define an interface for creating an object.
   - **Usage in Message App:** The `MessageSenderFactory` class is responsible for creating instances of different message senders ( `EmailSender` and `SMSSender`). It allows flexibility in creating various sender objects based on user input (message type).

3. **Decorator Pattern**
   - **Purpose:** Attach additional responsibilities to an object dynamically.
   - **Usage in Message App:** The `MessageDecorator` abstract class and its concrete subclass `EncryptedMessageDecorator` demonstrate message decoration. Decorators allow the application to add features (encryption) to messages dynamically.

4. **Adapter Pattern**
   - **Purpose:** Convert the interface of a class into another interface that a client expects.
   - **Usage in Message App:** The `MessageAdapter` interface and its implementation `MessageAdapterImpl` act as an adapter. This allows the `MessageAdapter` to be used as a standardized interface for sending messages, adapting to different sender implementations.

5. **Observer Pattern**
   - **Purpose:** Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   - **Usage in Message App:** The `MessageObserver` interface and its implementation `LoggingMessageObserver` demonstrate the Observer pattern. Observers can subscribe to the `MessageService` to receive notifications when messages are sent, allowing for additional actions such as logging.

6. **Strategy Pattern**
   - **Purpose:** Define a family of algorithms, encapsulate each one and make them interchangeable. The Strategy pattern allows the algorithm to change independently of the clients using it.
   - **Usage in Message App:** The `MessageSendingContext` class represents the context in which different message sending strategies (`EmailSendingStrategy`, `SMSSendingStrategy`
) can be used interchangeably. This flexibility allows the application to switch between different message sending algorithms dynamically based on user input.
