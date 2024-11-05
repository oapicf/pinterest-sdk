package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsReportDistributionStats;
import org.openapitools.model.CatalogsReportFeedIngestionStats;

@Canonical
class CatalogsReportStats {

    enum ReportTypeEnum {
    
        FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES"),
        
        DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES")
    
        private final String value
    
        ReportTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    ReportTypeEnum reportType
    /* ID of the catalog entity. */
    String catalogId
    /* The event code that a diagnostics aggregated number references */
    Integer code
    /* A human-friendly label for the event code (e.g, 'SPAM') */
    String codeLabel
    /* Title message describing the diagnostic issue */
    String message
    /* Number of occurrences of the issue */
    Integer occurrences

    enum SeverityEnum {
    
        WARN("WARN"),
        
        ERROR("ERROR")
    
        private final String value
    
        SeverityEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue */
    SeverityEnum severity
    /* Indicates if issue makes items ineligible for ads distribution */
    Boolean ineligibleForAds
    /* Indicates if issue makes items ineligible for organic distribution */
    Boolean ineligibleForOrganic
}
