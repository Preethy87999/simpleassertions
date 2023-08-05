package com.simplilearn.myapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	void test() {
		int actamount = 1000;
		int expamount = 1000;
		Assertions.assertEquals(expamount, actamount);
	}
}
