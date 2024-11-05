package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TargetingTemplateAudienceSizingReachEstimate
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateAudienceSizingReachEstimate   {
  @JsonProperty("estimate")
  private Long estimate;

  @JsonProperty("lower_bound")
  private Long lowerBound;

  @JsonProperty("upper_bound")
  private Long upperBound;

  public TargetingTemplateAudienceSizingReachEstimate estimate(Long estimate) {
    this.estimate = estimate;
    return this;
  }

  /**
   * Get estimate
   * @return estimate
   */
  @ApiModelProperty(example = "63492000", value = "")
  public Long getEstimate() {
    return estimate;
  }

  public void setEstimate(Long estimate) {
    this.estimate = estimate;
  }

  public TargetingTemplateAudienceSizingReachEstimate lowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

  /**
   * Get lowerBound
   * @return lowerBound
   */
  @ApiModelProperty(example = "47619000", value = "")
  public Long getLowerBound() {
    return lowerBound;
  }

  public void setLowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
  }

  public TargetingTemplateAudienceSizingReachEstimate upperBound(Long upperBound) {
    this.upperBound = upperBound;
    return this;
  }

  /**
   * Get upperBound
   * @return upperBound
   */
  @ApiModelProperty(example = "79365000", value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

