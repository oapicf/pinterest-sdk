/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdAccountEntityType;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.Schedule;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.openapitools.model.SchedulesCreate200ResponseInnerDataOneOf;



/**
 * Created/updated resource on success or error details on failure
 */

@ApiModel(description = "Created/updated resource on success or error details on failure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SchedulesCreate200ResponseInnerData   {
  
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
  private String id;
  private PinterestLibError exceptions;

  /**
   */
  public SchedulesCreate200ResponseInnerData deltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

  
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
   */
  public SchedulesCreate200ResponseInnerData endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  
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
   */
  public SchedulesCreate200ResponseInnerData entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "entity ID.")
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Specify the entity_type to get summary information
   */
  public SchedulesCreate200ResponseInnerData entityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  
  @ApiModelProperty(value = "Specify the entity_type to get summary information")
  @JsonProperty("entity_type")
  public AdAccountEntityType getEntityType() {
    return entityType;
  }
  public void setEntityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

  /**
   * Schedule name.
   */
  public SchedulesCreate200ResponseInnerData name(String name) {
    this.name = name;
    return this;
  }

  
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
   */
  public SchedulesCreate200ResponseInnerData scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

  
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
   */
  public SchedulesCreate200ResponseInnerData scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schedule ID.")
  @JsonProperty("schedule_id")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   * Schedule status.
   */
  public SchedulesCreate200ResponseInnerData scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

  
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
   */
  public SchedulesCreate200ResponseInnerData scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  
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
   */
  public SchedulesCreate200ResponseInnerData startTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "Schedule start time. Unix timestamp in seconds.")
  @JsonProperty("start_timestamp")
  public Integer getStartTimestamp() {
    return startTimestamp;
  }
  public void setStartTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  /**
   */
  public SchedulesCreate200ResponseInnerData id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public SchedulesCreate200ResponseInnerData exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("exceptions")
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
    return Objects.equals(deltaValue, schedulesCreate200ResponseInnerData.deltaValue) &&
        Objects.equals(endTimestamp, schedulesCreate200ResponseInnerData.endTimestamp) &&
        Objects.equals(entityId, schedulesCreate200ResponseInnerData.entityId) &&
        Objects.equals(entityType, schedulesCreate200ResponseInnerData.entityType) &&
        Objects.equals(name, schedulesCreate200ResponseInnerData.name) &&
        Objects.equals(scheduleAction, schedulesCreate200ResponseInnerData.scheduleAction) &&
        Objects.equals(scheduleId, schedulesCreate200ResponseInnerData.scheduleId) &&
        Objects.equals(scheduleStatus, schedulesCreate200ResponseInnerData.scheduleStatus) &&
        Objects.equals(scheduleType, schedulesCreate200ResponseInnerData.scheduleType) &&
        Objects.equals(startTimestamp, schedulesCreate200ResponseInnerData.startTimestamp) &&
        Objects.equals(id, schedulesCreate200ResponseInnerData.id) &&
        Objects.equals(exceptions, schedulesCreate200ResponseInnerData.exceptions);
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

