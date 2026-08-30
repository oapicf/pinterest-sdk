package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityComponentIssue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Metrics for a specific event type within a quality component.
 */

@Schema(name = "QualityComponentDetails", description = "Metrics for a specific event type within a quality component.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class QualityComponentDetails {

  private BigDecimal coverage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid QualityComponentIssue> issues = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal overlap;

  public QualityComponentDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QualityComponentDetails(BigDecimal coverage) {
    this.coverage = coverage;
  }

  public QualityComponentDetails coverage(BigDecimal coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Coverage percentage for this event type.
   * @return coverage
   */
  @NotNull @Valid 
  @Schema(name = "coverage", description = "Coverage percentage for this event type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("coverage")
  public BigDecimal getCoverage() {
    return coverage;
  }

  @JsonProperty("coverage")
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
   */
  @Valid 
  @Schema(name = "issues", description = "List of issues detected for this event type, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issues")
  public List<@Valid QualityComponentIssue> getIssues() {
    return issues;
  }

  @JsonProperty("issues")
  public void setIssues(List<@Valid QualityComponentIssue> issues) {
    this.issues = issues;
  }

  public QualityComponentDetails overlap(@Nullable BigDecimal overlap) {
    this.overlap = overlap;
    return this;
  }

  /**
   * Overlap percentage for this event type. Only populated for external_event_id
   * @return overlap
   */
  @Valid 
  @Schema(name = "overlap", description = "Overlap percentage for this event type. Only populated for external_event_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overlap")
  public @Nullable BigDecimal getOverlap() {
    return overlap;
  }

  @JsonProperty("overlap")
  public void setOverlap(@Nullable BigDecimal overlap) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

