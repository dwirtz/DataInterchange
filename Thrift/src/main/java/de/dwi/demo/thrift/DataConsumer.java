package de.dwi.demo.thrift;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;

import de.dwi.demo.thrift.model.StopArea;

/**
 * This class represents the consumer of the sample data.
 */
class DataConsumer {

    private static final TDeserializer DESERIALIZER = new TDeserializer(new TBinaryProtocol.Factory());

    /**
     * Consumes the sample data stored in the file {@code targetSource} by deserializing the content using Apache
     * Thrift.
     *
     * @param targetResource
     *         The absolute or relative path to the file the sample data can be consumed from.
     *
     * @throws TException
     *         iff consumer is not able to read the file.
     */
    void consume(final String targetResource) throws TException {
        try (final FileInputStream fis = new FileInputStream(targetResource)) {
            final byte[] data = new byte[1000];
            fis.read(data);

            final StopArea stopArea = new StopArea();
            DESERIALIZER.deserialize(stopArea, data);

            System.out.println(stopArea);
        } catch (final IOException e) {
            throw new TException(e);
        }
    }

}
