package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("catalogs_feed_processing_result_fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class CatalogsFeedProcessingResultFields   {
  
  private @Valid CatalogsFeedIngestionDetails ingestionDetails;
  private @Valid CatalogsFeedProcessingStatus status;
  private @Valid CatalogsFeedProductCounts productCounts;
  private @Valid CatalogsFeedValidationDetails validationDetails;

  /**
   **/
  public CatalogsFeedProcessingResultFields ingestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ingestion_details")
  @NotNull
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }

  @JsonProperty("ingestion_details")
  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

/**
   **/
  public CatalogsFeedProcessingResultFields status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

/**
   **/
  public CatalogsFeedProcessingResultFields productCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("product_counts")
  @NotNull
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }

  @JsonProperty("product_counts")
  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

/**
   **/
  public CatalogsFeedProcessingResultFields validationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("validation_details")
  @NotNull
  public CatalogsFeedValidationDetails getValidationDetails() {
    return validationDetails;
  }

  @JsonProperty("validation_details")
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
    return Objects.equals(this.ingestionDetails, catalogsFeedProcessingResultFields.ingestionDetails) &&
        Objects.equals(this.status, catalogsFeedProcessingResultFields.status) &&
        Objects.equals(this.productCounts, catalogsFeedProcessingResultFields.productCounts) &&
        Objects.equals(this.validationDetails, catalogsFeedProcessingResultFields.validationDetails);
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

