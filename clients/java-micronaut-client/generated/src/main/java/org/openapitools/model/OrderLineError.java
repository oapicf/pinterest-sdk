/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * OrderLineError
 */
@JsonPropertyOrder({
  OrderLineError.JSON_PROPERTY_DATA,
  OrderLineError.JSON_PROPERTY_ERROR_MESSAGES
})
@JsonTypeName("OrderLineError")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class OrderLineError {
    public static final String JSON_PROPERTY_DATA = "data";
    private OrderLine data;

    public static final String JSON_PROPERTY_ERROR_MESSAGES = "error_messages";
    private List<String> errorMessages = null;

    public OrderLineError() {
    }

    public OrderLineError data(OrderLine data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrderLine getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(OrderLine data) {
        this.data = data;
    }

    public OrderLineError errorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }

    public OrderLineError addErrorMessagesItem(String errorMessagesItem) {
        if (this.errorMessages == null) {
            this.errorMessages = new ArrayList<>();
        }
        this.errorMessages.add(errorMessagesItem);
        return this;
    }

    /**
     * Get errorMessages
     * @return errorMessages
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getErrorMessages() {
        return errorMessages;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLineError orderLineError = (OrderLineError) o;
        return Objects.equals(this.data, orderLineError.data) &&
            Objects.equals(this.errorMessages, orderLineError.errorMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errorMessages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLineError {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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

