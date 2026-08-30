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
 * ScheduleUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ScheduleUpdateRequest   {
  @JsonProperty("entity_id")
  @Pattern(regexp="^[C]?\\d+$")

  private String entityId;

  @JsonProperty("entity_type")
  
  private String entityType;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("delta_value")
  @Valid

  private ScheduleCommonDeltaValue deltaValue;

  @JsonProperty("end_timestamp")
  
  private Integer endTimestamp;

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

  public ScheduleUpdateRequest entityId(String entityId) {
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

  public ScheduleUpdateRequest entityType(String entityType) {
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

  public ScheduleUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Schedule ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScheduleUpdateRequest deltaValue(ScheduleCommonDeltaValue deltaValue) {
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

  public ScheduleUpdateRequest endTimestamp(Integer endTimestamp) {
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

  public ScheduleUpdateRequest name(String name) {
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

  public ScheduleUpdateRequest scheduleAction(ScheduleAction scheduleAction) {
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

  public ScheduleUpdateRequest scheduleStatus(ScheduleStatus scheduleStatus) {
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

  public ScheduleUpdateRequest scheduleType(ScheduleType scheduleType) {
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

  public ScheduleUpdateRequest startTimestamp(Integer startTimestamp) {
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
    ScheduleUpdateRequest scheduleUpdateRequest = (ScheduleUpdateRequest) o;
    return Objects.equals(entityId, scheduleUpdateRequest.entityId) &&
        Objects.equals(entityType, scheduleUpdateRequest.entityType) &&
        Objects.equals(id, scheduleUpdateRequest.id) &&
        Objects.equals(deltaValue, scheduleUpdateRequest.deltaValue) &&
        Objects.equals(endTimestamp, scheduleUpdateRequest.endTimestamp) &&
        Objects.equals(name, scheduleUpdateRequest.name) &&
        Objects.equals(scheduleAction, scheduleUpdateRequest.scheduleAction) &&
        Objects.equals(scheduleStatus, scheduleUpdateRequest.scheduleStatus) &&
        Objects.equals(scheduleType, scheduleUpdateRequest.scheduleType) &&
        Objects.equals(startTimestamp, scheduleUpdateRequest.startTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, id, deltaValue, endTimestamp, name, scheduleAction, scheduleStatus, scheduleType, startTimestamp);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

