package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.IngestionSourceOptions;
import com.prokarma.pkmst.model.LookbackPeriodOptions;
import com.prokarma.pkmst.model.OverallStatusOptions;
import com.prokarma.pkmst.model.QualityComponents;
import com.prokarma.pkmst.model.SourcePlatformOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Schema for GET Conversion EQS response.
 */
@ApiModel(description = "Schema for GET Conversion EQS response.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EventQualityScore   {
  @JsonProperty("ingestion_source")
  private IngestionSourceOptions ingestionSource;

  @JsonProperty("lookback_period")
  private LookbackPeriodOptions lookbackPeriod;

  @JsonProperty("overall_status")
  private OverallStatusOptions overallStatus;

  @JsonProperty("quality_components")
  private QualityComponents qualityComponents;

  @JsonProperty("source_platform")
  private SourcePlatformOptions sourcePlatform;

  public EventQualityScore ingestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  /**
   * Get ingestionSource
   * @return ingestionSource
   */
  @ApiModelProperty(required = true, value = "")
  public IngestionSourceOptions getIngestionSource() {
    return ingestionSource;
  }

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
  @ApiModelProperty(required = true, value = "")
  public LookbackPeriodOptions getLookbackPeriod() {
    return lookbackPeriod;
  }

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
  @ApiModelProperty(required = true, value = "")
  public OverallStatusOptions getOverallStatus() {
    return overallStatus;
  }

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
  @ApiModelProperty(required = true, value = "")
  public QualityComponents getQualityComponents() {
    return qualityComponents;
  }

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
  @ApiModelProperty(required = true, value = "")
  public SourcePlatformOptions getSourcePlatform() {
    return sourcePlatform;
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

