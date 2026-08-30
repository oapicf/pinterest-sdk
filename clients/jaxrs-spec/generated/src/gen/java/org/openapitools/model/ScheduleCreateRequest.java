package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleCommonDeltaValue;
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



@JsonTypeName("ScheduleCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleCreateRequest   {
  private String entityId;
  private String entityType;
  private ScheduleCommonDeltaValue deltaValue;
  private Integer endTimestamp;
  private String name;
  private ScheduleAction scheduleAction;
  private ScheduleStatus scheduleStatus;
  private ScheduleType scheduleType;
  private Integer startTimestamp;

  public ScheduleCreateRequest() {
  }

  @JsonCreator
  public ScheduleCreateRequest(
    @JsonProperty(required = true, value = "entity_id") String entityId,
    @JsonProperty(required = true, value = "entity_type") String entityType,
    @JsonProperty(required = true, value = "delta_value") ScheduleCommonDeltaValue deltaValue,
    @JsonProperty(required = true, value = "end_timestamp") Integer endTimestamp,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "schedule_action") ScheduleAction scheduleAction,
    @JsonProperty(required = true, value = "schedule_status") ScheduleStatus scheduleStatus,
    @JsonProperty(required = true, value = "schedule_type") ScheduleType scheduleType,
    @JsonProperty(required = true, value = "start_timestamp") Integer startTimestamp
  ) {
    this.entityId = entityId;
    this.entityType = entityType;
    this.deltaValue = deltaValue;
    this.endTimestamp = endTimestamp;
    this.name = name;
    this.scheduleAction = scheduleAction;
    this.scheduleStatus = scheduleStatus;
    this.scheduleType = scheduleType;
    this.startTimestamp = startTimestamp;
  }

  /**
   **/
  public ScheduleCreateRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "entity_id")
  @NotNull  @Pattern(regexp="^[C]?\\d+$")public String getEntityId() {
    return entityId;
  }

  @JsonProperty(required = true, value = "entity_id")
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Entity type
   **/
  public ScheduleCreateRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Entity type")
  @JsonProperty(required = true, value = "entity_type")
  @NotNull public String getEntityType() {
    return entityType;
  }

  @JsonProperty(required = true, value = "entity_type")
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   **/
  public ScheduleCreateRequest deltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "delta_value")
  @NotNull @Valid public ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }

  @JsonProperty(required = true, value = "delta_value")
  public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   **/
  public ScheduleCreateRequest endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schedule end time. Unix timestamp in seconds.")
  @JsonProperty(required = true, value = "end_timestamp")
  @NotNull public Integer getEndTimestamp() {
    return endTimestamp;
  }

  @JsonProperty(required = true, value = "end_timestamp")
  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  /**
   **/
  public ScheduleCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ScheduleCreateRequest scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "schedule_action")
  @NotNull public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  @JsonProperty(required = true, value = "schedule_action")
  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  /**
   **/
  public ScheduleCreateRequest scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "schedule_status")
  @NotNull public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  @JsonProperty(required = true, value = "schedule_status")
  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  /**
   **/
  public ScheduleCreateRequest scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "schedule_type")
  @NotNull public ScheduleType getScheduleType() {
    return scheduleType;
  }

  @JsonProperty(required = true, value = "schedule_type")
  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  /**
   * Schedule start time. Unix timestamp in seconds.
   **/
  public ScheduleCreateRequest startTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schedule start time. Unix timestamp in seconds.")
  @JsonProperty(required = true, value = "start_timestamp")
  @NotNull public Integer getStartTimestamp() {
    return startTimestamp;
  }

  @JsonProperty(required = true, value = "start_timestamp")
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
    ScheduleCreateRequest scheduleCreateRequest = (ScheduleCreateRequest) o;
    return Objects.equals(this.entityId, scheduleCreateRequest.entityId) &&
        Objects.equals(this.entityType, scheduleCreateRequest.entityType) &&
        Objects.equals(this.deltaValue, scheduleCreateRequest.deltaValue) &&
        Objects.equals(this.endTimestamp, scheduleCreateRequest.endTimestamp) &&
        Objects.equals(this.name, scheduleCreateRequest.name) &&
        Objects.equals(this.scheduleAction, scheduleCreateRequest.scheduleAction) &&
        Objects.equals(this.scheduleStatus, scheduleCreateRequest.scheduleStatus) &&
        Objects.equals(this.scheduleType, scheduleCreateRequest.scheduleType) &&
        Objects.equals(this.startTimestamp, scheduleCreateRequest.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, deltaValue, endTimestamp, name, scheduleAction, scheduleStatus, scheduleType, startTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCreateRequest {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
