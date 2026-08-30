package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.OverallStatusOptions;
import org.openapitools.model.QualityComponents;
import org.openapitools.model.SourcePlatformOptions;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Schema for GET Conversion EQS response.
 */

@Schema(name = "EventQualityScore", description = "Schema for GET Conversion EQS response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EventQualityScore {

  private IngestionSourceOptions ingestionSource;

  private LookbackPeriodOptions lookbackPeriod;

  private OverallStatusOptions overallStatus;

  private QualityComponents qualityComponents;

  private SourcePlatformOptions sourcePlatform;

  public EventQualityScore() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EventQualityScore(IngestionSourceOptions ingestionSource, LookbackPeriodOptions lookbackPeriod, OverallStatusOptions overallStatus, QualityComponents qualityComponents, SourcePlatformOptions sourcePlatform) {
    this.ingestionSource = ingestionSource;
    this.lookbackPeriod = lookbackPeriod;
    this.overallStatus = overallStatus;
    this.qualityComponents = qualityComponents;
    this.sourcePlatform = sourcePlatform;
  }

  public EventQualityScore ingestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  /**
   * Get ingestionSource
   * @return ingestionSource
   */
  @NotNull @Valid 
  @Schema(name = "ingestion_source", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ingestion_source")
  public IngestionSourceOptions getIngestionSource() {
    return ingestionSource;
  }

  @JsonProperty("ingestion_source")
  public void setIngestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  public EventQualityScore lookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
    return this;
  }

  /**
   * Get lookbackPeriod
   * @return lookbackPeriod
   */
  @NotNull @Valid 
  @Schema(name = "lookback_period", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lookback_period")
  public LookbackPeriodOptions getLookbackPeriod() {
    return lookbackPeriod;
  }

  @JsonProperty("lookback_period")
  public void setLookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

  public EventQualityScore overallStatus(OverallStatusOptions overallStatus) {
    this.overallStatus = overallStatus;
    return this;
  }

  /**
   * Get overallStatus
   * @return overallStatus
   */
  @NotNull @Valid 
  @Schema(name = "overall_status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("overall_status")
  public OverallStatusOptions getOverallStatus() {
    return overallStatus;
  }

  @JsonProperty("overall_status")
  public void setOverallStatus(OverallStatusOptions overallStatus) {
    this.overallStatus = overallStatus;
  }

  public EventQualityScore qualityComponents(QualityComponents qualityComponents) {
    this.qualityComponents = qualityComponents;
    return this;
  }

  /**
   * Get qualityComponents
   * @return qualityComponents
   */
  @NotNull @Valid 
  @Schema(name = "quality_components", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quality_components")
  public QualityComponents getQualityComponents() {
    return qualityComponents;
  }

  @JsonProperty("quality_components")
  public void setQualityComponents(QualityComponents qualityComponents) {
    this.qualityComponents = qualityComponents;
  }

  public EventQualityScore sourcePlatform(SourcePlatformOptions sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
    return this;
  }

  /**
   * Get sourcePlatform
   * @return sourcePlatform
   */
  @NotNull @Valid 
  @Schema(name = "source_platform", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source_platform")
  public SourcePlatformOptions getSourcePlatform() {
    return sourcePlatform;
  }

  @JsonProperty("source_platform")
  public void setSourcePlatform(SourcePlatformOptions sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventQualityScore eventQualityScore = (EventQualityScore) o;
    return Objects.equals(this.ingestionSource, eventQualityScore.ingestionSource) &&
        Objects.equals(this.lookbackPeriod, eventQualityScore.lookbackPeriod) &&
        Objects.equals(this.overallStatus, eventQualityScore.overallStatus) &&
        Objects.equals(this.qualityComponents, eventQualityScore.qualityComponents) &&
        Objects.equals(this.sourcePlatform, eventQualityScore.sourcePlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestionSource, lookbackPeriod, overallStatus, qualityComponents, sourcePlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventQualityScore {\n");
    sb.append("    ingestionSource: ").append(toIndentedString(ingestionSource)).append("\n");
    sb.append("    lookbackPeriod: ").append(toIndentedString(lookbackPeriod)).append("\n");
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    qualityComponents: ").append(toIndentedString(qualityComponents)).append("\n");
    sb.append("    sourcePlatform: ").append(toIndentedString(sourcePlatform)).append("\n");
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

