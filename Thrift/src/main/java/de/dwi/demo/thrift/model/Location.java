/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package de.dwi.demo.thrift.model;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-05-27")
public class Location implements org.apache.thrift.TBase<Location, Location._Fields>, java.io.Serializable, Cloneable, Comparable<Location> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Location");

  private static final org.apache.thrift.protocol.TField GPS_X_FIELD_DESC = new org.apache.thrift.protocol.TField("gpsX", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField GPS_Y_FIELD_DESC = new org.apache.thrift.protocol.TField("gpsY", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LocationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LocationTupleSchemeFactory();

  private double gpsX; // required
  private double gpsY; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GPS_X((short)1, "gpsX"),
    GPS_Y((short)2, "gpsY");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GPS_X
          return GPS_X;
        case 2: // GPS_Y
          return GPS_Y;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GPSX_ISSET_ID = 0;
  private static final int __GPSY_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GPS_X, new org.apache.thrift.meta_data.FieldMetaData("gpsX", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.GPS_Y, new org.apache.thrift.meta_data.FieldMetaData("gpsY", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Location.class, metaDataMap);
  }

  public Location() {
  }

  public Location(
    double gpsX,
    double gpsY)
  {
    this();
    this.gpsX = gpsX;
    setGpsXIsSet(true);
    this.gpsY = gpsY;
    setGpsYIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Location(Location other) {
    __isset_bitfield = other.__isset_bitfield;
    this.gpsX = other.gpsX;
    this.gpsY = other.gpsY;
  }

  public Location deepCopy() {
    return new Location(this);
  }

  @Override
  public void clear() {
    setGpsXIsSet(false);
    this.gpsX = 0.0;
    setGpsYIsSet(false);
    this.gpsY = 0.0;
  }

  public double getGpsX() {
    return this.gpsX;
  }

  public Location setGpsX(double gpsX) {
    this.gpsX = gpsX;
    setGpsXIsSet(true);
    return this;
  }

  public void unsetGpsX() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GPSX_ISSET_ID);
  }

  /** Returns true if field gpsX is set (has been assigned a value) and false otherwise */
  public boolean isSetGpsX() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GPSX_ISSET_ID);
  }

  public void setGpsXIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GPSX_ISSET_ID, value);
  }

  public double getGpsY() {
    return this.gpsY;
  }

  public Location setGpsY(double gpsY) {
    this.gpsY = gpsY;
    setGpsYIsSet(true);
    return this;
  }

  public void unsetGpsY() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GPSY_ISSET_ID);
  }

  /** Returns true if field gpsY is set (has been assigned a value) and false otherwise */
  public boolean isSetGpsY() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GPSY_ISSET_ID);
  }

  public void setGpsYIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GPSY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case GPS_X:
      if (value == null) {
        unsetGpsX();
      } else {
        setGpsX((java.lang.Double)value);
      }
      break;

    case GPS_Y:
      if (value == null) {
        unsetGpsY();
      } else {
        setGpsY((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case GPS_X:
      return getGpsX();

    case GPS_Y:
      return getGpsY();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case GPS_X:
      return isSetGpsX();
    case GPS_Y:
      return isSetGpsY();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Location)
      return this.equals((Location)that);
    return false;
  }

  public boolean equals(Location that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_gpsX = true;
    boolean that_present_gpsX = true;
    if (this_present_gpsX || that_present_gpsX) {
      if (!(this_present_gpsX && that_present_gpsX))
        return false;
      if (this.gpsX != that.gpsX)
        return false;
    }

    boolean this_present_gpsY = true;
    boolean that_present_gpsY = true;
    if (this_present_gpsY || that_present_gpsY) {
      if (!(this_present_gpsY && that_present_gpsY))
        return false;
      if (this.gpsY != that.gpsY)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gpsX);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gpsY);

    return hashCode;
  }

  @Override
  public int compareTo(Location other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetGpsX()).compareTo(other.isSetGpsX());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGpsX()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gpsX, other.gpsX);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGpsY()).compareTo(other.isSetGpsY());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGpsY()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gpsY, other.gpsY);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(");
    boolean first = true;

    sb.append("gpsX:");
    sb.append(this.gpsX);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gpsY:");
    sb.append(this.gpsY);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'gpsX' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'gpsY' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LocationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LocationStandardScheme getScheme() {
      return new LocationStandardScheme();
    }
  }

  private static class LocationStandardScheme extends org.apache.thrift.scheme.StandardScheme<Location> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GPS_X
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.gpsX = iprot.readDouble();
              struct.setGpsXIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GPS_Y
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.gpsY = iprot.readDouble();
              struct.setGpsYIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetGpsX()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'gpsX' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetGpsY()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'gpsY' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Location struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(GPS_X_FIELD_DESC);
      oprot.writeDouble(struct.gpsX);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GPS_Y_FIELD_DESC);
      oprot.writeDouble(struct.gpsY);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LocationTupleScheme getScheme() {
      return new LocationTupleScheme();
    }
  }

  private static class LocationTupleScheme extends org.apache.thrift.scheme.TupleScheme<Location> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeDouble(struct.gpsX);
      oprot.writeDouble(struct.gpsY);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.gpsX = iprot.readDouble();
      struct.setGpsXIsSet(true);
      struct.gpsY = iprot.readDouble();
      struct.setGpsYIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
