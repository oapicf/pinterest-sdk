package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleCommonDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("entity_id")
  @NotNull
 @Pattern(regexp="^[C]?\\d+$")  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Entity type
   **/
  
  @ApiModelProperty(required = true, value = "Entity type")
  @JsonProperty("entity_type")
  @NotNull
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("delta_value")
  @NotNull
  public ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }
  public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(required = true, value = "Schedule end time. Unix timestamp in seconds.")
  @JsonProperty("end_timestamp")
  @NotNull
  public Integer getEndTimestamp() {
    return endTimestamp;
  }
  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schedule_action")
  @NotNull
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }
  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schedule_status")
  @NotNull
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }
  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schedule_type")
  @NotNull
  public ScheduleType getScheduleType() {
    return scheduleType;
  }
  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  /**
   * Schedule start time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(required = true, value = "Schedule start time. Unix timestamp in seconds.")
  @JsonProperty("start_timestamp")
  @NotNull
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

