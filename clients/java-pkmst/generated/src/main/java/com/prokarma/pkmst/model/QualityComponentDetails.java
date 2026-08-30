package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.QualityComponentIssue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Metrics for a specific event type within a quality component.
 */
@ApiModel(description = "Metrics for a specific event type within a quality component.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class QualityComponentDetails   {
  @JsonProperty("coverage")
  private BigDecimal coverage;

  @JsonProperty("issues")
  
  private List<QualityComponentIssue> issues = null;

  @JsonProperty("overlap")
  private BigDecimal overlap;

  public QualityComponentDetails coverage(BigDecimal coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Coverage percentage for this event type.
   * @return coverage
   */
  @ApiModelProperty(required = true, value = "Coverage percentage for this event type.")
  public BigDecimal getCoverage() {
    return coverage;
  }

  public void setCoverage(BigDecimal coverage) {
    this.coverage = coverage;
  }

  public QualityComponentDetails issues(List<QualityComponentIssue> issues) {
    this.issues = issues;
    return this;
  }

  public QualityComponentDetails addIssuesItem(QualityComponentIssue issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * List of issues detected for this event type, if any.
   * @return issues
   */
  @ApiModelProperty(value = "List of issues detected for this event type, if any.")
  public List<QualityComponentIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<QualityComponentIssue> issues) {
    this.issues = issues;
  }

  public QualityComponentDetails overlap(BigDecimal overlap) {
    this.overlap = overlap;
    return this;
  }

  /**
   * Overlap percentage for this event type. Only populated for external_event_id
   * @return overlap
   */
  @ApiModelProperty(value = "Overlap percentage for this event type. Only populated for external_event_id")
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

