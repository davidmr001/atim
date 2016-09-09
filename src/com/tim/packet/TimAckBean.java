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
public class TimAckBean implements org.apache.thrift.TBase<TimAckBean, TimAckBean._Fields>, java.io.Serializable, Cloneable, Comparable<TimAckBean> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimAckBean");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ACK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("ackType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ACK_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("ackStatus", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXTRA_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("extraList", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("err", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField EXTRA_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("extraMap", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimAckBeanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimAckBeanTupleSchemeFactory());
  }

  /**
   * id，返回所要回执协议的线程id
   */
  public String id; // optional
  /**
   * 类型，自定义 如：ping，message等
   */
  public String ackType; // optional
  /**
   * 状态，如成功，失败等
   */
  public String ackStatus; // optional
  /**
   * 附加信息
   */
  public List<TimNode> extraList; // optional
  /**
   * 错误信息
   */
  public TimError err; // optional
  public Map<String,String> extraMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * id，返回所要回执协议的线程id
     */
    ID((short)1, "id"),
    /**
     * 类型，自定义 如：ping，message等
     */
    ACK_TYPE((short)2, "ackType"),
    /**
     * 状态，如成功，失败等
     */
    ACK_STATUS((short)3, "ackStatus"),
    /**
     * 附加信息
     */
    EXTRA_LIST((short)4, "extraList"),
    /**
     * 错误信息
     */
    ERR((short)5, "err"),
    EXTRA_MAP((short)6, "extraMap");

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
        case 1: // ID
          return ID;
        case 2: // ACK_TYPE
          return ACK_TYPE;
        case 3: // ACK_STATUS
          return ACK_STATUS;
        case 4: // EXTRA_LIST
          return EXTRA_LIST;
        case 5: // ERR
          return ERR;
        case 6: // EXTRA_MAP
          return EXTRA_MAP;
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
  private static final _Fields optionals[] = {_Fields.ID,_Fields.ACK_TYPE,_Fields.ACK_STATUS,_Fields.EXTRA_LIST,_Fields.ERR,_Fields.EXTRA_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("ackType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACK_STATUS, new org.apache.thrift.meta_data.FieldMetaData("ackStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTRA_LIST, new org.apache.thrift.meta_data.FieldMetaData("extraList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TimNode.class))));
    tmpMap.put(_Fields.ERR, new org.apache.thrift.meta_data.FieldMetaData("err", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TimError.class)));
    tmpMap.put(_Fields.EXTRA_MAP, new org.apache.thrift.meta_data.FieldMetaData("extraMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimAckBean.class, metaDataMap);
  }

  public TimAckBean() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimAckBean(TimAckBean other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetAckType()) {
      this.ackType = other.ackType;
    }
    if (other.isSetAckStatus()) {
      this.ackStatus = other.ackStatus;
    }
    if (other.isSetExtraList()) {
      List<TimNode> __this__extraList = new ArrayList<TimNode>(other.extraList.size());
      for (TimNode other_element : other.extraList) {
        __this__extraList.add(new TimNode(other_element));
      }
      this.extraList = __this__extraList;
    }
    if (other.isSetErr()) {
      this.err = new TimError(other.err);
    }
    if (other.isSetExtraMap()) {
      Map<String,String> __this__extraMap = new HashMap<String,String>(other.extraMap);
      this.extraMap = __this__extraMap;
    }
  }

  public TimAckBean deepCopy() {
    return new TimAckBean(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.ackType = null;
    this.ackStatus = null;
    this.extraList = null;
    this.err = null;
    this.extraMap = null;
  }

  /**
   * id，返回所要回执协议的线程id
   */
  public String getId() {
    return this.id;
  }

  /**
   * id，返回所要回执协议的线程id
   */
  public TimAckBean setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  /**
   * 类型，自定义 如：ping，message等
   */
  public String getAckType() {
    return this.ackType;
  }

  /**
   * 类型，自定义 如：ping，message等
   */
  public TimAckBean setAckType(String ackType) {
    this.ackType = ackType;
    return this;
  }

  public void unsetAckType() {
    this.ackType = null;
  }

  /** Returns true if field ackType is set (has been assigned a value) and false otherwise */
  public boolean isSetAckType() {
    return this.ackType != null;
  }

  public void setAckTypeIsSet(boolean value) {
    if (!value) {
      this.ackType = null;
    }
  }

  /**
   * 状态，如成功，失败等
   */
  public String getAckStatus() {
    return this.ackStatus;
  }

  /**
   * 状态，如成功，失败等
   */
  public TimAckBean setAckStatus(String ackStatus) {
    this.ackStatus = ackStatus;
    return this;
  }

  public void unsetAckStatus() {
    this.ackStatus = null;
  }

  /** Returns true if field ackStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetAckStatus() {
    return this.ackStatus != null;
  }

  public void setAckStatusIsSet(boolean value) {
    if (!value) {
      this.ackStatus = null;
    }
  }

  public int getExtraListSize() {
    return (this.extraList == null) ? 0 : this.extraList.size();
  }

  public java.util.Iterator<TimNode> getExtraListIterator() {
    return (this.extraList == null) ? null : this.extraList.iterator();
  }

  public void addToExtraList(TimNode elem) {
    if (this.extraList == null) {
      this.extraList = new ArrayList<TimNode>();
    }
    this.extraList.add(elem);
  }

  /**
   * 附加信息
   */
  public List<TimNode> getExtraList() {
    return this.extraList;
  }

  /**
   * 附加信息
   */
  public TimAckBean setExtraList(List<TimNode> extraList) {
    this.extraList = extraList;
    return this;
  }

  public void unsetExtraList() {
    this.extraList = null;
  }

  /** Returns true if field extraList is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraList() {
    return this.extraList != null;
  }

  public void setExtraListIsSet(boolean value) {
    if (!value) {
      this.extraList = null;
    }
  }

  /**
   * 错误信息
   */
  public TimError getErr() {
    return this.err;
  }

  /**
   * 错误信息
   */
  public TimAckBean setErr(TimError err) {
    this.err = err;
    return this;
  }

  public void unsetErr() {
    this.err = null;
  }

  /** Returns true if field err is set (has been assigned a value) and false otherwise */
  public boolean isSetErr() {
    return this.err != null;
  }

  public void setErrIsSet(boolean value) {
    if (!value) {
      this.err = null;
    }
  }

  public int getExtraMapSize() {
    return (this.extraMap == null) ? 0 : this.extraMap.size();
  }

  public void putToExtraMap(String key, String val) {
    if (this.extraMap == null) {
      this.extraMap = new HashMap<String,String>();
    }
    this.extraMap.put(key, val);
  }

  public Map<String,String> getExtraMap() {
    return this.extraMap;
  }

  public TimAckBean setExtraMap(Map<String,String> extraMap) {
    this.extraMap = extraMap;
    return this;
  }

  public void unsetExtraMap() {
    this.extraMap = null;
  }

  /** Returns true if field extraMap is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraMap() {
    return this.extraMap != null;
  }

  public void setExtraMapIsSet(boolean value) {
    if (!value) {
      this.extraMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case ACK_TYPE:
      if (value == null) {
        unsetAckType();
      } else {
        setAckType((String)value);
      }
      break;

    case ACK_STATUS:
      if (value == null) {
        unsetAckStatus();
      } else {
        setAckStatus((String)value);
      }
      break;

    case EXTRA_LIST:
      if (value == null) {
        unsetExtraList();
      } else {
        setExtraList((List<TimNode>)value);
      }
      break;

    case ERR:
      if (value == null) {
        unsetErr();
      } else {
        setErr((TimError)value);
      }
      break;

    case EXTRA_MAP:
      if (value == null) {
        unsetExtraMap();
      } else {
        setExtraMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case ACK_TYPE:
      return getAckType();

    case ACK_STATUS:
      return getAckStatus();

    case EXTRA_LIST:
      return getExtraList();

    case ERR:
      return getErr();

    case EXTRA_MAP:
      return getExtraMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case ACK_TYPE:
      return isSetAckType();
    case ACK_STATUS:
      return isSetAckStatus();
    case EXTRA_LIST:
      return isSetExtraList();
    case ERR:
      return isSetErr();
    case EXTRA_MAP:
      return isSetExtraMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimAckBean)
      return this.equals((TimAckBean)that);
    return false;
  }

  public boolean equals(TimAckBean that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_ackType = true && this.isSetAckType();
    boolean that_present_ackType = true && that.isSetAckType();
    if (this_present_ackType || that_present_ackType) {
      if (!(this_present_ackType && that_present_ackType))
        return false;
      if (!this.ackType.equals(that.ackType))
        return false;
    }

    boolean this_present_ackStatus = true && this.isSetAckStatus();
    boolean that_present_ackStatus = true && that.isSetAckStatus();
    if (this_present_ackStatus || that_present_ackStatus) {
      if (!(this_present_ackStatus && that_present_ackStatus))
        return false;
      if (!this.ackStatus.equals(that.ackStatus))
        return false;
    }

    boolean this_present_extraList = true && this.isSetExtraList();
    boolean that_present_extraList = true && that.isSetExtraList();
    if (this_present_extraList || that_present_extraList) {
      if (!(this_present_extraList && that_present_extraList))
        return false;
      if (!this.extraList.equals(that.extraList))
        return false;
    }

    boolean this_present_err = true && this.isSetErr();
    boolean that_present_err = true && that.isSetErr();
    if (this_present_err || that_present_err) {
      if (!(this_present_err && that_present_err))
        return false;
      if (!this.err.equals(that.err))
        return false;
    }

    boolean this_present_extraMap = true && this.isSetExtraMap();
    boolean that_present_extraMap = true && that.isSetExtraMap();
    if (this_present_extraMap || that_present_extraMap) {
      if (!(this_present_extraMap && that_present_extraMap))
        return false;
      if (!this.extraMap.equals(that.extraMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_ackType = true && (isSetAckType());
    list.add(present_ackType);
    if (present_ackType)
      list.add(ackType);

    boolean present_ackStatus = true && (isSetAckStatus());
    list.add(present_ackStatus);
    if (present_ackStatus)
      list.add(ackStatus);

    boolean present_extraList = true && (isSetExtraList());
    list.add(present_extraList);
    if (present_extraList)
      list.add(extraList);

    boolean present_err = true && (isSetErr());
    list.add(present_err);
    if (present_err)
      list.add(err);

    boolean present_extraMap = true && (isSetExtraMap());
    list.add(present_extraMap);
    if (present_extraMap)
      list.add(extraMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimAckBean other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAckType()).compareTo(other.isSetAckType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAckType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ackType, other.ackType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAckStatus()).compareTo(other.isSetAckStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAckStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ackStatus, other.ackStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraList()).compareTo(other.isSetExtraList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraList, other.extraList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErr()).compareTo(other.isSetErr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.err, other.err);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraMap()).compareTo(other.isSetExtraMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraMap, other.extraMap);
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
    StringBuilder sb = new StringBuilder("TimAckBean(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    if (isSetAckType()) {
      if (!first) sb.append(", ");
      sb.append("ackType:");
      if (this.ackType == null) {
        sb.append("null");
      } else {
        sb.append(this.ackType);
      }
      first = false;
    }
    if (isSetAckStatus()) {
      if (!first) sb.append(", ");
      sb.append("ackStatus:");
      if (this.ackStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.ackStatus);
      }
      first = false;
    }
    if (isSetExtraList()) {
      if (!first) sb.append(", ");
      sb.append("extraList:");
      if (this.extraList == null) {
        sb.append("null");
      } else {
        sb.append(this.extraList);
      }
      first = false;
    }
    if (isSetErr()) {
      if (!first) sb.append(", ");
      sb.append("err:");
      if (this.err == null) {
        sb.append("null");
      } else {
        sb.append(this.err);
      }
      first = false;
    }
    if (isSetExtraMap()) {
      if (!first) sb.append(", ");
      sb.append("extraMap:");
      if (this.extraMap == null) {
        sb.append("null");
      } else {
        sb.append(this.extraMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (err != null) {
      err.validate();
    }
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

  private static class TimAckBeanStandardSchemeFactory implements SchemeFactory {
    public TimAckBeanStandardScheme getScheme() {
      return new TimAckBeanStandardScheme();
    }
  }

  private static class TimAckBeanStandardScheme extends StandardScheme<TimAckBean> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimAckBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ackType = iprot.readString();
              struct.setAckTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACK_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ackStatus = iprot.readString();
              struct.setAckStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTRA_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.extraList = new ArrayList<TimNode>(_list0.size);
                TimNode _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TimNode();
                  _elem1.read(iprot);
                  struct.extraList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setExtraListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ERR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.err = new TimError();
              struct.err.read(iprot);
              struct.setErrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EXTRA_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
                struct.extraMap = new HashMap<String,String>(2*_map3.size);
                String _key4;
                String _val5;
                for (int _i6 = 0; _i6 < _map3.size; ++_i6)
                {
                  _key4 = iprot.readString();
                  _val5 = iprot.readString();
                  struct.extraMap.put(_key4, _val5);
                }
                iprot.readMapEnd();
              }
              struct.setExtraMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimAckBean struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ackType != null) {
        if (struct.isSetAckType()) {
          oprot.writeFieldBegin(ACK_TYPE_FIELD_DESC);
          oprot.writeString(struct.ackType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ackStatus != null) {
        if (struct.isSetAckStatus()) {
          oprot.writeFieldBegin(ACK_STATUS_FIELD_DESC);
          oprot.writeString(struct.ackStatus);
          oprot.writeFieldEnd();
        }
      }
      if (struct.extraList != null) {
        if (struct.isSetExtraList()) {
          oprot.writeFieldBegin(EXTRA_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.extraList.size()));
            for (TimNode _iter7 : struct.extraList)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.err != null) {
        if (struct.isSetErr()) {
          oprot.writeFieldBegin(ERR_FIELD_DESC);
          struct.err.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.extraMap != null) {
        if (struct.isSetExtraMap()) {
          oprot.writeFieldBegin(EXTRA_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraMap.size()));
            for (Map.Entry<String, String> _iter8 : struct.extraMap.entrySet())
            {
              oprot.writeString(_iter8.getKey());
              oprot.writeString(_iter8.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimAckBeanTupleSchemeFactory implements SchemeFactory {
    public TimAckBeanTupleScheme getScheme() {
      return new TimAckBeanTupleScheme();
    }
  }

  private static class TimAckBeanTupleScheme extends TupleScheme<TimAckBean> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimAckBean struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetAckType()) {
        optionals.set(1);
      }
      if (struct.isSetAckStatus()) {
        optionals.set(2);
      }
      if (struct.isSetExtraList()) {
        optionals.set(3);
      }
      if (struct.isSetErr()) {
        optionals.set(4);
      }
      if (struct.isSetExtraMap()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetAckType()) {
        oprot.writeString(struct.ackType);
      }
      if (struct.isSetAckStatus()) {
        oprot.writeString(struct.ackStatus);
      }
      if (struct.isSetExtraList()) {
        {
          oprot.writeI32(struct.extraList.size());
          for (TimNode _iter9 : struct.extraList)
          {
            _iter9.write(oprot);
          }
        }
      }
      if (struct.isSetErr()) {
        struct.err.write(oprot);
      }
      if (struct.isSetExtraMap()) {
        {
          oprot.writeI32(struct.extraMap.size());
          for (Map.Entry<String, String> _iter10 : struct.extraMap.entrySet())
          {
            oprot.writeString(_iter10.getKey());
            oprot.writeString(_iter10.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimAckBean struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ackType = iprot.readString();
        struct.setAckTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ackStatus = iprot.readString();
        struct.setAckStatusIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list11 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.extraList = new ArrayList<TimNode>(_list11.size);
          TimNode _elem12;
          for (int _i13 = 0; _i13 < _list11.size; ++_i13)
          {
            _elem12 = new TimNode();
            _elem12.read(iprot);
            struct.extraList.add(_elem12);
          }
        }
        struct.setExtraListIsSet(true);
      }
      if (incoming.get(4)) {
        struct.err = new TimError();
        struct.err.read(iprot);
        struct.setErrIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraMap = new HashMap<String,String>(2*_map14.size);
          String _key15;
          String _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readString();
            _val16 = iprot.readString();
            struct.extraMap.put(_key15, _val16);
          }
        }
        struct.setExtraMapIsSet(true);
      }
    }
  }

}

