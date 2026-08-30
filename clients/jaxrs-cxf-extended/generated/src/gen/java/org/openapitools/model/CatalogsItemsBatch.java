package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsCreativeAssetsItemsBatch;
import org.openapitools.model.CatalogsHotelItemsBatch;
import org.openapitools.model.CatalogsRetailItemsBatch;
import org.openapitools.model.CreativeAssetsProcessingRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsItemsBatch.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelItemsBatch.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailItemsBatch.class, name = "RETAIL"),
})

/**
 * Object describing the catalogs items batch
 */
@ApiModel(description="Object describing the catalogs items batch")

public class CatalogsItemsBatch  {
  
 /**
  * Id of the catalogs items batch
  */
  @ApiModelProperty(example = "595953100599279259", value = "Id of the catalogs items batch")
  private String batchId;

public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));

    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date completedTime;

 /**
  * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  */
  @ApiModelProperty(example = "2024-01-01T20:10:40Z", required = true, value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
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
  */
  @JsonProperty("batch_id")
 @Pattern(regexp="^\\d+$")  public String getBatchId() {
    return batchId;
  }

  /**
   * Sets the <code>batchId</code> property.
   */
 public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   * Sets the <code>batchId</code> property.
   */
  public CatalogsItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsItemsBatch catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
  * @return completedTime
  */
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }

  /**
   * Sets the <code>completedTime</code> property.
   */
 public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }

  /**
   * Sets the <code>completedTime</code> property.
   */
  public CatalogsItemsBatch completedTime(Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

 /**
  * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
  * @return createdTime
  */
  @JsonProperty("created_time")
  @NotNull
  public Date getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public CatalogsItemsBatch createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Array with the catalogs items processing records part of the catalogs items batch
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid CreativeAssetsProcessingRecord> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid CreativeAssetsProcessingRecord> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CatalogsItemsBatch items(List<@Valid CreativeAssetsProcessingRecord> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CatalogsItemsBatch addItemsItem(CreativeAssetsProcessingRecord itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public BatchOperationStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(BatchOperationStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CatalogsItemsBatch status(BatchOperationStatus status) {
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
    CatalogsItemsBatch catalogsItemsBatch = (CatalogsItemsBatch) o;
    return Objects.equals(this.batchId, catalogsItemsBatch.batchId) &&
        Objects.equals(this.catalogType, catalogsItemsBatch.catalogType) &&
        Objects.equals(this.completedTime, catalogsItemsBatch.completedTime) &&
        Objects.equals(this.createdTime, catalogsItemsBatch.createdTime) &&
        Objects.equals(this.items, catalogsItemsBatch.items) &&
        Objects.equals(this.status, catalogsItemsBatch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, catalogType, completedTime, createdTime, items, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsBatch {\n");
    
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

