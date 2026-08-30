package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdvancedAuctionKey;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object used to get bid options values for a batch of retail catalog items
 */
public class AdvancedAuctionItemsGetRequest   {

    private String catalogId;
    private List<@Valid AdvancedAuctionKey> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AdvancedAuctionItemsGetRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvancedAuctionItemsGetRequest.
     *
     * @param catalogId Catalog id pertaining to the retail item
     * @param items A list of retail catalog items to fetch bid options for
     */
    public AdvancedAuctionItemsGetRequest(
        String catalogId, 
        List<@Valid AdvancedAuctionKey> items
    ) {
        this.catalogId = catalogId;
        this.items = items;
    }



    /**
     * Catalog id pertaining to the retail item
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * A list of retail catalog items to fetch bid options for
     * @return items
     */
    public List<@Valid AdvancedAuctionKey> getItems() {
        return items;
    }

    public void setItems(List<@Valid AdvancedAuctionKey> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedAuctionItemsGetRequest {\n");
        
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

