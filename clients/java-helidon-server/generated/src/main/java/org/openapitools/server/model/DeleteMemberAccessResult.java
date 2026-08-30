package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The terminated asset access.
 */
public class DeleteMemberAccessResult   {

    private String assetId;
    private String memberId;

    /**
     * Default constructor.
     */
    public DeleteMemberAccessResult() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteMemberAccessResult.
     *
     * @param assetId Unique identifier of the business asset.
     * @param memberId Unique identifier of the business member.
     */
    public DeleteMemberAccessResult(
        String assetId, 
        String memberId
    ) {
        this.assetId = assetId;
        this.memberId = memberId;
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
     * Unique identifier of the business member.
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
        sb.append("class DeleteMemberAccessResult {\n");
        
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

