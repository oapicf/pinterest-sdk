package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A creative assets item to be updated.
 **/
@ApiModel(description="A creative assets item to be updated.")

public class CatalogsUpdateCreativeAssetsItem  {
  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog creative assets item id in the merchant namespace")
 /**
   * The catalog creative assets item id in the merchant namespace
  **/
  private String creativeAssetsId;

public enum OperationEnum {

UPDATE(String.valueOf("UPDATE"));


    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(required = true, value = "")
  private OperationEnum operation;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsUpdatableCreativeAssetsAttributes attributes;
 /**
   * The catalog creative assets item id in the merchant namespace
   * @return creativeAssetsId
  **/
  @JsonProperty("creative_assets_id")
  @NotNull
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CatalogsUpdateCreativeAssetsItem creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    if (operation == null) {
      return null;
    }
    return operation.value();
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CatalogsUpdateCreativeAssetsItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  @NotNull
  public CatalogsUpdatableCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

  public CatalogsUpdateCreativeAssetsItem attributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

