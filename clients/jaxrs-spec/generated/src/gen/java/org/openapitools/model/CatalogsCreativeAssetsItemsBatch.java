package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CreativeAssetsProcessingRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Object describing the catalogs creative assets items batch
 **/
@ApiModel(description = "Object describing the catalogs creative assets items batch")
@JsonTypeName("CatalogsCreativeAssetsItemsBatch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsCreativeAssetsItemsBatch   {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CatalogTypeEnum fromString(String s) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private CatalogTypeEnum catalogType;
  private Date completedTime;
  private Date createdTime;
  private @Valid List<@Valid CreativeAssetsProcessingRecord> items = new ArrayList<>();
  private BatchOperationStatus status;

  public CatalogsCreativeAssetsItemsBatch() {
  }

  @JsonCreator
  public CatalogsCreativeAssetsItemsBatch(
    @JsonProperty(required = true, value = "catalog_type") CatalogTypeEnum catalogType
  ) {
    this.catalogType = catalogType;
  }

  /**
   * Id of the catalogs items batch
   **/
  public CatalogsCreativeAssetsItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  
  @ApiModelProperty(example = "595953100599279259", value = "Id of the catalogs items batch")
  @JsonProperty("batch_id")
   @Pattern(regexp="^\\d+$")public String getBatchId() {
    return batchId;
  }

  @JsonProperty("batch_id")
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   **/
  public CatalogsCreativeAssetsItemsBatch catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "catalog_type")
  @NotNull public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  @JsonProperty(required = true, value = "catalog_type")
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   **/
  public CatalogsCreativeAssetsItemsBatch completedTime(Date completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  
  @ApiModelProperty(example = "2024-01-01T20:20Z", value = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss")
  @JsonProperty("completed_time")
  public Date getCompletedTime() {
    return completedTime;
  }

  @JsonProperty("completed_time")
  public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
   **/
  public CatalogsCreativeAssetsItemsBatch createdTime(Date createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "2024-01-01T20:10:40Z", value = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss")
  @JsonProperty("created_time")
  public Date getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
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
  @Valid public List<@Valid CreativeAssetsProcessingRecord> getItems() {
    return items;
  }

  @JsonProperty("items")
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

  public CatalogsCreativeAssetsItemsBatch removeItemsItem(CreativeAssetsProcessingRecord itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

    return this;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
