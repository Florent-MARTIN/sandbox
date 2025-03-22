package fma.sandbox.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is the main entry point for the HelloWorld application.
 * It demonstrates a simple program that prints "hello world !" to the console.
 */
public class Main {
    // Initialize the SLF4J logger
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * The main method is the entry point of the application.
     * It logs "hello world !" to the standard console output.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        logger.info("hello world !");
    }
}
