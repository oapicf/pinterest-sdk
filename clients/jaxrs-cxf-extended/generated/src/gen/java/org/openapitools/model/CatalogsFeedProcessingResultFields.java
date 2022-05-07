package org.openapitools.model;

import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedProcessingResultFields  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedIngestionDetails ingestionDetails;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedProcessingStatus status;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedProductCounts productCounts;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedValidationDetails validationDetails;
 /**
  * Get ingestionDetails
  * @return ingestionDetails
  */
  @JsonProperty("ingestion_details")
  @NotNull
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }

  /**
   * Sets the <code>ingestionDetails</code> property.
   */
 public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

  /**
   * Sets the <code>ingestionDetails</code> property.
   */
  public CatalogsFeedProcessingResultFields ingestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CatalogsFeedProcessingResultFields status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Get productCounts
  * @return productCounts
  */
  @JsonProperty("product_counts")
  @NotNull
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }

  /**
   * Sets the <code>productCounts</code> property.
   */
 public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

  /**
   * Sets the <code>productCounts</code> property.
   */
  public CatalogsFeedProcessingResultFields productCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
    return this;
  }

 /**
  * Get validationDetails
  * @return validationDetails
  */
  @JsonProperty("validation_details")
  @NotNull
  public CatalogsFeedValidationDetails getValidationDetails() {
    return validationDetails;
  }

  /**
   * Sets the <code>validationDetails</code> property.
   */
 public void setValidationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
  }

  /**
   * Sets the <code>validationDetails</code> property.
   */
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

