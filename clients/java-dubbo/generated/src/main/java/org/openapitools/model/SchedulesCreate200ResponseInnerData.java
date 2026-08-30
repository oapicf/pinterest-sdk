package org.openapitools.model;

import org.openapitools.model.AdAccountEntityType;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.Schedule;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.openapitools.model.SchedulesCreate200ResponseInnerDataOneOf;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Created/updated resource on success or error details on failure
 */
public class SchedulesCreate200ResponseInnerData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("delta_value")
  private ScheduleDeltaValue deltaValue;

  /**
   * Schedule end time. Unix timestamp in seconds.
   */
  @JsonProperty("end_timestamp")
  private Integer endTimestamp;

  /**
   * entity ID.
   */
  @JsonProperty("entity_id")
  private String entityId;

  /**
   * Specify the entity_type to get summary information
   */
  @JsonProperty("entity_type")
  private AdAccountEntityType entityType;

  /**
   * Schedule name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The schedule action.
   */
  @JsonProperty("schedule_action")
  private ScheduleAction scheduleAction;

  /**
   * Schedule ID.
   */
  @JsonProperty("schedule_id")
  private String scheduleId;

  /**
   * Schedule status.
   */
  @JsonProperty("schedule_status")
  private ScheduleStatus scheduleStatus;

  /**
   * The schedule type.
   */
  @JsonProperty("schedule_type")
  private ScheduleType scheduleType;

  /**
   * Schedule start time. Unix timestamp in seconds.
   */
  @JsonProperty("start_timestamp")
  private Integer startTimestamp;

  @JsonProperty("id")
  private String id;

  @JsonProperty("exceptions")
  private PinterestLibError exceptions;

  /**
   * 
   * @return deltaValue
   */
  public ScheduleDeltaValue getDeltaValue() {
    return deltaValue;
  }

  public void setDeltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   * @return endTimestamp
   */
  public Integer getEndTimestamp() {
    return endTimestamp;
  }

  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  /**
   * entity ID.
   * @return entityId
   */
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Specify the entity_type to get summary information
   * @return entityType
   */
  public AdAccountEntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

  /**
   * Schedule name.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The schedule action.
   * @return scheduleAction
   */
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  /**
   * Schedule ID.
   * @return scheduleId
   */
  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   * Schedule status.
   * @return scheduleStatus
   */
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  /**
   * The schedule type.
   * @return scheduleType
   */
  public ScheduleType getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  /**
   * Schedule start time. Unix timestamp in seconds.
   * @return startTimestamp
   */
  public Integer getStartTimestamp() {
    return startTimestamp;
  }

  public void setStartTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  /**
   * 
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @return exceptions
   */
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulesCreate200ResponseInnerData schedulesCreate200ResponseInnerData = (SchedulesCreate200ResponseInnerData) o;
    return Objects.equals(this.deltaValue, schedulesCreate200ResponseInnerData.deltaValue) &&
        Objects.equals(this.endTimestamp, schedulesCreate200ResponseInnerData.endTimestamp) &&
        Objects.equals(this.entityId, schedulesCreate200ResponseInnerData.entityId) &&
        Objects.equals(this.entityType, schedulesCreate200ResponseInnerData.entityType) &&
        Objects.equals(this.name, schedulesCreate200ResponseInnerData.name) &&
        Objects.equals(this.scheduleAction, schedulesCreate200ResponseInnerData.scheduleAction) &&
        Objects.equals(this.scheduleId, schedulesCreate200ResponseInnerData.scheduleId) &&
        Objects.equals(this.scheduleStatus, schedulesCreate200ResponseInnerData.scheduleStatus) &&
        Objects.equals(this.scheduleType, schedulesCreate200ResponseInnerData.scheduleType) &&
        Objects.equals(this.startTimestamp, schedulesCreate200ResponseInnerData.startTimestamp) &&
        Objects.equals(this.id, schedulesCreate200ResponseInnerData.id) &&
        Objects.equals(this.exceptions, schedulesCreate200ResponseInnerData.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaValue, endTimestamp, entityId, entityType, name, scheduleAction, scheduleId, scheduleStatus, scheduleType, startTimestamp, id, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulesCreate200ResponseInnerData {\n");
    
    sb.append("    deltaValue: ").append(toIndentedString(deltaValue)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduleAction: ").append(toIndentedString(scheduleAction)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
