package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ItemAttributesRequest;

/**
 * An item to be created
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreateRetailItem   {
  
  private ItemAttributesRequest attributes;
  private String itemId;


  public enum OperationEnum {
    CREATE("CREATE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OperationEnum operation;

  public CatalogsCreateRetailItem () {

  }

  public CatalogsCreateRetailItem (ItemAttributesRequest attributes, String itemId, OperationEnum operation) {
    this.attributes = attributes;
    this.itemId = itemId;
    this.operation = operation;
  }

    
  @JsonProperty("attributes")
  public ItemAttributesRequest getAttributes() {
    return attributes;
  }
  public void setAttributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
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
    return Objects.equals(attributes, catalogsCreateRetailItem.attributes) &&
        Objects.equals(itemId, catalogsCreateRetailItem.itemId) &&
        Objects.equals(operation, catalogsCreateRetailItem.operation);
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
