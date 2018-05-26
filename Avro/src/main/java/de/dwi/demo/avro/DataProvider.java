package de.dwi.demo.avro;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import de.dwi.demo.avro.model.Location;
import de.dwi.demo.avro.model.NetPoint;
import de.dwi.demo.avro.model.StopArea;
import de.dwi.demo.avro.model.StopAreaType;

import avro.shaded.com.google.common.collect.Lists;

/**
 * This class represents the provider of the sample data by serializing this data using avro.
 */
final class DataProvider {

    private DataProvider() {
    }

    /**
     * Provides sample data by serializing it into the file specified by {@code targetResource} using avro.
     *
     * @param targetResource
     *         The absolute or relative path to the file where the serialized sample data shall be
     *         stored into.
     *
     * @throws IOException
     *         iff provider is not able to write file.
     */
    static void provide(final String targetResource) throws IOException {
        //@formatter:off
        final List<NetPoint> netPoints = Lists.newArrayList(
                createNetPoint("1011", 6090225L, 50777322L),
                createNetPoint("1012", 6090230L, 50777330L),
                createNetPoint("1013", 6090250L, 50777335L),
                createNetPoint("1014", 6090290L,50777340L));
        //@formatter:on
        final StopArea stopArea = StopArea.newBuilder()
                .setId("Point Lobos")
                .setType(StopAreaType.A)
                .setPoints(netPoints)
                .build();

        serialize(targetResource, stopArea);
    }

    private static void serialize(final String targetResource, final StopArea stopArea) throws IOException {
        final DatumWriter<StopArea> writer = new SpecificDatumWriter<>(StopArea.class);

        try (final DataFileWriter<StopArea> fileWriter = new DataFileWriter<>(writer);) {
            fileWriter.create(stopArea.getSchema(), new File(targetResource));
            fileWriter.append(stopArea);
        }
    }

    private static NetPoint createNetPoint(final String netPointId, final long gpsX, final long gpsY) {
        final Location location = Location.newBuilder().setGpsX(gpsX).setGpsY(gpsY).build();
        return NetPoint.newBuilder().setId(netPointId).setLocation(location).build();
    }
}
