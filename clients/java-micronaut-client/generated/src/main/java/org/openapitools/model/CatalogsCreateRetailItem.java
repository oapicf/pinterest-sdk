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
import org.openapitools.model.ItemAttributesRequest;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * An item to be created
 */
@JsonPropertyOrder({
  CatalogsCreateRetailItem.JSON_PROPERTY_ITEM_ID,
  CatalogsCreateRetailItem.JSON_PROPERTY_OPERATION,
  CatalogsCreateRetailItem.JSON_PROPERTY_ATTRIBUTES
})
@JsonTypeName("CatalogsCreateRetailItem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsCreateRetailItem {
    public static final String JSON_PROPERTY_ITEM_ID = "item_id";
    private String itemId;

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
        public static OperationEnum fromValue(String value) {
            for (OperationEnum b : OperationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_OPERATION = "operation";
    private OperationEnum operation;

    public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
    private ItemAttributesRequest attributes;

    public CatalogsCreateRetailItem(String itemId, OperationEnum operation, ItemAttributesRequest attributes) {
        this.itemId = itemId;
        this.operation = operation;
        this.attributes = attributes;
    }

    public CatalogsCreateRetailItem itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * The catalog item id in the merchant namespace
     * @return itemId
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ITEM_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getItemId() {
        return itemId;
    }

    @JsonProperty(JSON_PROPERTY_ITEM_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public CatalogsCreateRetailItem operation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation
     * @return operation
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_OPERATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OperationEnum getOperation() {
        return operation;
    }

    @JsonProperty(JSON_PROPERTY_OPERATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public CatalogsCreateRetailItem attributes(ItemAttributesRequest attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ItemAttributesRequest getAttributes() {
        return attributes;
    }

    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAttributes(ItemAttributesRequest attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsCreateRetailItem catalogsCreateRetailItem = (CatalogsCreateRetailItem) o;
        return Objects.equals(this.itemId, catalogsCreateRetailItem.itemId) &&
            Objects.equals(this.operation, catalogsCreateRetailItem.operation) &&
            Objects.equals(this.attributes, catalogsCreateRetailItem.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, operation, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreateRetailItem {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

