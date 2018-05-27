package de.dwi.demo.avro;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;

import de.dwi.demo.avro.model.StopArea;

/**
 * This class represents the consumer of the sample data.
 */
class DataConsumer {

    /**
     * Consumes the sample data stored in the file {@code targetSource} by deserializing the content using Apache Avro.
     *
     * @param targetResource
     *         The absolute or relative path to the file the sample data can be consumed from.
     *
     * @throws IOException
     *         iff consumer is not able to read the file.
     */
    void consume(final String targetResource) throws IOException {
        final DatumReader<StopArea> reader = new SpecificDatumReader<StopArea>(StopArea.class);
        final DataFileReader fileReader = new DataFileReader<>(new File(targetResource), reader);

        StopArea stopArea = null;
        while (fileReader.hasNext()) {
            stopArea = (StopArea) fileReader.next();
        }

        System.out.println(stopArea);
    }
}
