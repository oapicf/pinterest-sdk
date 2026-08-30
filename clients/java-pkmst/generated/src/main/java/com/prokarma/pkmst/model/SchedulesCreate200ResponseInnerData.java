package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AdAccountEntityType;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.Schedule;
import com.prokarma.pkmst.model.ScheduleAction;
import com.prokarma.pkmst.model.ScheduleDeltaValue;
import com.prokarma.pkmst.model.ScheduleStatus;
import com.prokarma.pkmst.model.ScheduleType;
import com.prokarma.pkmst.model.SchedulesCreate200ResponseInnerDataOneOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Created/updated resource on success or error details on failure
 */
@ApiModel(description = "Created/updated resource on success or error details on failure")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SchedulesCreate200ResponseInnerData   {
  @JsonProperty("delta_value")
  private ScheduleDeltaValue deltaValue;

  @JsonProperty("end_timestamp")
  private Integer endTimestamp;

  @JsonProperty("entity_id")
  private String entityId;

  @JsonProperty("entity_type")
  private AdAccountEntityType entityType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("schedule_action")
  private ScheduleAction scheduleAction;

  @JsonProperty("schedule_id")
  private String scheduleId;

  @JsonProperty("schedule_status")
  private ScheduleStatus scheduleStatus;

  @JsonProperty("schedule_type")
  private ScheduleType scheduleType;

  @JsonProperty("start_timestamp")
  private Integer startTimestamp;

  @JsonProperty("id")
  private String id;

  @JsonProperty("exceptions")
  private PinterestLibError exceptions;

  public SchedulesCreate200ResponseInnerData deltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

  /**
   * Get deltaValue
   * @return deltaValue
   */
  @ApiModelProperty(value = "")
  public ScheduleDeltaValue getDeltaValue() {
    return deltaValue;
  }

  public void setDeltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  public SchedulesCreate200ResponseInnerData endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   * @return endTimestamp
   */
  @ApiModelProperty(value = "Schedule end time. Unix timestamp in seconds.")
  public Integer getEndTimestamp() {
    return endTimestamp;
  }

  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public SchedulesCreate200ResponseInnerData entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * entity ID.
   * @return entityId
   */
  @ApiModelProperty(required = true, value = "entity ID.")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public SchedulesCreate200ResponseInnerData entityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Specify the entity_type to get summary information
   * @return entityType
   */
  @ApiModelProperty(value = "Specify the entity_type to get summary information")
  public AdAccountEntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

  public SchedulesCreate200ResponseInnerData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Schedule name.
   * @return name
   */
  @ApiModelProperty(value = "Schedule name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SchedulesCreate200ResponseInnerData scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

  /**
   * The schedule action.
   * @return scheduleAction
   */
  @ApiModelProperty(value = "The schedule action.")
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  public SchedulesCreate200ResponseInnerData scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * Schedule ID.
   * @return scheduleId
   */
  @ApiModelProperty(required = true, value = "Schedule ID.")
  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public SchedulesCreate200ResponseInnerData scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

  /**
   * Schedule status.
   * @return scheduleStatus
   */
  @ApiModelProperty(value = "Schedule status.")
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  public SchedulesCreate200ResponseInnerData scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  /**
   * The schedule type.
   * @return scheduleType
   */
  @ApiModelProperty(value = "The schedule type.")
  public ScheduleType getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  public SchedulesCreate200ResponseInnerData startTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * Schedule start time. Unix timestamp in seconds.
   * @return startTimestamp
   */
  @ApiModelProperty(value = "Schedule start time. Unix timestamp in seconds.")
  public Integer getStartTimestamp() {
    return startTimestamp;
  }

  public void setStartTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  public SchedulesCreate200ResponseInnerData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SchedulesCreate200ResponseInnerData exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Get exceptions
   * @return exceptions
   */
  @ApiModelProperty(required = true, value = "")
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulesCreate200ResponseInnerData schedulesCreate200ResponseInnerData = (SchedulesCreate200ResponseInnerData) o;
    return Objects.equals(this.deltaValue, schedulesCreate200ResponseInnerData.deltaValue) &&
        Objects.equals(this.endTimestamp, schedulesCreate200ResponseInnerData.endTimestamp) &&
        Objects.equals(this.entityId, schedulesCreate200ResponseInnerData.entityId) &&
        Objects.equals(this.entityType, schedulesCreate200ResponseInnerData.entityType) &&
        Objects.equals(this.name, schedulesCreate200ResponseInnerData.name) &&
        Objects.equals(this.scheduleAction, schedulesCreate200ResponseInnerData.scheduleAction) &&
        Objects.equals(this.scheduleId, schedulesCreate200ResponseInnerData.scheduleId) &&
        Objects.equals(this.scheduleStatus, schedulesCreate200ResponseInnerData.scheduleStatus) &&
        Objects.equals(this.scheduleType, schedulesCreate200ResponseInnerData.scheduleType) &&
        Objects.equals(this.startTimestamp, schedulesCreate200ResponseInnerData.startTimestamp) &&
        Objects.equals(this.id, schedulesCreate200ResponseInnerData.id) &&
        Objects.equals(this.exceptions, schedulesCreate200ResponseInnerData.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaValue, endTimestamp, entityId, entityType, name, scheduleAction, scheduleId, scheduleStatus, scheduleType, startTimestamp, id, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulesCreate200ResponseInnerData {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

