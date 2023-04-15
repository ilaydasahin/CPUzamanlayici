package com.mycompany.cpuzamanlayici;

import java.util.Scanner;

public class CPUzamanlayici {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("     CPU SCHEDULING SIMULATION SUITE");
        System.out.println("==================================================");
        System.out.println("1. Priority Scheduler");
        System.out.println("2. Round-Robin Scheduler");
        System.out.println("3. Multi-Level Queue Scheduler");
        System.out.println("4. Run Automated Benchmark (Sample Process Workload)");
        System.out.println("0. Exit");
        System.out.print("Select algorithm [0-4]: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Exiting.");
            return;
        }

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                PriorityScheduler.main(args);
                break;
            case 2:
                RoundRobinScheduler.main(args);
                break;
            case 3:
                MultiLevelQueueScheduler.main(args);
                break;
            case 4:
                runBenchmark();
                break;
            case 0:
                System.out.println("Exiting simulation.");
                break;
            default:
                System.out.println("Unknown option.");
                break;
        }
    }

    private static void runBenchmark() {
        System.out.println("\n--- Executing Benchmark Workload ---");
        Process p1 = new Process("P1", 10, 2, 0);
        Process p2 = new Process("P2", 5, 1, 1);
        Process p3 = new Process("P3", 8, 3, 2);

        System.out.println("\n[1] Priority Scheduler Execution:");
        PriorityScheduler ps = new PriorityScheduler();
        ps.addProcess(p1);
        ps.addProcess(p2);
        ps.addProcess(p3);
        ps.execute();

        System.out.println("\n[2] Round-Robin Scheduler Execution (Quantum=3):");
        RoundRobinScheduler rr = new RoundRobinScheduler(3);
        rr.addProcess(new Process("P1", 10, 2, 0));
        rr.addProcess(new Process("P2", 5, 1, 1));
        rr.addProcess(new Process("P3", 8, 3, 2));
        rr.execute();

        System.out.println("\n[3] Multi-Level Queue Scheduler Execution:");
        MultiLevelQueueScheduler mlq = new MultiLevelQueueScheduler();
        mlq.addProcess(new Process("P1", 10, 1, 0));
        mlq.addProcess(new Process("P2", 5, 2, 1));
        mlq.addProcess(new Process("P3", 8, 1, 2));
        mlq.execute();

        System.out.println("\nBenchmark complete.");
    }
}
