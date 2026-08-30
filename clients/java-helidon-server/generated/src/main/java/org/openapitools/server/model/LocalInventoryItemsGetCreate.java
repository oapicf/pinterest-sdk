package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ItemIdStoreCodePair;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class LocalInventoryItemsGetCreate   {

    private List<@Valid ItemIdStoreCodePair> itemFilters = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocalInventoryItemsGetCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create LocalInventoryItemsGetCreate.
     *
     * @param itemFilters Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
     */
    public LocalInventoryItemsGetCreate(
        List<@Valid ItemIdStoreCodePair> itemFilters
    ) {
        this.itemFilters = itemFilters;
    }



    /**
     * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
     * @return itemFilters
     */
    public List<@Valid ItemIdStoreCodePair> getItemFilters() {
        return itemFilters;
    }

    public void setItemFilters(List<@Valid ItemIdStoreCodePair> itemFilters) {
        this.itemFilters = itemFilters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalInventoryItemsGetCreate {\n");
        
        sb.append("    itemFilters: ").append(toIndentedString(itemFilters)).append("\n");
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

