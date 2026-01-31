package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import org.openapitools.model.CatalogsFeedVideoCounts;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CatalogsFeedProcessingResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsFeedProcessingResult   {
  private Date createdAt;
  private String id;
  private Date updatedAt;
  private CatalogsFeedIngestionDetails ingestionDetails;
  private CatalogsFeedProductCounts productCounts;
  private CatalogsFeedProcessingStatus status;
  private CatalogsFeedValidationDetails validationDetails;
  private CatalogsFeedVideoCounts videoCounts;

  public CatalogsFeedProcessingResult() {
  }

  @JsonCreator
  public CatalogsFeedProcessingResult(
    @JsonProperty(required = true, value = "created_at") Date createdAt,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "updated_at") Date updatedAt,
    @JsonProperty(required = true, value = "ingestion_details") CatalogsFeedIngestionDetails ingestionDetails,
    @JsonProperty(required = true, value = "product_counts") CatalogsFeedProductCounts productCounts,
    @JsonProperty(required = true, value = "status") CatalogsFeedProcessingStatus status,
    @JsonProperty(required = true, value = "validation_details") CatalogsFeedValidationDetails validationDetails
  ) {
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
    this.ingestionDetails = ingestionDetails;
    this.productCounts = productCounts;
    this.status = status;
    this.validationDetails = validationDetails;
  }

  /**
   **/
  public CatalogsFeedProcessingResult createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "")
  @JsonProperty(required = true, value = "created_at")
  @NotNull public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public CatalogsFeedProcessingResult id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public CatalogsFeedProcessingResult updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", required = true, value = "")
  @JsonProperty(required = true, value = "updated_at")
  @NotNull public Date getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty(required = true, value = "updated_at")
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  public CatalogsFeedProcessingResult ingestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "ingestion_details")
  @NotNull @Valid public CatalogsFeedIngestionDetails getIngestionDetails() {
    return ingestionDetails;
  }

  @JsonProperty(required = true, value = "ingestion_details")
  public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
    this.ingestionDetails = ingestionDetails;
  }

  /**
   **/
  public CatalogsFeedProcessingResult productCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "product_counts")
  @NotNull @Valid public CatalogsFeedProductCounts getProductCounts() {
    return productCounts;
  }

  @JsonProperty(required = true, value = "product_counts")
  public void setProductCounts(CatalogsFeedProductCounts productCounts) {
    this.productCounts = productCounts;
  }

  /**
   **/
  public CatalogsFeedProcessingResult status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "status")
  @NotNull public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  /**
   **/
  public CatalogsFeedProcessingResult validationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "validation_details")
  @NotNull @Valid public CatalogsFeedValidationDetails getValidationDetails() {
    return validationDetails;
  }

  @JsonProperty(required = true, value = "validation_details")
  public void setValidationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
  }

  /**
   **/
  public CatalogsFeedProcessingResult videoCounts(CatalogsFeedVideoCounts videoCounts) {
    this.videoCounts = videoCounts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("video_counts")
  @Valid public CatalogsFeedVideoCounts getVideoCounts() {
    return videoCounts;
  }

  @JsonProperty("video_counts")
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
        Objects.equals(this.updatedAt, catalogsFeedProcessingResult.updatedAt) &&
        Objects.equals(this.ingestionDetails, catalogsFeedProcessingResult.ingestionDetails) &&
        Objects.equals(this.productCounts, catalogsFeedProcessingResult.productCounts) &&
        Objects.equals(this.status, catalogsFeedProcessingResult.status) &&
        Objects.equals(this.validationDetails, catalogsFeedProcessingResult.validationDetails) &&
        Objects.equals(this.videoCounts, catalogsFeedProcessingResult.videoCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, ingestionDetails, productCounts, status, validationDetails, videoCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProcessingResult {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    ingestionDetails: ").append(toIndentedString(ingestionDetails)).append("\n");
    sb.append("    productCounts: ").append(toIndentedString(productCounts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

