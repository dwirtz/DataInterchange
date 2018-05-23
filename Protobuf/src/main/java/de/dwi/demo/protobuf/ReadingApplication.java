package de.dwi.demo.protobuf;

import java.io.FileInputStream;
import java.io.IOException;

import de.dwi.demo.protobuf.model.Model;

public class ReadingApplication {

    public static void main(final String[] args) throws IOException {
        final Model.StopArea stopArea = Model.StopArea.parseFrom(new FileInputStream(""
                + "./Protobuf/src/main/resources/StopAreas"));

        System.out.println(stopArea);
    }

}
