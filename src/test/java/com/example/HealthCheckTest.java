package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HealthCheckTest {

    @Test
    public void testGetStatus() {
        HealthCheck health = new HealthCheck();
        assertEquals("Application is running", health.getStatus());
    }
}