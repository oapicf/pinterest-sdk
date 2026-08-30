package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AdAccountEntityType;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleDeltaValue;
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
 * ScheduleBatchUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleBatchUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleDeltaValue deltaValue;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer endTimestamp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String entityId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AdAccountEntityType entityType;

  private String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleAction scheduleAction;

  private String scheduleId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleStatus scheduleStatus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleType scheduleType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer startTimestamp;

  public ScheduleBatchUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleBatchUpdate(String id, String scheduleId) {
    this.id = id;
    this.scheduleId = scheduleId;
  }

  public ScheduleBatchUpdate deltaValue(@Nullable ScheduleDeltaValue deltaValue) {
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
  public @Nullable ScheduleDeltaValue getDeltaValue() {
    return deltaValue;
  }

  @JsonProperty("delta_value")
  public void setDeltaValue(@Nullable ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  public ScheduleBatchUpdate endTimestamp(@Nullable Integer endTimestamp) {
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

  public ScheduleBatchUpdate entityId(@Nullable String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * entity ID.
   * @return entityId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "entity_id", description = "entity ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_id")
  public @Nullable String getEntityId() {
    return entityId;
  }

  @JsonProperty("entity_id")
  public void setEntityId(@Nullable String entityId) {
    this.entityId = entityId;
  }

  public ScheduleBatchUpdate entityType(@Nullable AdAccountEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Specify the entity_type to get summary information
   * @return entityType
   */
  @Valid 
  @Schema(name = "entity_type", description = "Specify the entity_type to get summary information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_type")
  public @Nullable AdAccountEntityType getEntityType() {
    return entityType;
  }

  @JsonProperty("entity_type")
  public void setEntityType(@Nullable AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

  public ScheduleBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public ScheduleBatchUpdate name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Schedule name.
   * @return name
   */
  
  @Schema(name = "name", description = "Schedule name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ScheduleBatchUpdate scheduleAction(@Nullable ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

  /**
   * The schedule action.
   * @return scheduleAction
   */
  @Valid 
  @Schema(name = "schedule_action", description = "The schedule action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_action")
  public @Nullable ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  @JsonProperty("schedule_action")
  public void setScheduleAction(@Nullable ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  public ScheduleBatchUpdate scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * Schedule ID.
   * @return scheduleId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "schedule_id", description = "Schedule ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule_id")
  public String getScheduleId() {
    return scheduleId;
  }

  @JsonProperty("schedule_id")
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public ScheduleBatchUpdate scheduleStatus(@Nullable ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

  /**
   * Schedule status.
   * @return scheduleStatus
   */
  @Valid 
  @Schema(name = "schedule_status", description = "Schedule status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_status")
  public @Nullable ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  @JsonProperty("schedule_status")
  public void setScheduleStatus(@Nullable ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  public ScheduleBatchUpdate scheduleType(@Nullable ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  /**
   * The schedule type.
   * @return scheduleType
   */
  @Valid 
  @Schema(name = "schedule_type", description = "The schedule type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_type")
  public @Nullable ScheduleType getScheduleType() {
    return scheduleType;
  }

  @JsonProperty("schedule_type")
  public void setScheduleType(@Nullable ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  public ScheduleBatchUpdate startTimestamp(@Nullable Integer startTimestamp) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

