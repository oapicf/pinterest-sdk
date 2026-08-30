package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.OverallStatusOptions;
import org.openapitools.model.QualityComponents;
import org.openapitools.model.SourcePlatformOptions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Schema for GET Conversion EQS response.
 */
@ApiModel(description="Schema for GET Conversion EQS response.")

public class EventQualityScore  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private IngestionSourceOptions ingestionSource;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private LookbackPeriodOptions lookbackPeriod;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OverallStatusOptions overallStatus;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private QualityComponents qualityComponents;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private SourcePlatformOptions sourcePlatform;
 /**
  * Get ingestionSource
  * @return ingestionSource
  */
  @JsonProperty("ingestion_source")
  @NotNull
  public IngestionSourceOptions getIngestionSource() {
    return ingestionSource;
  }

  /**
   * Sets the <code>ingestionSource</code> property.
   */
 public void setIngestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * Sets the <code>ingestionSource</code> property.
   */
  public EventQualityScore ingestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

 /**
  * Get lookbackPeriod
  * @return lookbackPeriod
  */
  @JsonProperty("lookback_period")
  @NotNull
  public LookbackPeriodOptions getLookbackPeriod() {
    return lookbackPeriod;
  }

  /**
   * Sets the <code>lookbackPeriod</code> property.
   */
 public void setLookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

  /**
   * Sets the <code>lookbackPeriod</code> property.
   */
  public EventQualityScore lookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
    return this;
  }

 /**
  * Get overallStatus
  * @return overallStatus
  */
  @JsonProperty("overall_status")
  @NotNull
  public OverallStatusOptions getOverallStatus() {
    return overallStatus;
  }

  /**
   * Sets the <code>overallStatus</code> property.
   */
 public void setOverallStatus(OverallStatusOptions overallStatus) {
    this.overallStatus = overallStatus;
  }

  /**
   * Sets the <code>overallStatus</code> property.
   */
  public EventQualityScore overallStatus(OverallStatusOptions overallStatus) {
    this.overallStatus = overallStatus;
    return this;
  }

 /**
  * Get qualityComponents
  * @return qualityComponents
  */
  @JsonProperty("quality_components")
  @NotNull
  public QualityComponents getQualityComponents() {
    return qualityComponents;
  }

  /**
   * Sets the <code>qualityComponents</code> property.
   */
 public void setQualityComponents(QualityComponents qualityComponents) {
    this.qualityComponents = qualityComponents;
  }

  /**
   * Sets the <code>qualityComponents</code> property.
   */
  public EventQualityScore qualityComponents(QualityComponents qualityComponents) {
    this.qualityComponents = qualityComponents;
    return this;
  }

 /**
  * Get sourcePlatform
  * @return sourcePlatform
  */
  @JsonProperty("source_platform")
  @NotNull
  public SourcePlatformOptions getSourcePlatform() {
    return sourcePlatform;
  }

  /**
   * Sets the <code>sourcePlatform</code> property.
   */
 public void setSourcePlatform(SourcePlatformOptions sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
  }

  /**
   * Sets the <code>sourcePlatform</code> property.
   */
  public EventQualityScore sourcePlatform(SourcePlatformOptions sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

