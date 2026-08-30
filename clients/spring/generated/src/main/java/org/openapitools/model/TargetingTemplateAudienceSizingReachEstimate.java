package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TargetingTemplateAudienceSizingReachEstimate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingTemplateAudienceSizingReachEstimate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Long estimate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Long lowerBound;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Long upperBound;

  public TargetingTemplateAudienceSizingReachEstimate estimate(@Nullable Long estimate) {
    this.estimate = estimate;
    return this;
  }

  /**
   * Get estimate
   * @return estimate
   */
  
  @Schema(name = "estimate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimate")
  public @Nullable Long getEstimate() {
    return estimate;
  }

  @JsonProperty("estimate")
  public void setEstimate(@Nullable Long estimate) {
    this.estimate = estimate;
  }

  public TargetingTemplateAudienceSizingReachEstimate lowerBound(@Nullable Long lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

  /**
   * Get lowerBound
   * @return lowerBound
   */
  
  @Schema(name = "lower_bound", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lower_bound")
  public @Nullable Long getLowerBound() {
    return lowerBound;
  }

  @JsonProperty("lower_bound")
  public void setLowerBound(@Nullable Long lowerBound) {
    this.lowerBound = lowerBound;
  }

  public TargetingTemplateAudienceSizingReachEstimate upperBound(@Nullable Long upperBound) {
    this.upperBound = upperBound;
    return this;
  }

  /**
   * Get upperBound
   * @return upperBound
   */
  
  @Schema(name = "upper_bound", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("upper_bound")
  public @Nullable Long getUpperBound() {
    return upperBound;
  }

  @JsonProperty("upper_bound")
  public void setUpperBound(@Nullable Long upperBound) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

