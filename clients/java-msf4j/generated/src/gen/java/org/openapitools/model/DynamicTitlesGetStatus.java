package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DynamicTitlesGetStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesGetStatus   {
  @JsonProperty("generated_count")
  private Integer generatedCount;

  @JsonProperty("is_ready")
  private Boolean isReady;

  @JsonProperty("reviewed_count")
  private Integer reviewedCount;

  public DynamicTitlesGetStatus generatedCount(Integer generatedCount) {
    this.generatedCount = generatedCount;
    return this;
  }

   /**
   * The count of generated titles.
   * @return generatedCount
  **/
  @ApiModelProperty(example = "987", value = "The count of generated titles.")
  public Integer getGeneratedCount() {
    return generatedCount;
  }

  public void setGeneratedCount(Integer generatedCount) {
    this.generatedCount = generatedCount;
  }

  public DynamicTitlesGetStatus isReady(Boolean isReady) {
    this.isReady = isReady;
    return this;
  }

   /**
   * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
   * @return isReady
  **/
  @ApiModelProperty(example = "true", value = "Whether dynamic titles have been generated and are ready to be reviewed for the ad group.")
  public Boolean getIsReady() {
    return isReady;
  }

  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }

  public DynamicTitlesGetStatus reviewedCount(Integer reviewedCount) {
    this.reviewedCount = reviewedCount;
    return this;
  }

   /**
   * The count of advertiser reviewed titles.
   * @return reviewedCount
  **/
  @ApiModelProperty(example = "456", value = "The count of advertiser reviewed titles.")
  public Integer getReviewedCount() {
    return reviewedCount;
  }

  public void setReviewedCount(Integer reviewedCount) {
    this.reviewedCount = reviewedCount;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

