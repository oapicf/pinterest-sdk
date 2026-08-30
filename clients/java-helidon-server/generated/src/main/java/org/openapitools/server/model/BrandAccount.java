package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BrandAccount   {

    private String brandAccountId;

    /**
     * Default constructor.
     */
    public BrandAccount() {
    // JSON-B / Jackson
    }

    /**
     * Create BrandAccount.
     *
     * @param brandAccountId brandAccountId
     */
    public BrandAccount(
        String brandAccountId
    ) {
        this.brandAccountId = brandAccountId;
    }



    /**
     * Get brandAccountId
     * @return brandAccountId
     */
    public String getBrandAccountId() {
        return brandAccountId;
    }

    public void setBrandAccountId(String brandAccountId) {
        this.brandAccountId = brandAccountId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandAccount {\n");
        
        sb.append("    brandAccountId: ").append(toIndentedString(brandAccountId)).append("\n");
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

