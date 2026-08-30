package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsFeedValidationErrors;
import org.openapitools.server.model.CatalogsFeedValidationWarnings;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsFeedValidationDetails   {

    private CatalogsFeedValidationErrors errors;
    private CatalogsFeedValidationWarnings warnings;

    /**
     * Default constructor.
     */
    public CatalogsFeedValidationDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedValidationDetails.
     *
     * @param errors errors
     * @param warnings warnings
     */
    public CatalogsFeedValidationDetails(
        CatalogsFeedValidationErrors errors, 
        CatalogsFeedValidationWarnings warnings
    ) {
        this.errors = errors;
        this.warnings = warnings;
    }



    /**
     * Get errors
     * @return errors
     */
    public CatalogsFeedValidationErrors getErrors() {
        return errors;
    }

    public void setErrors(CatalogsFeedValidationErrors errors) {
        this.errors = errors;
    }

    /**
     * Get warnings
     * @return warnings
     */
    public CatalogsFeedValidationWarnings getWarnings() {
        return warnings;
    }

    public void setWarnings(CatalogsFeedValidationWarnings warnings) {
        this.warnings = warnings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedValidationDetails {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

