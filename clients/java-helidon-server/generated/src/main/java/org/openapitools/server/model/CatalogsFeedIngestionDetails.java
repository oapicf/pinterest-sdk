package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsFeedIngestionErrors;
import org.openapitools.server.model.CatalogsFeedIngestionInfo;
import org.openapitools.server.model.CatalogsFeedIngestionWarnings;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsFeedIngestionDetails   {

    private CatalogsFeedIngestionErrors errors;
    private CatalogsFeedIngestionInfo info;
    private CatalogsFeedIngestionWarnings warnings;

    /**
     * Default constructor.
     */
    public CatalogsFeedIngestionDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedIngestionDetails.
     *
     * @param errors errors
     * @param info info
     * @param warnings warnings
     */
    public CatalogsFeedIngestionDetails(
        CatalogsFeedIngestionErrors errors, 
        CatalogsFeedIngestionInfo info, 
        CatalogsFeedIngestionWarnings warnings
    ) {
        this.errors = errors;
        this.info = info;
        this.warnings = warnings;
    }



    /**
     * Get errors
     * @return errors
     */
    public CatalogsFeedIngestionErrors getErrors() {
        return errors;
    }

    public void setErrors(CatalogsFeedIngestionErrors errors) {
        this.errors = errors;
    }

    /**
     * Get info
     * @return info
     */
    public CatalogsFeedIngestionInfo getInfo() {
        return info;
    }

    public void setInfo(CatalogsFeedIngestionInfo info) {
        this.info = info;
    }

    /**
     * Get warnings
     * @return warnings
     */
    public CatalogsFeedIngestionWarnings getWarnings() {
        return warnings;
    }

    public void setWarnings(CatalogsFeedIngestionWarnings warnings) {
        this.warnings = warnings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedIngestionDetails {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

