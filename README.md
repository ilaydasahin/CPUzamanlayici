# CPU Scheduling Simulation

A Java-based simulation of operating system CPU scheduling algorithms, implementing Priority Scheduling, Round Robin, and Multi-Level Queue scheduling logic.

## Overview

This project simulates process execution and CPU resource allocation using classical operating system scheduling concepts. It evaluates process throughput, turnaround time, waiting time, and response efficiency across different queue management strategies.

## Features

- Process Representation: Encapsulates process metadata such as Process ID, Arrival Time, Burst Time, Priority, and Execution State.
- Priority Scheduling: Allocates CPU time based on process priority attributes.
- Round Robin (RR) Scheduling: Implements time-slice multiplexing for preemptive execution.
- Multi-Level Queue Scheduling: Segregates processes into distinct priority queues with specific scheduling policies per level.

## Project Structure

CPUzamanlayici/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── cpuzamanlayici/
│                       ├── MultiLevelQueueScheduler.java
│                       ├── PriorityScheduler.java
│                       ├── Process.java
│                       └── RoundRobinScheduler.java
├── pom.xml
├── .gitignore
└── README.md

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven 3.6+

## Build & Execution Instructions

1. Compile the project using Maven:
   mvn clean compile

2. Package the application:
   mvn package

3. Run the scheduler:
   java -cp target/CPUzamanlayici-1.0-SNAPSHOT.jar com.mycompany.cpuzamanlayici.RoundRobinScheduler
