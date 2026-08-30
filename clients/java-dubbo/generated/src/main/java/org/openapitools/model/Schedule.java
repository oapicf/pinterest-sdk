package org.openapitools.model;

import org.openapitools.model.AdAccountEntityType;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class Schedule implements Serializable {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.deltaValue, schedule.deltaValue) &&
        Objects.equals(this.endTimestamp, schedule.endTimestamp) &&
        Objects.equals(this.entityId, schedule.entityId) &&
        Objects.equals(this.entityType, schedule.entityType) &&
        Objects.equals(this.name, schedule.name) &&
        Objects.equals(this.scheduleAction, schedule.scheduleAction) &&
        Objects.equals(this.scheduleId, schedule.scheduleId) &&
        Objects.equals(this.scheduleStatus, schedule.scheduleStatus) &&
        Objects.equals(this.scheduleType, schedule.scheduleType) &&
        Objects.equals(this.startTimestamp, schedule.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaValue, endTimestamp, entityId, entityType, name, scheduleAction, scheduleId, scheduleStatus, scheduleType, startTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
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
