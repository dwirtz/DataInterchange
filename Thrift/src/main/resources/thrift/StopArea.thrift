namespace java de.dwi.demo.thrift.model

include "StopAreaType.thrift"
include "NetPoint.thrift"

struct StopArea {
    1: required string id,
    2: required StopAreaType.StopAreaType type,
    3: required list<NetPoint.NetPoint> points
}