package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsFeedProcessingResult
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsFeedProcessingResult {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date createdAt;

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date updatedAt;

  private CatalogsFeedIngestionDetails ingestionDetails;

  private CatalogsFeedProcessingStatus status;

  private JsonNullable<CatalogsFeedProductCounts> productCounts = JsonNullable.<CatalogsFeedProductCounts>undefined();

  private CatalogsFeedValidationDetails validationDetails;

  public CatalogsFeedProcessingResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsFeedProcessingResult(Date createdAt, String id, Date updatedAt, CatalogsFeedIngestionDetails ingestionDetails, CatalogsFeedProcessingStatus status, CatalogsFeedProductCounts productCounts, CatalogsFeedValidationDetails validationDetails) {
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
    this.ingestionDetails = ingestionDetails;
    this.status = status;
    this.productCounts = JsonNullable.of(productCounts);
    this.validationDetails = validationDetails;
  }

  public CatalogsFeedProcessingResult createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @NotNull @Valid 
  @Schema(name = "created_at", example = "2022-03-14T15:15:22Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsFeedProcessingResult id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsFeedProcessingResult updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @NotNull @Valid 
  @Schema(name = "updated_at", example = "2022-03-14T15:16:34Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CatalogsFeedProcessingResult ingestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
    return this;
  }

  /**
   * Get ingestionDetails
   * @return ingestionDetails
   */
  @NotNull @Valid 
  @Schema(name = "ingestion_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ingestion_details")
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }

  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

  public CatalogsFeedProcessingResult status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  public CatalogsFeedProcessingResult productCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = JsonNullable.of(productCounts);
    return this;
  }

  /**
   * Get productCounts
   * @return productCounts
   */
  @NotNull @Valid 
  @Schema(name = "product_counts", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("product_counts")
  public JsonNullable<CatalogsFeedProductCounts> getProductCounts() {
    return productCounts;
  }

  public void setProductCounts(JsonNullable<CatalogsFeedProductCounts> productCounts) {
    this.productCounts = productCounts;
  }

  public CatalogsFeedProcessingResult validationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
    return this;
  }

  /**
   * Get validationDetails
   * @return validationDetails
   */
  @NotNull @Valid 
  @Schema(name = "validation_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validation_details")
  public CatalogsFeedValidationDetails getValidationDetails() {
    return validationDetails;
  }

  public void setValidationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedProcessingResult catalogsFeedProcessingResult = (CatalogsFeedProcessingResult) o;
    return Objects.equals(this.createdAt, catalogsFeedProcessingResult.createdAt) &&
        Objects.equals(this.id, catalogsFeedProcessingResult.id) &&
        Objects.equals(this.updatedAt, catalogsFeedProcessingResult.updatedAt) &&
        Objects.equals(this.ingestionDetails, catalogsFeedProcessingResult.ingestionDetails) &&
        Objects.equals(this.status, catalogsFeedProcessingResult.status) &&
        Objects.equals(this.productCounts, catalogsFeedProcessingResult.productCounts) &&
        Objects.equals(this.validationDetails, catalogsFeedProcessingResult.validationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, ingestionDetails, status, productCounts, validationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProcessingResult {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    ingestionDetails: ").append(toIndentedString(ingestionDetails)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    productCounts: ").append(toIndentedString(productCounts)).append("\n");
    sb.append("    validationDetails: ").append(toIndentedString(validationDetails)).append("\n");
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

