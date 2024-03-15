package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.HotelProcessingRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing the catalogs hotel items batch
 */
@ApiModel(description="Object describing the catalogs hotel items batch")

public class CatalogsHotelItemsBatch  {
  
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

 /**
  * Array with the catalogs items processing records part of the catalogs items batch
  */
  @ApiModelProperty(value = "Array with the catalogs items processing records part of the catalogs items batch")
  @Valid
  private List<@Valid HotelProcessingRecord> items;
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
  public CatalogsHotelItemsBatch batchId(String batchId) {
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
  public CatalogsHotelItemsBatch createdTime(Date createdTime) {
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
  public CatalogsHotelItemsBatch completedTime(Date completedTime) {
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
  public CatalogsHotelItemsBatch status(BatchOperationStatus status) {
    this.status = status;
    return this;
  }

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
  public CatalogsHotelItemsBatch catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
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
  public CatalogsHotelItemsBatch items(List<@Valid HotelProcessingRecord> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CatalogsHotelItemsBatch addItemsItem(HotelProcessingRecord itemsItem) {
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
    CatalogsHotelItemsBatch catalogsHotelItemsBatch = (CatalogsHotelItemsBatch) o;
    return Objects.equals(this.batchId, catalogsHotelItemsBatch.batchId) &&
        Objects.equals(this.createdTime, catalogsHotelItemsBatch.createdTime) &&
        Objects.equals(this.completedTime, catalogsHotelItemsBatch.completedTime) &&
        Objects.equals(this.status, catalogsHotelItemsBatch.status) &&
        Objects.equals(this.catalogType, catalogsHotelItemsBatch.catalogType) &&
        Objects.equals(this.items, catalogsHotelItemsBatch.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, createdTime, completedTime, status, catalogType, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemsBatch {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

