package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
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



@JsonTypeName("CatalogsFeedProcessingResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsFeedProcessingResult   {
  private @Valid Date createdAt;
  private @Valid String id;
  private @Valid Date updatedAt;
  private @Valid CatalogsFeedIngestionDetails ingestionDetails;
  private @Valid CatalogsFeedProcessingStatus status;
  private @Valid CatalogsFeedProductCounts productCounts;
  private @Valid CatalogsFeedValidationDetails validationDetails;

  /**
   **/
  public CatalogsFeedProcessingResult createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", value = "")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public CatalogsFeedProcessingResult id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public CatalogsFeedProcessingResult updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updated_at")
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
  public CatalogsFeedProcessingResult status(CatalogsFeedProcessingStatus status) {
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
  public CatalogsFeedProcessingResult productCounts(CatalogsFeedProductCounts productCounts) {
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
  public CatalogsFeedProcessingResult validationDetails(CatalogsFeedValidationDetails validationDetails) {
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
    CatalogsFeedProcessingResult catalogsFeedProcessingResult = (CatalogsFeedProcessingResult) o;
    return Objects.equals(this.createdAt, catalogsFeedProcessingResult.createdAt) &&
        Objects.equals(this.id, catalogsFeedProcessingResult.id) &&
        Objects.equals(this.updatedAt, catalogsFeedProcessingResult.updatedAt) &&
        Objects.equals(this.ingestionDetails, catalogsFeedProcessingResult.ingestionDetails) &&
        Objects.equals(this.status, catalogsFeedProcessingResult.status) &&
        Objects.equals(this.productCounts, catalogsFeedProcessingResult.productCounts) &&
        Objects.equals(this.validationDetails, catalogsFeedProcessingResult.validationDetails);
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

