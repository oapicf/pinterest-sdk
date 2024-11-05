package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TargetingTemplateAudienceSizingReachEstimate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
 */

@Schema(name = "TargetingTemplateAudienceSizing", description = "Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateAudienceSizing {

  private TargetingTemplateAudienceSizingReachEstimate reachEstimate;

  public TargetingTemplateAudienceSizing reachEstimate(TargetingTemplateAudienceSizingReachEstimate reachEstimate) {
    this.reachEstimate = reachEstimate;
    return this;
  }

  /**
   * Get reachEstimate
   * @return reachEstimate
   */
  @Valid 
  @Schema(name = "reach_estimate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reach_estimate")
  public TargetingTemplateAudienceSizingReachEstimate getReachEstimate() {
    return reachEstimate;
  }

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

