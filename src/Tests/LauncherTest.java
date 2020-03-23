package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MainLogic.Launcher;

class LauncherTest {

	@Test
	void test() {
		assertEquals(2, Launcher.sum(1, 1));
	}

}
