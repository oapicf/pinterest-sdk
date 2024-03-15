package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemProcessingRecord;



/**
 * Object describing the catalogs retail items batch
 **/

@ApiModel(description = "Object describing the catalogs retail items batch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsRetailItemsBatch   {
  @JsonProperty("batch_id")
  private String batchId;

  @JsonProperty("created_time")
  private Date createdTime;

  @JsonProperty("completed_time")
  private Date completedTime;

  @JsonProperty("status")
  private BatchOperationStatus status;

  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("items")
  private List<ItemProcessingRecord> items = null;

  /**
   * Id of the catalogs items batch
   **/
  public CatalogsRetailItemsBatch batchId(String batchId) {
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
   * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
   **/
  public CatalogsRetailItemsBatch createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD")
  @JsonProperty("created_time")
  public Date getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
   **/
  public CatalogsRetailItemsBatch completedTime(Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-10T15:37:10Z", value = "Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD")
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }
  public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }

  /**
   **/
  public CatalogsRetailItemsBatch status(BatchOperationStatus status) {
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
  public CatalogsRetailItemsBatch catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Array with the catalogs items processing records part of the catalogs items batch
   **/
  public CatalogsRetailItemsBatch items(List<ItemProcessingRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the catalogs items processing records part of the catalogs items batch")
  @JsonProperty("items")
  public List<ItemProcessingRecord> getItems() {
    return items;
  }
  public void setItems(List<ItemProcessingRecord> items) {
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
    CatalogsRetailItemsBatch catalogsRetailItemsBatch = (CatalogsRetailItemsBatch) o;
    return Objects.equals(batchId, catalogsRetailItemsBatch.batchId) &&
        Objects.equals(createdTime, catalogsRetailItemsBatch.createdTime) &&
        Objects.equals(completedTime, catalogsRetailItemsBatch.completedTime) &&
        Objects.equals(status, catalogsRetailItemsBatch.status) &&
        Objects.equals(catalogType, catalogsRetailItemsBatch.catalogType) &&
        Objects.equals(items, catalogsRetailItemsBatch.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, createdTime, completedTime, status, catalogType, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemsBatch {\n");
    
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

