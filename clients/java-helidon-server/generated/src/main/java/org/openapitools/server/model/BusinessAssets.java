package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AssetGroupBinding;
import org.openapitools.server.model.AssetTypeResponse;
import org.openapitools.server.model.CatalogBinding;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BusinessAssets   {

    private AssetGroupBinding assetGroupInfo;
    private String assetId;
    private AssetTypeResponse assetType;
    private List<String> permissions = new ArrayList<>();
    private CatalogBinding catalogInfo;

    /**
     * Default constructor.
     */
    public BusinessAssets() {
    // JSON-B / Jackson
    }

    /**
     * Create BusinessAssets.
     *
     * @param assetGroupInfo An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.
     * @param assetId Unique identifier of a business asset.
     * @param assetType assetType
     * @param permissions Permission levels the requesting business has on an asset.
     * @param catalogInfo An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
     */
    public BusinessAssets(
        AssetGroupBinding assetGroupInfo, 
        String assetId, 
        AssetTypeResponse assetType, 
        List<String> permissions, 
        CatalogBinding catalogInfo
    ) {
        this.assetGroupInfo = assetGroupInfo;
        this.assetId = assetId;
        this.assetType = assetType;
        this.permissions = permissions;
        this.catalogInfo = catalogInfo;
    }



    /**
     * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
     * @return assetGroupInfo
     */
    public AssetGroupBinding getAssetGroupInfo() {
        return assetGroupInfo;
    }

    public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
        this.assetGroupInfo = assetGroupInfo;
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
     * Permission levels the requesting business has on an asset.
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    /**
     * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
     * @return catalogInfo
     */
    public CatalogBinding getCatalogInfo() {
        return catalogInfo;
    }

    public void setCatalogInfo(CatalogBinding catalogInfo) {
        this.catalogInfo = catalogInfo;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessAssets {\n");
        
        sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    catalogInfo: ").append(toIndentedString(catalogInfo)).append("\n");
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

