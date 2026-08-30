package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ItemProcessingStatus;
import org.openapitools.server.model.ItemValidationEvent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing an item processing record
 */
public class CreativeAssetsProcessingRecord   {

    private String creativeAssetsId;
    private List<@Valid ItemValidationEvent> errors = new ArrayList<>();
    private ItemProcessingStatus status;
    private List<@Valid ItemValidationEvent> warnings = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreativeAssetsProcessingRecord() {
    // JSON-B / Jackson
    }

    /**
     * Create CreativeAssetsProcessingRecord.
     *
     * @param creativeAssetsId The catalog creative assets id in the merchant namespace
     * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
     * @param status status
     * @param warnings Array with the validation warnings for the item processing record
     */
    public CreativeAssetsProcessingRecord(
        String creativeAssetsId, 
        List<@Valid ItemValidationEvent> errors, 
        ItemProcessingStatus status, 
        List<@Valid ItemValidationEvent> warnings
    ) {
        this.creativeAssetsId = creativeAssetsId;
        this.errors = errors;
        this.status = status;
        this.warnings = warnings;
    }



    /**
     * The catalog creative assets id in the merchant namespace
     * @return creativeAssetsId
     */
    public String getCreativeAssetsId() {
        return creativeAssetsId;
    }

    public void setCreativeAssetsId(String creativeAssetsId) {
        this.creativeAssetsId = creativeAssetsId;
    }

    /**
     * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
     * @return errors
     */
    public List<@Valid ItemValidationEvent> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid ItemValidationEvent> errors) {
        this.errors = errors;
    }

    /**
     * Get status
     * @return status
     */
    public ItemProcessingStatus getStatus() {
        return status;
    }

    public void setStatus(ItemProcessingStatus status) {
        this.status = status;
    }

    /**
     * Array with the validation warnings for the item processing record
     * @return warnings
     */
    public List<@Valid ItemValidationEvent> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<@Valid ItemValidationEvent> warnings) {
        this.warnings = warnings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreativeAssetsProcessingRecord {\n");
        
        sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

