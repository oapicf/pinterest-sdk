package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.ItemProcessingRecord;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing the catalogs items batch
 **/
@ApiModel(description="Object describing the catalogs items batch")
public class CatalogsItemsBatch  {
  
  @ApiModelProperty(value = "Array with the catalogs items processing records part of the catalogs items batch")
 /**
   * Array with the catalogs items processing records part of the catalogs items batch
  **/
  private List<ItemProcessingRecord> items = null;

  @ApiModelProperty(example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", value = "Id of the catalogs items batch")
 /**
   * Id of the catalogs items batch
  **/
  private String batchId;

  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD")
 /**
   * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
  **/
  private Date createdTime;

  @ApiModelProperty(example = "2022-03-10T15:37:10Z", value = "Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD")
 /**
   * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
  **/
  private Date completedTime;

  @ApiModelProperty(value = "")
  private BatchOperationStatus status;
 /**
   * Array with the catalogs items processing records part of the catalogs items batch
   * @return items
  **/
  @JsonProperty("items")
  public List<ItemProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemProcessingRecord> items) {
    this.items = items;
  }

  public CatalogsItemsBatch items(List<ItemProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsBatch addItemsItem(ItemProcessingRecord itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Id of the catalogs items batch
   * @return batchId
  **/
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public CatalogsItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
   * Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Date getCreatedTime() {
    return createdTime;
  }


 /**
   * Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
   * @return completedTime
  **/
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }


 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public BatchOperationStatus getStatus() {
    return status;
  }

  public void setStatus(BatchOperationStatus status) {
    this.status = status;
  }

  public CatalogsItemsBatch status(BatchOperationStatus status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

