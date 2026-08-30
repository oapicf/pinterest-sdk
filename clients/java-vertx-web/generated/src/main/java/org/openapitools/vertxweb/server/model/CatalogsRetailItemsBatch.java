package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BatchOperationStatus;
import org.openapitools.vertxweb.server.model.ItemProcessingRecord;

/**
 * Object describing the catalogs retail items batch
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailItemsBatch   {
  
  private String batchId;


  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private OffsetDateTime completedTime;
  private OffsetDateTime createdTime;
  private List<ItemProcessingRecord> items = new ArrayList<>();
  private BatchOperationStatus status;

  public CatalogsRetailItemsBatch () {

  }

  public CatalogsRetailItemsBatch (String batchId, CatalogTypeEnum catalogType, OffsetDateTime completedTime, OffsetDateTime createdTime, List<ItemProcessingRecord> items, BatchOperationStatus status) {
    this.batchId = batchId;
    this.catalogType = catalogType;
    this.completedTime = completedTime;
    this.createdTime = createdTime;
    this.items = items;
    this.status = status;
  }

    
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("completed_time")
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }
  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

    
  @JsonProperty("created_time")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("items")
  public List<ItemProcessingRecord> getItems() {
    return items;
  }
  public void setItems(List<ItemProcessingRecord> items) {
    this.items = items;
  }

    
  @JsonProperty("status")
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
    CatalogsRetailItemsBatch catalogsRetailItemsBatch = (CatalogsRetailItemsBatch) o;
    return Objects.equals(batchId, catalogsRetailItemsBatch.batchId) &&
        Objects.equals(catalogType, catalogsRetailItemsBatch.catalogType) &&
        Objects.equals(completedTime, catalogsRetailItemsBatch.completedTime) &&
        Objects.equals(createdTime, catalogsRetailItemsBatch.createdTime) &&
        Objects.equals(items, catalogsRetailItemsBatch.items) &&
        Objects.equals(status, catalogsRetailItemsBatch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, catalogType, completedTime, createdTime, items, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemsBatch {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
