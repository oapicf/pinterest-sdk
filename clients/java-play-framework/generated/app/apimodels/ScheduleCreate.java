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
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ScheduleCreate   {
  @JsonProperty("delta_value")
  @Valid

  private ScheduleDeltaValue deltaValue;

  @JsonProperty("end_timestamp")
  
  private Integer endTimestamp;

  @JsonProperty("entity_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String entityId;

  @JsonProperty("entity_type")
  @Valid

  private AdAccountEntityType entityType;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("schedule_action")
  @Valid

  private ScheduleAction scheduleAction;

  @JsonProperty("schedule_status")
  @Valid

  private ScheduleStatus scheduleStatus;

  @JsonProperty("schedule_type")
  @Valid

  private ScheduleType scheduleType;

  @JsonProperty("start_timestamp")
  
  private Integer startTimestamp;

  public ScheduleCreate deltaValue(ScheduleDeltaValue deltaValue) {
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

  public ScheduleCreate endTimestamp(Integer endTimestamp) {
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

  public ScheduleCreate entityId(String entityId) {
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

  public ScheduleCreate entityType(AdAccountEntityType entityType) {
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

  public ScheduleCreate name(String name) {
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

  public ScheduleCreate scheduleAction(ScheduleAction scheduleAction) {
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

  public ScheduleCreate scheduleStatus(ScheduleStatus scheduleStatus) {
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

  public ScheduleCreate scheduleType(ScheduleType scheduleType) {
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

  public ScheduleCreate startTimestamp(Integer startTimestamp) {
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
    ScheduleCreate scheduleCreate = (ScheduleCreate) o;
    return Objects.equals(deltaValue, scheduleCreate.deltaValue) &&
        Objects.equals(endTimestamp, scheduleCreate.endTimestamp) &&
        Objects.equals(entityId, scheduleCreate.entityId) &&
        Objects.equals(entityType, scheduleCreate.entityType) &&
        Objects.equals(name, scheduleCreate.name) &&
        Objects.equals(scheduleAction, scheduleCreate.scheduleAction) &&
        Objects.equals(scheduleStatus, scheduleCreate.scheduleStatus) &&
        Objects.equals(scheduleType, scheduleCreate.scheduleType) &&
        Objects.equals(startTimestamp, scheduleCreate.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaValue, endTimestamp, entityId, entityType, name, scheduleAction, scheduleStatus, scheduleType, startTimestamp);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

