package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AudienceUpdateOperationType;
import org.openapitools.server.model.TargetingSpecOptimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TargetingTemplateUpdateRequestReadOrUpdate   {

    private String id;
    private AudienceUpdateOperationType operationType;
    private TargetingSpecOptimal targetingAttributes;

    /**
     * Default constructor.
     */
    public TargetingTemplateUpdateRequestReadOrUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingTemplateUpdateRequestReadOrUpdate.
     *
     * @param id Targeting template ID
     * @param operationType operationType
     * @param targetingAttributes targeting profile attributes
     */
    public TargetingTemplateUpdateRequestReadOrUpdate(
        String id, 
        AudienceUpdateOperationType operationType, 
        TargetingSpecOptimal targetingAttributes
    ) {
        this.id = id;
        this.operationType = operationType;
        this.targetingAttributes = targetingAttributes;
    }



    /**
     * Targeting template ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get operationType
     * @return operationType
     */
    public AudienceUpdateOperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(AudienceUpdateOperationType operationType) {
        this.operationType = operationType;
    }

    /**
     * targeting profile attributes
     * @return targetingAttributes
     */
    public TargetingSpecOptimal getTargetingAttributes() {
        return targetingAttributes;
    }

    public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
        this.targetingAttributes = targetingAttributes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingTemplateUpdateRequestReadOrUpdate {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
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

