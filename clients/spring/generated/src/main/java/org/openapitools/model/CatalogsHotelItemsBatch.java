package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.HotelProcessingRecord;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing the catalogs hotel items batch
 */

@Schema(name = "CatalogsHotelItemsBatch", description = "Object describing the catalogs hotel items batch")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelItemsBatch implements CatalogsItemsBatch {

  private String batchId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> completedTime = JsonNullable.<OffsetDateTime>undefined();

  private BatchOperationStatus status;

  private CatalogsType catalogType;

  @Valid
  private List<@Valid HotelProcessingRecord> items;

  public CatalogsHotelItemsBatch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsHotelItemsBatch(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Id of the catalogs items batch
   * @return batchId
  */
  
  @Schema(name = "batch_id", example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", description = "Id of the catalogs items batch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public CatalogsHotelItemsBatch createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
   * @return createdTime
  */
  @Valid 
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, example = "2020-01-01T20:10:40Z", description = "Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public CatalogsHotelItemsBatch completedTime(OffsetDateTime completedTime) {
    this.completedTime = JsonNullable.of(completedTime);
    return this;
  }

  /**
   * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
   * @return completedTime
  */
  @Valid 
  @Schema(name = "completed_time", accessMode = Schema.AccessMode.READ_ONLY, example = "2022-03-10T15:37:10Z", description = "Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_time")
  public JsonNullable<OffsetDateTime> getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(JsonNullable<OffsetDateTime> completedTime) {
    this.completedTime = completedTime;
  }

  public CatalogsHotelItemsBatch status(BatchOperationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public BatchOperationStatus getStatus() {
    return status;
  }

  public void setStatus(BatchOperationStatus status) {
    this.status = status;
  }

  public CatalogsHotelItemsBatch catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
  */
  @NotNull @Valid 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelItemsBatch items(List<@Valid HotelProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsHotelItemsBatch addItemsItem(HotelProcessingRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array with the catalogs items processing records part of the catalogs items batch
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Array with the catalogs items processing records part of the catalogs items batch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid HotelProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid HotelProcessingRecord> items) {
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
    CatalogsHotelItemsBatch catalogsHotelItemsBatch = (CatalogsHotelItemsBatch) o;
    return Objects.equals(this.batchId, catalogsHotelItemsBatch.batchId) &&
        Objects.equals(this.createdTime, catalogsHotelItemsBatch.createdTime) &&
        equalsNullable(this.completedTime, catalogsHotelItemsBatch.completedTime) &&
        Objects.equals(this.status, catalogsHotelItemsBatch.status) &&
        Objects.equals(this.catalogType, catalogsHotelItemsBatch.catalogType) &&
        Objects.equals(this.items, catalogsHotelItemsBatch.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, createdTime, hashCodeNullable(completedTime), status, catalogType, items);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

