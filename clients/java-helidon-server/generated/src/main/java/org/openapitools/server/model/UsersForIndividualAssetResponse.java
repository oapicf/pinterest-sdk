package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object containing the permissions a business member has on the asset.
 */
public class UsersForIndividualAssetResponse   {

    private String assetId;
    private String memberId;
    private List<String> permissions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UsersForIndividualAssetResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create UsersForIndividualAssetResponse.
     *
     * @param assetId Unique identifier of a business asset.
     * @param memberId Unique identifier of the business member with asset access.
     * @param permissions Permission levels member or partner has on an asset.
     */
    public UsersForIndividualAssetResponse(
        String assetId, 
        String memberId, 
        List<String> permissions
    ) {
        this.assetId = assetId;
        this.memberId = memberId;
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
     * Unique identifier of the business member with asset access.
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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
        sb.append("class UsersForIndividualAssetResponse {\n");
        
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

