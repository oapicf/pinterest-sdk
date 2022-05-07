package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsFeedIngestionDetails;
import org.openapitools.vertxweb.server.model.CatalogsFeedProcessingStatus;
import org.openapitools.vertxweb.server.model.CatalogsFeedProductCounts;
import org.openapitools.vertxweb.server.model.CatalogsFeedValidationDetails;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedProcessingResultFields   {
  
  private CatalogsFeedIngestionDetails ingestionDetails;
  private CatalogsFeedProcessingStatus status;
  private CatalogsFeedProductCounts productCounts;
  private CatalogsFeedValidationDetails validationDetails;

  public CatalogsFeedProcessingResultFields () {

  }

  public CatalogsFeedProcessingResultFields (CatalogsFeedIngestionDetails ingestionDetails, CatalogsFeedProcessingStatus status, CatalogsFeedProductCounts productCounts, CatalogsFeedValidationDetails validationDetails) {
    this.ingestionDetails = ingestionDetails;
    this.status = status;
    this.productCounts = productCounts;
    this.validationDetails = validationDetails;
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
    CatalogsFeedProcessingResultFields catalogsFeedProcessingResultFields = (CatalogsFeedProcessingResultFields) o;
    return Objects.equals(ingestionDetails, catalogsFeedProcessingResultFields.ingestionDetails) &&
        Objects.equals(status, catalogsFeedProcessingResultFields.status) &&
        Objects.equals(productCounts, catalogsFeedProcessingResultFields.productCounts) &&
        Objects.equals(validationDetails, catalogsFeedProcessingResultFields.validationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestionDetails, status, productCounts, validationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProcessingResultFields {\n");
    
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
