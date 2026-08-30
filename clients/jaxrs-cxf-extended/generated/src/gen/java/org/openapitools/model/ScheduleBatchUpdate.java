package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AdAccountEntityType;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduleBatchUpdate  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ScheduleDeltaValue deltaValue;

 /**
  * Schedule end time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Schedule end time. Unix timestamp in seconds.")
  private Integer endTimestamp;

 /**
  * entity ID.
  */
  @ApiModelProperty(value = "entity ID.")
  private String entityId;

 /**
  * Specify the entity_type to get summary information
  */
  @ApiModelProperty(value = "Specify the entity_type to get summary information")
  @Valid
  private AdAccountEntityType entityType;

  @ApiModelProperty(required = true, value = "")
  private String id;

 /**
  * Schedule name.
  */
  @ApiModelProperty(value = "Schedule name.")
  private String name;

 /**
  * The schedule action.
  */
  @ApiModelProperty(value = "The schedule action.")
  @Valid
  private ScheduleAction scheduleAction;

 /**
  * Schedule ID.
  */
  @ApiModelProperty(required = true, value = "Schedule ID.")
  private String scheduleId;

 /**
  * Schedule status.
  */
  @ApiModelProperty(value = "Schedule status.")
  @Valid
  private ScheduleStatus scheduleStatus;

 /**
  * The schedule type.
  */
  @ApiModelProperty(value = "The schedule type.")
  @Valid
  private ScheduleType scheduleType;

 /**
  * Schedule start time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Schedule start time. Unix timestamp in seconds.")
  private Integer startTimestamp;
 /**
  * Get deltaValue
  * @return deltaValue
  */
  @JsonProperty("delta_value")
  public ScheduleDeltaValue getDeltaValue() {
    return deltaValue;
  }

  /**
   * Sets the <code>deltaValue</code> property.
   */
 public void setDeltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  /**
   * Sets the <code>deltaValue</code> property.
   */
  public ScheduleBatchUpdate deltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

 /**
  * Schedule end time. Unix timestamp in seconds.
  * @return endTimestamp
  */
  @JsonProperty("end_timestamp")
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
  public ScheduleBatchUpdate endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

 /**
  * entity ID.
  * @return entityId
  */
  @JsonProperty("entity_id")
 @Pattern(regexp="^\\d+$")  public String getEntityId() {
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
  public ScheduleBatchUpdate entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

 /**
  * Specify the entity_type to get summary information
  * @return entityType
  */
  @JsonProperty("entity_type")
  public AdAccountEntityType getEntityType() {
    return entityType;
  }

  /**
   * Sets the <code>entityType</code> property.
   */
 public void setEntityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

  /**
   * Sets the <code>entityType</code> property.
   */
  public ScheduleBatchUpdate entityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public ScheduleBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Schedule name.
  * @return name
  */
  @JsonProperty("name")
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
  public ScheduleBatchUpdate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The schedule action.
  * @return scheduleAction
  */
  @JsonProperty("schedule_action")
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
  public ScheduleBatchUpdate scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

 /**
  * Schedule ID.
  * @return scheduleId
  */
  @JsonProperty("schedule_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getScheduleId() {
    return scheduleId;
  }

  /**
   * Sets the <code>scheduleId</code> property.
   */
 public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   * Sets the <code>scheduleId</code> property.
   */
  public ScheduleBatchUpdate scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

 /**
  * Schedule status.
  * @return scheduleStatus
  */
  @JsonProperty("schedule_status")
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
  public ScheduleBatchUpdate scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

 /**
  * The schedule type.
  * @return scheduleType
  */
  @JsonProperty("schedule_type")
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
  public ScheduleBatchUpdate scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

 /**
  * Schedule start time. Unix timestamp in seconds.
  * @return startTimestamp
  */
  @JsonProperty("start_timestamp")
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
  public ScheduleBatchUpdate startTimestamp(Integer startTimestamp) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

