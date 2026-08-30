package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ScheduleAction;
import org.openapitools.server.model.ScheduleCommonDeltaValue;
import org.openapitools.server.model.ScheduleStatus;
import org.openapitools.server.model.ScheduleType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ScheduleUpdateRequest   {

    private String entityId;
    private String entityType;
    private String id;
    private ScheduleCommonDeltaValue deltaValue;
    private Integer endTimestamp;
    private String name;
    private ScheduleAction scheduleAction;
    private ScheduleStatus scheduleStatus;
    private ScheduleType scheduleType;
    private Integer startTimestamp;

    /**
     * Default constructor.
     */
    public ScheduleUpdateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ScheduleUpdateRequest.
     *
     * @param entityId entityId
     * @param entityType Entity type
     * @param id Schedule ID.
     * @param deltaValue deltaValue
     * @param endTimestamp Schedule end time. Unix timestamp in seconds.
     * @param name name
     * @param scheduleAction scheduleAction
     * @param scheduleStatus scheduleStatus
     * @param scheduleType scheduleType
     * @param startTimestamp Schedule start time. Unix timestamp in seconds.
     */
    public ScheduleUpdateRequest(
        String entityId, 
        String entityType, 
        String id, 
        ScheduleCommonDeltaValue deltaValue, 
        Integer endTimestamp, 
        String name, 
        ScheduleAction scheduleAction, 
        ScheduleStatus scheduleStatus, 
        ScheduleType scheduleType, 
        Integer startTimestamp
    ) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.id = id;
        this.deltaValue = deltaValue;
        this.endTimestamp = endTimestamp;
        this.name = name;
        this.scheduleAction = scheduleAction;
        this.scheduleStatus = scheduleStatus;
        this.scheduleType = scheduleType;
        this.startTimestamp = startTimestamp;
    }



    /**
     * Get entityId
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Entity type
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * Schedule ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get deltaValue
     * @return deltaValue
     */
    public ScheduleCommonDeltaValue getDeltaValue() {
        return deltaValue;
    }

    public void setDeltaValue(ScheduleCommonDeltaValue deltaValue) {
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
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get scheduleAction
     * @return scheduleAction
     */
    public ScheduleAction getScheduleAction() {
        return scheduleAction;
    }

    public void setScheduleAction(ScheduleAction scheduleAction) {
        this.scheduleAction = scheduleAction;
    }

    /**
     * Get scheduleStatus
     * @return scheduleStatus
     */
    public ScheduleStatus getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(ScheduleStatus scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    /**
     * Get scheduleType
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
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

