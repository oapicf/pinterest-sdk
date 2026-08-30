package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Item validation event
 */
public class SupplementalItemValidationEvent   {

    private String attribute;
    private Integer code;
    private String message;

    /**
     * Default constructor.
     */
    public SupplementalItemValidationEvent() {
    // JSON-B / Jackson
    }

    /**
     * Create SupplementalItemValidationEvent.
     *
     * @param attribute The item attribute referenced by the validation event eg. price, availability, ad_link
     * @param code The event code that the item validation event references
     * @param message Title message describing the item validation event
     */
    public SupplementalItemValidationEvent(
        String attribute, 
        Integer code, 
        String message
    ) {
        this.attribute = attribute;
        this.code = code;
        this.message = message;
    }



    /**
     * The item attribute referenced by the validation event eg. price, availability, ad_link
     * @return attribute
     */
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * The event code that the item validation event references
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Title message describing the item validation event
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplementalItemValidationEvent {\n");
        
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

