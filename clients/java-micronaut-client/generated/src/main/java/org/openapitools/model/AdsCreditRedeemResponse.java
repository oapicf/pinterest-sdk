/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * AdsCreditRedeemResponse
 */
@JsonPropertyOrder({
  AdsCreditRedeemResponse.JSON_PROPERTY_SUCCESS,
  AdsCreditRedeemResponse.JSON_PROPERTY_ERROR_CODE,
  AdsCreditRedeemResponse.JSON_PROPERTY_ERROR_MESSAGE
})
@JsonTypeName("AdsCreditRedeemResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-03-14T23:01:49.950286870Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class AdsCreditRedeemResponse {
    public static final String JSON_PROPERTY_SUCCESS = "success";
    private Boolean success;

    public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
    private Integer errorCode;

    public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
    private String errorMessage;

    public AdsCreditRedeemResponse() {
    }

    public AdsCreditRedeemResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).
     * @return success
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUCCESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty(JSON_PROPERTY_SUCCESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public AdsCreditRedeemResponse errorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Error code type if error occurs
     * @return errorCode
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public AdsCreditRedeemResponse errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Reason for failure
     * @return errorMessage
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdsCreditRedeemResponse adsCreditRedeemResponse = (AdsCreditRedeemResponse) o;
        return Objects.equals(this.success, adsCreditRedeemResponse.success) &&
            Objects.equals(this.errorCode, adsCreditRedeemResponse.errorCode) &&
            Objects.equals(this.errorMessage, adsCreditRedeemResponse.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsCreditRedeemResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
