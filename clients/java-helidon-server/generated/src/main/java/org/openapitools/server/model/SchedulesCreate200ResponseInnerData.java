package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AdAccountEntityType;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.Schedule;
import org.openapitools.server.model.ScheduleAction;
import org.openapitools.server.model.ScheduleDeltaValue;
import org.openapitools.server.model.ScheduleStatus;
import org.openapitools.server.model.ScheduleType;
import org.openapitools.server.model.SchedulesCreate200ResponseInnerDataOneOf;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Created/updated resource on success or error details on failure
 */
public class SchedulesCreate200ResponseInnerData   {

    private ScheduleDeltaValue deltaValue;
    private Integer endTimestamp;
    private String entityId;
    private AdAccountEntityType entityType;
    private String name;
    private ScheduleAction scheduleAction;
    private String scheduleId;
    private ScheduleStatus scheduleStatus;
    private ScheduleType scheduleType;
    private Integer startTimestamp;
    private String id;
    private PinterestLibError exceptions;

    /**
     * Default constructor.
     */
    public SchedulesCreate200ResponseInnerData() {
    // JSON-B / Jackson
    }

    /**
     * Create SchedulesCreate200ResponseInnerData.
     *
     * @param deltaValue deltaValue
     * @param endTimestamp Schedule end time. Unix timestamp in seconds.
     * @param entityId entity ID.
     * @param entityType Specify the entity_type to get summary information
     * @param name Schedule name.
     * @param scheduleAction The schedule action.
     * @param scheduleId Schedule ID.
     * @param scheduleStatus Schedule status.
     * @param scheduleType The schedule type.
     * @param startTimestamp Schedule start time. Unix timestamp in seconds.
     * @param id id
     * @param exceptions exceptions
     */
    public SchedulesCreate200ResponseInnerData(
        ScheduleDeltaValue deltaValue, 
        Integer endTimestamp, 
        String entityId, 
        AdAccountEntityType entityType, 
        String name, 
        ScheduleAction scheduleAction, 
        String scheduleId, 
        ScheduleStatus scheduleStatus, 
        ScheduleType scheduleType, 
        Integer startTimestamp, 
        String id, 
        PinterestLibError exceptions
    ) {
        this.deltaValue = deltaValue;
        this.endTimestamp = endTimestamp;
        this.entityId = entityId;
        this.entityType = entityType;
        this.name = name;
        this.scheduleAction = scheduleAction;
        this.scheduleId = scheduleId;
        this.scheduleStatus = scheduleStatus;
        this.scheduleType = scheduleType;
        this.startTimestamp = startTimestamp;
        this.id = id;
        this.exceptions = exceptions;
    }



    /**
     * Get deltaValue
     * @return deltaValue
     */
    public ScheduleDeltaValue getDeltaValue() {
        return deltaValue;
    }

    public void setDeltaValue(ScheduleDeltaValue deltaValue) {
        this.deltaValue = deltaValue;
    }

    /**
     * Schedule end time. Unix timestamp in seconds.
     * @return endTimestamp
     */
    public Integer getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Integer endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * entity ID.
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Specify the entity_type to get summary information
     * @return entityType
     */
    public AdAccountEntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(AdAccountEntityType entityType) {
        this.entityType = entityType;
    }

    /**
     * Schedule name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The schedule action.
     * @return scheduleAction
     */
    public ScheduleAction getScheduleAction() {
        return scheduleAction;
    }

    public void setScheduleAction(ScheduleAction scheduleAction) {
        this.scheduleAction = scheduleAction;
    }

    /**
     * Schedule ID.
     * @return scheduleId
     */
    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * Schedule status.
     * @return scheduleStatus
     */
    public ScheduleStatus getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(ScheduleStatus scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    /**
     * The schedule type.
     * @return scheduleType
     */
    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    /**
     * Schedule start time. Unix timestamp in seconds.
     * @return startTimestamp
     */
    public Integer getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Integer startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get exceptions
     * @return exceptions
     */
    public PinterestLibError getExceptions() {
        return exceptions;
    }

    public void setExceptions(PinterestLibError exceptions) {
        this.exceptions = exceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

