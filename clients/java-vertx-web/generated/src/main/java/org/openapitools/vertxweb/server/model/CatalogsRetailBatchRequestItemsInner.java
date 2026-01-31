package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsCreateRetailItem;
import org.openapitools.vertxweb.server.model.CatalogsDeleteRetailItem;
import org.openapitools.vertxweb.server.model.CatalogsUpdateRetailItem;
import org.openapitools.vertxweb.server.model.CatalogsUpsertRetailItem;
import org.openapitools.vertxweb.server.model.ItemAttributesRequest;
import org.openapitools.vertxweb.server.model.UpdateMaskFieldType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailBatchRequestItemsInner   {
  
  private ItemAttributesRequest attributes;
  private String itemId;


  public enum OperationEnum {
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
  private List<UpdateMaskFieldType> updateMask;
  private Long lastUpdatedTime;

  public CatalogsRetailBatchRequestItemsInner () {

  }

  public CatalogsRetailBatchRequestItemsInner (ItemAttributesRequest attributes, String itemId, OperationEnum operation, List<UpdateMaskFieldType> updateMask, Long lastUpdatedTime) {
    this.attributes = attributes;
    this.itemId = itemId;
    this.operation = operation;
    this.updateMask = updateMask;
    this.lastUpdatedTime = lastUpdatedTime;
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

    
  @JsonProperty("update_mask")
  public List<UpdateMaskFieldType> getUpdateMask() {
    return updateMask;
  }
  public void setUpdateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
  }

    
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }
  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailBatchRequestItemsInner catalogsRetailBatchRequestItemsInner = (CatalogsRetailBatchRequestItemsInner) o;
    return Objects.equals(attributes, catalogsRetailBatchRequestItemsInner.attributes) &&
        Objects.equals(itemId, catalogsRetailBatchRequestItemsInner.itemId) &&
        Objects.equals(operation, catalogsRetailBatchRequestItemsInner.operation) &&
        Objects.equals(updateMask, catalogsRetailBatchRequestItemsInner.updateMask) &&
        Objects.equals(lastUpdatedTime, catalogsRetailBatchRequestItemsInner.lastUpdatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId, operation, updateMask, lastUpdatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailBatchRequestItemsInner {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
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
