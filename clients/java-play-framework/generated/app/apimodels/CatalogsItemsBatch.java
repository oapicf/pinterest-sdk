package apimodels;

import apimodels.BatchOperationStatus;
import apimodels.ItemProcessingRecord;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Object describing the catalogs items batch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-07-01T11:59:57.602846Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsItemsBatch   {
  @JsonProperty("items")
  @Valid

  private List<ItemProcessingRecord> items = null;

  @JsonProperty("batch_id")
  
  private String batchId;

  @JsonProperty("created_time")
  @Valid

  private OffsetDateTime createdTime;

  @JsonProperty("completed_time")
  @Valid

  private OffsetDateTime completedTime;

  @JsonProperty("status")
  @Valid

  private BatchOperationStatus status;

  public CatalogsItemsBatch items(List<ItemProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsBatch addItemsItem(ItemProcessingRecord itemsItem) {
    if (items == null) {
      items = new ArrayList<>();
    }
    items.add(itemsItem);
    return this;
  }

   /**
   * Array with the catalogs items processing records part of the catalogs items batch
   * @return items
  **/
  public List<ItemProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemProcessingRecord> items) {
    this.items = items;
  }

  public CatalogsItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Id of the catalogs items batch
   * @return batchId
  **/
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public CatalogsItemsBatch createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
   * @return createdTime
  **/
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public CatalogsItemsBatch completedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
    return this;
  }

   /**
   * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
   * @return completedTime
  **/
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

  public CatalogsItemsBatch status(BatchOperationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public BatchOperationStatus getStatus() {
    return status;
  }

  public void setStatus(BatchOperationStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsBatch catalogsItemsBatch = (CatalogsItemsBatch) o;
    return Objects.equals(items, catalogsItemsBatch.items) &&
        Objects.equals(batchId, catalogsItemsBatch.batchId) &&
        Objects.equals(createdTime, catalogsItemsBatch.createdTime) &&
        Objects.equals(completedTime, catalogsItemsBatch.completedTime) &&
        Objects.equals(status, catalogsItemsBatch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, batchId, createdTime, completedTime, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsBatch {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

