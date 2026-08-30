package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DeletePartnerAssetAccessResult;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeletePartnerAssetAccessResultsResponseArray   {

    private List<@Valid DeletePartnerAssetAccessResult> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeletePartnerAssetAccessResultsResponseArray() {
    // JSON-B / Jackson
    }

    /**
     * Create DeletePartnerAssetAccessResultsResponseArray.
     *
     * @param items List of terminated partner asset accesses.
     */
    public DeletePartnerAssetAccessResultsResponseArray(
        List<@Valid DeletePartnerAssetAccessResult> items
    ) {
        this.items = items;
    }



    /**
     * List of terminated partner asset accesses.
     * @return items
     */
    public List<@Valid DeletePartnerAssetAccessResult> getItems() {
        return items;
    }

    public void setItems(List<@Valid DeletePartnerAssetAccessResult> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePartnerAssetAccessResultsResponseArray {\n");
        
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

