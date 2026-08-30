package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RespondToInviteResultItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RespondToInvitesResponseArray   {

    private List<@Valid RespondToInviteResultItem> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RespondToInvitesResponseArray() {
    // JSON-B / Jackson
    }

    /**
     * Create RespondToInvitesResponseArray.
     *
     * @param items List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
     */
    public RespondToInvitesResponseArray(
        List<@Valid RespondToInviteResultItem> items
    ) {
        this.items = items;
    }



    /**
     * List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
     * @return items
     */
    public List<@Valid RespondToInviteResultItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid RespondToInviteResultItem> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespondToInvitesResponseArray {\n");
        
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

