/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityComponentIssue;



/**
 * Metrics for a specific event type within a quality component.
 */

@ApiModel(description = "Metrics for a specific event type within a quality component.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class QualityComponentDetails   {
  
  private BigDecimal coverage;
  private List<QualityComponentIssue> issues = new ArrayList<>();
  private BigDecimal overlap;

  /**
   * Coverage percentage for this event type.
   */
  public QualityComponentDetails coverage(BigDecimal coverage) {
    this.coverage = coverage;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Coverage percentage for this event type.")
  @JsonProperty("coverage")
  public BigDecimal getCoverage() {
    return coverage;
  }
  public void setCoverage(BigDecimal coverage) {
    this.coverage = coverage;
  }

  /**
   * List of issues detected for this event type, if any.
   */
  public QualityComponentDetails issues(List<QualityComponentIssue> issues) {
    this.issues = issues;
    return this;
  }

  
  @ApiModelProperty(value = "List of issues detected for this event type, if any.")
  @JsonProperty("issues")
  public List<QualityComponentIssue> getIssues() {
    return issues;
  }
  public void setIssues(List<QualityComponentIssue> issues) {
    this.issues = issues;
  }

  /**
   * Overlap percentage for this event type. Only populated for external_event_id
   */
  public QualityComponentDetails overlap(BigDecimal overlap) {
    this.overlap = overlap;
    return this;
  }

  
  @ApiModelProperty(value = "Overlap percentage for this event type. Only populated for external_event_id")
  @JsonProperty("overlap")
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
    return Objects.equals(coverage, qualityComponentDetails.coverage) &&
        Objects.equals(issues, qualityComponentDetails.issues) &&
        Objects.equals(overlap, qualityComponentDetails.overlap);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

