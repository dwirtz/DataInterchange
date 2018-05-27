package de.dwi.demo.avro;

import java.io.IOException;

/**
 * Main application to illustrate the usage of Apache Avro.
 */
public class Application {

    /**
     * Exchanges data between a provider and a consumer.
     *
     * @param args
     *         program arguments.
     *
     * @throws IOException
     *         iff data exchange fails.
     */
    public static void main(final String[] args) throws IOException {
        final String targetResource = "./Avro/src/main/resources/StopAreas";

        DataProvider.provide(targetResource);

        final DataConsumer dataConsumer = new DataConsumer();
        dataConsumer.consume(targetResource);
    }
}
