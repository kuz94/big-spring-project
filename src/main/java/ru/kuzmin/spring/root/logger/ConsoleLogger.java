/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.root.logger;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Component;

/**
 *
 * @author kuzmin_a_a
 */
@Component
public class ConsoleLogger implements CommonLogger {
	private final AtomicLong eventCounter = new AtomicLong(0);

	@Override
	public void logEvent(String source, String message) {
		System.out.println(eventCounter.incrementAndGet() + ":" + source + ":" + message);
	}
}
