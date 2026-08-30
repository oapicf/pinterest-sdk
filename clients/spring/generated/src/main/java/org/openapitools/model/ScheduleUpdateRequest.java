package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleCommonDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ScheduleUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleUpdateRequest {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String entityId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String entityType;

  private String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleCommonDeltaValue deltaValue;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer endTimestamp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleAction scheduleAction;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleStatus scheduleStatus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleType scheduleType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer startTimestamp;

  public ScheduleUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleUpdateRequest(String id) {
    this.id = id;
  }

  public ScheduleUpdateRequest entityId(@Nullable String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "entity_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_id")
  public @Nullable String getEntityId() {
    return entityId;
  }

  @JsonProperty("entity_id")
  public void setEntityId(@Nullable String entityId) {
    this.entityId = entityId;
  }

  public ScheduleUpdateRequest entityType(@Nullable String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Entity type
   * @return entityType
   */
  
  @Schema(name = "entity_type", description = "Entity type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_type")
  public @Nullable String getEntityType() {
    return entityType;
  }

  @JsonProperty("entity_type")
  public void setEntityType(@Nullable String entityType) {
    this.entityType = entityType;
  }

  public ScheduleUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Schedule ID.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Schedule ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public ScheduleUpdateRequest deltaValue(@Nullable ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

  /**
   * Get deltaValue
   * @return deltaValue
   */
  @Valid 
  @Schema(name = "delta_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delta_value")
  public @Nullable ScheduleCommonDeltaValue getDeltaValue() {
    return deltaValue;
  }

  @JsonProperty("delta_value")
  public void setDeltaValue(@Nullable ScheduleCommonDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  public ScheduleUpdateRequest endTimestamp(@Nullable Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  /**
   * Schedule end time. Unix timestamp in seconds.
   * @return endTimestamp
   */
  
  @Schema(name = "end_timestamp", description = "Schedule end time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_timestamp")
  public @Nullable Integer getEndTimestamp() {
    return endTimestamp;
  }

  @JsonProperty("end_timestamp")
  public void setEndTimestamp(@Nullable Integer endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public ScheduleUpdateRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ScheduleUpdateRequest scheduleAction(@Nullable ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

  /**
   * Get scheduleAction
   * @return scheduleAction
   */
  @Valid 
  @Schema(name = "schedule_action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_action")
  public @Nullable ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  @JsonProperty("schedule_action")
  public void setScheduleAction(@Nullable ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  public ScheduleUpdateRequest scheduleStatus(@Nullable ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

  /**
   * Get scheduleStatus
   * @return scheduleStatus
   */
  @Valid 
  @Schema(name = "schedule_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_status")
  public @Nullable ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  @JsonProperty("schedule_status")
  public void setScheduleStatus(@Nullable ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  public ScheduleUpdateRequest scheduleType(@Nullable ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  /**
   * Get scheduleType
   * @return scheduleType
   */
  @Valid 
  @Schema(name = "schedule_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_type")
  public @Nullable ScheduleType getScheduleType() {
    return scheduleType;
  }

  @JsonProperty("schedule_type")
  public void setScheduleType(@Nullable ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  public ScheduleUpdateRequest startTimestamp(@Nullable Integer startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * Schedule start time. Unix timestamp in seconds.
   * @return startTimestamp
   */
  
  @Schema(name = "start_timestamp", description = "Schedule start time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_timestamp")
  public @Nullable Integer getStartTimestamp() {
    return startTimestamp;
  }

  @JsonProperty("start_timestamp")
  public void setStartTimestamp(@Nullable Integer startTimestamp) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

