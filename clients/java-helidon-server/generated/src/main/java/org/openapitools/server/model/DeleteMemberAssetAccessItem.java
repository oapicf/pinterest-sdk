package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeleteMemberAssetAccessItem   {

    private String assetId;
    private String memberId;

    /**
     * Default constructor.
     */
    public DeleteMemberAssetAccessItem() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteMemberAssetAccessItem.
     *
     * @param assetId Id of the asset on which to remove member permissions.
     * @param memberId Unique identifier of the member on which to perform the asset permission removal
     */
    public DeleteMemberAssetAccessItem(
        String assetId, 
        String memberId
    ) {
        this.assetId = assetId;
        this.memberId = memberId;
    }



    /**
     * Id of the asset on which to remove member permissions.
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * Unique identifier of the member on which to perform the asset permission removal
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMemberAssetAccessItem {\n");
        
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

