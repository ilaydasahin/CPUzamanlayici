/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpuzamanlayici;

/**
 *
 * @author sahin
 */
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityScheduler {
    private PriorityQueue<Process> processQueue;

    public PriorityScheduler() {
        processQueue = new PriorityQueue<>((p1, p2) -> p1.getPriority() - p2.getPriority());
    }

    public void addProcess(Process process) {
        processQueue.add(process);
    }

    public void execute() {
        int currentTime = 0;
        while (!processQueue.isEmpty()) {
            Process currentProcess = processQueue.poll();
            System.out.println("Process ID: " + currentProcess.getProcessId() + " with priority " + currentProcess.getPriority() + " executed.");

            currentTime += currentProcess.getBurstTime();
            System.out.println("Process ID: " + currentProcess.getProcessId() + " finished execution at time " + currentTime);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityScheduler priorityScheduler = new PriorityScheduler();

        System.out.print("Kac iclem eklemek istersiniz? ");
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

            priorityScheduler.addProcess(new Process(processId, burstTime, priority, arrivalTime));
        }

        priorityScheduler.execute();
    }
}
