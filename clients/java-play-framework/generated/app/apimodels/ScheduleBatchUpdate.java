package apimodels;

import apimodels.AdAccountEntityType;
import apimodels.ScheduleAction;
import apimodels.ScheduleDeltaValue;
import apimodels.ScheduleStatus;
import apimodels.ScheduleType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScheduleBatchUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ScheduleBatchUpdate   {
  @JsonProperty("delta_value")
  @Valid

  private ScheduleDeltaValue deltaValue;

  @JsonProperty("end_timestamp")
  
  private Integer endTimestamp;

  @JsonProperty("entity_id")
  @Pattern(regexp="^\\d+$")

  private String entityId;

  @JsonProperty("entity_type")
  @Valid

  private AdAccountEntityType entityType;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("schedule_action")
  @Valid

  private ScheduleAction scheduleAction;

  @JsonProperty("schedule_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String scheduleId;

  @JsonProperty("schedule_status")
  @Valid

  private ScheduleStatus scheduleStatus;

  @JsonProperty("schedule_type")
  @Valid

  private ScheduleType scheduleType;

  @JsonProperty("start_timestamp")
  
  private Integer startTimestamp;

  public ScheduleBatchUpdate deltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
    return this;
  }

   /**
   * Get deltaValue
   * @return deltaValue
  **/
  public ScheduleDeltaValue getDeltaValue() {
    return deltaValue;
  }

  public void setDeltaValue(ScheduleDeltaValue deltaValue) {
    this.deltaValue = deltaValue;
  }

  public ScheduleBatchUpdate endTimestamp(Integer endTimestamp) {
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

  public ScheduleBatchUpdate entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * entity ID.
   * @return entityId
  **/
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleBatchUpdate entityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Specify the entity_type to get summary information
   * @return entityType
  **/
  public AdAccountEntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(AdAccountEntityType entityType) {
    this.entityType = entityType;
  }

  public ScheduleBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScheduleBatchUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Schedule name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScheduleBatchUpdate scheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
    return this;
  }

   /**
   * The schedule action.
   * @return scheduleAction
  **/
  public ScheduleAction getScheduleAction() {
    return scheduleAction;
  }

  public void setScheduleAction(ScheduleAction scheduleAction) {
    this.scheduleAction = scheduleAction;
  }

  public ScheduleBatchUpdate scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * Schedule ID.
   * @return scheduleId
  **/
  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public ScheduleBatchUpdate scheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

   /**
   * Schedule status.
   * @return scheduleStatus
  **/
  public ScheduleStatus getScheduleStatus() {
    return scheduleStatus;
  }

  public void setScheduleStatus(ScheduleStatus scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  public ScheduleBatchUpdate scheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * The schedule type.
   * @return scheduleType
  **/
  public ScheduleType getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }

  public ScheduleBatchUpdate startTimestamp(Integer startTimestamp) {
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
    ScheduleBatchUpdate scheduleBatchUpdate = (ScheduleBatchUpdate) o;
    return Objects.equals(deltaValue, scheduleBatchUpdate.deltaValue) &&
        Objects.equals(endTimestamp, scheduleBatchUpdate.endTimestamp) &&
        Objects.equals(entityId, scheduleBatchUpdate.entityId) &&
        Objects.equals(entityType, scheduleBatchUpdate.entityType) &&
        Objects.equals(id, scheduleBatchUpdate.id) &&
        Objects.equals(name, scheduleBatchUpdate.name) &&
        Objects.equals(scheduleAction, scheduleBatchUpdate.scheduleAction) &&
        Objects.equals(scheduleId, scheduleBatchUpdate.scheduleId) &&
        Objects.equals(scheduleStatus, scheduleBatchUpdate.scheduleStatus) &&
        Objects.equals(scheduleType, scheduleBatchUpdate.scheduleType) &&
        Objects.equals(startTimestamp, scheduleBatchUpdate.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaValue, endTimestamp, entityId, entityType, id, name, scheduleAction, scheduleId, scheduleStatus, scheduleType, startTimestamp);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

