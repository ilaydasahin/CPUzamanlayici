# CPU Scheduling Algorithms Simulator

An implementation of CPU process scheduling algorithms in Java. This project simulates core operating system process scheduling mechanisms including Priority Scheduling, Round-Robin (RR) with configurable time quanta, and Multi-Level Queue (MLQ) scheduling.

## Implemented Scheduling Algorithms

1. **Priority Scheduler**: Preemptive priority-based execution queue using Java `PriorityQueue`. Lower numerical values represent higher process priority.
2. **Round-Robin Scheduler**: Time-sliced round-robin execution queue with configurable `Time Quantum`. Processes with remaining execution burst times are re-queued until completion.
3. **Multi-Level Queue (MLQ) Scheduler**: Dual-level queue separating high-priority and low-priority process pools, executing foreground queues prior to background workloads.

## Project Structure

```
CPUzamanlayici/
├── src/
│   ├── main/java/com/mycompany/cpuzamanlayici/
│   │   ├── CPUzamanlayici.java            # Main CLI & benchmark entrypoint
│   │   ├── Process.java                    # Process data model
│   │   ├── PriorityScheduler.java          # Priority scheduling engine
│   │   ├── RoundRobinScheduler.java        # Round-Robin scheduling engine
│   │   └── MultiLevelQueueScheduler.java   # Multi-level queue engine
│   └── test/java/com/mycompany/cpuzamanlayici/
│       └── SchedulerTest.java              # Unit tests
├── pom.xml                                 # Maven configuration
└── README.md
```

## Requirements & Building

- **JDK**: Java 17 or higher
- **Build Tool**: Maven 3.8+

### Building from Source

```bash
mvn clean package
```

### Running the Simulator

Interactive CLI menu:

```bash
mvn exec:java -Dexec.mainClass="com.mycompany.cpuzamanlayici.CPUzamanlayici"
```

Running unit test suite:

```bash
mvn test
```
