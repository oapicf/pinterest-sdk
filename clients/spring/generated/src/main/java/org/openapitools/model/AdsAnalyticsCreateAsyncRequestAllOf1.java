package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ReportingColumnAsync;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdsAnalyticsCreateAsyncRequestAllOf1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-08T00:42:02.037116Z[Etc/UTC]")
public class AdsAnalyticsCreateAsyncRequestAllOf1   {

  @JsonProperty("columns")
  @Valid
  private List<ReportingColumnAsync> columns = new ArrayList<>();

  @JsonProperty("level")
  private MetricsReportingLevel level;

  @JsonProperty("report_format")
  private DataOutputFormat reportFormat = "JSON";

  public AdsAnalyticsCreateAsyncRequestAllOf1 columns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 addColumnsItem(ReportingColumnAsync columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Metric and entity columns
   * @return columns
  */
  @NotNull @Valid 
  @Schema(name = "columns", description = "Metric and entity columns", required = true)
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 level(MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the report
   * @return level
  */
  @NotNull @Valid 
  @Schema(name = "level", example = "CAMPAIGN", description = "Level of the report", required = true)
  public MetricsReportingLevel getLevel() {
    return level;
  }

  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  /**
   * Specification for formatting report data
   * @return reportFormat
  */
  @Valid 
  @Schema(name = "report_format", description = "Specification for formatting report data", required = false)
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
    return Objects.equals(this.columns, adsAnalyticsCreateAsyncRequestAllOf1.columns) &&
        Objects.equals(this.level, adsAnalyticsCreateAsyncRequestAllOf1.level) &&
        Objects.equals(this.reportFormat, adsAnalyticsCreateAsyncRequestAllOf1.reportFormat);
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

