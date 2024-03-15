package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BatchOperationStatus;
import org.openapitools.server.api.model.CatalogsType;
import org.openapitools.server.api.model.HotelProcessingRecord;

/**
 * Object describing the catalogs hotel items batch
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelItemsBatch   {
  
  private String batchId;
  private OffsetDateTime createdTime;
  private OffsetDateTime completedTime;
  private BatchOperationStatus status;
  private CatalogsType catalogType;
  private List<HotelProcessingRecord> items;

  public CatalogsHotelItemsBatch () {

  }

  public CatalogsHotelItemsBatch (String batchId, OffsetDateTime createdTime, OffsetDateTime completedTime, BatchOperationStatus status, CatalogsType catalogType, List<HotelProcessingRecord> items) {
    this.batchId = batchId;
    this.createdTime = createdTime;
    this.completedTime = completedTime;
    this.status = status;
    this.catalogType = catalogType;
    this.items = items;
  }

    
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

    
  @JsonProperty("created_time")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("completed_time")
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }
  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

    
  @JsonProperty("status")
  public BatchOperationStatus getStatus() {
    return status;
  }
  public void setStatus(BatchOperationStatus status) {
    this.status = status;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("items")
  public List<HotelProcessingRecord> getItems() {
    return items;
  }
  public void setItems(List<HotelProcessingRecord> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelItemsBatch catalogsHotelItemsBatch = (CatalogsHotelItemsBatch) o;
    return Objects.equals(batchId, catalogsHotelItemsBatch.batchId) &&
        Objects.equals(createdTime, catalogsHotelItemsBatch.createdTime) &&
        Objects.equals(completedTime, catalogsHotelItemsBatch.completedTime) &&
        Objects.equals(status, catalogsHotelItemsBatch.status) &&
        Objects.equals(catalogType, catalogsHotelItemsBatch.catalogType) &&
        Objects.equals(items, catalogsHotelItemsBatch.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, createdTime, completedTime, status, catalogType, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemsBatch {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
