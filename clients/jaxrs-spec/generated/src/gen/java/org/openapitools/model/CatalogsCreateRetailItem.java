package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAttributesRequest;
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
 * An item to be created
 **/
@ApiModel(description = "An item to be created")
@JsonTypeName("CatalogsCreateRetailItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsCreateRetailItem   {
  private ItemAttributesRequest attributes;
  private String itemId;
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

  public CatalogsCreateRetailItem() {
  }

  @JsonCreator
  public CatalogsCreateRetailItem(
    @JsonProperty(required = true, value = "attributes") ItemAttributesRequest attributes,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "operation") OperationEnum operation
  ) {
    this.attributes = attributes;
    this.itemId = itemId;
    this.operation = operation;
  }

  /**
   **/
  public CatalogsCreateRetailItem attributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "attributes")
  @NotNull @Valid public ItemAttributesRequest getAttributes() {
    return attributes;
  }

  @JsonProperty(required = true, value = "attributes")
  public void setAttributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
  }

  /**
   * The catalog item id in the merchant namespace
   **/
  public CatalogsCreateRetailItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog item id in the merchant namespace")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  public CatalogsCreateRetailItem operation(OperationEnum operation) {
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
    CatalogsCreateRetailItem catalogsCreateRetailItem = (CatalogsCreateRetailItem) o;
    return Objects.equals(this.attributes, catalogsCreateRetailItem.attributes) &&
        Objects.equals(this.itemId, catalogsCreateRetailItem.itemId) &&
        Objects.equals(this.operation, catalogsCreateRetailItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreateRetailItem {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
