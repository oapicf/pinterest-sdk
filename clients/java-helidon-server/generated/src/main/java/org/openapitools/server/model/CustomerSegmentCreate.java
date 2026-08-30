package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class CustomerSegmentCreate   {

    private List<String> audienceIds = new ArrayList<>();
    private String name;

    /**
     * Default constructor.
     */
    public CustomerSegmentCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerSegmentCreate.
     *
     * @param audienceIds Audience IDs included in the customer segment.
     * @param name Customer segment name.
     */
    public CustomerSegmentCreate(
        List<String> audienceIds, 
        String name
    ) {
        this.audienceIds = audienceIds;
        this.name = name;
    }



    /**
     * Audience IDs included in the customer segment.
     * @return audienceIds
     */
    public List<String> getAudienceIds() {
        return audienceIds;
    }

    public void setAudienceIds(List<String> audienceIds) {
        this.audienceIds = audienceIds;
    }

    /**
     * Customer segment name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerSegmentCreate {\n");
        
        sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

