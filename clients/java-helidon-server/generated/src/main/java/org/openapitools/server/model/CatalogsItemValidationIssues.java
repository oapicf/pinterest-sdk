package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsItemValidationErrors;
import org.openapitools.server.model.CatalogsItemValidationWarnings;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsItemValidationIssues   {

    private CatalogsItemValidationErrors errors;
    private String itemId;
    private Integer itemNumber;
    private CatalogsItemValidationWarnings warnings;

    /**
     * Default constructor.
     */
    public CatalogsItemValidationIssues() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsItemValidationIssues.
     *
     * @param errors errors
     * @param itemId The merchant-created unique ID that represents the product.
     * @param itemNumber Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.
     * @param warnings warnings
     */
    public CatalogsItemValidationIssues(
        CatalogsItemValidationErrors errors, 
        String itemId, 
        Integer itemNumber, 
        CatalogsItemValidationWarnings warnings
    ) {
        this.errors = errors;
        this.itemId = itemId;
        this.itemNumber = itemNumber;
        this.warnings = warnings;
    }



    /**
     * Get errors
     * @return errors
     */
    public CatalogsItemValidationErrors getErrors() {
        return errors;
    }

    public void setErrors(CatalogsItemValidationErrors errors) {
        this.errors = errors;
    }

    /**
     * The merchant-created unique ID that represents the product.
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
     * @return itemNumber
     */
    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     * Get warnings
     * @return warnings
     */
    public CatalogsItemValidationWarnings getWarnings() {
        return warnings;
    }

    public void setWarnings(CatalogsItemValidationWarnings warnings) {
        this.warnings = warnings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsItemValidationIssues {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

