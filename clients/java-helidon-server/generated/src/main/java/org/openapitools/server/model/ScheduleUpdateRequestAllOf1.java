package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ScheduleUpdateRequestAllOf1   {

    private String entityId;
    private String entityType;
    private String id;

    /**
     * Default constructor.
     */
    public ScheduleUpdateRequestAllOf1() {
    // JSON-B / Jackson
    }

    /**
     * Create ScheduleUpdateRequestAllOf1.
     *
     * @param entityId entityId
     * @param entityType Entity type
     * @param id Schedule ID.
     */
    public ScheduleUpdateRequestAllOf1(
        String entityId, 
        String entityType, 
        String id
    ) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.id = id;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleUpdateRequestAllOf1 {\n");
        
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

