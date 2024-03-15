package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsHotelItemsBatch;
import org.openapitools.model.CatalogsRetailItemsBatch;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.HotelProcessingRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelItemsBatch.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailItemsBatch.class, name = "RETAIL"),
})

/**
 * Object describing the catalogs items batch
 */
@ApiModel(description="Object describing the catalogs items batch")

public class CatalogsItemsBatch  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

 /**
  * Id of the catalogs items batch
  */
  @ApiModelProperty(example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", value = "Id of the catalogs items batch")
  private String batchId;

 /**
  * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
  */
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdTime;

 /**
  * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
  */
  @ApiModelProperty(example = "2022-03-10T15:37:10Z", value = "Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date completedTime;

  @ApiModelProperty(value = "")
  @Valid
  private BatchOperationStatus status;

 /**
  * Array with the catalogs items processing records part of the catalogs items batch
  */
  @ApiModelProperty(value = "Array with the catalogs items processing records part of the catalogs items batch")
  @Valid
  private List<@Valid HotelProcessingRecord> items;
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsItemsBatch catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Id of the catalogs items batch
  * @return batchId
  */
  @JsonProperty("batch_id")
  public String getBatchId() {
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
  * Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Date getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CatalogsItemsBatch createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD
  * @return completedTime
  */
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }

  /**
   * Sets the <code>completedTime</code> property.
   * <br><em>N.B. <code>completedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }

  /**
   * Sets the <code>completedTime</code> property.
   * <br><em>N.B. <code>completedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CatalogsItemsBatch completedTime(Date completedTime) {
    this.completedTime = completedTime;
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

 /**
  * Array with the catalogs items processing records part of the catalogs items batch
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid HotelProcessingRecord> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid HotelProcessingRecord> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CatalogsItemsBatch items(List<@Valid HotelProcessingRecord> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CatalogsItemsBatch addItemsItem(HotelProcessingRecord itemsItem) {
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
    CatalogsItemsBatch catalogsItemsBatch = (CatalogsItemsBatch) o;
    return Objects.equals(this.catalogType, catalogsItemsBatch.catalogType) &&
        Objects.equals(this.batchId, catalogsItemsBatch.batchId) &&
        Objects.equals(this.createdTime, catalogsItemsBatch.createdTime) &&
        Objects.equals(this.completedTime, catalogsItemsBatch.completedTime) &&
        Objects.equals(this.status, catalogsItemsBatch.status) &&
        Objects.equals(this.items, catalogsItemsBatch.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, batchId, createdTime, completedTime, status, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsBatch {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

