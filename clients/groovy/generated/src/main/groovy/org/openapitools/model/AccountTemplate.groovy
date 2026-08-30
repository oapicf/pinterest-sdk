package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.CreationSource;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.Granularity;
import org.openapitools.model.IngestionSource;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ReportingColumn;
import org.openapitools.model.ReportingTimeZone;

@Canonical
class AccountTemplate {
    /* ID of the Ad Account that owns the template */
    String adAccountId
    /* IDs of the Ad Accounts that have access to this template */
    List<String> adAccountIds = new ArrayList<>()
    /* A list of ADE columns */
    List<String> adeColumns = new ArrayList<>()
    /* Attribution type for Brand/Category/SKU reports */
    Object attributionType = null
    /* The length of the sliding window over which click conversions will be attributed */
    BigDecimal clickWindowDays
    /* A list of columns to be included in the report */
    List<ReportingColumn> columns = new ArrayList<>()
    /* Conversion report time type */
    ConversionReportTimeType conversionReportTimeType
    /* The surface used to create this template */
    CreationSource creationSource
    /* A list of custom column IDs */
    List<String> customColumnIds
    /* Additional metadata about this reporting template */
    String displayMetadata
    /* The length of the sliding window over which engagement conversions will be attributed */
    BigDecimal engagementWindowDays
    /* A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values */
    String filtersJson
    
    Granularity granularity
    /* Template ID */
    String id
    /* The filter on the conversion ingestion source method for conversion metrics */
    List<IngestionSource> ingestionSources
    /* A boolean representing if this is the default view that loads for this template type */
    Boolean isDefault
    /* A boolean that indicates if the template has been deleted */
    Boolean isDeleted
    /* A boolean value that indicates if the user owns the template */
    Boolean isOwnedByUser
    /* A boolean value that indicates if this template has been used to create a scheduled report */
    Boolean isScheduled
    /* Template Name */
    String name
    /* The number of days prior to the day the report will be delivered at which the report will end */
    BigDecimal reportEndRelativeDaysInPast
    
    DataOutputFormat reportFormat
    
    MetricsReportingLevel reportLevel
    /* The number of days prior to the day the report will be delivered at which the report will start */
    BigDecimal reportStartRelativeDaysInPast
    /* Timezone for reporting data */
    ReportingTimeZone reportingTimeZone
    /* Unified metric sort configuration */
    Object sortBy = null
    /* Type of the template */
    String type
    /* Time of last update in seconds since Unix epoch */
    BigDecimal updatedTime
    /* ID of the user who created the template */
    String userId
    /* The length of the sliding window over which view conversions will be attributed */
    BigDecimal viewWindowDays
}
