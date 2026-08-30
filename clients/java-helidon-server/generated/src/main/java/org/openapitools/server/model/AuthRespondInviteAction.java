package org.openapitools.server.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.Permissions;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AuthRespondInviteAction   {

    private Boolean acceptInvite;
    private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

    /**
     * Default constructor.
     */
    public AuthRespondInviteAction() {
    // JSON-B / Jackson
    }

    /**
     * Create AuthRespondInviteAction.
     *
     * @param acceptInvite Whether the invite/request is accepted.
     * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
     */
    public AuthRespondInviteAction(
        Boolean acceptInvite, 
        Map<String, List<Permissions>> assetIdToPermissions
    ) {
        this.acceptInvite = acceptInvite;
        this.assetIdToPermissions = assetIdToPermissions;
    }



    /**
     * Whether the invite/request is accepted.
     * @return acceptInvite
     */
    public Boolean getAcceptInvite() {
        return acceptInvite;
    }

    public void setAcceptInvite(Boolean acceptInvite) {
        this.acceptInvite = acceptInvite;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthRespondInviteAction {\n");
        
        sb.append("    acceptInvite: ").append(toIndentedString(acceptInvite)).append("\n");
        sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
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

