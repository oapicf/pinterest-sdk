package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsHotelAttributes;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A hotel item to be created.
 */
public class CatalogsCreateHotelItem   {

    private CatalogsHotelAttributes attributes;
    private String hotelId;

    /**
    * Gets or Sets operation
    */
    public enum OperationEnum {
        CREATE("CREATE");

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
    public CatalogsCreateHotelItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreateHotelItem.
     *
     * @param attributes attributes
     * @param hotelId The catalog hotel id in the merchant namespace
     * @param operation operation
     */
    public CatalogsCreateHotelItem(
        CatalogsHotelAttributes attributes, 
        String hotelId, 
        OperationEnum operation
    ) {
        this.attributes = attributes;
        this.hotelId = hotelId;
        this.operation = operation;
    }



    /**
     * Get attributes
     * @return attributes
     */
    public CatalogsHotelAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CatalogsHotelAttributes attributes) {
        this.attributes = attributes;
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
        sb.append("class CatalogsCreateHotelItem {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

