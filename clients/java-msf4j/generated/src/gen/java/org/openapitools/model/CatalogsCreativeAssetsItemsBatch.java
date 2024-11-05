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
import org.openapitools.model.CreativeAssetsProcessingRecord;

/**
 * Object describing the catalogs creative assets items batch
 */
@ApiModel(description = "Object describing the catalogs creative assets items batch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsItemsBatch   {
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
  private List<@Valid CreativeAssetsProcessingRecord> items = null;

  public CatalogsCreativeAssetsItemsBatch batchId(String batchId) {
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

   /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
   * @return createdTime
  **/
  @ApiModelProperty(value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  public Date getCreatedTime() {
    return createdTime;
  }

   /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
   * @return completedTime
  **/
  @ApiModelProperty(value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
  public Date getCompletedTime() {
    return completedTime;
  }

  public CatalogsCreativeAssetsItemsBatch status(BatchOperationStatus status) {
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

  public CatalogsCreativeAssetsItemsBatch catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsItemsBatch items(List<@Valid CreativeAssetsProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsCreativeAssetsItemsBatch addItemsItem(CreativeAssetsProcessingRecord itemsItem) {
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
  public List<@Valid CreativeAssetsProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid CreativeAssetsProcessingRecord> items) {
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

