/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.tim.packet;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-05")
public class TimTime implements org.apache.thrift.TBase<TimTime, TimTime._Fields>, java.io.Serializable, Cloneable, Comparable<TimTime> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimTime");

  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FORMATTIME_FIELD_DESC = new org.apache.thrift.protocol.TField("formattime", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimTimeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimTimeTupleSchemeFactory());
  }

  /**
   * 时间戳    (毫秒)
   */
  public String timestamp; // optional
  /**
   * 格式化时间
   */
  public String formattime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 时间戳    (毫秒)
     */
    TIMESTAMP((short)1, "timestamp"),
    /**
     * 格式化时间
     */
    FORMATTIME((short)2, "formattime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TIMESTAMP
          return TIMESTAMP;
        case 2: // FORMATTIME
          return FORMATTIME;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TIMESTAMP,_Fields.FORMATTIME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FORMATTIME, new org.apache.thrift.meta_data.FieldMetaData("formattime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimTime.class, metaDataMap);
  }

  public TimTime() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimTime(TimTime other) {
    if (other.isSetTimestamp()) {
      this.timestamp = other.timestamp;
    }
    if (other.isSetFormattime()) {
      this.formattime = other.formattime;
    }
  }

  public TimTime deepCopy() {
    return new TimTime(this);
  }

  @Override
  public void clear() {
    this.timestamp = null;
    this.formattime = null;
  }

  /**
   * 时间戳    (毫秒)
   */
  public String getTimestamp() {
    return this.timestamp;
  }

  /**
   * 时间戳    (毫秒)
   */
  public TimTime setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public void unsetTimestamp() {
    this.timestamp = null;
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return this.timestamp != null;
  }

  public void setTimestampIsSet(boolean value) {
    if (!value) {
      this.timestamp = null;
    }
  }

  /**
   * 格式化时间
   */
  public String getFormattime() {
    return this.formattime;
  }

  /**
   * 格式化时间
   */
  public TimTime setFormattime(String formattime) {
    this.formattime = formattime;
    return this;
  }

  public void unsetFormattime() {
    this.formattime = null;
  }

  /** Returns true if field formattime is set (has been assigned a value) and false otherwise */
  public boolean isSetFormattime() {
    return this.formattime != null;
  }

  public void setFormattimeIsSet(boolean value) {
    if (!value) {
      this.formattime = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((String)value);
      }
      break;

    case FORMATTIME:
      if (value == null) {
        unsetFormattime();
      } else {
        setFormattime((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return getTimestamp();

    case FORMATTIME:
      return getFormattime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMESTAMP:
      return isSetTimestamp();
    case FORMATTIME:
      return isSetFormattime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimTime)
      return this.equals((TimTime)that);
    return false;
  }

  public boolean equals(TimTime that) {
    if (that == null)
      return false;

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (!this.timestamp.equals(that.timestamp))
        return false;
    }

    boolean this_present_formattime = true && this.isSetFormattime();
    boolean that_present_formattime = true && that.isSetFormattime();
    if (this_present_formattime || that_present_formattime) {
      if (!(this_present_formattime && that_present_formattime))
        return false;
      if (!this.formattime.equals(that.formattime))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_timestamp = true && (isSetTimestamp());
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    boolean present_formattime = true && (isSetFormattime());
    list.add(present_formattime);
    if (present_formattime)
      list.add(formattime);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimTime other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFormattime()).compareTo(other.isSetFormattime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFormattime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.formattime, other.formattime);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TimTime(");
    boolean first = true;

    if (isSetTimestamp()) {
      sb.append("timestamp:");
      if (this.timestamp == null) {
        sb.append("null");
      } else {
        sb.append(this.timestamp);
      }
      first = false;
    }
    if (isSetFormattime()) {
      if (!first) sb.append(", ");
      sb.append("formattime:");
      if (this.formattime == null) {
        sb.append("null");
      } else {
        sb.append(this.formattime);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TimTimeStandardSchemeFactory implements SchemeFactory {
    public TimTimeStandardScheme getScheme() {
      return new TimTimeStandardScheme();
    }
  }

  private static class TimTimeStandardScheme extends StandardScheme<TimTime> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimTime struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.timestamp = iprot.readString();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FORMATTIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.formattime = iprot.readString();
              struct.setFormattimeIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimTime struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.timestamp != null) {
        if (struct.isSetTimestamp()) {
          oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
          oprot.writeString(struct.timestamp);
          oprot.writeFieldEnd();
        }
      }
      if (struct.formattime != null) {
        if (struct.isSetFormattime()) {
          oprot.writeFieldBegin(FORMATTIME_FIELD_DESC);
          oprot.writeString(struct.formattime);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimTimeTupleSchemeFactory implements SchemeFactory {
    public TimTimeTupleScheme getScheme() {
      return new TimTimeTupleScheme();
    }
  }

  private static class TimTimeTupleScheme extends TupleScheme<TimTime> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimTime struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTimestamp()) {
        optionals.set(0);
      }
      if (struct.isSetFormattime()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTimestamp()) {
        oprot.writeString(struct.timestamp);
      }
      if (struct.isSetFormattime()) {
        oprot.writeString(struct.formattime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimTime struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.timestamp = iprot.readString();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(1)) {
        struct.formattime = iprot.readString();
        struct.setFormattimeIsSet(true);
      }
    }
  }

}

