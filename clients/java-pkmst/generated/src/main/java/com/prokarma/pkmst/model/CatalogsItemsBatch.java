package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BatchOperationStatus;
import com.prokarma.pkmst.model.ItemProcessingRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Object describing the catalogs items batch
 */
@ApiModel(description = "Object describing the catalogs items batch")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-07T06:39:36.253940Z[Etc/UTC]")
public class CatalogsItemsBatch   {
  @JsonProperty("items")
  
  private List<ItemProcessingRecord> items = null;

  @JsonProperty("batch_id")
  private String batchId;

  @JsonProperty("created_time")
  private OffsetDateTime createdTime;

  @JsonProperty("completed_time")
  private OffsetDateTime completedTime;

  @JsonProperty("status")
  private BatchOperationStatus status;

  public CatalogsItemsBatch items(List<ItemProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsBatch addItemsItem(ItemProcessingRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array with the catalogs items processing records part of the catalogs items batch
   * @return items
  **/
  @ApiModelProperty(value = "Array with the catalogs items processing records part of the catalogs items batch")
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
  @ApiModelProperty(example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", value = "Id of the catalogs items batch")
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
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", readOnly = true, value = "Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD")
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
  @ApiModelProperty(example = "2022-03-10T15:37:10Z", readOnly = true, value = "Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.items, catalogsItemsBatch.items) &&
        Objects.equals(this.batchId, catalogsItemsBatch.batchId) &&
        Objects.equals(this.createdTime, catalogsItemsBatch.createdTime) &&
        Objects.equals(this.completedTime, catalogsItemsBatch.completedTime) &&
        Objects.equals(this.status, catalogsItemsBatch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, batchId, createdTime, completedTime, status);
  }

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

