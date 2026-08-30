package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.SupplementalItemProcessingStatus;
import org.openapitools.server.model.SupplementalItemValidationEvent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Result of a supplemental item operation, discriminated by supplemental_type
 */
public class SupplementalOperationResult   {

    private List<@Valid SupplementalItemValidationEvent> errors = new ArrayList<>();
    private String itemId;
    private SupplementalItemProcessingStatus status;
    private String storeCode;

    /**
    * Gets or Sets supplementalType
    */
    public enum SupplementalTypeEnum {
        LOCAL_INVENTORY("LOCAL_INVENTORY");

        private String value;

        SupplementalTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static SupplementalTypeEnum fromValue(String text) {
            for (SupplementalTypeEnum b : SupplementalTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private SupplementalTypeEnum supplementalType;
    private List<@Valid SupplementalItemValidationEvent> warnings = new ArrayList<>();

    /**
     * Default constructor.
     */
    public SupplementalOperationResult() {
    // JSON-B / Jackson
    }

    /**
     * Create SupplementalOperationResult.
     *
     * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
     * @param itemId Catalog item id in the merchant namespace
     * @param status Status of the item processing record
     * @param storeCode Store code for the local inventory item
     * @param supplementalType supplementalType
     * @param warnings Array with the validation warnings for the item processing record
     */
    public SupplementalOperationResult(
        List<@Valid SupplementalItemValidationEvent> errors, 
        String itemId, 
        SupplementalItemProcessingStatus status, 
        String storeCode, 
        SupplementalTypeEnum supplementalType, 
        List<@Valid SupplementalItemValidationEvent> warnings
    ) {
        this.errors = errors;
        this.itemId = itemId;
        this.status = status;
        this.storeCode = storeCode;
        this.supplementalType = supplementalType;
        this.warnings = warnings;
    }



    /**
     * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
     * @return errors
     */
    public List<@Valid SupplementalItemValidationEvent> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid SupplementalItemValidationEvent> errors) {
        this.errors = errors;
    }

    /**
     * Catalog item id in the merchant namespace
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * Status of the item processing record
     * @return status
     */
    public SupplementalItemProcessingStatus getStatus() {
        return status;
    }

    public void setStatus(SupplementalItemProcessingStatus status) {
        this.status = status;
    }

    /**
     * Store code for the local inventory item
     * @return storeCode
     */
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    /**
     * Get supplementalType
     * @return supplementalType
     */
    public SupplementalTypeEnum getSupplementalType() {
        return supplementalType;
    }

    public void setSupplementalType(SupplementalTypeEnum supplementalType) {
        this.supplementalType = supplementalType;
    }

    /**
     * Array with the validation warnings for the item processing record
     * @return warnings
     */
    public List<@Valid SupplementalItemValidationEvent> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<@Valid SupplementalItemValidationEvent> warnings) {
        this.warnings = warnings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplementalOperationResult {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
        sb.append("    supplementalType: ").append(toIndentedString(supplementalType)).append("\n");
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

