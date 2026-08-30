package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.IngestionSourceOptions;
import org.openapitools.server.model.LookbackPeriodOptions;
import org.openapitools.server.model.OverallStatusOptions;
import org.openapitools.server.model.QualityComponents;
import org.openapitools.server.model.SourcePlatformOptions;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Schema for GET Conversion EQS response.
 */
public class EventQualityScore   {

    private IngestionSourceOptions ingestionSource;
    private LookbackPeriodOptions lookbackPeriod;
    private OverallStatusOptions overallStatus;
    private QualityComponents qualityComponents;
    private SourcePlatformOptions sourcePlatform;

    /**
     * Default constructor.
     */
    public EventQualityScore() {
    // JSON-B / Jackson
    }

    /**
     * Create EventQualityScore.
     *
     * @param ingestionSource ingestionSource
     * @param lookbackPeriod lookbackPeriod
     * @param overallStatus overallStatus
     * @param qualityComponents qualityComponents
     * @param sourcePlatform sourcePlatform
     */
    public EventQualityScore(
        IngestionSourceOptions ingestionSource, 
        LookbackPeriodOptions lookbackPeriod, 
        OverallStatusOptions overallStatus, 
        QualityComponents qualityComponents, 
        SourcePlatformOptions sourcePlatform
    ) {
        this.ingestionSource = ingestionSource;
        this.lookbackPeriod = lookbackPeriod;
        this.overallStatus = overallStatus;
        this.qualityComponents = qualityComponents;
        this.sourcePlatform = sourcePlatform;
    }



    /**
     * Get ingestionSource
     * @return ingestionSource
     */
    public IngestionSourceOptions getIngestionSource() {
        return ingestionSource;
    }

    public void setIngestionSource(IngestionSourceOptions ingestionSource) {
        this.ingestionSource = ingestionSource;
    }

    /**
     * Get lookbackPeriod
     * @return lookbackPeriod
     */
    public LookbackPeriodOptions getLookbackPeriod() {
        return lookbackPeriod;
    }

    public void setLookbackPeriod(LookbackPeriodOptions lookbackPeriod) {
        this.lookbackPeriod = lookbackPeriod;
    }

    /**
     * Get overallStatus
     * @return overallStatus
     */
    public OverallStatusOptions getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(OverallStatusOptions overallStatus) {
        this.overallStatus = overallStatus;
    }

    /**
     * Get qualityComponents
     * @return qualityComponents
     */
    public QualityComponents getQualityComponents() {
        return qualityComponents;
    }

    public void setQualityComponents(QualityComponents qualityComponents) {
        this.qualityComponents = qualityComponents;
    }

    /**
     * Get sourcePlatform
     * @return sourcePlatform
     */
    public SourcePlatformOptions getSourcePlatform() {
        return sourcePlatform;
    }

    public void setSourcePlatform(SourcePlatformOptions sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

