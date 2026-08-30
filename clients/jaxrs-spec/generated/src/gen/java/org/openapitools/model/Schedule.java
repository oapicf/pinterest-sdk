package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("Schedule")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Schedule   {
  private ScheduleDeltaValue deltaValue;
  private Integer endTimestamp;
  private String entityId;
  private AdAccountEntityType entityType;
  private String name;
  private ScheduleAction scheduleAction;
  private String scheduleId;
  private ScheduleStatus scheduleStatus;
  private ScheduleType scheduleType;
  private Integer startTimestamp;

  public Schedule() {
  }

  @JsonCreator
  public Schedule(
    @JsonProperty(required = true, value = "entity_id") String entityId,
    @JsonProperty(required = true, value = "schedule_id") String scheduleId
  ) {
    this.entityId = entityId;
    this.scheduleId = scheduleId;
  }

  /**
   **/
  public Schedule deltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delta_value")
  @Valid public ScheduleDeltaValue getDeltaValue() {
    return deltaValue;
  }

  @JsonProperty("delta_value")
  public void setDeltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   **/
  public Schedule endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "Schedule end time. Unix timestamp in seconds.")
  @JsonProperty("end_timestamp")
  public Integer getEndTimestamp() {
    return endTimestamp;
  }

  @JsonProperty("end_timestamp")
  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  /**
   * entity ID.
   **/
  public Schedule entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "entity ID.")
  @JsonProperty(required = true, value = "entity_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getEntityId() {
    return entityId;
  }

  @JsonProperty(required = true, value = "entity_id")
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Specify the entity_type to get summary information
   **/
  public Schedule entityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  
  @ApiModelProperty(value = "Specify the entity_type to get summary information")
  @JsonProperty("entity_type")
  public AdAccountEntityType getEntityType() {
    return entityType;
  }

  @JsonProperty("entity_type")
  public void setEntityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

  /**
   * Schedule name.
   **/
  public Schedule name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Schedule name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The schedule action.
   **/
  public Schedule scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

  
  @ApiModelProperty(value = "The schedule action.")
  @JsonProperty("schedule_action")
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  @JsonProperty("schedule_action")
  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  /**
   * Schedule ID.
   **/
  public Schedule scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schedule ID.")
  @JsonProperty(required = true, value = "schedule_id")
   @Pattern(regexp="^\\d+$")public String getScheduleId() {
    return scheduleId;
  }

  @JsonProperty(required = true, value = "schedule_id")
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   * Schedule status.
   **/
  public Schedule scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

  
  @ApiModelProperty(value = "Schedule status.")
  @JsonProperty("schedule_status")
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  @JsonProperty("schedule_status")
  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  /**
   * The schedule type.
   **/
  public Schedule scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  
  @ApiModelProperty(value = "The schedule type.")
  @JsonProperty("schedule_type")
  public ScheduleType getScheduleType() {
    return scheduleType;
  }

  @JsonProperty("schedule_type")
  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  /**
   * Schedule start time. Unix timestamp in seconds.
   **/
  public Schedule startTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "Schedule start time. Unix timestamp in seconds.")
  @JsonProperty("start_timestamp")
  public Integer getStartTimestamp() {
    return startTimestamp;
  }

  @JsonProperty("start_timestamp")
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
