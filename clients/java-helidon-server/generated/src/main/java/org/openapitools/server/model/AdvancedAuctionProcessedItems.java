package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdvancedAuctionItemsSubmitRecord;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Response object containing the results of an operation on an item bid option
 */
public class AdvancedAuctionProcessedItems   {

    private String catalogId;
    private List<@Valid AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AdvancedAuctionProcessedItems() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvancedAuctionProcessedItems.
     *
     * @param catalogId Catalog id pertaining to all items
     * @param items Array of advanced auction processed items
     */
    public AdvancedAuctionProcessedItems(
        String catalogId, 
        List<@Valid AdvancedAuctionItemsSubmitRecord> items
    ) {
        this.catalogId = catalogId;
        this.items = items;
    }



    /**
     * Catalog id pertaining to all items
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * Array of advanced auction processed items
     * @return items
     */
    public List<@Valid AdvancedAuctionItemsSubmitRecord> getItems() {
        return items;
    }

    public void setItems(List<@Valid AdvancedAuctionItemsSubmitRecord> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedAuctionProcessedItems {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

