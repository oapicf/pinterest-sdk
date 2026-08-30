package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdAccountEntityType;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delta_value")
  public ScheduleDeltaValue getDeltaValue() {
    return deltaValue;
  }
  public void setDeltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(value = "Schedule end time. Unix timestamp in seconds.")
  @JsonProperty("end_timestamp")
  public Integer getEndTimestamp() {
    return endTimestamp;
  }
  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  /**
   * entity ID.
   **/
  
  @ApiModelProperty(value = "entity ID.")
  @JsonProperty("entity_id")
 @Pattern(regexp="^\\d+$")  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Specify the entity_type to get summary information
   **/
  
  @ApiModelProperty(value = "Specify the entity_type to get summary information")
  @JsonProperty("entity_type")
  public AdAccountEntityType getEntityType() {
    return entityType;
  }
  public void setEntityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Schedule name.
   **/
  
  @ApiModelProperty(value = "Schedule name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The schedule action.
   **/
  
  @ApiModelProperty(value = "The schedule action.")
  @JsonProperty("schedule_action")
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }
  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  /**
   * Schedule ID.
   **/
  
  @ApiModelProperty(required = true, value = "Schedule ID.")
  @JsonProperty("schedule_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   * Schedule status.
   **/
  
  @ApiModelProperty(value = "Schedule status.")
  @JsonProperty("schedule_status")
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }
  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  /**
   * The schedule type.
   **/
  
  @ApiModelProperty(value = "The schedule type.")
  @JsonProperty("schedule_type")
  public ScheduleType getScheduleType() {
    return scheduleType;
  }
  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  /**
   * Schedule start time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(value = "Schedule start time. Unix timestamp in seconds.")
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
    return Objects.equals(this.deltaValue, scheduleBatchUpdate.deltaValue) &&
        Objects.equals(this.endTimestamp, scheduleBatchUpdate.endTimestamp) &&
        Objects.equals(this.entityId, scheduleBatchUpdate.entityId) &&
        Objects.equals(this.entityType, scheduleBatchUpdate.entityType) &&
        Objects.equals(this.id, scheduleBatchUpdate.id) &&
        Objects.equals(this.name, scheduleBatchUpdate.name) &&
        Objects.equals(this.scheduleAction, scheduleBatchUpdate.scheduleAction) &&
        Objects.equals(this.scheduleId, scheduleBatchUpdate.scheduleId) &&
        Objects.equals(this.scheduleStatus, scheduleBatchUpdate.scheduleStatus) &&
        Objects.equals(this.scheduleType, scheduleBatchUpdate.scheduleType) &&
        Objects.equals(this.startTimestamp, scheduleBatchUpdate.startTimestamp);
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

