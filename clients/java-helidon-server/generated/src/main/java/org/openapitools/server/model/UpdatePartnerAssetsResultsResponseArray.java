package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdatePartnerAssetsResult;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdatePartnerAssetsResultsResponseArray   {

    private List<@Valid UpdatePartnerAssetsResult> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdatePartnerAssetsResultsResponseArray() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdatePartnerAssetsResultsResponseArray.
     *
     * @param items List of assigned/updated partner asset access.
     */
    public UpdatePartnerAssetsResultsResponseArray(
        List<@Valid UpdatePartnerAssetsResult> items
    ) {
        this.items = items;
    }



    /**
     * List of assigned/updated partner asset access.
     * @return items
     */
    public List<@Valid UpdatePartnerAssetsResult> getItems() {
        return items;
    }

    public void setItems(List<@Valid UpdatePartnerAssetsResult> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePartnerAssetsResultsResponseArray {\n");
        
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

