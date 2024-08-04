package com.mycompany.cpuzamanlayici;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahin
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RoundRobinScheduler {
    private Queue<Process> processQueue;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.processQueue = new LinkedList<>();
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(Process process) {
        processQueue.add(process);
    }

    public void execute() {
        int currentTime = 0;
        while (!processQueue.isEmpty()) {
            Process currentProcess = processQueue.poll();
            System.out.println("Process ID: " + currentProcess.getProcessId() + " executed for " + Math.min(currentProcess.getRemainingTime(), timeQuantum) + " units.");

            if (currentProcess.getRemainingTime() > timeQuantum) {
                currentProcess.setRemainingTime(currentProcess.getRemainingTime() - timeQuantum);
                currentTime += timeQuantum;
                processQueue.add(currentProcess);
            } else {
                currentTime += currentProcess.getRemainingTime();
                currentProcess.setRemainingTime(0);
                System.out.println("Process ID: " + currentProcess.getProcessId() + " finished execution at time " + currentTime);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Time Quantum girin: ");
        int timeQuantum = scanner.nextInt();

        RoundRobinScheduler rrScheduler = new RoundRobinScheduler(timeQuantum);

        System.out.print("Kac islem eklemek istersiniz? ");
        int processCount = scanner.nextInt();

        for (int i = 0; i < processCount; i++) {
            System.out.print("Process ID: ");
            String processId = scanner.next();
            System.out.print("Burst Time: ");
            int burstTime = scanner.nextInt();
            System.out.print("Priority: ");
            int priority = scanner.nextInt();
            System.out.print("Arrival Time: ");
            int arrivalTime = scanner.nextInt();

            rrScheduler.addProcess(new Process(processId, burstTime, priority, arrivalTime));
        }

        rrScheduler.execute();
    }
}
