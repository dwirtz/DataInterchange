package de.dwi.demo.protobuf;

import java.io.IOException;

/**
 * Main application to illustrate the usage of protobuf.
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
        final String targetResource = "./Protobuf/src/main/resources/StopAreas";

        DataProvider.provide(targetResource);

        final DataConsumer subscriber = new DataConsumer();
        subscriber.consume(targetResource);
    }

}
