package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.InviteType;
import org.openapitools.server.model.Permissions;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object declaring an asset role update to an invite.
 */
public class CreateAssetInvitesRequestItem   {

    private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();
    private String inviteId;
    private InviteType inviteType;

    /**
     * Default constructor.
     */
    public CreateAssetInvitesRequestItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateAssetInvitesRequestItem.
     *
     * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
     * @param inviteId Unique identifier of an invite.
     * @param inviteType inviteType
     */
    public CreateAssetInvitesRequestItem(
        Map<String, List<Permissions>> assetIdToPermissions, 
        String inviteId, 
        InviteType inviteType
    ) {
        this.assetIdToPermissions = assetIdToPermissions;
        this.inviteId = inviteId;
        this.inviteType = inviteType;
    }



    /**
     * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
     * @return assetIdToPermissions
     */
    public Map<String, List<Permissions>> getAssetIdToPermissions() {
        return assetIdToPermissions;
    }

    public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
        this.assetIdToPermissions = assetIdToPermissions;
    }

    /**
     * Unique identifier of an invite.
     * @return inviteId
     */
    public String getInviteId() {
        return inviteId;
    }

    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    /**
     * Get inviteType
     * @return inviteType
     */
    public InviteType getInviteType() {
        return inviteType;
    }

    public void setInviteType(InviteType inviteType) {
        this.inviteType = inviteType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetInvitesRequestItem {\n");
        
        sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
        sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
        sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
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

