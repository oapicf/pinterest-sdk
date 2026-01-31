package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.OverallStatusOptions;
import org.openapitools.model.QualityComponents;
import org.openapitools.model.SourcePlatformOptions;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Schema for GET Conversion EQS response.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Schema for GET Conversion EQS response.")
public class EventQualityScore   {
  
  private IngestionSourceOptions ingestionSource;

  private LookbackPeriodOptions lookbackPeriod;

  private OverallStatusOptions overallStatus;

  private QualityComponents qualityComponents;

  private SourcePlatformOptions sourcePlatform;

  /**
   **/
  public EventQualityScore ingestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ingestion_source")
  @NotNull
  public IngestionSourceOptions getIngestionSource() {
    return ingestionSource;
  }
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
  @JsonProperty("lookback_period")
  @NotNull
  public LookbackPeriodOptions getLookbackPeriod() {
    return lookbackPeriod;
  }
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
  @JsonProperty("overall_status")
  @NotNull
  public OverallStatusOptions getOverallStatus() {
    return overallStatus;
  }
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
  @JsonProperty("quality_components")
  @NotNull
  public QualityComponents getQualityComponents() {
    return qualityComponents;
  }
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
  @JsonProperty("source_platform")
  @NotNull
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

