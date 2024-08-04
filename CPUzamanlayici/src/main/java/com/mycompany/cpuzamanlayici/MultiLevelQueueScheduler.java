/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpuzamanlayici;

/**
 *
 * @author sahin
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MultiLevelQueueScheduler {
    private Queue<Process> highPriorityQueue;
    private Queue<Process> lowPriorityQueue;

    public MultiLevelQueueScheduler() {
        highPriorityQueue = new LinkedList<>();
        lowPriorityQueue = new LinkedList<>();
    }

    public void addProcess(Process process) {
        if (process.getPriority() == 1) {
            highPriorityQueue.add(process);
        } else {
            lowPriorityQueue.add(process);
        }
    }

    public void execute() {
        int currentTime = 0;
        while (!highPriorityQueue.isEmpty() || !lowPriorityQueue.isEmpty()) {
            if (!highPriorityQueue.isEmpty()) {
                Process currentProcess = highPriorityQueue.poll();
                System.out.println("High priority process ID: " + currentProcess.getProcessId() + " executed.");
                currentTime += currentProcess.getBurstTime();
                System.out.println("Process ID: " + currentProcess.getProcessId() + " finished execution at time " + currentTime);
            } else if (!lowPriorityQueue.isEmpty()) {
                Process currentProcess = lowPriorityQueue.poll();
                System.out.println("Low priority process ID: " + currentProcess.getProcessId() + " executed.");
                currentTime += currentProcess.getBurstTime();
                System.out.println("Process ID: " + currentProcess.getProcessId() + " finished execution at time " + currentTime);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MultiLevelQueueScheduler mlqScheduler = new MultiLevelQueueScheduler();

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

            mlqScheduler.addProcess(new Process(processId, burstTime, priority, arrivalTime));
        }

        mlqScheduler.execute();
    }
}
