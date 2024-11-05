package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A creative assets item to be created.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A creative assets item to be created.")
public class CatalogsCreateCreativeAssetsItem   {
  
  private String creativeAssetsId;


public enum OperationEnum {

    @JsonProperty("CREATE") CREATE(String.valueOf("CREATE"));


    private String value;

    OperationEnum(String v) {
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

  private OperationEnum operation;

  private CatalogsCreativeAssetsAttributes attributes;

  /**
   * The catalog creative assets id in the merchant namespace
   **/
  public CatalogsCreateCreativeAssetsItem creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog creative assets id in the merchant namespace")
  @JsonProperty("creative_assets_id")
  @NotNull
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }


  /**
   **/
  public CatalogsCreateCreativeAssetsItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  /**
   **/
  public CatalogsCreateCreativeAssetsItem attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attributes")
  @NotNull
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
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
    CatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem = (CatalogsCreateCreativeAssetsItem) o;
    return Objects.equals(this.creativeAssetsId, catalogsCreateCreativeAssetsItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsCreateCreativeAssetsItem.operation) &&
        Objects.equals(this.attributes, catalogsCreateCreativeAssetsItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreateCreativeAssetsItem {\n");
    
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

