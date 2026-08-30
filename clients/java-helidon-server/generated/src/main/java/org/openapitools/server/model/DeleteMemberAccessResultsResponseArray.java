package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DeleteMemberAccessResult;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeleteMemberAccessResultsResponseArray   {

    private List<@Valid DeleteMemberAccessResult> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeleteMemberAccessResultsResponseArray() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteMemberAccessResultsResponseArray.
     *
     * @param items List of member asset permissions that were deleted.
     */
    public DeleteMemberAccessResultsResponseArray(
        List<@Valid DeleteMemberAccessResult> items
    ) {
        this.items = items;
    }



    /**
     * List of member asset permissions that were deleted.
     * @return items
     */
    public List<@Valid DeleteMemberAccessResult> getItems() {
        return items;
    }

    public void setItems(List<@Valid DeleteMemberAccessResult> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMemberAccessResultsResponseArray {\n");
        
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

