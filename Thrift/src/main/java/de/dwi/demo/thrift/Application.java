package de.dwi.demo.thrift;

import org.apache.thrift.TException;

/**
 * Main application to illustrate the usage of Apache Thrift.
 */
public class Application {

    /**
     * Exchanges data between a provider and a consumer.
     *
     * @param args
     *         program arguments.
     *
     * @throws TException
     *         iff data exchange fails.
     */
    public static void main(final String[] args) throws TException {
        final String targetResource = "./Thrift/src/main/resources/StopAreas";

        DataProvider.provide(targetResource);

        final DataConsumer dataConsumer = new DataConsumer();
        dataConsumer.consume(targetResource);
    }
}
