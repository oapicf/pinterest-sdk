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
 * SSIOInsertionOrderStatus
 */
@JsonPropertyOrder({
  SSIOInsertionOrderStatus.JSON_PROPERTY_PIN_ORDER_ID,
  SSIOInsertionOrderStatus.JSON_PROPERTY_STATUS,
  SSIOInsertionOrderStatus.JSON_PROPERTY_CREATION_TIME
})
@JsonTypeName("SSIOInsertionOrderStatus")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-03-14T23:01:49.950286870Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class SSIOInsertionOrderStatus {
    public static final String JSON_PROPERTY_PIN_ORDER_ID = "pin_order_id";
    private String pinOrderId;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public static final String JSON_PROPERTY_CREATION_TIME = "creation_time";
    private String creationTime;

    public SSIOInsertionOrderStatus() {
    }

    public SSIOInsertionOrderStatus pinOrderId(String pinOrderId) {
        this.pinOrderId = pinOrderId;
        return this;
    }

    /**
     * Salesforce order id
     * @return pinOrderId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PIN_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPinOrderId() {
        return pinOrderId;
    }

    @JsonProperty(JSON_PROPERTY_PIN_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPinOrderId(String pinOrderId) {
        this.pinOrderId = pinOrderId;
    }

    public SSIOInsertionOrderStatus status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Salesforce insertion order status
     * @return status
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    public SSIOInsertionOrderStatus creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Salesforce insertion order creation time
     * @return creationTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATION_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreationTime() {
        return creationTime;
    }

    @JsonProperty(JSON_PROPERTY_CREATION_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SSIOInsertionOrderStatus ssIOInsertionOrderStatus = (SSIOInsertionOrderStatus) o;
        return Objects.equals(this.pinOrderId, ssIOInsertionOrderStatus.pinOrderId) &&
            Objects.equals(this.status, ssIOInsertionOrderStatus.status) &&
            Objects.equals(this.creationTime, ssIOInsertionOrderStatus.creationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinOrderId, status, creationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSIOInsertionOrderStatus {\n");
        sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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
