package org.openapitools.model;

import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CreativeAssetsProcessingRecord;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object describing the catalogs creative assets items batch
 */
public class CatalogsCreativeAssetsItemsBatch implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Id of the catalogs items batch
   */
  @JsonProperty("batch_id")
  private String batchId;

  @JsonProperty("catalog_type")
  private String catalogType;

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   */
  @JsonProperty("completed_time")
  private OffsetDateTime completedTime;

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   */
  @JsonProperty("created_time")
  private OffsetDateTime createdTime;

  /**
   * Array with the catalogs items processing records part of the catalogs items batch
   */
  @JsonProperty("items")
  private List<CreativeAssetsProcessingRecord> items = new ArrayList<>();

  @JsonProperty("status")
  private BatchOperationStatus status;

  /**
   * Id of the catalogs items batch
   * @return batchId
   */
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   * @return completedTime
   */
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   * @return createdTime
   */
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Array with the catalogs items processing records part of the catalogs items batch
   * @return items
   */
  public List<CreativeAssetsProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<CreativeAssetsProcessingRecord> items) {
    this.items = items;
  }

  /**
   * 
   * @return status
   */
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
    CatalogsCreativeAssetsItemsBatch catalogsCreativeAssetsItemsBatch = (CatalogsCreativeAssetsItemsBatch) o;
    return Objects.equals(this.batchId, catalogsCreativeAssetsItemsBatch.batchId) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsItemsBatch.catalogType) &&
        Objects.equals(this.completedTime, catalogsCreativeAssetsItemsBatch.completedTime) &&
        Objects.equals(this.createdTime, catalogsCreativeAssetsItemsBatch.createdTime) &&
        Objects.equals(this.items, catalogsCreativeAssetsItemsBatch.items) &&
        Objects.equals(this.status, catalogsCreativeAssetsItemsBatch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, catalogType, completedTime, createdTime, items, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemsBatch {\n");
    
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
