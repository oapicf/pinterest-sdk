package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicTitlesGetStatus   {
  
  private Integer generatedCount;
  private Boolean isReady;
  private Integer reviewedCount;

  public DynamicTitlesGetStatus () {

  }

  public DynamicTitlesGetStatus (Integer generatedCount, Boolean isReady, Integer reviewedCount) {
    this.generatedCount = generatedCount;
    this.isReady = isReady;
    this.reviewedCount = reviewedCount;
  }

    
  @JsonProperty("generated_count")
  public Integer getGeneratedCount() {
    return generatedCount;
  }
  public void setGeneratedCount(Integer generatedCount) {
    this.generatedCount = generatedCount;
  }

    
  @JsonProperty("is_ready")
  public Boolean getIsReady() {
    return isReady;
  }
  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }

    
  @JsonProperty("reviewed_count")
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
    return Objects.equals(generatedCount, dynamicTitlesGetStatus.generatedCount) &&
        Objects.equals(isReady, dynamicTitlesGetStatus.isReady) &&
        Objects.equals(reviewedCount, dynamicTitlesGetStatus.reviewedCount);
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
