package org.openapitools.server.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.Permissions;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateAssetAccessRequestItem   {

    private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();
    private String partnerId;

    /**
     * Default constructor.
     */
    public CreateAssetAccessRequestItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateAssetAccessRequestItem.
     *
     * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
     * @param partnerId Unique identifier of a business partner to request asset access to.
     */
    public CreateAssetAccessRequestItem(
        Map<String, List<Permissions>> assetIdToPermissions, 
        String partnerId
    ) {
        this.assetIdToPermissions = assetIdToPermissions;
        this.partnerId = partnerId;
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
     * Unique identifier of a business partner to request asset access to.
     * @return partnerId
     */
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetAccessRequestItem {\n");
        
        sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
        sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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

