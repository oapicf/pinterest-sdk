package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OperationType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
public class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody   {

    private String audienceId;
    private OperationType operationType;
    private List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody() {
    // JSON-B / Jackson
    }

    /**
     * Create BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.
     *
     * @param audienceId Unique identifier of an audience
     * @param operationType operationType
     * @param recipientAccountIds Ad account IDs to share with or revoke from (request) / that received the audience (response).
     */
    public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody(
        String audienceId, 
        OperationType operationType, 
        List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds
    ) {
        this.audienceId = audienceId;
        this.operationType = operationType;
        this.recipientAccountIds = recipientAccountIds;
    }



    /**
     * Unique identifier of an audience
     * @return audienceId
     */
    public String getAudienceId() {
        return audienceId;
    }

    public void setAudienceId(String audienceId) {
        this.audienceId = audienceId;
    }

    /**
     * Get operationType
     * @return operationType
     */
    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    /**
     * Ad account IDs to share with or revoke from (request) / that received the audience (response).
     * @return recipientAccountIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getRecipientAccountIds() {
        return recipientAccountIds;
    }

    public void setRecipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
        this.recipientAccountIds = recipientAccountIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody {\n");
        
        sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    recipientAccountIds: ").append(toIndentedString(recipientAccountIds)).append("\n");
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

