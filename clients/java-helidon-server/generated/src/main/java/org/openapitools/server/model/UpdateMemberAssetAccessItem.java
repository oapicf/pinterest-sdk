package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Permissions;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdateMemberAssetAccessItem   {

    private String assetId;
    private String memberId;
    private List<Permissions> permissions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateMemberAssetAccessItem() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateMemberAssetAccessItem.
     *
     * @param assetId Id of the asset to update.
     * @param memberId Unique identifier of the member on which to perform the update
     * @param permissions A non-empty array of permissions to assign to the member.
     */
    public UpdateMemberAssetAccessItem(
        String assetId, 
        String memberId, 
        List<Permissions> permissions
    ) {
        this.assetId = assetId;
        this.memberId = memberId;
        this.permissions = permissions;
    }



    /**
     * Id of the asset to update.
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * Unique identifier of the member on which to perform the update
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * A non-empty array of permissions to assign to the member.
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
        sb.append("class UpdateMemberAssetAccessItem {\n");
        
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

