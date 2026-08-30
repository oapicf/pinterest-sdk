package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.EntityLabelStatus;
import org.openapitools.server.model.LabelParentType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EntityLabel   {

    private String entityId;
    private LabelParentType entityType;
    private String labelId;
    private EntityLabelStatus status;

    /**
     * Default constructor.
     */
    public EntityLabel() {
    // JSON-B / Jackson
    }

    /**
     * Create EntityLabel.
     *
     * @param entityId Entity ID to apply label to.
     * @param entityType entityType
     * @param labelId Label ID.
     * @param status status
     */
    public EntityLabel(
        String entityId, 
        LabelParentType entityType, 
        String labelId, 
        EntityLabelStatus status
    ) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.labelId = labelId;
        this.status = status;
    }



    /**
     * Entity ID to apply label to.
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Get entityType
     * @return entityType
     */
    public LabelParentType getEntityType() {
        return entityType;
    }

    public void setEntityType(LabelParentType entityType) {
        this.entityType = entityType;
    }

    /**
     * Label ID.
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    /**
     * Get status
     * @return status
     */
    public EntityLabelStatus getStatus() {
        return status;
    }

    public void setStatus(EntityLabelStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityLabel {\n");
        
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

