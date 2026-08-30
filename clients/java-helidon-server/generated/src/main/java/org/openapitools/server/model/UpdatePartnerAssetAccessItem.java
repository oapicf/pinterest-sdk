package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Permissions;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdatePartnerAssetAccessItem   {

    private String assetId;
    private String partnerId;
    private List<Permissions> permissions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdatePartnerAssetAccessItem() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdatePartnerAssetAccessItem.
     *
     * @param assetId Unique identifier of the business asset.
     * @param partnerId Unique identifier of a business partner to update asset access to.
     * @param permissions A non-empty array of permissions to assign to the partner.
     */
    public UpdatePartnerAssetAccessItem(
        String assetId, 
        String partnerId, 
        List<Permissions> permissions
    ) {
        this.assetId = assetId;
        this.partnerId = partnerId;
        this.permissions = permissions;
    }



    /**
     * Unique identifier of the business asset.
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * Unique identifier of a business partner to update asset access to.
     * @return partnerId
     */
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * A non-empty array of permissions to assign to the partner.
     * @return permissions
     */
    public List<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permissions> permissions) {
        this.permissions = permissions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePartnerAssetAccessItem {\n");
        
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

