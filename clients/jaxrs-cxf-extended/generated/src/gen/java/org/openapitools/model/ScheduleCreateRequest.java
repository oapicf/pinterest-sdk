package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleCommonDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduleCreateRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private String entityId;

 /**
  * Entity type
  */
  @ApiModelProperty(required = true, value = "Entity type")
  private String entityType;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ScheduleCommonDeltaValue deltaValue;

 /**
  * Schedule end time. Unix timestamp in seconds.
  */
  @ApiModelProperty(required = true, value = "Schedule end time. Unix timestamp in seconds.")
  private Integer endTimestamp;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ScheduleAction scheduleAction;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ScheduleStatus scheduleStatus;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ScheduleType scheduleType;

 /**
  * Schedule start time. Unix timestamp in seconds.
  */
  @ApiModelProperty(required = true, value = "Schedule start time. Unix timestamp in seconds.")
  private Integer startTimestamp;
 /**
  * Get entityId
  * @return entityId
  */
  @JsonProperty("entity_id")
  @NotNull
 @Pattern(regexp="^[C]?\\d+$")  public String getEntityId() {
    return entityId;
  }

  /**
   * Sets the <code>entityId</code> property.
   */
 public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Sets the <code>entityId</code> property.
   */
  public ScheduleCreateRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

 /**
  * Entity type
  * @return entityType
  */
  @JsonProperty("entity_type")
  @NotNull
  public String getEntityType() {
    return entityType;
  }

  /**
   * Sets the <code>entityType</code> property.
   */
 public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   * Sets the <code>entityType</code> property.
   */
  public ScheduleCreateRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

 /**
  * Get deltaValue
  * @return deltaValue
  */
  @JsonProperty("delta_value")
  @NotNull
  public ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }

  /**
   * Sets the <code>deltaValue</code> property.
   */
 public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  /**
   * Sets the <code>deltaValue</code> property.
   */
  public ScheduleCreateRequest deltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

 /**
  * Schedule end time. Unix timestamp in seconds.
  * @return endTimestamp
  */
  @JsonProperty("end_timestamp")
  @NotNull
  public Integer getEndTimestamp() {
    return endTimestamp;
  }

  /**
   * Sets the <code>endTimestamp</code> property.
   */
 public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  /**
   * Sets the <code>endTimestamp</code> property.
   */
  public ScheduleCreateRequest endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ScheduleCreateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get scheduleAction
  * @return scheduleAction
  */
  @JsonProperty("schedule_action")
  @NotNull
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  /**
   * Sets the <code>scheduleAction</code> property.
   */
 public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  /**
   * Sets the <code>scheduleAction</code> property.
   */
  public ScheduleCreateRequest scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

 /**
  * Get scheduleStatus
  * @return scheduleStatus
  */
  @JsonProperty("schedule_status")
  @NotNull
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  /**
   * Sets the <code>scheduleStatus</code> property.
   */
 public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  /**
   * Sets the <code>scheduleStatus</code> property.
   */
  public ScheduleCreateRequest scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

 /**
  * Get scheduleType
  * @return scheduleType
  */
  @JsonProperty("schedule_type")
  @NotNull
  public ScheduleType getScheduleType() {
    return scheduleType;
  }

  /**
   * Sets the <code>scheduleType</code> property.
   */
 public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  /**
   * Sets the <code>scheduleType</code> property.
   */
  public ScheduleCreateRequest scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

 /**
  * Schedule start time. Unix timestamp in seconds.
  * @return startTimestamp
  */
  @JsonProperty("start_timestamp")
  @NotNull
  public Integer getStartTimestamp() {
    return startTimestamp;
  }

  /**
   * Sets the <code>startTimestamp</code> property.
   */
 public void setStartTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  /**
   * Sets the <code>startTimestamp</code> property.
   */
  public ScheduleCreateRequest startTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

