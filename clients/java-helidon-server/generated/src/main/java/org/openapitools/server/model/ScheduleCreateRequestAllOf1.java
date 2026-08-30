package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ScheduleCreateRequestAllOf1   {

    private String entityId;
    private String entityType;

    /**
     * Default constructor.
     */
    public ScheduleCreateRequestAllOf1() {
    // JSON-B / Jackson
    }

    /**
     * Create ScheduleCreateRequestAllOf1.
     *
     * @param entityId entityId
     * @param entityType Entity type
     */
    public ScheduleCreateRequestAllOf1(
        String entityId, 
        String entityType
    ) {
        this.entityId = entityId;
        this.entityType = entityType;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleCreateRequestAllOf1 {\n");
        
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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

