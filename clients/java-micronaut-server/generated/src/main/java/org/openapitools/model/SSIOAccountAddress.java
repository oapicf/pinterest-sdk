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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SSIOAccountAddress
 */
@JsonPropertyOrder({
  SSIOAccountAddress.JSON_PROPERTY_DISPLAY,
  SSIOAccountAddress.JSON_PROPERTY_PURPOSE,
  SSIOAccountAddress.JSON_PROPERTY_ADDRESS_ID,
  SSIOAccountAddress.JSON_PROPERTY_ORDER_LEGAL_ENTITY
})
@JsonTypeName("SSIOAccountAddress")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class SSIOAccountAddress {
    public static final String JSON_PROPERTY_DISPLAY = "display";
    private String display;

    public static final String JSON_PROPERTY_PURPOSE = "purpose";
    private String purpose;

    public static final String JSON_PROPERTY_ADDRESS_ID = "address_id";
    private String addressId;

    public static final String JSON_PROPERTY_ORDER_LEGAL_ENTITY = "order_legal_entity";
    private String orderLegalEntity;

    public SSIOAccountAddress() {
    }

    public SSIOAccountAddress display(String display) {
        this.display = display;
        return this;
    }

    /**
     * Address display
     * @return display
     */
    @Nullable
    @Schema(name = "display", example = "475 Brannan Street, San Francisco, CA 94103", description = "Address display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DISPLAY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDisplay() {
        return display;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDisplay(String display) {
        this.display = display;
    }

    public SSIOAccountAddress purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Purpose for which the address is used, usually Billing or Businness
     * @return purpose
     */
    @Nullable
    @Schema(name = "purpose", example = "Billing", description = "Purpose for which the address is used, usually Billing or Businness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PURPOSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPurpose() {
        return purpose;
    }

    @JsonProperty(JSON_PROPERTY_PURPOSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public SSIOAccountAddress addressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * Salesforce id for address
     * @return addressId
     */
    @Nullable
    @Schema(name = "address_id", example = "a1C1N000004MUrLUAW", description = "Salesforce id for address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ADDRESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAddressId() {
        return addressId;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public SSIOAccountAddress orderLegalEntity(String orderLegalEntity) {
        this.orderLegalEntity = orderLegalEntity;
        return this;
    }

    /**
     * Legal entity for this insertion order
     * @return orderLegalEntity
     */
    @Nullable
    @Schema(name = "order_legal_entity", example = "PIN US OU", description = "Legal entity for this insertion order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ORDER_LEGAL_ENTITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOrderLegalEntity() {
        return orderLegalEntity;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_LEGAL_ENTITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrderLegalEntity(String orderLegalEntity) {
        this.orderLegalEntity = orderLegalEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SSIOAccountAddress ssIOAccountAddress = (SSIOAccountAddress) o;
        return Objects.equals(this.display, ssIOAccountAddress.display) &&
            Objects.equals(this.purpose, ssIOAccountAddress.purpose) &&
            Objects.equals(this.addressId, ssIOAccountAddress.addressId) &&
            Objects.equals(this.orderLegalEntity, ssIOAccountAddress.orderLegalEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(display, purpose, addressId, orderLegalEntity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSIOAccountAddress {\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
        sb.append("    orderLegalEntity: ").append(toIndentedString(orderLegalEntity)).append("\n");
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

