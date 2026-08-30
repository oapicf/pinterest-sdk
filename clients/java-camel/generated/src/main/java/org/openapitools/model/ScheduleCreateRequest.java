package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleCommonDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ScheduleCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleCreateRequest {

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
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleCreateRequest(String entityId, String entityType, ScheduleCommonDeltaValue deltaValue, Integer endTimestamp, String name, ScheduleAction scheduleAction, ScheduleStatus scheduleStatus, ScheduleType scheduleType, Integer startTimestamp) {
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

  public ScheduleCreateRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @NotNull @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "entity_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleCreateRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Entity type
   * @return entityType
   */
  @NotNull 
  @Schema(name = "entity_type", description = "Entity type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public ScheduleCreateRequest deltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

  /**
   * Get deltaValue
   * @return deltaValue
   */
  @NotNull @Valid 
  @Schema(name = "delta_value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("delta_value")
  public ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }

  public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  public ScheduleCreateRequest endTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   * @return endTimestamp
   */
  @NotNull 
  @Schema(name = "end_timestamp", description = "Schedule end time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_timestamp")
  public Integer getEndTimestamp() {
    return endTimestamp;
  }

  public void setEndTimestamp(Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public ScheduleCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScheduleCreateRequest scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

  /**
   * Get scheduleAction
   * @return scheduleAction
   */
  @NotNull @Valid 
  @Schema(name = "schedule_action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule_action")
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  public ScheduleCreateRequest scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

  /**
   * Get scheduleStatus
   * @return scheduleStatus
   */
  @NotNull @Valid 
  @Schema(name = "schedule_status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule_status")
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  public ScheduleCreateRequest scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  /**
   * Get scheduleType
   * @return scheduleType
   */
  @NotNull @Valid 
  @Schema(name = "schedule_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule_type")
  public ScheduleType getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  public ScheduleCreateRequest startTimestamp(Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * Schedule start time. Unix timestamp in seconds.
   * @return startTimestamp
   */
  @NotNull 
  @Schema(name = "start_timestamp", description = "Schedule start time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_timestamp")
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

