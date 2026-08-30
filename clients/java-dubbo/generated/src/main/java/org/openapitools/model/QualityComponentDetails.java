package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.QualityComponentIssue;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Metrics for a specific event type within a quality component.
 */
public class QualityComponentDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Coverage percentage for this event type.
   */
  @JsonProperty("coverage")
  private BigDecimal coverage;

  /**
   * List of issues detected for this event type, if any.
   */
  @JsonProperty("issues")
  private List<QualityComponentIssue> issues = new ArrayList<>();

  /**
   * Overlap percentage for this event type. Only populated for external_event_id
   */
  @JsonProperty("overlap")
  private BigDecimal overlap;

  /**
   * Coverage percentage for this event type.
   * @return coverage
   */
  public BigDecimal getCoverage() {
    return coverage;
  }

  public void setCoverage(BigDecimal coverage) {
    this.coverage = coverage;
  }

  /**
   * List of issues detected for this event type, if any.
   * @return issues
   */
  public List<QualityComponentIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<QualityComponentIssue> issues) {
    this.issues = issues;
  }

  /**
   * Overlap percentage for this event type. Only populated for external_event_id
   * @return overlap
   */
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
