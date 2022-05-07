package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ReportingColumnAsync;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdsAnalyticsCreateAsyncRequestAllOf1  {
  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
 /**
   * Metric and entity columns
  **/
  private List<ReportingColumnAsync> columns = new ArrayList<ReportingColumnAsync>();

  @ApiModelProperty(example = "CAMPAIGN", required = true, value = "Level of the report")
 /**
   * Level of the report
  **/
  private MetricsReportingLevel level;

  @ApiModelProperty(value = "Specification for formatting report data")
 /**
   * Specification for formatting report data
  **/
  private DataOutputFormat reportFormat = "JSON";
 /**
   * Metric and entity columns
   * @return columns
  **/
  @JsonProperty("columns")
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 columns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 addColumnsItem(ReportingColumnAsync columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
   * Level of the report
   * @return level
  **/
  @JsonProperty("level")
  public MetricsReportingLevel getLevel() {
    return level;
  }

  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 level(MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

 /**
   * Specification for formatting report data
   * @return reportFormat
  **/
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsCreateAsyncRequestAllOf1 {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

