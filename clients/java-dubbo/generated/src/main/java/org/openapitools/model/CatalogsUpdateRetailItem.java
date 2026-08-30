package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UpdatableItemAttributes;
import org.openapitools.model.UpdateMaskFieldType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * An item to be updated
 */
public class CatalogsUpdateRetailItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private UpdatableItemAttributes attributes;

  /**
   * The catalog item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("operation")
  private String operation;

  /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   */
  @JsonProperty("update_mask")
  private List<UpdateMaskFieldType> updateMask;

  /**
   * 
   * @return attributes
   */
  public UpdatableItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * 
   * @return operation
   */
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   * @return updateMask
   */
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
    return Objects.equals(this.attributes, catalogsUpdateRetailItem.attributes) &&
        Objects.equals(this.itemId, catalogsUpdateRetailItem.itemId) &&
        Objects.equals(this.operation, catalogsUpdateRetailItem.operation) &&
        Objects.equals(this.updateMask, catalogsUpdateRetailItem.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId, operation, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdateRetailItem {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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
