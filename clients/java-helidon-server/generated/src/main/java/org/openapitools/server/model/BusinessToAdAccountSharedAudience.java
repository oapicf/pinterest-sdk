package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Role;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BusinessToAdAccountSharedAudience   {

    private String audienceId;
    private List<Role> permissions = new ArrayList<>();
    private List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BusinessToAdAccountSharedAudience() {
    // JSON-B / Jackson
    }

    /**
     * Create BusinessToAdAccountSharedAudience.
     *
     * @param audienceId Unique identifier of an audience
     * @param permissions Permissions granted to the recipients.
     * @param recipientAccountIds Ad account IDs to share with or revoke from (request) / that received the audience (response).
     */
    public BusinessToAdAccountSharedAudience(
        String audienceId, 
        List<Role> permissions, 
        List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds
    ) {
        this.audienceId = audienceId;
        this.permissions = permissions;
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
     * Permissions granted to the recipients.
     * @return permissions
     */
    public List<Role> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Role> permissions) {
        this.permissions = permissions;
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
        sb.append("class BusinessToAdAccountSharedAudience {\n");
        
        sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

