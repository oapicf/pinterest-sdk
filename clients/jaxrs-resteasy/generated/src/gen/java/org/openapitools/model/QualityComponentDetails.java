package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityComponentIssue;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Metrics for a specific event type within a quality component.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class QualityComponentDetails   {
  
  private BigDecimal coverage;
  private List<@Valid QualityComponentIssue> issues = new ArrayList<>();
  private BigDecimal overlap;

  /**
   * Coverage percentage for this event type.
   **/
  
  @ApiModelProperty(required = true, value = "Coverage percentage for this event type.")
  @JsonProperty("coverage")
  @NotNull
  @Valid
  public BigDecimal getCoverage() {
    return coverage;
  }
  public void setCoverage(BigDecimal coverage) {
    this.coverage = coverage;
  }

  /**
   * List of issues detected for this event type, if any.
   **/
  
  @ApiModelProperty(value = "List of issues detected for this event type, if any.")
  @JsonProperty("issues")
  @Valid
  public List<@Valid QualityComponentIssue> getIssues() {
    return issues;
  }
  public void setIssues(List<@Valid QualityComponentIssue> issues) {
    this.issues = issues;
  }

  /**
   * Overlap percentage for this event type. Only populated for external_event_id
   **/
  
  @ApiModelProperty(value = "Overlap percentage for this event type. Only populated for external_event_id")
  @JsonProperty("overlap")
  @Valid
  public BigDecimal getOverlap() {
    return overlap;
  }
  public void setOverlap(BigDecimal overlap) {
    this.overlap = overlap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityComponentDetails qualityComponentDetails = (QualityComponentDetails) o;
    return Objects.equals(this.coverage, qualityComponentDetails.coverage) &&
        Objects.equals(this.issues, qualityComponentDetails.issues) &&
        Objects.equals(this.overlap, qualityComponentDetails.overlap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverage, issues, overlap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityComponentDetails {\n");
    
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    overlap: ").append(toIndentedString(overlap)).append("\n");
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

