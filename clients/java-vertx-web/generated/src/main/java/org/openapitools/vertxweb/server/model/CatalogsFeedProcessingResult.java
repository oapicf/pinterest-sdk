package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.CatalogsFeedIngestionDetails;
import org.openapitools.vertxweb.server.model.CatalogsFeedProcessingStatus;
import org.openapitools.vertxweb.server.model.CatalogsFeedProductCounts;
import org.openapitools.vertxweb.server.model.CatalogsFeedValidationDetails;
import org.openapitools.vertxweb.server.model.CatalogsFeedVideoCounts;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedProcessingResult   {
  
  private OffsetDateTime createdAt;
  private String id;
  private CatalogsFeedIngestionDetails ingestionDetails;
  private CatalogsFeedProductCounts productCounts;
  private CatalogsFeedProcessingStatus status;
  private OffsetDateTime updatedAt;
  private CatalogsFeedValidationDetails validationDetails;
  private CatalogsFeedVideoCounts videoCounts;

  public CatalogsFeedProcessingResult () {

  }

  public CatalogsFeedProcessingResult (OffsetDateTime createdAt, String id, CatalogsFeedIngestionDetails ingestionDetails, CatalogsFeedProductCounts productCounts, CatalogsFeedProcessingStatus status, OffsetDateTime updatedAt, CatalogsFeedValidationDetails validationDetails, CatalogsFeedVideoCounts videoCounts) {
    this.createdAt = createdAt;
    this.id = id;
    this.ingestionDetails = ingestionDetails;
    this.productCounts = productCounts;
    this.status = status;
    this.updatedAt = updatedAt;
    this.validationDetails = validationDetails;
    this.videoCounts = videoCounts;
  }

    
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("ingestion_details")
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }
  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

    
  @JsonProperty("product_counts")
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }
  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

    
  @JsonProperty("status")
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

    
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("validation_details")
  public CatalogsFeedValidationDetails getValidationDetails() {
    return validationDetails;
  }
  public void setValidationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
  }

    
  @JsonProperty("video_counts")
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
    return Objects.equals(createdAt, catalogsFeedProcessingResult.createdAt) &&
        Objects.equals(id, catalogsFeedProcessingResult.id) &&
        Objects.equals(ingestionDetails, catalogsFeedProcessingResult.ingestionDetails) &&
        Objects.equals(productCounts, catalogsFeedProcessingResult.productCounts) &&
        Objects.equals(status, catalogsFeedProcessingResult.status) &&
        Objects.equals(updatedAt, catalogsFeedProcessingResult.updatedAt) &&
        Objects.equals(validationDetails, catalogsFeedProcessingResult.validationDetails) &&
        Objects.equals(videoCounts, catalogsFeedProcessingResult.videoCounts);
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
