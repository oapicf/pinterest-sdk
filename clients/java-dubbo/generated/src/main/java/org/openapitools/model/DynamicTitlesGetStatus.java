package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class DynamicTitlesGetStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The count of generated titles.
   */
  @JsonProperty("generated_count")
  private Integer generatedCount;

  /**
   * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
   */
  @JsonProperty("is_ready")
  private Boolean isReady;

  /**
   * The count of advertiser reviewed titles.
   */
  @JsonProperty("reviewed_count")
  private Integer reviewedCount;

  /**
   * The count of generated titles.
   * @return generatedCount
   */
  public Integer getGeneratedCount() {
    return generatedCount;
  }

  public void setGeneratedCount(Integer generatedCount) {
    this.generatedCount = generatedCount;
  }

  /**
   * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
   * @return isReady
   */
  public Boolean getIsReady() {
    return isReady;
  }

  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }

  /**
   * The count of advertiser reviewed titles.
   * @return reviewedCount
   */
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
