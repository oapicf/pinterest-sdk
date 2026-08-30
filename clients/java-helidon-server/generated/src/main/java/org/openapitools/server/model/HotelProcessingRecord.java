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
public class HotelProcessingRecord   {

    private List<@Valid ItemValidationEvent> errors = new ArrayList<>();
    private String hotelId;
    private ItemProcessingStatus status;
    private List<@Valid ItemValidationEvent> warnings = new ArrayList<>();

    /**
     * Default constructor.
     */
    public HotelProcessingRecord() {
    // JSON-B / Jackson
    }

    /**
     * Create HotelProcessingRecord.
     *
     * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
     * @param hotelId The catalog hotel id in the merchant namespace
     * @param status status
     * @param warnings Array with the validation warnings for the item processing record
     */
    public HotelProcessingRecord(
        List<@Valid ItemValidationEvent> errors, 
        String hotelId, 
        ItemProcessingStatus status, 
        List<@Valid ItemValidationEvent> warnings
    ) {
        this.errors = errors;
        this.hotelId = hotelId;
        this.status = status;
        this.warnings = warnings;
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
     * The catalog hotel id in the merchant namespace
     * @return hotelId
     */
    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
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
        sb.append("class HotelProcessingRecord {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

