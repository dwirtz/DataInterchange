package de.dwi.demo.protobuf;

import java.io.FileOutputStream;
import java.io.IOException;

import de.dwi.demo.protobuf.model.Model;

public class WritingApplication {

    public static void main(final String[] args) throws IOException {
        final Model.StopArea.Builder stopAreaBuilder = Model.StopArea.newBuilder();
        stopAreaBuilder.setId("Aachen Bushof");
        stopAreaBuilder.setType(Model.StopArea.StopAreaType.A);

        stopAreaBuilder.addPoint(createNetPoint("1011", 6090225L, 50777322L));
        stopAreaBuilder.addPoint(createNetPoint("1012", 6090225L, 50777322L));
        stopAreaBuilder.addPoint(createNetPoint("1013", 6090225L, 50777322L));
        stopAreaBuilder.addPoint(createNetPoint("1014", 6090225L, 50777322L));

        stopAreaBuilder.build().writeTo(new FileOutputStream("./Protobuf/src/main/resources/StopAreas"));
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
