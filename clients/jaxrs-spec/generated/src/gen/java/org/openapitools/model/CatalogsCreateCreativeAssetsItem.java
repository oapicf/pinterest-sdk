package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A creative assets item to be created.
 **/
@ApiModel(description = "A creative assets item to be created.")
@JsonTypeName("CatalogsCreateCreativeAssetsItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsCreateCreativeAssetsItem   {
  private CatalogsCreativeAssetsAttributes attributes;
  private String creativeAssetsId;
  public enum OperationEnum {

    CREATE(String.valueOf("CREATE"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OperationEnum fromString(String s) {
        for (OperationEnum b : OperationEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private OperationEnum operation;

  public CatalogsCreateCreativeAssetsItem() {
  }

  @JsonCreator
  public CatalogsCreateCreativeAssetsItem(
    @JsonProperty(required = true, value = "attributes") CatalogsCreativeAssetsAttributes attributes,
    @JsonProperty(required = true, value = "creative_assets_id") String creativeAssetsId,
    @JsonProperty(required = true, value = "operation") OperationEnum operation
  ) {
    this.attributes = attributes;
    this.creativeAssetsId = creativeAssetsId;
    this.operation = operation;
  }

  /**
   **/
  public CatalogsCreateCreativeAssetsItem attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "attributes")
  @NotNull @Valid public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  @JsonProperty(required = true, value = "attributes")
  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * The catalog creative assets id in the merchant namespace
   **/
  public CatalogsCreateCreativeAssetsItem creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog creative assets id in the merchant namespace")
  @JsonProperty(required = true, value = "creative_assets_id")
  @NotNull public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  @JsonProperty(required = true, value = "creative_assets_id")
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
  @JsonProperty(required = true, value = "operation")
  @NotNull public OperationEnum getOperation() {
    return operation;
  }

  @JsonProperty(required = true, value = "operation")
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
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
    return Objects.equals(this.attributes, catalogsCreateCreativeAssetsItem.attributes) &&
        Objects.equals(this.creativeAssetsId, catalogsCreateCreativeAssetsItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsCreateCreativeAssetsItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, creativeAssetsId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreateCreativeAssetsItem {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

