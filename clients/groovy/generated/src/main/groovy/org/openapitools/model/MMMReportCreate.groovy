package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MMMReportGranularity;
import org.openapitools.model.MMMReportLevel;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;

@Canonical
class MMMReportCreate {
    /* Advertiser IDs for multi-advertiser report */
    List<String> advertiserIds = new ArrayList<>()
    /* Metric and entity columns */
    List<MMMReportingColumn> columns = new ArrayList<>()
    /* A List of countries for filtering */
    List<TargetingAdvertiserCountry> countries = new ArrayList<>()
    /* List of custom column IDs */
    List<String> customColumnIds = new ArrayList<>()
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    String endDate
    /*   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. */
    MMMReportGranularity granularity
    /* Level of the report */
    MMMReportLevel level
    /* Name of the Marketing Mix Modeling (MMM) report */
    String reportName
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    String startDate
    /* List of targeting types */
    List<MMMReportingTargetingType> targetingTypes = new ArrayList<>()
}
