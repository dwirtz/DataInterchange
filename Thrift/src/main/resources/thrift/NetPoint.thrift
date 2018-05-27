namespace java de.dwi.demo.thrift.model

include "Location.thrift"

struct NetPoint {
 1: required string id,
 2: required Location.Location location
}