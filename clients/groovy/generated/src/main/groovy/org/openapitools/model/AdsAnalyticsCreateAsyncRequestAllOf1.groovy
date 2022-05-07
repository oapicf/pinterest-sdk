package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ReportingColumnAsync;

@Canonical
class AdsAnalyticsCreateAsyncRequestAllOf1 {
    /* Metric and entity columns */
    List<ReportingColumnAsync> columns = new ArrayList<ReportingColumnAsync>()
    /* Level of the report */
    MetricsReportingLevel level
    /* Specification for formatting report data */
    DataOutputFormat reportFormat = "JSON"
}
