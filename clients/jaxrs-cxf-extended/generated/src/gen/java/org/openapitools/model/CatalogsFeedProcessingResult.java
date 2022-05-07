package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.CatalogsDbItem;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingResultFields;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedProcessingResult  {
  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updatedAt;

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
  * Get createdAt
  * @return createdAt
  */
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public CatalogsFeedProcessingResult createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CatalogsFeedProcessingResult id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get updatedAt
  * @return updatedAt
  */
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
 public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
  public CatalogsFeedProcessingResult updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

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
  public CatalogsFeedProcessingResult ingestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
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
  public CatalogsFeedProcessingResult status(CatalogsFeedProcessingStatus status) {
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
  public CatalogsFeedProcessingResult productCounts(CatalogsFeedProductCounts productCounts) {
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
  public CatalogsFeedProcessingResult validationDetails(CatalogsFeedValidationDetails validationDetails) {
    this.validationDetails = validationDetails;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

