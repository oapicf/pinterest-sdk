package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleCommonDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;

/**
 * ScheduleUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleUpdateRequest   {
  @JsonProperty("entity_id")
  private String entityId;

  @JsonProperty("entity_type")
  private String entityType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("delta_value")
  private ScheduleCommonDeltaValue deltaValue;

  @JsonProperty("end_timestamp")
  private Integer endTimestamp;

  @JsonProperty("name")
  private String name;

  @JsonProperty("schedule_action")
  private ScheduleAction scheduleAction;

  @JsonProperty("schedule_status")
  private ScheduleStatus scheduleStatus;

  @JsonProperty("schedule_type")
  private ScheduleType scheduleType;

  @JsonProperty("start_timestamp")
  private Integer startTimestamp;

  public ScheduleUpdateRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(value = "")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleUpdateRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Entity type
   * @return entityType
  **/
  @ApiModelProperty(value = "Entity type")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public ScheduleUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Schedule ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Schedule ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScheduleUpdateRequest deltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

   /**
   * Get deltaValue
   * @return deltaValue
  **/
  @ApiModelProperty(value = "")
  public ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }

  public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  public ScheduleUpdateRequest endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

   /**
   * Schedule end time. Unix timestamp in seconds.
   * @return endTimestamp
  **/
  @ApiModelProperty(value = "Schedule end time. Unix timestamp in seconds.")
  public Integer getEndTimestamp() {
    return endTimestamp;
  }

  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public ScheduleUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScheduleUpdateRequest scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

   /**
   * Get scheduleAction
   * @return scheduleAction
  **/
  @ApiModelProperty(value = "")
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  public ScheduleUpdateRequest scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

   /**
   * Get scheduleStatus
   * @return scheduleStatus
  **/
  @ApiModelProperty(value = "")
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  public ScheduleUpdateRequest scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @ApiModelProperty(value = "")
  public ScheduleType getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  public ScheduleUpdateRequest startTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

   /**
   * Schedule start time. Unix timestamp in seconds.
   * @return startTimestamp
  **/
  @ApiModelProperty(value = "Schedule start time. Unix timestamp in seconds.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

