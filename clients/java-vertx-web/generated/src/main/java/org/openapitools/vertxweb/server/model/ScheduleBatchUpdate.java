package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AdAccountEntityType;
import org.openapitools.vertxweb.server.model.ScheduleAction;
import org.openapitools.vertxweb.server.model.ScheduleDeltaValue;
import org.openapitools.vertxweb.server.model.ScheduleStatus;
import org.openapitools.vertxweb.server.model.ScheduleType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleBatchUpdate   {
  
  private ScheduleDeltaValue deltaValue;
  private Integer endTimestamp;
  private String entityId;
  private AdAccountEntityType entityType;
  private String id;
  private String name;
  private ScheduleAction scheduleAction;
  private String scheduleId;
  private ScheduleStatus scheduleStatus;
  private ScheduleType scheduleType;
  private Integer startTimestamp;

  public ScheduleBatchUpdate () {

  }

  public ScheduleBatchUpdate (ScheduleDeltaValue deltaValue, Integer endTimestamp, String entityId, AdAccountEntityType entityType, String id, String name, ScheduleAction scheduleAction, String scheduleId, ScheduleStatus scheduleStatus, ScheduleType scheduleType, Integer startTimestamp) {
    this.deltaValue = deltaValue;
    this.endTimestamp = endTimestamp;
    this.entityId = entityId;
    this.entityType = entityType;
    this.id = id;
    this.name = name;
    this.scheduleAction = scheduleAction;
    this.scheduleId = scheduleId;
    this.scheduleStatus = scheduleStatus;
    this.scheduleType = scheduleType;
    this.startTimestamp = startTimestamp;
  }

    
  @JsonProperty("delta_value")
  public ScheduleDeltaValue getDeltaValue() {
    return deltaValue;
  }
  public void setDeltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

    
  @JsonProperty("end_timestamp")
  public Integer getEndTimestamp() {
    return endTimestamp;
  }
  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

    
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

    
  @JsonProperty("entity_type")
  public AdAccountEntityType getEntityType() {
    return entityType;
  }
  public void setEntityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("schedule_action")
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }
  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

    
  @JsonProperty("schedule_id")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

    
  @JsonProperty("schedule_status")
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }
  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

    
  @JsonProperty("schedule_type")
  public ScheduleType getScheduleType() {
    return scheduleType;
  }
  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

    
  @JsonProperty("start_timestamp")
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
    ScheduleBatchUpdate scheduleBatchUpdate = (ScheduleBatchUpdate) o;
    return Objects.equals(deltaValue, scheduleBatchUpdate.deltaValue) &&
        Objects.equals(endTimestamp, scheduleBatchUpdate.endTimestamp) &&
        Objects.equals(entityId, scheduleBatchUpdate.entityId) &&
        Objects.equals(entityType, scheduleBatchUpdate.entityType) &&
        Objects.equals(id, scheduleBatchUpdate.id) &&
        Objects.equals(name, scheduleBatchUpdate.name) &&
        Objects.equals(scheduleAction, scheduleBatchUpdate.scheduleAction) &&
        Objects.equals(scheduleId, scheduleBatchUpdate.scheduleId) &&
        Objects.equals(scheduleStatus, scheduleBatchUpdate.scheduleStatus) &&
        Objects.equals(scheduleType, scheduleBatchUpdate.scheduleType) &&
        Objects.equals(startTimestamp, scheduleBatchUpdate.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaValue, endTimestamp, entityId, entityType, id, name, scheduleAction, scheduleId, scheduleStatus, scheduleType, startTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBatchUpdate {\n");
    
    sb.append("    deltaValue: ").append(toIndentedString(deltaValue)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
