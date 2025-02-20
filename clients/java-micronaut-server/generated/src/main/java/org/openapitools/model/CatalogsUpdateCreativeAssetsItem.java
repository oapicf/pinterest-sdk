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
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A creative assets item to be updated.
 */
@Schema(name = "CatalogsUpdateCreativeAssetsItem", description = "A creative assets item to be updated.")
@JsonPropertyOrder({
  CatalogsUpdateCreativeAssetsItem.JSON_PROPERTY_CREATIVE_ASSETS_ID,
  CatalogsUpdateCreativeAssetsItem.JSON_PROPERTY_OPERATION,
  CatalogsUpdateCreativeAssetsItem.JSON_PROPERTY_ATTRIBUTES
})
@JsonTypeName("CatalogsUpdateCreativeAssetsItem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsUpdateCreativeAssetsItem {
    public static final String JSON_PROPERTY_CREATIVE_ASSETS_ID = "creative_assets_id";
    private String creativeAssetsId;

    /**
     * Gets or Sets operation
     */
    public enum OperationEnum {
        UPDATE("UPDATE");

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
    private CatalogsUpdatableCreativeAssetsAttributes attributes;

    public CatalogsUpdateCreativeAssetsItem(String creativeAssetsId, OperationEnum operation, CatalogsUpdatableCreativeAssetsAttributes attributes) {
        this.creativeAssetsId = creativeAssetsId;
        this.operation = operation;
        this.attributes = attributes;
    }

    public CatalogsUpdateCreativeAssetsItem creativeAssetsId(String creativeAssetsId) {
        this.creativeAssetsId = creativeAssetsId;
        return this;
    }

    /**
     * The catalog creative assets item id in the merchant namespace
     * @return creativeAssetsId
     */
    @NotNull
    @Schema(name = "creative_assets_id", example = "DS0294-M", description = "The catalog creative assets item id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_CREATIVE_ASSETS_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCreativeAssetsId() {
        return creativeAssetsId;
    }

    @JsonProperty(JSON_PROPERTY_CREATIVE_ASSETS_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreativeAssetsId(String creativeAssetsId) {
        this.creativeAssetsId = creativeAssetsId;
    }

    public CatalogsUpdateCreativeAssetsItem operation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation
     * @return operation
     */
    @NotNull
    @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public CatalogsUpdateCreativeAssetsItem attributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    @Valid
    @NotNull
    @Schema(name = "attributes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsUpdatableCreativeAssetsAttributes getAttributes() {
        return attributes;
    }

    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAttributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
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
        CatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem = (CatalogsUpdateCreativeAssetsItem) o;
        return Objects.equals(this.creativeAssetsId, catalogsUpdateCreativeAssetsItem.creativeAssetsId) &&
            Objects.equals(this.operation, catalogsUpdateCreativeAssetsItem.operation) &&
            Objects.equals(this.attributes, catalogsUpdateCreativeAssetsItem.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creativeAssetsId, operation, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsUpdateCreativeAssetsItem {\n");
        sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
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

