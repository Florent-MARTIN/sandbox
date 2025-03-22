package fma.sandbox.helloworld;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MainTest {

    /**
     * Helper method to mock the LoggerFactory and return a mocked logger.
     *
     * @return The mocked logger.
     */
    private Logger setupMockLogger() {
        Logger mockLogger = mock(Logger.class);
        MockedStatic<LoggerFactory> mockedLoggerFactory = Mockito.mockStatic(LoggerFactory.class);
        mockedLoggerFactory.when(() -> LoggerFactory.getLogger(Main.class)).thenReturn(mockLogger);
        return mockLogger;
    }

    @Test
    void testMainLogsHelloWorld() {
        // Arrange: Set up the mocked logger
        Logger mockLogger = setupMockLogger();

        // Act: Call the main method
        Main.main(new String[]{});

        // Assert: Verify that "hello world !" was logged
        verify(mockLogger).info("hello world !");
    }
}
