package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.IngestionSourceOptions;
import org.openapitools.vertxweb.server.model.LookbackPeriodOptions;
import org.openapitools.vertxweb.server.model.OverallStatusOptions;
import org.openapitools.vertxweb.server.model.QualityComponents;
import org.openapitools.vertxweb.server.model.SourcePlatformOptions;

/**
 * Schema for GET Conversion EQS response.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventQualityScore   {
  
  private IngestionSourceOptions ingestionSource;
  private LookbackPeriodOptions lookbackPeriod;
  private OverallStatusOptions overallStatus;
  private QualityComponents qualityComponents;
  private SourcePlatformOptions sourcePlatform;

  public EventQualityScore () {

  }

  public EventQualityScore (IngestionSourceOptions ingestionSource, LookbackPeriodOptions lookbackPeriod, OverallStatusOptions overallStatus, QualityComponents qualityComponents, SourcePlatformOptions sourcePlatform) {
    this.ingestionSource = ingestionSource;
    this.lookbackPeriod = lookbackPeriod;
    this.overallStatus = overallStatus;
    this.qualityComponents = qualityComponents;
    this.sourcePlatform = sourcePlatform;
  }

    
  @JsonProperty("ingestion_source")
  public IngestionSourceOptions getIngestionSource() {
    return ingestionSource;
  }
  public void setIngestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

    
  @JsonProperty("lookback_period")
  public LookbackPeriodOptions getLookbackPeriod() {
    return lookbackPeriod;
  }
  public void setLookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

    
  @JsonProperty("overall_status")
  public OverallStatusOptions getOverallStatus() {
    return overallStatus;
  }
  public void setOverallStatus(OverallStatusOptions overallStatus) {
    this.overallStatus = overallStatus;
  }

    
  @JsonProperty("quality_components")
  public QualityComponents getQualityComponents() {
    return qualityComponents;
  }
  public void setQualityComponents(QualityComponents qualityComponents) {
    this.qualityComponents = qualityComponents;
  }

    
  @JsonProperty("source_platform")
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
    return Objects.equals(ingestionSource, eventQualityScore.ingestionSource) &&
        Objects.equals(lookbackPeriod, eventQualityScore.lookbackPeriod) &&
        Objects.equals(overallStatus, eventQualityScore.overallStatus) &&
        Objects.equals(qualityComponents, eventQualityScore.qualityComponents) &&
        Objects.equals(sourcePlatform, eventQualityScore.sourcePlatform);
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
