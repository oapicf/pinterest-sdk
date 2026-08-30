package org.openapitools.model;

import java.time.OffsetDateTime;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import org.openapitools.model.CatalogsFeedVideoCounts;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsFeedProcessingResult implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  /**
   * ID of the feed processing result.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("ingestion_details")
  private CatalogsFeedIngestionDetails ingestionDetails;

  @JsonProperty("product_counts")
  private CatalogsFeedProductCounts productCounts;

  @JsonProperty("status")
  private CatalogsFeedProcessingStatus status;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt;

  @JsonProperty("validation_details")
  private CatalogsFeedValidationDetails validationDetails;

  @JsonProperty("video_counts")
  private CatalogsFeedVideoCounts videoCounts;

  /**
   * 
   * @return createdAt
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * ID of the feed processing result.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @return ingestionDetails
   */
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }

  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

  /**
   * 
   * @return productCounts
   */
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }

  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

  /**
   * 
   * @return status
   */
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  /**
   * 
   * @return updatedAt
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * 
   * @return validationDetails
   */
  public CatalogsFeedValidationDetails getValidationDetails() {
    return validationDetails;
  }

  public void setValidationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
  }

  /**
   * 
   * @return videoCounts
   */
  public CatalogsFeedVideoCounts getVideoCounts() {
    return videoCounts;
  }

  public void setVideoCounts(CatalogsFeedVideoCounts videoCounts) {
    this.videoCounts = videoCounts;
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
        Objects.equals(this.ingestionDetails, catalogsFeedProcessingResult.ingestionDetails) &&
        Objects.equals(this.productCounts, catalogsFeedProcessingResult.productCounts) &&
        Objects.equals(this.status, catalogsFeedProcessingResult.status) &&
        Objects.equals(this.updatedAt, catalogsFeedProcessingResult.updatedAt) &&
        Objects.equals(this.validationDetails, catalogsFeedProcessingResult.validationDetails) &&
        Objects.equals(this.videoCounts, catalogsFeedProcessingResult.videoCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, ingestionDetails, productCounts, status, updatedAt, validationDetails, videoCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProcessingResult {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingestionDetails: ").append(toIndentedString(ingestionDetails)).append("\n");
    sb.append("    productCounts: ").append(toIndentedString(productCounts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    validationDetails: ").append(toIndentedString(validationDetails)).append("\n");
    sb.append("    videoCounts: ").append(toIndentedString(videoCounts)).append("\n");
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
