package org.openapitools.model;

import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.OverallStatusOptions;
import org.openapitools.model.QualityComponents;
import org.openapitools.model.SourcePlatformOptions;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Schema for GET Conversion EQS response.
 */
public class EventQualityScore implements Serializable {
  private static final long serialVersionUID = 1L;

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

  /**
   * 
   * @return ingestionSource
   */
  public IngestionSourceOptions getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * 
   * @return lookbackPeriod
   */
  public LookbackPeriodOptions getLookbackPeriod() {
    return lookbackPeriod;
  }

  public void setLookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
    this.lookbackPeriod = lookbackPeriod;
  }

  /**
   * 
   * @return overallStatus
   */
  public OverallStatusOptions getOverallStatus() {
    return overallStatus;
  }

  public void setOverallStatus(OverallStatusOptions overallStatus) {
    this.overallStatus = overallStatus;
  }

  /**
   * 
   * @return qualityComponents
   */
  public QualityComponents getQualityComponents() {
    return qualityComponents;
  }

  public void setQualityComponents(QualityComponents qualityComponents) {
    this.qualityComponents = qualityComponents;
  }

  /**
   * 
   * @return sourcePlatform
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
