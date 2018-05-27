package de.dwi.demo.thrift;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TBinaryProtocol;

import de.dwi.demo.thrift.model.Location;
import de.dwi.demo.thrift.model.NetPoint;
import de.dwi.demo.thrift.model.StopArea;
import de.dwi.demo.thrift.model.StopAreaType;

/**
 * This class represents the provider of the sample data by serializing this data using Apache Thrift.
 */
final class DataProvider {

    private static final TSerializer T_SERIALIZER = new TSerializer(new TBinaryProtocol.Factory());

    /**
     * Provides sample data by serializing it into the file specified by {@code targetResource} using Apache Thrift.
     *
     * @param targetResource
     *         The absolute or relative path to the file where the serialized sample data shall be
     *         stored into.
     *
     * @throws TException
     *         iff provider is not able to write file.
     */
    static void provide(final String targetResource) throws TException {
        //@formatter:off
        final List<NetPoint> netPoints = Arrays.asList(
                createNetPoint("1011", 6090225L, 50777322L),
                createNetPoint("1012", 6090230L, 50777330L),
                createNetPoint("1013", 6090250L, 50777335L),
                createNetPoint("1014", 6090290L,50777340L));
        //@formatter:on

        final StopArea stopArea = new StopArea("Point Lobos", StopAreaType.A, netPoints);

        serialize(targetResource, stopArea);
    }

    private static void serialize(final String targetResource, final StopArea stopArea) throws TException {
        try (final FileOutputStream fos = new FileOutputStream(targetResource)) {
            fos.write(T_SERIALIZER.serialize(stopArea));
        } catch (final IOException e) {
            throw new TException(e);
        }
    }

    private static NetPoint createNetPoint(final String netPointId, final long gpsX, final long gpsY) {
        return new NetPoint(netPointId, new Location(gpsX, gpsY));
    }

}
