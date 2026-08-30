package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AudienceDefinition;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AudienceInsightsScopeAndTypeGet200Response   {

    private List<@Valid AudienceDefinition> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AudienceInsightsScopeAndTypeGet200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create AudienceInsightsScopeAndTypeGet200Response.
     *
     * @param items items
     */
    public AudienceInsightsScopeAndTypeGet200Response(
        List<@Valid AudienceDefinition> items
    ) {
        this.items = items;
    }



    /**
     * Get items
     * @return items
     */
    public List<@Valid AudienceDefinition> getItems() {
        return items;
    }

    public void setItems(List<@Valid AudienceDefinition> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudienceInsightsScopeAndTypeGet200Response {\n");
        
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

