package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ItemAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * An item to be upserted
 */
@ApiModel(description = "An item to be upserted")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsUpsertRetailItem   {
  @JsonProperty("item_id")
  private String itemId;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    CREATE("CREATE"),
    
    UPDATE("UPDATE"),
    
    UPSERT("UPSERT"),
    
    DELETE("DELETE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation;

  @JsonProperty("attributes")
  private ItemAttributes attributes;

  public CatalogsUpsertRetailItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The catalog item id in the merchant namespace
   * @return itemId
  **/
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsUpsertRetailItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CatalogsUpsertRetailItem attributes(ItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "")
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
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
    CatalogsUpsertRetailItem catalogsUpsertRetailItem = (CatalogsUpsertRetailItem) o;
    return Objects.equals(this.itemId, catalogsUpsertRetailItem.itemId) &&
        Objects.equals(this.operation, catalogsUpsertRetailItem.operation) &&
        Objects.equals(this.attributes, catalogsUpsertRetailItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpsertRetailItem {\n");
    
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

