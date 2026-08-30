package org.openapitools.server.model;

import org.openapitools.server.model.UsersForIndividualAssetResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdateMemberAssetResultItem   {

    private UsersForIndividualAssetResponse response;

    /**
     * Default constructor.
     */
    public UpdateMemberAssetResultItem() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateMemberAssetResultItem.
     *
     * @param response response
     */
    public UpdateMemberAssetResultItem(
        UsersForIndividualAssetResponse response
    ) {
        this.response = response;
    }



    /**
     * Get response
     * @return response
     */
    public UsersForIndividualAssetResponse getResponse() {
        return response;
    }

    public void setResponse(UsersForIndividualAssetResponse response) {
        this.response = response;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMemberAssetResultItem {\n");
        
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

