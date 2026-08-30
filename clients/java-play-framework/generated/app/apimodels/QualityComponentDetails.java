package apimodels;

import apimodels.QualityComponentIssue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Metrics for a specific event type within a quality component.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QualityComponentDetails   {
  @JsonProperty("coverage")
  @NotNull
@Valid

  private BigDecimal coverage;

  @JsonProperty("issues")
  @Valid

  private List<@Valid QualityComponentIssue> issues = null;

  @JsonProperty("overlap")
  @Valid

  private BigDecimal overlap;

  public QualityComponentDetails coverage(BigDecimal coverage) {
    this.coverage = coverage;
    return this;
  }

   /**
   * Coverage percentage for this event type.
   * @return coverage
  **/
  public BigDecimal getCoverage() {
    return coverage;
  }

  public void setCoverage(BigDecimal coverage) {
    this.coverage = coverage;
  }

  public QualityComponentDetails issues(List<@Valid QualityComponentIssue> issues) {
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
  **/
  public List<@Valid QualityComponentIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<@Valid QualityComponentIssue> issues) {
    this.issues = issues;
  }

  public QualityComponentDetails overlap(BigDecimal overlap) {
    this.overlap = overlap;
    return this;
  }

   /**
   * Overlap percentage for this event type. Only populated for external_event_id
   * @return overlap
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

