package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.OverallStatusOptions;
import org.openapitools.model.QualityComponents;
import org.openapitools.model.SourcePlatformOptions;
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
 * Schema for GET Conversion EQS response.
 **/
@ApiModel(description = "Schema for GET Conversion EQS response.")
@JsonTypeName("EventQualityScore")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EventQualityScore   {
  private IngestionSourceOptions ingestionSource;
  private LookbackPeriodOptions lookbackPeriod;
  private OverallStatusOptions overallStatus;
  private QualityComponents qualityComponents;
  private SourcePlatformOptions sourcePlatform;

  public EventQualityScore() {
  }

  @JsonCreator
  public EventQualityScore(
    @JsonProperty(required = true, value = "ingestion_source") IngestionSourceOptions ingestionSource,
    @JsonProperty(required = true, value = "lookback_period") LookbackPeriodOptions lookbackPeriod,
    @JsonProperty(required = true, value = "overall_status") OverallStatusOptions overallStatus,
    @JsonProperty(required = true, value = "quality_components") QualityComponents qualityComponents,
    @JsonProperty(required = true, value = "source_platform") SourcePlatformOptions sourcePlatform
  ) {
    this.ingestionSource = ingestionSource;
    this.lookbackPeriod = lookbackPeriod;
    this.overallStatus = overallStatus;
    this.qualityComponents = qualityComponents;
    this.sourcePlatform = sourcePlatform;
  }

  /**
   **/
  public EventQualityScore ingestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "ingestion_source")
  @NotNull public IngestionSourceOptions getIngestionSource() {
    return ingestionSource;
  }

  @JsonProperty(required = true, value = "ingestion_source")
  public void setIngestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   **/
  public EventQualityScore lookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "lookback_period")
  @NotNull public LookbackPeriodOptions getLookbackPeriod() {
    return lookbackPeriod;
  }

  @JsonProperty(required = true, value = "lookback_period")
  public void setLookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

  /**
   **/
  public EventQualityScore overallStatus(OverallStatusOptions overallStatus) {
    this.overallStatus = overallStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "overall_status")
  @NotNull public OverallStatusOptions getOverallStatus() {
    return overallStatus;
  }

  @JsonProperty(required = true, value = "overall_status")
  public void setOverallStatus(OverallStatusOptions overallStatus) {
    this.overallStatus = overallStatus;
  }

  /**
   **/
  public EventQualityScore qualityComponents(QualityComponents qualityComponents) {
    this.qualityComponents = qualityComponents;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "quality_components")
  @NotNull @Valid public QualityComponents getQualityComponents() {
    return qualityComponents;
  }

  @JsonProperty(required = true, value = "quality_components")
  public void setQualityComponents(QualityComponents qualityComponents) {
    this.qualityComponents = qualityComponents;
  }

  /**
   **/
  public EventQualityScore sourcePlatform(SourcePlatformOptions sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "source_platform")
  @NotNull public SourcePlatformOptions getSourcePlatform() {
    return sourcePlatform;
  }

  @JsonProperty(required = true, value = "source_platform")
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

