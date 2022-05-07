package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.ItemProcessingRecord;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing the catalogs items batch
 */

@Schema(name = "CatalogsItemsBatch", description = "Object describing the catalogs items batch")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
public class CatalogsItemsBatch   {

  @JsonProperty("items")
  @Valid
  private List<ItemProcessingRecord> items = null;

  @JsonProperty("batch_id")
  private String batchId;

  @JsonProperty("created_time")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdTime;

  @JsonProperty("completed_time")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> completedTime = JsonNullable.undefined();

  @JsonProperty("status")
  private BatchOperationStatus status;

  public CatalogsItemsBatch items(List<ItemProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsBatch addItemsItem(ItemProcessingRecord itemsItem) {
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
  @Schema(name = "items", description = "Array with the catalogs items processing records part of the catalogs items batch", required = false)
  public List<ItemProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemProcessingRecord> items) {
    this.items = items;
  }

  public CatalogsItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Id of the catalogs items batch
   * @return batchId
  */
  
  @Schema(name = "batch_id", example = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e", description = "Id of the catalogs items batch", required = false)
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public CatalogsItemsBatch createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
   * @return createdTime
  */
  @Valid 
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, example = "2020-01-01T20:10:40Z", description = "Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD", required = false)
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public CatalogsItemsBatch completedTime(OffsetDateTime completedTime) {
    this.completedTime = JsonNullable.of(completedTime);
    return this;
  }

  /**
   * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
   * @return completedTime
  */
  @Valid 
  @Schema(name = "completed_time", accessMode = Schema.AccessMode.READ_ONLY, example = "2022-03-10T15:37:10Z", description = "Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD", required = false)
  public JsonNullable<OffsetDateTime> getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(JsonNullable<OffsetDateTime> completedTime) {
    this.completedTime = completedTime;
  }

  public CatalogsItemsBatch status(BatchOperationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", required = false)
  public BatchOperationStatus getStatus() {
    return status;
  }

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
    CatalogsItemsBatch catalogsItemsBatch = (CatalogsItemsBatch) o;
    return Objects.equals(this.items, catalogsItemsBatch.items) &&
        Objects.equals(this.batchId, catalogsItemsBatch.batchId) &&
        Objects.equals(this.createdTime, catalogsItemsBatch.createdTime) &&
        Objects.equals(this.completedTime, catalogsItemsBatch.completedTime) &&
        Objects.equals(this.status, catalogsItemsBatch.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, batchId, createdTime, completedTime, status);
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
    sb.append("class CatalogsItemsBatch {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
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

