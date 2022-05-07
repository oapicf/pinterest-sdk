package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.vertxweb.server.model.DataOutputFormat;
import org.openapitools.vertxweb.server.model.MetricsReportingLevel;
import org.openapitools.vertxweb.server.model.ReportingColumnAsync;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsAnalyticsCreateAsyncRequestAllOf1   {
  
  private List<ReportingColumnAsync> columns = new ArrayList<>();
  private MetricsReportingLevel level;
  private DataOutputFormat reportFormat = "JSON";

  public AdsAnalyticsCreateAsyncRequestAllOf1 () {

  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 (List<ReportingColumnAsync> columns, MetricsReportingLevel level, DataOutputFormat reportFormat) {
    this.columns = columns;
    this.level = level;
    this.reportFormat = reportFormat;
  }

    
  @JsonProperty("columns")
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }
  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

    
  @JsonProperty("level")
  public MetricsReportingLevel getLevel() {
    return level;
  }
  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

    
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalyticsCreateAsyncRequestAllOf1 adsAnalyticsCreateAsyncRequestAllOf1 = (AdsAnalyticsCreateAsyncRequestAllOf1) o;
    return Objects.equals(columns, adsAnalyticsCreateAsyncRequestAllOf1.columns) &&
        Objects.equals(level, adsAnalyticsCreateAsyncRequestAllOf1.level) &&
        Objects.equals(reportFormat, adsAnalyticsCreateAsyncRequestAllOf1.reportFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, level, reportFormat);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
