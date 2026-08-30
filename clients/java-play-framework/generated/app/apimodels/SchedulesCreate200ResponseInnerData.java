package apimodels;

import apimodels.AdAccountEntityType;
import apimodels.PinterestLibError;
import apimodels.Schedule;
import apimodels.ScheduleAction;
import apimodels.ScheduleDeltaValue;
import apimodels.ScheduleStatus;
import apimodels.ScheduleType;
import apimodels.SchedulesCreate200ResponseInnerDataOneOf;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Created/updated resource on success or error details on failure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SchedulesCreate200ResponseInnerData   {
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

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String id;

  @JsonProperty("exceptions")
  @NotNull
@Valid

  private PinterestLibError exceptions;

  public SchedulesCreate200ResponseInnerData deltaValue(ScheduleDeltaValue deltaValue) {
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

  public SchedulesCreate200ResponseInnerData endTimestamp(Integer endTimestamp) {
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

  public SchedulesCreate200ResponseInnerData entityId(String entityId) {
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

  public SchedulesCreate200ResponseInnerData entityType(AdAccountEntityType entityType) {
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

  public SchedulesCreate200ResponseInnerData name(String name) {
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

  public SchedulesCreate200ResponseInnerData scheduleAction(ScheduleAction scheduleAction) {
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

  public SchedulesCreate200ResponseInnerData scheduleId(String scheduleId) {
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

  public SchedulesCreate200ResponseInnerData scheduleStatus(ScheduleStatus scheduleStatus) {
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

  public SchedulesCreate200ResponseInnerData scheduleType(ScheduleType scheduleType) {
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

  public SchedulesCreate200ResponseInnerData startTimestamp(Integer startTimestamp) {
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

  public SchedulesCreate200ResponseInnerData id(String id) {
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

  public SchedulesCreate200ResponseInnerData exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

   /**
   * Get exceptions
   * @return exceptions
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

