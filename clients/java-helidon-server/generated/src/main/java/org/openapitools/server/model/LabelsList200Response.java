package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.Label;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabelsList200Response   {

    private String bookmark;
    private List<@Valid Label> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LabelsList200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create LabelsList200Response.
     *
     * @param bookmark bookmark
     * @param items items
     */
    public LabelsList200Response(
        String bookmark, 
        List<@Valid Label> items
    ) {
        this.bookmark = bookmark;
        this.items = items;
    }



    /**
     * Get bookmark
     * @return bookmark
     */
    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    /**
     * Get items
     * @return items
     */
    public List<@Valid Label> getItems() {
        return items;
    }

    public void setItems(List<@Valid Label> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelsList200Response {\n");
        
        sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
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

