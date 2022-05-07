package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.ItemProcessingRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object describing the catalogs items batch
 **/
@ApiModel(description = "Object describing the catalogs items batch")
@JsonTypeName("CatalogsItemsBatch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class CatalogsItemsBatch   {
  
  private @Valid List<ItemProcessingRecord> items = new ArrayList<ItemProcessingRecord>();
  private @Valid String batchId;
  private @Valid Date createdTime;
  private @Valid Date completedTime;
  private @Valid BatchOperationStatus status;

  /**
   * Array with the catalogs items processing records part of the catalogs items batch
   **/
  public CatalogsItemsBatch items(List<ItemProcessingRecord> items) {
    this.items = items;
    return this;
  }

  

  
  @ApiModelProperty(value = "Array with the catalogs items processing records part of the catalogs items batch")
  @JsonProperty("items")
  public List<ItemProcessingRecord> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<ItemProcessingRecord> items) {
    this.items = items;
  }

  public CatalogsItemsBatch addItemsItem(ItemProcessingRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemProcessingRecord>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public CatalogsItemsBatch removeItemsItem(ItemProcessingRecord itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

    return this;
  }
/**
   * Id of the catalogs items batch
   **/
  public CatalogsItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  

  
  @ApiModelProperty(example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", value = "Id of the catalogs items batch")
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }

  @JsonProperty("batch_id")
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

/**
   * Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
   **/
  public CatalogsItemsBatch createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD")
  @JsonProperty("created_time")
  public Date getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

/**
   * Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
   **/
  public CatalogsItemsBatch completedTime(Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "2022-03-10T15:37:10Z", value = "Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD")
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }

  @JsonProperty("completed_time")
  public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }

/**
   **/
  public CatalogsItemsBatch status(BatchOperationStatus status) {
    this.status = status;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public BatchOperationStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
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

