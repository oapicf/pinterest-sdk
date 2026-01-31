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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsHotelItemsBatch implements CatalogsItemsBatch {

  private @Nullable String batchId;

  private CatalogsType catalogType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> completedTime = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdTime;

  @Valid
  private List<@Valid HotelProcessingRecord> items = new ArrayList<>();

  private @Nullable BatchOperationStatus status;

  public CatalogsHotelItemsBatch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsHotelItemsBatch(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelItemsBatch batchId(@Nullable String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Id of the catalogs items batch
   * @return batchId
   */
  
  @Schema(name = "batch_id", example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", description = "Id of the catalogs items batch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batch_id")
  public @Nullable String getBatchId() {
    return batchId;
  }

  public void setBatchId(@Nullable String batchId) {
    this.batchId = batchId;
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

  public CatalogsHotelItemsBatch completedTime(OffsetDateTime completedTime) {
    this.completedTime = JsonNullable.of(completedTime);
    return this;
  }

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
   * @return completedTime
   */
  @Valid 
  @Schema(name = "completed_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_time")
  public JsonNullable<OffsetDateTime> getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(JsonNullable<OffsetDateTime> completedTime) {
    this.completedTime = completedTime;
  }

  public CatalogsHotelItemsBatch createdTime(@Nullable OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
   * @return createdTime
   */
  @Valid 
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public @Nullable OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(@Nullable OffsetDateTime createdTime) {
    this.createdTime = createdTime;
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

  public CatalogsHotelItemsBatch status(@Nullable BatchOperationStatus status) {
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
  public @Nullable BatchOperationStatus getStatus() {
    return status;
  }

  public void setStatus(@Nullable BatchOperationStatus status) {
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
    CatalogsHotelItemsBatch catalogsHotelItemsBatch = (CatalogsHotelItemsBatch) o;
    return Objects.equals(this.batchId, catalogsHotelItemsBatch.batchId) &&
        Objects.equals(this.catalogType, catalogsHotelItemsBatch.catalogType) &&
        equalsNullable(this.completedTime, catalogsHotelItemsBatch.completedTime) &&
        Objects.equals(this.createdTime, catalogsHotelItemsBatch.createdTime) &&
        Objects.equals(this.items, catalogsHotelItemsBatch.items) &&
        Objects.equals(this.status, catalogsHotelItemsBatch.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, catalogType, hashCodeNullable(completedTime), createdTime, items, status);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

