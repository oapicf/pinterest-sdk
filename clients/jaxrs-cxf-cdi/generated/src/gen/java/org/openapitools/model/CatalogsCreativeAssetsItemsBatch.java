package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.CreativeAssetsProcessingRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object describing the catalogs creative assets items batch
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Object describing the catalogs creative assets items batch")
public class CatalogsCreativeAssetsItemsBatch   {
  
  private String batchId;

  private java.util.Date createdTime;

  private java.util.Date completedTime;

  private BatchOperationStatus status;

  private CatalogsType catalogType;

  private List<@Valid CreativeAssetsProcessingRecord> items = new ArrayList<>();

  /**
   * Id of the catalogs items batch
   **/
  public CatalogsCreativeAssetsItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  
  @ApiModelProperty(example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", value = "Id of the catalogs items batch")
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   **/
  public CatalogsCreativeAssetsItemsBatch createdTime(java.util.Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  @JsonProperty("created_time")
  public java.util.Date getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(java.util.Date createdTime) {
    this.createdTime = createdTime;
  }


  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   **/
  public CatalogsCreativeAssetsItemsBatch completedTime(java.util.Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
  @JsonProperty("completed_time")
  public java.util.Date getCompletedTime() {
    return completedTime;
  }
  public void setCompletedTime(java.util.Date completedTime) {
    this.completedTime = completedTime;
  }


  /**
   **/
  public CatalogsCreativeAssetsItemsBatch status(BatchOperationStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public BatchOperationStatus getStatus() {
    return status;
  }
  public void setStatus(BatchOperationStatus status) {
    this.status = status;
  }


  /**
   **/
  public CatalogsCreativeAssetsItemsBatch catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }


  /**
   * Array with the catalogs items processing records part of the catalogs items batch
   **/
  public CatalogsCreativeAssetsItemsBatch items(List<@Valid CreativeAssetsProcessingRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the catalogs items processing records part of the catalogs items batch")
  @JsonProperty("items")
  public List<@Valid CreativeAssetsProcessingRecord> getItems() {
    return items;
  }
  public void setItems(List<@Valid CreativeAssetsProcessingRecord> items) {
    this.items = items;
  }

  public CatalogsCreativeAssetsItemsBatch addItemsItem(CreativeAssetsProcessingRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
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
        Objects.equals(this.createdTime, catalogsCreativeAssetsItemsBatch.createdTime) &&
        Objects.equals(this.completedTime, catalogsCreativeAssetsItemsBatch.completedTime) &&
        Objects.equals(this.status, catalogsCreativeAssetsItemsBatch.status) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsItemsBatch.catalogType) &&
        Objects.equals(this.items, catalogsCreativeAssetsItemsBatch.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, createdTime, completedTime, status, catalogType, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemsBatch {\n");
    
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

