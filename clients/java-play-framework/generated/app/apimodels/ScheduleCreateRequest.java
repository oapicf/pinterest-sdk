package apimodels;

import apimodels.ScheduleAction;
import apimodels.ScheduleCommonDeltaValue;
import apimodels.ScheduleStatus;
import apimodels.ScheduleType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScheduleCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ScheduleCreateRequest   {
  @JsonProperty("entity_id")
  @NotNull
@Pattern(regexp="^[C]?\\d+$")

  private String entityId;

  @JsonProperty("entity_type")
  @NotNull

  private String entityType;

  @JsonProperty("delta_value")
  @NotNull
@Valid

  private ScheduleCommonDeltaValue deltaValue;

  @JsonProperty("end_timestamp")
  @NotNull

  private Integer endTimestamp;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("schedule_action")
  @NotNull
@Valid

  private ScheduleAction scheduleAction;

  @JsonProperty("schedule_status")
  @NotNull
@Valid

  private ScheduleStatus scheduleStatus;

  @JsonProperty("schedule_type")
  @NotNull
@Valid

  private ScheduleType scheduleType;

  @JsonProperty("start_timestamp")
  @NotNull

  private Integer startTimestamp;

  public ScheduleCreateRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(entityId, scheduleCreateRequest.entityId) &&
        Objects.equals(entityType, scheduleCreateRequest.entityType) &&
        Objects.equals(deltaValue, scheduleCreateRequest.deltaValue) &&
        Objects.equals(endTimestamp, scheduleCreateRequest.endTimestamp) &&
        Objects.equals(name, scheduleCreateRequest.name) &&
        Objects.equals(scheduleAction, scheduleCreateRequest.scheduleAction) &&
        Objects.equals(scheduleStatus, scheduleCreateRequest.scheduleStatus) &&
        Objects.equals(scheduleType, scheduleCreateRequest.scheduleType) &&
        Objects.equals(startTimestamp, scheduleCreateRequest.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, deltaValue, endTimestamp, name, scheduleAction, scheduleStatus, scheduleType, startTimestamp);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

