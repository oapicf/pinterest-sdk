package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibStatus204;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignAdPreviewDelete200ResponseInnerStatus   {


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
    private Integer code;
    private String message;

    /**
     * Default constructor.
     */
    public CampaignAdPreviewDelete200ResponseInnerStatus() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignAdPreviewDelete200ResponseInnerStatus.
     *
     * @param statusCode statusCode
     * @param code code
     * @param message message
     */
    public CampaignAdPreviewDelete200ResponseInnerStatus(
        StatusCodeEnum statusCode, 
        Integer code, 
        String message
    ) {
        this.statusCode = statusCode;
        this.code = code;
        this.message = message;
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
     * Get code
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Get message
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
        sb.append("class CampaignAdPreviewDelete200ResponseInnerStatus {\n");
        
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

