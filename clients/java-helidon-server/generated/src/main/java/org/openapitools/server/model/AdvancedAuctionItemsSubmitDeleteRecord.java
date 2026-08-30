package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdvancedAuctionOperationError;
import org.openapitools.server.model.Country;
import org.openapitools.server.model.Language;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing an item bid option deletion operation
 */
public class AdvancedAuctionItemsSubmitDeleteRecord   {

    private Country country;
    private List<@Valid AdvancedAuctionOperationError> errors = new ArrayList<>();
    private String itemId;
    private Language language;

    /**
    * Gets or Sets operation
    */
    public enum OperationEnum {
        DELETE("DELETE");

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String text) {
            for (OperationEnum b : OperationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private OperationEnum operation;

    /**
     * Default constructor.
     */
    public AdvancedAuctionItemsSubmitDeleteRecord() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvancedAuctionItemsSubmitDeleteRecord.
     *
     * @param country country
     * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
     * @param itemId The catalog retail item id in the merchant namespace
     * @param language language
     * @param operation operation
     */
    public AdvancedAuctionItemsSubmitDeleteRecord(
        Country country, 
        List<@Valid AdvancedAuctionOperationError> errors, 
        String itemId, 
        Language language, 
        OperationEnum operation
    ) {
        this.country = country;
        this.errors = errors;
        this.itemId = itemId;
        this.language = language;
        this.operation = operation;
    }



    /**
     * Get country
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
     * @return errors
     */
    public List<@Valid AdvancedAuctionOperationError> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid AdvancedAuctionOperationError> errors) {
        this.errors = errors;
    }

    /**
     * The catalog retail item id in the merchant namespace
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * Get language
     * @return language
     */
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * Get operation
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedAuctionItemsSubmitDeleteRecord {\n");
        
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

