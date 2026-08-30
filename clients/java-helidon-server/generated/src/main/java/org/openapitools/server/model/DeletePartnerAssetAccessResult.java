package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The terminated asset access.
 */
public class DeletePartnerAssetAccessResult   {

    private String assetId;
    private String assetType;
    private Boolean isSharedPartner;
    private String partnerId;
    private List<String> permissions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeletePartnerAssetAccessResult() {
    // JSON-B / Jackson
    }

    /**
     * Create DeletePartnerAssetAccessResult.
     *
     * @param assetId Unique identifier of a business asset.
     * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
     * @param isSharedPartner If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.
     * @param partnerId Unique identifier of a business partner.
     * @param permissions Permission levels member or partner has on an asset.
     */
    public DeletePartnerAssetAccessResult(
        String assetId, 
        String assetType, 
        Boolean isSharedPartner, 
        String partnerId, 
        List<String> permissions
    ) {
        this.assetId = assetId;
        this.assetType = assetType;
        this.isSharedPartner = isSharedPartner;
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
     * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
     * @return isSharedPartner
     */
    public Boolean getIsSharedPartner() {
        return isSharedPartner;
    }

    public void setIsSharedPartner(Boolean isSharedPartner) {
        this.isSharedPartner = isSharedPartner;
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
        sb.append("class DeletePartnerAssetAccessResult {\n");
        
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
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

