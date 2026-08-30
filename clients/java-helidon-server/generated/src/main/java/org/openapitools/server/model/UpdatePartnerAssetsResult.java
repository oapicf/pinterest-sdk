package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AssetTypeResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object containing the permissions a business partner has on the asset.
 */
public class UpdatePartnerAssetsResult   {

    private String assetId;
    private AssetTypeResponse assetType;
    private String partnerId;
    private List<String> permissions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdatePartnerAssetsResult() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdatePartnerAssetsResult.
     *
     * @param assetId Unique identifier of a business asset.
     * @param assetType assetType
     * @param partnerId Unique identifier of a business partner.
     * @param permissions Permission levels member or partner has on an asset.
     */
    public UpdatePartnerAssetsResult(
        String assetId, 
        AssetTypeResponse assetType, 
        String partnerId, 
        List<String> permissions
    ) {
        this.assetId = assetId;
        this.assetType = assetType;
        this.partnerId = partnerId;
        this.permissions = permissions;
    }



    /**
     * Unique identifier of a business asset.
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * Get assetType
     * @return assetType
     */
    public AssetTypeResponse getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeResponse assetType) {
        this.assetType = assetType;
    }

    /**
     * Unique identifier of a business partner.
     * @return partnerId
     */
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * Permission levels member or partner has on an asset.
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePartnerAssetsResult {\n");
        
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
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

