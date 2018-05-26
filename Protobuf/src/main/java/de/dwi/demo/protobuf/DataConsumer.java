package de.dwi.demo.protobuf;

import java.io.FileInputStream;
import java.io.IOException;

import de.dwi.demo.protobuf.model.Model;

/**
 * This class represents the consumer of the sample data.
 */
class DataConsumer {

    /**
     * Consumes the sample data stored in the file {@code targetSource} by deserializing the content using protobuf.
     *
     * @param targetSource
     *         The absolute or relative path to the file the sample data can be consumed from.
     *
     * @throws IOException
     *         iff consumer is not able to read the file.
     */
    void consume(final String targetSource) throws IOException {
        final Model.StopArea stopArea = Model.StopArea.parseFrom(new FileInputStream(targetSource));

        System.out.println(stopArea);
    }

}
