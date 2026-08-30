package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.IneligibleProductTagErrorItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details about ineligible product tags in the request.
 */
public class IneligibleProductTagsErrorDetails   {

    private List<@Valid IneligibleProductTagErrorItem> productTags = new ArrayList<>();

    /**
     * Default constructor.
     */
    public IneligibleProductTagsErrorDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create IneligibleProductTagsErrorDetails.
     *
     * @param productTags List of product tags that failed eligibility check.
     */
    public IneligibleProductTagsErrorDetails(
        List<@Valid IneligibleProductTagErrorItem> productTags
    ) {
        this.productTags = productTags;
    }



    /**
     * List of product tags that failed eligibility check.
     * @return productTags
     */
    public List<@Valid IneligibleProductTagErrorItem> getProductTags() {
        return productTags;
    }

    public void setProductTags(List<@Valid IneligibleProductTagErrorItem> productTags) {
        this.productTags = productTags;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IneligibleProductTagsErrorDetails {\n");
        
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

