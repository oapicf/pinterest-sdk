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



@JsonTypeName("ScheduleUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleUpdateRequest   {
  private String entityId;
  private String entityType;
  private String id;
  private ScheduleCommonDeltaValue deltaValue;
  private Integer endTimestamp;
  private String name;
  private ScheduleAction scheduleAction;
  private ScheduleStatus scheduleStatus;
  private ScheduleType scheduleType;
  private Integer startTimestamp;

  public ScheduleUpdateRequest() {
  }

  @JsonCreator
  public ScheduleUpdateRequest(
    @JsonProperty(required = true, value = "id") String id
  ) {
    this.id = id;
  }

  /**
   **/
  public ScheduleUpdateRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entity_id")
   @Pattern(regexp="^[C]?\\d+$")public String getEntityId() {
    return entityId;
  }

  @JsonProperty("entity_id")
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Entity type
   **/
  public ScheduleUpdateRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  
  @ApiModelProperty(value = "Entity type")
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }

  @JsonProperty("entity_type")
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   * Schedule ID.
   **/
  public ScheduleUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schedule ID.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public ScheduleUpdateRequest deltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delta_value")
  @Valid public ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }

  @JsonProperty("delta_value")
  public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   **/
  public ScheduleUpdateRequest endTimestamp(Integer endTimestamp) {
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
   **/
  public ScheduleUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ScheduleUpdateRequest scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("schedule_action")
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  @JsonProperty("schedule_action")
  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  /**
   **/
  public ScheduleUpdateRequest scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("schedule_status")
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  @JsonProperty("schedule_status")
  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  /**
   **/
  public ScheduleUpdateRequest scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  public ScheduleUpdateRequest startTimestamp(Integer startTimestamp) {
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
