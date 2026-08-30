package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdateMemberAssetResultItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdateMemberAssetsResultsResponseArray   {

    private List<@Valid UpdateMemberAssetResultItem> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateMemberAssetsResultsResponseArray() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateMemberAssetsResultsResponseArray.
     *
     * @param items List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
     */
    public UpdateMemberAssetsResultsResponseArray(
        List<@Valid UpdateMemberAssetResultItem> items
    ) {
        this.items = items;
    }



    /**
     * List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
     * @return items
     */
    public List<@Valid UpdateMemberAssetResultItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid UpdateMemberAssetResultItem> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMemberAssetsResultsResponseArray {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

