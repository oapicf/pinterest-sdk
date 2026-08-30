package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DynamicTitlesGetStatus  {
  
 /**
  * The count of generated titles.
  */
  @ApiModelProperty(example = "987", value = "The count of generated titles.")
  private Integer generatedCount;

 /**
  * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
  */
  @ApiModelProperty(example = "true", value = "Whether dynamic titles have been generated and are ready to be reviewed for the ad group.")
  private Boolean isReady;

 /**
  * The count of advertiser reviewed titles.
  */
  @ApiModelProperty(example = "456", value = "The count of advertiser reviewed titles.")
  private Integer reviewedCount;
 /**
  * The count of generated titles.
  * @return generatedCount
  */
  @JsonProperty("generated_count")
  public Integer getGeneratedCount() {
    return generatedCount;
  }

  /**
   * Sets the <code>generatedCount</code> property.
   */
 public void setGeneratedCount(Integer generatedCount) {
    this.generatedCount = generatedCount;
  }

  /**
   * Sets the <code>generatedCount</code> property.
   */
  public DynamicTitlesGetStatus generatedCount(Integer generatedCount) {
    this.generatedCount = generatedCount;
    return this;
  }

 /**
  * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
  * @return isReady
  */
  @JsonProperty("is_ready")
  public Boolean getIsReady() {
    return isReady;
  }

  /**
   * Sets the <code>isReady</code> property.
   */
 public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }

  /**
   * Sets the <code>isReady</code> property.
   */
  public DynamicTitlesGetStatus isReady(Boolean isReady) {
    this.isReady = isReady;
    return this;
  }

 /**
  * The count of advertiser reviewed titles.
  * @return reviewedCount
  */
  @JsonProperty("reviewed_count")
  public Integer getReviewedCount() {
    return reviewedCount;
  }

  /**
   * Sets the <code>reviewedCount</code> property.
   */
 public void setReviewedCount(Integer reviewedCount) {
    this.reviewedCount = reviewedCount;
  }

  /**
   * Sets the <code>reviewedCount</code> property.
   */
  public DynamicTitlesGetStatus reviewedCount(Integer reviewedCount) {
    this.reviewedCount = reviewedCount;
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
    DynamicTitlesGetStatus dynamicTitlesGetStatus = (DynamicTitlesGetStatus) o;
    return Objects.equals(this.generatedCount, dynamicTitlesGetStatus.generatedCount) &&
        Objects.equals(this.isReady, dynamicTitlesGetStatus.isReady) &&
        Objects.equals(this.reviewedCount, dynamicTitlesGetStatus.reviewedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generatedCount, isReady, reviewedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesGetStatus {\n");
    
    sb.append("    generatedCount: ").append(toIndentedString(generatedCount)).append("\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
    sb.append("    reviewedCount: ").append(toIndentedString(reviewedCount)).append("\n");
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

