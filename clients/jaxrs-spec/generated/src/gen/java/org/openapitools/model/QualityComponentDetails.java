package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Metrics for a specific event type within a quality component.
 **/
@ApiModel(description = "Metrics for a specific event type within a quality component.")
@JsonTypeName("QualityComponentDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class QualityComponentDetails   {
  private BigDecimal coverage;
  private @Valid List<@Valid QualityComponentIssue> issues = new ArrayList<>();
  private BigDecimal overlap;

  public QualityComponentDetails() {
  }

  @JsonCreator
  public QualityComponentDetails(
    @JsonProperty(required = true, value = "coverage") BigDecimal coverage
  ) {
    this.coverage = coverage;
  }

  /**
   * Coverage percentage for this event type.
   **/
  public QualityComponentDetails coverage(BigDecimal coverage) {
    this.coverage = coverage;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Coverage percentage for this event type.")
  @JsonProperty(required = true, value = "coverage")
  @NotNull @Valid public BigDecimal getCoverage() {
    return coverage;
  }

  @JsonProperty(required = true, value = "coverage")
  public void setCoverage(BigDecimal coverage) {
    this.coverage = coverage;
  }

  /**
   * List of issues detected for this event type, if any.
   **/
  public QualityComponentDetails issues(List<@Valid QualityComponentIssue> issues) {
    this.issues = issues;
    return this;
  }

  
  @ApiModelProperty(value = "List of issues detected for this event type, if any.")
  @JsonProperty("issues")
  @Valid public List<@Valid QualityComponentIssue> getIssues() {
    return issues;
  }

  @JsonProperty("issues")
  public void setIssues(List<@Valid QualityComponentIssue> issues) {
    this.issues = issues;
  }

  public QualityComponentDetails addIssuesItem(QualityComponentIssue issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }

    this.issues.add(issuesItem);
    return this;
  }

  public QualityComponentDetails removeIssuesItem(QualityComponentIssue issuesItem) {
    if (issuesItem != null && this.issues != null) {
      this.issues.remove(issuesItem);
    }

    return this;
  }
  /**
   * Overlap percentage for this event type. Only populated for external_event_id
   **/
  public QualityComponentDetails overlap(BigDecimal overlap) {
    this.overlap = overlap;
    return this;
  }

  
  @ApiModelProperty(value = "Overlap percentage for this event type. Only populated for external_event_id")
  @JsonProperty("overlap")
  @Valid public BigDecimal getOverlap() {
    return overlap;
  }

  @JsonProperty("overlap")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

