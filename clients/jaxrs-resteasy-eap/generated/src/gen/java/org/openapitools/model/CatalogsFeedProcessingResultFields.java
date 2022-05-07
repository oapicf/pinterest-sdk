package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-07T06:42:33.868481Z[Etc/UTC]")
public class CatalogsFeedProcessingResultFields   {
  

  private CatalogsFeedIngestionDetails ingestionDetails;

  private CatalogsFeedProcessingStatus status;

  private CatalogsFeedProductCounts productCounts;

  private CatalogsFeedValidationDetails validationDetails;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ingestion_details")
  @NotNull
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }
  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("product_counts")
  @NotNull
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }
  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("validation_details")
  @NotNull
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

