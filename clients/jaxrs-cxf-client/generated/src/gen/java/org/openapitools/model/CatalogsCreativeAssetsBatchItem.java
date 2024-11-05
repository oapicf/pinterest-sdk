package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsCreateCreativeAssetsItem;
import org.openapitools.model.CatalogsDeleteCreativeAssetsItem;
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes;
import org.openapitools.model.CatalogsUpdateCreativeAssetsItem;
import org.openapitools.model.CatalogsUpsertCreativeAssetsItem;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Creative assets batch item
 **/
@ApiModel(description="Creative assets batch item")

public class CatalogsCreativeAssetsBatchItem  {
  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog creative assets id in the merchant namespace")
 /**
   * The catalog creative assets id in the merchant namespace
  **/
  private String creativeAssetsId;

public enum OperationEnum {

DELETE(String.valueOf("DELETE"));


    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private OperationEnum operation;

  @ApiModelProperty(required = true, value = "")
  private CatalogsUpdatableCreativeAssetsAttributes attributes;
 /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
  **/
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CatalogsCreativeAssetsBatchItem creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public String getOperation() {
    if (operation == null) {
      return null;
    }
    return operation.value();
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CatalogsCreativeAssetsBatchItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public CatalogsUpdatableCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

  public CatalogsCreativeAssetsBatchItem attributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem = (CatalogsCreativeAssetsBatchItem) o;
    return Objects.equals(this.creativeAssetsId, catalogsCreativeAssetsBatchItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsCreativeAssetsBatchItem.operation) &&
        Objects.equals(this.attributes, catalogsCreativeAssetsBatchItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsBatchItem {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

