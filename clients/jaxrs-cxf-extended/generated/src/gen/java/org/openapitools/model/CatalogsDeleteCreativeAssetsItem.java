package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A creative assets item to be deleted
 */
@ApiModel(description="A creative assets item to be deleted")

public class CatalogsDeleteCreativeAssetsItem  {
  
 /**
  * The catalog creative assets id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog creative assets id in the merchant namespace")
  private String creativeAssetsId;

public enum OperationEnum {

    @JsonProperty("DELETE") DELETE(String.valueOf("DELETE"));

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
 /**
  * The catalog creative assets id in the merchant namespace
  * @return creativeAssetsId
  */
  @JsonProperty("creative_assets_id")
  @NotNull
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  /**
   * Sets the <code>creativeAssetsId</code> property.
   */
 public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   * Sets the <code>creativeAssetsId</code> property.
   */
  public CatalogsDeleteCreativeAssetsItem creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    return operation == null ? null : operation.value();
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public CatalogsDeleteCreativeAssetsItem operation(OperationEnum operation) {
    this.operation = operation;
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
    CatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem = (CatalogsDeleteCreativeAssetsItem) o;
    return Objects.equals(this.creativeAssetsId, catalogsDeleteCreativeAssetsItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsDeleteCreativeAssetsItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsDeleteCreativeAssetsItem {\n");
    
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

