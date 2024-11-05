package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TargetingTemplateAudienceSizing_reach_estimate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateAudienceSizingReachEstimate   {
  private Long estimate;
  private Long lowerBound;
  private Long upperBound;

  /**
   **/
  public TargetingTemplateAudienceSizingReachEstimate estimate(Long estimate) {
    this.estimate = estimate;
    return this;
  }

  
  @ApiModelProperty(example = "63492000", value = "")
  @JsonProperty("estimate")
  public Long getEstimate() {
    return estimate;
  }

  @JsonProperty("estimate")
  public void setEstimate(Long estimate) {
    this.estimate = estimate;
  }

  /**
   **/
  public TargetingTemplateAudienceSizingReachEstimate lowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

  
  @ApiModelProperty(example = "47619000", value = "")
  @JsonProperty("lower_bound")
  public Long getLowerBound() {
    return lowerBound;
  }

  @JsonProperty("lower_bound")
  public void setLowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
  }

  /**
   **/
  public TargetingTemplateAudienceSizingReachEstimate upperBound(Long upperBound) {
    this.upperBound = upperBound;
    return this;
  }

  
  @ApiModelProperty(example = "79365000", value = "")
  @JsonProperty("upper_bound")
  public Long getUpperBound() {
    return upperBound;
  }

  @JsonProperty("upper_bound")
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

