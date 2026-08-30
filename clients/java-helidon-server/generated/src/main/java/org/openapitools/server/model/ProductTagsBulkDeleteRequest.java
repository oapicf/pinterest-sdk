package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ProductTagItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request body for bulk deleting product tags from a pin.
 */
public class ProductTagsBulkDeleteRequest   {

    private List<@Valid ProductTagItem> productTags = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ProductTagsBulkDeleteRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductTagsBulkDeleteRequest.
     *
     * @param productTags List of product tags to delete.
     */
    public ProductTagsBulkDeleteRequest(
        List<@Valid ProductTagItem> productTags
    ) {
        this.productTags = productTags;
    }



    /**
     * List of product tags to delete.
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
        sb.append("class ProductTagsBulkDeleteRequest {\n");
        
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

