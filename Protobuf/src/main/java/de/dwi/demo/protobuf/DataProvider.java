package de.dwi.demo.protobuf;

import java.io.FileOutputStream;
import java.io.IOException;

import de.dwi.demo.protobuf.model.Model;

/**
 * This class represents the provider of the sample data by serializing this data using protobuf.
 */
final class DataProvider {

    private DataProvider() {
    }

    /**
     * Provides sample data by serializing it into the file specified by {@code targetResource} using protobuf.
     *
     * @param targetResource
     *         The absolute or relative path to the file where the serialized sample data shall be
     *         stored into.
     *
     * @throws IOException
     *         iff provider is not able to write file.
     */
    static void provide(final String targetResource) throws IOException {
        final Model.StopArea.Builder stopAreaBuilder = Model.StopArea.newBuilder();
        stopAreaBuilder.setId("Point Lobos");
        stopAreaBuilder.setType(Model.StopArea.StopAreaType.A);

        stopAreaBuilder.addPoint(createNetPoint("1011", 6090225L, 50777322L));
        stopAreaBuilder.addPoint(createNetPoint("1012", 6090230L, 50777330L));
        stopAreaBuilder.addPoint(createNetPoint("1013", 6090250L, 50777335L));
        stopAreaBuilder.addPoint(createNetPoint("1014", 6090290L, 50777340L));

        stopAreaBuilder.build().writeTo(new FileOutputStream(targetResource));
    }

    private static Model.NetPoint createNetPoint(final String netPointId, final long gpsX, final long gpsY) {
        final Model.NetPoint.Builder netPointBuilder = Model.NetPoint.newBuilder();
        netPointBuilder.setId(netPointId);

        final Model.Location.Builder locationBuilder = Model.Location.newBuilder();
        locationBuilder.setGpsX(gpsX);
        locationBuilder.setGpsY(gpsY);
        netPointBuilder.setLocation(locationBuilder.build());
        return netPointBuilder.build();
    }
}


