package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.UpdatableItemAttributes;
import org.openapitools.vertxweb.server.model.UpdateMaskFieldType;

/**
 * An item to be updated
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsUpdateRetailItem   {
  
  private String itemId;


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
      return value;
    }
  }

  private OperationEnum operation;
  private UpdatableItemAttributes attributes;
  private List<UpdateMaskFieldType> updateMask;

  public CatalogsUpdateRetailItem () {

  }

  public CatalogsUpdateRetailItem (String itemId, OperationEnum operation, UpdatableItemAttributes attributes, List<UpdateMaskFieldType> updateMask) {
    this.itemId = itemId;
    this.operation = operation;
    this.attributes = attributes;
    this.updateMask = updateMask;
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

    
  @JsonProperty("attributes")
  public UpdatableItemAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("update_mask")
  public List<UpdateMaskFieldType> getUpdateMask() {
    return updateMask;
  }
  public void setUpdateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsUpdateRetailItem catalogsUpdateRetailItem = (CatalogsUpdateRetailItem) o;
    return Objects.equals(itemId, catalogsUpdateRetailItem.itemId) &&
        Objects.equals(operation, catalogsUpdateRetailItem.operation) &&
        Objects.equals(attributes, catalogsUpdateRetailItem.attributes) &&
        Objects.equals(updateMask, catalogsUpdateRetailItem.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, operation, attributes, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdateRetailItem {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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
