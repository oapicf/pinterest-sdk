package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdvancedAuctionItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Response object containing item bid options
 */
public class AdvancedAuctionItems   {

    private String catalogId;
    private List<@Valid AdvancedAuctionItem> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AdvancedAuctionItems() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvancedAuctionItems.
     *
     * @param catalogId Response object of item bid options
     * @param items Array with item bid options
     */
    public AdvancedAuctionItems(
        String catalogId, 
        List<@Valid AdvancedAuctionItem> items
    ) {
        this.catalogId = catalogId;
        this.items = items;
    }



    /**
     * Response object of item bid options
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * Array with item bid options
     * @return items
     */
    public List<@Valid AdvancedAuctionItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid AdvancedAuctionItem> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedAuctionItems {\n");
        
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

