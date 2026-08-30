package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdvertiserDefinedEventInput;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request body for creating or updating advertiser defined events
 */
public class AdvertiserDefinedEventsCreateRequest   {

    private List<@Valid AdvertiserDefinedEventInput> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AdvertiserDefinedEventsCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvertiserDefinedEventsCreateRequest.
     *
     * @param items List of advertiser defined events to create or update
     */
    public AdvertiserDefinedEventsCreateRequest(
        List<@Valid AdvertiserDefinedEventInput> items
    ) {
        this.items = items;
    }



    /**
     * List of advertiser defined events to create or update
     * @return items
     */
    public List<@Valid AdvertiserDefinedEventInput> getItems() {
        return items;
    }

    public void setItems(List<@Valid AdvertiserDefinedEventInput> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvertiserDefinedEventsCreateRequest {\n");
        
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

