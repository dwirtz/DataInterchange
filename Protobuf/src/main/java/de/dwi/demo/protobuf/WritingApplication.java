package de.dwi.demo.protobuf;

import java.io.FileOutputStream;
import java.io.IOException;

import de.dwi.demo.protobuf.model.Model;

public class WritingApplication {

    public static void main(final String[] args) throws IOException {
        final Model.StopArea.Builder stopAreaBuilder = Model.StopArea.newBuilder();
        stopAreaBuilder.setId("Aachen Bushof");
        stopAreaBuilder.setType(Model.StopArea.StopAreaType.A);

        final Model.NetPoint.Builder netPointBuilder = Model.NetPoint.newBuilder();
        netPointBuilder.setId("1011");

        final Model.Location.Builder locationBuilder = Model.Location.newBuilder();
        locationBuilder.setGpsX(6090225L);
        locationBuilder.setGpsY(50777322L);
        netPointBuilder.setLocation(locationBuilder.build());

        stopAreaBuilder.addPoint(netPointBuilder.build());

        stopAreaBuilder.build().writeTo(new FileOutputStream("./Protobuf/src/main/resources/StopAreas"));
    }
}
