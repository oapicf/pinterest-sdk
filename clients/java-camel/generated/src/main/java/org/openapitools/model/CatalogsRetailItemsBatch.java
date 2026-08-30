package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.ItemProcessingRecord;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object describing the catalogs retail items batch
 */

@Schema(name = "CatalogsRetailItemsBatch", description = "Object describing the catalogs retail items batch")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailItemsBatch implements CatalogsItemsBatch {

  private String batchId;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private CatalogTypeEnum catalogType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<Date> completedTime = JsonNullable.<Date>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<Date> createdTime = JsonNullable.<Date>undefined();

  @Valid
  private List<@Valid ItemProcessingRecord> items = new ArrayList<>();

  private BatchOperationStatus status;

  public CatalogsRetailItemsBatch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailItemsBatch(CatalogTypeEnum catalogType, Date createdTime) {
    this.catalogType = catalogType;
    this.createdTime = JsonNullable.of(createdTime);
  }

  public CatalogsRetailItemsBatch batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Id of the catalogs items batch
   * @return batchId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "batch_id", example = "595953100599279259", description = "Id of the catalogs items batch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public CatalogsRetailItemsBatch catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailItemsBatch completedTime(Date completedTime) {
    this.completedTime = JsonNullable.of(completedTime);
    return this;
  }

  /**
   * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
   * @return completedTime
   */
  @Valid 
  @Schema(name = "completed_time", example = "2024-01-01T20:20Z", description = "Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_time")
  public JsonNullable<Date> getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(JsonNullable<Date> completedTime) {
    this.completedTime = completedTime;
  }

  public CatalogsRetailItemsBatch createdTime(Date createdTime) {
    this.createdTime = JsonNullable.of(createdTime);
    return this;
  }

  /**
   * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.
   * @return createdTime
   */
  @NotNull @Valid 
  @Schema(name = "created_time", example = "2024-01-01T20:10:40Z", description = "Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_time")
  public JsonNullable<Date> getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(JsonNullable<Date> createdTime) {
    this.createdTime = createdTime;
  }

  public CatalogsRetailItemsBatch items(List<@Valid ItemProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsRetailItemsBatch addItemsItem(ItemProcessingRecord itemsItem) {
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
  public List<@Valid ItemProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid ItemProcessingRecord> items) {
    this.items = items;
  }

  public CatalogsRetailItemsBatch status(BatchOperationStatus status) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailItemsBatch catalogsRetailItemsBatch = (CatalogsRetailItemsBatch) o;
    return Objects.equals(this.batchId, catalogsRetailItemsBatch.batchId) &&
        Objects.equals(this.catalogType, catalogsRetailItemsBatch.catalogType) &&
        equalsNullable(this.completedTime, catalogsRetailItemsBatch.completedTime) &&
        Objects.equals(this.createdTime, catalogsRetailItemsBatch.createdTime) &&
        Objects.equals(this.items, catalogsRetailItemsBatch.items) &&
        Objects.equals(this.status, catalogsRetailItemsBatch.status);
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
    sb.append("class CatalogsRetailItemsBatch {\n");
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

