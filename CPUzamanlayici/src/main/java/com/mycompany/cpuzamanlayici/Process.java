/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpuzamanlayici;

/**
 *
 * @author sahin
 */
public class Process {
    private String processId;
    private int burstTime;
    private int priority;
    private int arrivalTime;
    private int remainingTime;

    public Process(String processId, int burstTime, int priority, int arrivalTime) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
        this.remainingTime = burstTime;
    }

    public String getProcessId() {
        return processId;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    @Override
    public String toString() {
        return "Process{" +
                "processId='" + processId + '\'' +
                ", burstTime=" + burstTime +
                ", priority=" + priority +
                ", arrivalTime=" + arrivalTime +
                ", remainingTime=" + remainingTime +
                '}';
    }
}
