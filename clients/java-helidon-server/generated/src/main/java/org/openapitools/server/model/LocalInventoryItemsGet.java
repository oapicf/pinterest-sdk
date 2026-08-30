package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LocalInventoryItemResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Model for getting local inventory items
 */
public class LocalInventoryItemsGet   {

    private List<@Valid LocalInventoryItemResponse> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocalInventoryItemsGet() {
    // JSON-B / Jackson
    }

    /**
     * Create LocalInventoryItemsGet.
     *
     * @param items Array of local inventory items
     */
    public LocalInventoryItemsGet(
        List<@Valid LocalInventoryItemResponse> items
    ) {
        this.items = items;
    }



    /**
     * Array of local inventory items
     * @return items
     */
    public List<@Valid LocalInventoryItemResponse> getItems() {
        return items;
    }

    public void setItems(List<@Valid LocalInventoryItemResponse> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalInventoryItemsGet {\n");
        
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

