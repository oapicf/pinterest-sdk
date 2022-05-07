package org.openapitools.model;

import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CatalogsFeedProcessingResultFields  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsFeedIngestionDetails ingestionDetails;

  @ApiModelProperty(required = true, value = "")
  private CatalogsFeedProcessingStatus status;

  @ApiModelProperty(required = true, value = "")
  private CatalogsFeedProductCounts productCounts;

  @ApiModelProperty(required = true, value = "")
  private CatalogsFeedValidationDetails validationDetails;
 /**
   * Get ingestionDetails
   * @return ingestionDetails
  **/
  @JsonProperty("ingestion_details")
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }

  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

  public CatalogsFeedProcessingResultFields ingestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  public CatalogsFeedProcessingResultFields status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get productCounts
   * @return productCounts
  **/
  @JsonProperty("product_counts")
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }

  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

  public CatalogsFeedProcessingResultFields productCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
    return this;
  }

 /**
   * Get validationDetails
   * @return validationDetails
  **/
  @JsonProperty("validation_details")
  public CatalogsFeedValidationDetails getValidationDetails() {
    return validationDetails;
  }

  public void setValidationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
  }

  public CatalogsFeedProcessingResultFields validationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

