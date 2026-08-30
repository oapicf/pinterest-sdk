package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ScheduleAction;
import org.openapitools.vertxweb.server.model.ScheduleCommonDeltaValue;
import org.openapitools.vertxweb.server.model.ScheduleStatus;
import org.openapitools.vertxweb.server.model.ScheduleType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleUpdateRequest   {
  
  private String entityId;
  private String entityType;
  private String id;
  private ScheduleCommonDeltaValue deltaValue;
  private Integer endTimestamp;
  private String name;
  private ScheduleAction scheduleAction;
  private ScheduleStatus scheduleStatus;
  private ScheduleType scheduleType;
  private Integer startTimestamp;

  public ScheduleUpdateRequest () {

  }

  public ScheduleUpdateRequest (String entityId, String entityType, String id, ScheduleCommonDeltaValue deltaValue, Integer endTimestamp, String name, ScheduleAction scheduleAction, ScheduleStatus scheduleStatus, ScheduleType scheduleType, Integer startTimestamp) {
    this.entityId = entityId;
    this.entityType = entityType;
    this.id = id;
    this.deltaValue = deltaValue;
    this.endTimestamp = endTimestamp;
    this.name = name;
    this.scheduleAction = scheduleAction;
    this.scheduleStatus = scheduleStatus;
    this.scheduleType = scheduleType;
    this.startTimestamp = startTimestamp;
  }

    
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

    
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("delta_value")
  public ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }
  public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

    
  @JsonProperty("end_timestamp")
  public Integer getEndTimestamp() {
    return endTimestamp;
  }
  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
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
    ScheduleUpdateRequest scheduleUpdateRequest = (ScheduleUpdateRequest) o;
    return Objects.equals(entityId, scheduleUpdateRequest.entityId) &&
        Objects.equals(entityType, scheduleUpdateRequest.entityType) &&
        Objects.equals(id, scheduleUpdateRequest.id) &&
        Objects.equals(deltaValue, scheduleUpdateRequest.deltaValue) &&
        Objects.equals(endTimestamp, scheduleUpdateRequest.endTimestamp) &&
        Objects.equals(name, scheduleUpdateRequest.name) &&
        Objects.equals(scheduleAction, scheduleUpdateRequest.scheduleAction) &&
        Objects.equals(scheduleStatus, scheduleUpdateRequest.scheduleStatus) &&
        Objects.equals(scheduleType, scheduleUpdateRequest.scheduleType) &&
        Objects.equals(startTimestamp, scheduleUpdateRequest.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, id, deltaValue, endTimestamp, name, scheduleAction, scheduleStatus, scheduleType, startTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleUpdateRequest {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deltaValue: ").append(toIndentedString(deltaValue)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduleAction: ").append(toIndentedString(scheduleAction)).append("\n");
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
