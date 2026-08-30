package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ProductTagItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request body for bulk adding product tags to a pin.
 */
public class ProductTagsBulkAddRequest   {

    private List<@Valid ProductTagItem> productTags = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ProductTagsBulkAddRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductTagsBulkAddRequest.
     *
     * @param productTags List of product tags to add. Maximum 24 items allowed.
     */
    public ProductTagsBulkAddRequest(
        List<@Valid ProductTagItem> productTags
    ) {
        this.productTags = productTags;
    }



    /**
     * List of product tags to add. Maximum 24 items allowed.
     * @return productTags
     */
    public List<@Valid ProductTagItem> getProductTags() {
        return productTags;
    }

    public void setProductTags(List<@Valid ProductTagItem> productTags) {
        this.productTags = productTags;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductTagsBulkAddRequest {\n");
        
        sb.append("    productTags: ").append(toIndentedString(productTags)).append("\n");
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

