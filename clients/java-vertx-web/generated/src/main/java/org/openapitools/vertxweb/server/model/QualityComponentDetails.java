package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.QualityComponentIssue;

/**
 * Metrics for a specific event type within a quality component.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QualityComponentDetails   {
  
  private BigDecimal coverage;
  private List<QualityComponentIssue> issues = new ArrayList<>();
  private BigDecimal overlap;

  public QualityComponentDetails () {

  }

  public QualityComponentDetails (BigDecimal coverage, List<QualityComponentIssue> issues, BigDecimal overlap) {
    this.coverage = coverage;
    this.issues = issues;
    this.overlap = overlap;
  }

    
  @JsonProperty("coverage")
  public BigDecimal getCoverage() {
    return coverage;
  }
  public void setCoverage(BigDecimal coverage) {
    this.coverage = coverage;
  }

    
  @JsonProperty("issues")
  public List<QualityComponentIssue> getIssues() {
    return issues;
  }
  public void setIssues(List<QualityComponentIssue> issues) {
    this.issues = issues;
  }

    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
