package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingTemplateAudienceSizingReachEstimate   {
  
  private Long estimate;
  private Long lowerBound;
  private Long upperBound;

  public TargetingTemplateAudienceSizingReachEstimate () {

  }

  public TargetingTemplateAudienceSizingReachEstimate (Long estimate, Long lowerBound, Long upperBound) {
    this.estimate = estimate;
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

    
  @JsonProperty("estimate")
  public Long getEstimate() {
    return estimate;
  }
  public void setEstimate(Long estimate) {
    this.estimate = estimate;
  }

    
  @JsonProperty("lower_bound")
  public Long getLowerBound() {
    return lowerBound;
  }
  public void setLowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
  }

    
  @JsonProperty("upper_bound")
  public Long getUpperBound() {
    return upperBound;
  }
  public void setUpperBound(Long upperBound) {
    this.upperBound = upperBound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplateAudienceSizingReachEstimate targetingTemplateAudienceSizingReachEstimate = (TargetingTemplateAudienceSizingReachEstimate) o;
    return Objects.equals(estimate, targetingTemplateAudienceSizingReachEstimate.estimate) &&
        Objects.equals(lowerBound, targetingTemplateAudienceSizingReachEstimate.lowerBound) &&
        Objects.equals(upperBound, targetingTemplateAudienceSizingReachEstimate.upperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimate, lowerBound, upperBound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateAudienceSizingReachEstimate {\n");
    
    sb.append("    estimate: ").append(toIndentedString(estimate)).append("\n");
    sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
    sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
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
