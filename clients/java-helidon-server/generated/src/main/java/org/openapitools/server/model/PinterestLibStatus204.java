package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The resource was successfully deleted.
 */
public class PinterestLibStatus204   {


    /**
    * Gets or Sets statusCode
    */
    public enum StatusCodeEnum {
        NUMBER_204(new BigDecimal("204"));

        private BigDecimal value;

        StatusCodeEnum(BigDecimal value) {
            this.value = value;
        }

        @JsonValue
        public BigDecimal getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static StatusCodeEnum fromValue(String text) {
            for (StatusCodeEnum b : StatusCodeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private StatusCodeEnum statusCode;

    /**
     * Default constructor.
     */
    public PinterestLibStatus204() {
    // JSON-B / Jackson
    }

    /**
     * Create PinterestLibStatus204.
     *
     * @param statusCode statusCode
     */
    public PinterestLibStatus204(
        StatusCodeEnum statusCode
    ) {
        this.statusCode = statusCode;
    }



    /**
     * Get statusCode
     * @return statusCode
     */
    public StatusCodeEnum getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinterestLibStatus204 {\n");
        
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

