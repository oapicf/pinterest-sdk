package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.model.CatalogsReportFeedIngestionFilter;

@Canonical
class CatalogsHotelReportParametersReport {

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
    /* ID of the feed entity. */
    String feedId
    /* Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
    String processingResultId
    /* Unique identifier of a catalog. If not given, oldest catalog will be used */
    String catalogId
}
