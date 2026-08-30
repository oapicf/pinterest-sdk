package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AudienceUpdateOperationType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
public class CustomerSegmentUpdateRequestUpdateWithRequiredBody   {

    private List<String> audienceIds = new ArrayList<>();
    private String id;
    private AudienceUpdateOperationType operationType;

    /**
     * Default constructor.
     */
    public CustomerSegmentUpdateRequestUpdateWithRequiredBody() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerSegmentUpdateRequestUpdateWithRequiredBody.
     *
     * @param audienceIds Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
     * @param id Customer segment ID.
     * @param operationType operationType
     */
    public CustomerSegmentUpdateRequestUpdateWithRequiredBody(
        List<String> audienceIds, 
        String id, 
        AudienceUpdateOperationType operationType
    ) {
        this.audienceIds = audienceIds;
        this.id = id;
        this.operationType = operationType;
    }



    /**
     * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
     * @return audienceIds
     */
    public List<String> getAudienceIds() {
        return audienceIds;
    }

    public void setAudienceIds(List<String> audienceIds) {
        this.audienceIds = audienceIds;
    }

    /**
     * Customer segment ID.
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerSegmentUpdateRequestUpdateWithRequiredBody {\n");
        
        sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

