package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplateAudienceSizingReachEstimate  {
  
  @ApiModelProperty(example = "63492000", value = "")
  private Long estimate;

  @ApiModelProperty(example = "47619000", value = "")
  private Long lowerBound;

  @ApiModelProperty(example = "79365000", value = "")
  private Long upperBound;
 /**
  * Get estimate
  * @return estimate
  */
  @JsonProperty("estimate")
  public Long getEstimate() {
    return estimate;
  }

  /**
   * Sets the <code>estimate</code> property.
   */
 public void setEstimate(Long estimate) {
    this.estimate = estimate;
  }

  /**
   * Sets the <code>estimate</code> property.
   */
  public TargetingTemplateAudienceSizingReachEstimate estimate(Long estimate) {
    this.estimate = estimate;
    return this;
  }

 /**
  * Get lowerBound
  * @return lowerBound
  */
  @JsonProperty("lower_bound")
  public Long getLowerBound() {
    return lowerBound;
  }

  /**
   * Sets the <code>lowerBound</code> property.
   */
 public void setLowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
  }

  /**
   * Sets the <code>lowerBound</code> property.
   */
  public TargetingTemplateAudienceSizingReachEstimate lowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

 /**
  * Get upperBound
  * @return upperBound
  */
  @JsonProperty("upper_bound")
  public Long getUpperBound() {
    return upperBound;
  }

  /**
   * Sets the <code>upperBound</code> property.
   */
 public void setUpperBound(Long upperBound) {
    this.upperBound = upperBound;
  }

  /**
   * Sets the <code>upperBound</code> property.
   */
  public TargetingTemplateAudienceSizingReachEstimate upperBound(Long upperBound) {
    this.upperBound = upperBound;
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
    TargetingTemplateAudienceSizingReachEstimate targetingTemplateAudienceSizingReachEstimate = (TargetingTemplateAudienceSizingReachEstimate) o;
    return Objects.equals(this.estimate, targetingTemplateAudienceSizingReachEstimate.estimate) &&
        Objects.equals(this.lowerBound, targetingTemplateAudienceSizingReachEstimate.lowerBound) &&
        Objects.equals(this.upperBound, targetingTemplateAudienceSizingReachEstimate.upperBound);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

