package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CreativeAssetsProcessingRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object describing the catalogs creative assets items batch
 */
@ApiModel(description="Object describing the catalogs creative assets items batch")

public class CatalogsCreativeAssetsItemsBatch  {
  
 /**
  * Id of the catalogs items batch
  */
  @ApiModelProperty(example = "595953100599279259", value = "Id of the catalogs items batch")

  private String batchId;

public enum CatalogTypeEnum {

CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private CatalogTypeEnum catalogType;

 /**
  * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  */
  @ApiModelProperty(example = "2024-01-01T20:20Z", value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")

  private Date completedTime;

 /**
  * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  */
  @ApiModelProperty(example = "2024-01-01T20:10:40Z", value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")

  private Date createdTime;

 /**
  * Array with the catalogs items processing records part of the catalogs items batch
  */
  @ApiModelProperty(value = "Array with the catalogs items processing records part of the catalogs items batch")

  @Valid

  private List<@Valid CreativeAssetsProcessingRecord> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private BatchOperationStatus status;
 /**
   * Id of the catalogs items batch
   * @return batchId
  **/
  @JsonProperty("batch_id")
 @Pattern(regexp="^\\d+$")  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public CatalogsCreativeAssetsItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsItemsBatch catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   * @return completedTime
  **/
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }

  public CatalogsCreativeAssetsItemsBatch completedTime(Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

 /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public CatalogsCreativeAssetsItemsBatch createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
   * Array with the catalogs items processing records part of the catalogs items batch
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid CreativeAssetsProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid CreativeAssetsProcessingRecord> items) {
    this.items = items;
  }

  public CatalogsCreativeAssetsItemsBatch items(List<@Valid CreativeAssetsProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsCreativeAssetsItemsBatch addItemsItem(CreativeAssetsProcessingRecord itemsItem) {
    this.items.add(itemsItem);
    return this;
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

  public CatalogsCreativeAssetsItemsBatch status(BatchOperationStatus status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

