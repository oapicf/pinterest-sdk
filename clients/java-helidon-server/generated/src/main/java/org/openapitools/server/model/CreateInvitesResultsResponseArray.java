package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.InviteActionResultItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateInvitesResultsResponseArray   {

    private List<@Valid InviteActionResultItem> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateInvitesResultsResponseArray() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateInvitesResultsResponseArray.
     *
     * @param items List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
     */
    public CreateInvitesResultsResponseArray(
        List<@Valid InviteActionResultItem> items
    ) {
        this.items = items;
    }



    /**
     * List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
     * @return items
     */
    public List<@Valid InviteActionResultItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid InviteActionResultItem> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInvitesResultsResponseArray {\n");
        
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

