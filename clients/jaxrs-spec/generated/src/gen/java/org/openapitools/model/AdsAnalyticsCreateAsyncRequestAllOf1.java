package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ReportingColumnAsync;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdsAnalyticsCreateAsyncRequest_allOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class AdsAnalyticsCreateAsyncRequestAllOf1   {
  
  private @Valid List<ReportingColumnAsync> columns = new ArrayList<ReportingColumnAsync>();
  private @Valid MetricsReportingLevel level;
  private @Valid DataOutputFormat reportFormat = "JSON";

  /**
   * Metric and entity columns
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf1 columns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty("columns")
  @NotNull
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  @JsonProperty("columns")
  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 addColumnsItem(ReportingColumnAsync columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ReportingColumnAsync>();
    }

    this.columns.add(columnsItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf1 removeColumnsItem(ReportingColumnAsync columnsItem) {
    if (columnsItem != null && this.columns != null) {
      this.columns.remove(columnsItem);
    }

    return this;
  }
/**
   * Level of the report
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf1 level(MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

  

  
  @ApiModelProperty(example = "CAMPAIGN", required = true, value = "Level of the report")
  @JsonProperty("level")
  @NotNull
  public MetricsReportingLevel getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

/**
   * Specification for formatting report data
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf1 reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  

  
  @ApiModelProperty(value = "Specification for formatting report data")
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  @JsonProperty("report_format")
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

