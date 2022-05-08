package apimodels;

import apimodels.CatalogsFeedIngestionDetails;
import apimodels.CatalogsFeedProcessingStatus;
import apimodels.CatalogsFeedProductCounts;
import apimodels.CatalogsFeedValidationDetails;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CatalogsFeedProcessingResultFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsFeedProcessingResultFields   {
  @JsonProperty("ingestion_details")
  @NotNull
@Valid

  private CatalogsFeedIngestionDetails ingestionDetails;

  @JsonProperty("status")
  @NotNull
@Valid

  private CatalogsFeedProcessingStatus status;

  @JsonProperty("product_counts")
  @NotNull
@Valid

  private CatalogsFeedProductCounts productCounts;

  @JsonProperty("validation_details")
  @NotNull
@Valid

  private CatalogsFeedValidationDetails validationDetails;

  public CatalogsFeedProcessingResultFields ingestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
    return this;
  }

   /**
   * Get ingestionDetails
   * @return ingestionDetails
  **/
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }

  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

  public CatalogsFeedProcessingResultFields status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  public CatalogsFeedProcessingResultFields productCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
    return this;
  }

   /**
   * Get productCounts
   * @return productCounts
  **/
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }

  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

  public CatalogsFeedProcessingResultFields validationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
    return this;
  }

   /**
   * Get validationDetails
   * @return validationDetails
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

