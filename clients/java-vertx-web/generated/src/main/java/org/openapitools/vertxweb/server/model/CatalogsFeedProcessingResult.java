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

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedProcessingResult   {
  
  private OffsetDateTime createdAt;
  private String id;
  private OffsetDateTime updatedAt;
  private CatalogsFeedIngestionDetails ingestionDetails;
  private CatalogsFeedProcessingStatus status;
  private CatalogsFeedProductCounts productCounts;
  private CatalogsFeedValidationDetails validationDetails;

  public CatalogsFeedProcessingResult () {

  }

  public CatalogsFeedProcessingResult (OffsetDateTime createdAt, String id, OffsetDateTime updatedAt, CatalogsFeedIngestionDetails ingestionDetails, CatalogsFeedProcessingStatus status, CatalogsFeedProductCounts productCounts, CatalogsFeedValidationDetails validationDetails) {
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
    this.ingestionDetails = ingestionDetails;
    this.status = status;
    this.productCounts = productCounts;
    this.validationDetails = validationDetails;
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

    
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("ingestion_details")
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }
  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

    
  @JsonProperty("status")
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

    
  @JsonProperty("product_counts")
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }
  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

    
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
    return Objects.equals(createdAt, catalogsFeedProcessingResult.createdAt) &&
        Objects.equals(id, catalogsFeedProcessingResult.id) &&
        Objects.equals(updatedAt, catalogsFeedProcessingResult.updatedAt) &&
        Objects.equals(ingestionDetails, catalogsFeedProcessingResult.ingestionDetails) &&
        Objects.equals(status, catalogsFeedProcessingResult.status) &&
        Objects.equals(productCounts, catalogsFeedProcessingResult.productCounts) &&
        Objects.equals(validationDetails, catalogsFeedProcessingResult.validationDetails);
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
