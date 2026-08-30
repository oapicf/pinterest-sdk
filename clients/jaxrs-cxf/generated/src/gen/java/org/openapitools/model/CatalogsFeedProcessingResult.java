package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import org.openapitools.model.CatalogsFeedVideoCounts;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedProcessingResult  {
  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "")

  private Date createdAt;

 /**
  * ID of the feed processing result.
  */
  @ApiModelProperty(example = "864344156814050986", required = true, value = "ID of the feed processing result.")

  private String id;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsFeedIngestionDetails ingestionDetails;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsFeedProductCounts productCounts;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsFeedProcessingStatus status;

  @ApiModelProperty(example = "2022-03-14T15:16:34Z", required = true, value = "")

  private Date updatedAt;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsFeedValidationDetails validationDetails;

  @ApiModelProperty(value = "")

  @Valid

  private CatalogsFeedVideoCounts videoCounts;
 /**
   * Get createdAt
   * @return createdAt
  **/
  @JsonProperty("created_at")
  @NotNull
  public Date getCreatedAt() {
    return createdAt;
  }


 /**
   * ID of the feed processing result.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsFeedProcessingResult id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get ingestionDetails
   * @return ingestionDetails
  **/
  @JsonProperty("ingestion_details")
  @NotNull
  public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }

  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

  public CatalogsFeedProcessingResult ingestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
    return this;
  }

 /**
   * Get productCounts
   * @return productCounts
  **/
  @JsonProperty("product_counts")
  @NotNull
  public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }

  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

  public CatalogsFeedProcessingResult productCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  public CatalogsFeedProcessingResult status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get updatedAt
   * @return updatedAt
  **/
  @JsonProperty("updated_at")
  @NotNull
  public Date getUpdatedAt() {
    return updatedAt;
  }


 /**
   * Get validationDetails
   * @return validationDetails
  **/
  @JsonProperty("validation_details")
  @NotNull
  public CatalogsFeedValidationDetails getValidationDetails() {
    return validationDetails;
  }

  public void setValidationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
  }

  public CatalogsFeedProcessingResult validationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
    return this;
  }

 /**
   * Get videoCounts
   * @return videoCounts
  **/
  @JsonProperty("video_counts")
  public CatalogsFeedVideoCounts getVideoCounts() {
    return videoCounts;
  }

  public void setVideoCounts(CatalogsFeedVideoCounts videoCounts) {
    this.videoCounts = videoCounts;
  }

  public CatalogsFeedProcessingResult videoCounts(CatalogsFeedVideoCounts videoCounts) {
    this.videoCounts = videoCounts;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

