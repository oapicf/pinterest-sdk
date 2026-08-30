package apimodels;

import apimodels.IngestionSourceOptions;
import apimodels.LookbackPeriodOptions;
import apimodels.OverallStatusOptions;
import apimodels.QualityComponents;
import apimodels.SourcePlatformOptions;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Schema for GET Conversion EQS response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EventQualityScore   {
  @JsonProperty("ingestion_source")
  @NotNull
@Valid

  private IngestionSourceOptions ingestionSource;

  @JsonProperty("lookback_period")
  @NotNull
@Valid

  private LookbackPeriodOptions lookbackPeriod;

  @JsonProperty("overall_status")
  @NotNull
@Valid

  private OverallStatusOptions overallStatus;

  @JsonProperty("quality_components")
  @NotNull
@Valid

  private QualityComponents qualityComponents;

  @JsonProperty("source_platform")
  @NotNull
@Valid

  private SourcePlatformOptions sourcePlatform;

  public EventQualityScore ingestionSource(IngestionSourceOptions ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

   /**
   * Get ingestionSource
   * @return ingestionSource
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

