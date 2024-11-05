package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TargetingTemplateAudienceSizingReachEstimate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
 **/
@ApiModel(description = "Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. ")
@JsonTypeName("TargetingTemplateAudienceSizing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateAudienceSizing   {
  private TargetingTemplateAudienceSizingReachEstimate reachEstimate;

  /**
   **/
  public TargetingTemplateAudienceSizing reachEstimate(TargetingTemplateAudienceSizingReachEstimate reachEstimate) {
    this.reachEstimate = reachEstimate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reach_estimate")
  @Valid public TargetingTemplateAudienceSizingReachEstimate getReachEstimate() {
    return reachEstimate;
  }

  @JsonProperty("reach_estimate")
  public void setReachEstimate(TargetingTemplateAudienceSizingReachEstimate reachEstimate) {
    this.reachEstimate = reachEstimate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplateAudienceSizing targetingTemplateAudienceSizing = (TargetingTemplateAudienceSizing) o;
    return Objects.equals(this.reachEstimate, targetingTemplateAudienceSizing.reachEstimate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reachEstimate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateAudienceSizing {\n");
    
    sb.append("    reachEstimate: ").append(toIndentedString(reachEstimate)).append("\n");
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

