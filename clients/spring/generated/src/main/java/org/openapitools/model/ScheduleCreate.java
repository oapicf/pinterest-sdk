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
 * Resource create operation model.
 */

@Schema(name = "ScheduleCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScheduleDeltaValue deltaValue;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer endTimestamp;

  private String entityId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AdAccountEntityType entityType;

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

  public ScheduleCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleCreate(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleCreate deltaValue(@Nullable ScheduleDeltaValue deltaValue) {
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

  public ScheduleCreate endTimestamp(@Nullable Integer endTimestamp) {
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

  public ScheduleCreate entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * entity ID.
   * @return entityId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "entity_id", description = "entity ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }

  @JsonProperty("entity_id")
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleCreate entityType(@Nullable AdAccountEntityType entityType) {
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

  public ScheduleCreate name(@Nullable String name) {
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

  public ScheduleCreate scheduleAction(@Nullable ScheduleAction scheduleAction) {
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

  public ScheduleCreate scheduleStatus(@Nullable ScheduleStatus scheduleStatus) {
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

  public ScheduleCreate scheduleType(@Nullable ScheduleType scheduleType) {
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

  public ScheduleCreate startTimestamp(@Nullable Integer startTimestamp) {
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
    ScheduleCreate scheduleCreate = (ScheduleCreate) o;
    return Objects.equals(this.deltaValue, scheduleCreate.deltaValue) &&
        Objects.equals(this.endTimestamp, scheduleCreate.endTimestamp) &&
        Objects.equals(this.entityId, scheduleCreate.entityId) &&
        Objects.equals(this.entityType, scheduleCreate.entityType) &&
        Objects.equals(this.name, scheduleCreate.name) &&
        Objects.equals(this.scheduleAction, scheduleCreate.scheduleAction) &&
        Objects.equals(this.scheduleStatus, scheduleCreate.scheduleStatus) &&
        Objects.equals(this.scheduleType, scheduleCreate.scheduleType) &&
        Objects.equals(this.startTimestamp, scheduleCreate.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaValue, endTimestamp, entityId, entityType, name, scheduleAction, scheduleStatus, scheduleType, startTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCreate {\n");
    sb.append("    deltaValue: ").append(toIndentedString(deltaValue)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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

