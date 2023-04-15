package com.mycompany.cpuzamanlayici;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchedulerTest {

    @Test
    void testProcessInitialization() {
        Process process = new Process("P1", 10, 1, 0);
        assertEquals("P1", process.getProcessId());
        assertEquals(10, process.getBurstTime());
        assertEquals(1, process.getPriority());
        assertEquals(0, process.getArrivalTime());
        assertEquals(10, process.getRemainingTime());
    }

    @Test
    void testPrioritySchedulerExecution() {
        PriorityScheduler scheduler = new PriorityScheduler();
        Process p1 = new Process("P1", 5, 2, 0);
        Process p2 = new Process("P2", 3, 1, 0);

        scheduler.addProcess(p1);
        scheduler.addProcess(p2);

        assertDoesNotThrow(scheduler::execute);
    }

    @Test
    void testRoundRobinSchedulerExecution() {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(2);
        Process p1 = new Process("P1", 5, 1, 0);

        scheduler.addProcess(p1);

        assertDoesNotThrow(scheduler::execute);
    }
}
