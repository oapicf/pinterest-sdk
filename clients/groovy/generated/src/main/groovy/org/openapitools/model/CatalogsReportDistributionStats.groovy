package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsReportDistributionStats {

    enum ReportTypeEnum {
    
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
    /* Indicates if issue makes items ineligible for ads distribution */
    Boolean ineligibleForAds
    /* Indicates if issue makes items ineligible for organic distribution */
    Boolean ineligibleForOrganic
}
