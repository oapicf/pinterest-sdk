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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduleUpdateRequest  {
  
  @ApiModelProperty(value = "")

  private String entityId;

 /**
  * Entity type
  */
  @ApiModelProperty(value = "Entity type")

  private String entityType;

 /**
  * Schedule ID.
  */
  @ApiModelProperty(required = true, value = "Schedule ID.")

  private String id;

  @ApiModelProperty(value = "")

  @Valid

  private ScheduleCommonDeltaValue deltaValue;

 /**
  * Schedule end time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Schedule end time. Unix timestamp in seconds.")

  private Integer endTimestamp;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private ScheduleAction scheduleAction;

  @ApiModelProperty(value = "")

  @Valid

  private ScheduleStatus scheduleStatus;

  @ApiModelProperty(value = "")

  @Valid

  private ScheduleType scheduleType;

 /**
  * Schedule start time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Schedule start time. Unix timestamp in seconds.")

  private Integer startTimestamp;
 /**
   * Get entityId
   * @return entityId
  **/
  @JsonProperty("entity_id")
 @Pattern(regexp="^[C]?\\d+$")  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleUpdateRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

 /**
   * Entity type
   * @return entityType
  **/
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public ScheduleUpdateRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

 /**
   * Schedule ID.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScheduleUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get deltaValue
   * @return deltaValue
  **/
  @JsonProperty("delta_value")
  public ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }

  public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  public ScheduleUpdateRequest deltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

 /**
   * Schedule end time. Unix timestamp in seconds.
   * @return endTimestamp
  **/
  @JsonProperty("end_timestamp")
  public Integer getEndTimestamp() {
    return endTimestamp;
  }

  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public ScheduleUpdateRequest endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScheduleUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get scheduleAction
   * @return scheduleAction
  **/
  @JsonProperty("schedule_action")
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  public ScheduleUpdateRequest scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

 /**
   * Get scheduleStatus
   * @return scheduleStatus
  **/
  @JsonProperty("schedule_status")
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  public ScheduleUpdateRequest scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

 /**
   * Get scheduleType
   * @return scheduleType
  **/
  @JsonProperty("schedule_type")
  public ScheduleType getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  public ScheduleUpdateRequest scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

 /**
   * Schedule start time. Unix timestamp in seconds.
   * @return startTimestamp
  **/
  @JsonProperty("start_timestamp")
  public Integer getStartTimestamp() {
    return startTimestamp;
  }

  public void setStartTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  public ScheduleUpdateRequest startTimestamp(Integer startTimestamp) {
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
    ScheduleUpdateRequest scheduleUpdateRequest = (ScheduleUpdateRequest) o;
    return Objects.equals(this.entityId, scheduleUpdateRequest.entityId) &&
        Objects.equals(this.entityType, scheduleUpdateRequest.entityType) &&
        Objects.equals(this.id, scheduleUpdateRequest.id) &&
        Objects.equals(this.deltaValue, scheduleUpdateRequest.deltaValue) &&
        Objects.equals(this.endTimestamp, scheduleUpdateRequest.endTimestamp) &&
        Objects.equals(this.name, scheduleUpdateRequest.name) &&
        Objects.equals(this.scheduleAction, scheduleUpdateRequest.scheduleAction) &&
        Objects.equals(this.scheduleStatus, scheduleUpdateRequest.scheduleStatus) &&
        Objects.equals(this.scheduleType, scheduleUpdateRequest.scheduleType) &&
        Objects.equals(this.startTimestamp, scheduleUpdateRequest.startTimestamp);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

