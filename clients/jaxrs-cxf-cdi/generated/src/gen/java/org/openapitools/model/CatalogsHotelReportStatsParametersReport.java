package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.model.CatalogsReportFeedIngestionFilter;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "report_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsReportDistributionIssueFilter.class, name = "DISTRIBUTION_ISSUES"),
  @JsonSubTypes.Type(value = CatalogsReportFeedIngestionFilter.class, name = "FEED_INGESTION_ISSUES"),
})

public class CatalogsHotelReportStatsParametersReport   {
  
  private String feedId;

  private String processingResultId;


public enum ReportTypeEnum {

    @JsonProperty("DISTRIBUTION_ISSUES") DISTRIBUTION_ISSUES(String.valueOf("DISTRIBUTION_ISSUES"));


    private String value;

    ReportTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportTypeEnum fromValue(String value) {
        for (ReportTypeEnum b : ReportTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ReportTypeEnum reportType;

  private String catalogId;

  /**
   * ID of the feed entity.
   **/
  public CatalogsHotelReportStatsParametersReport feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID of the feed entity.")
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }


  /**
   * Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
   **/
  public CatalogsHotelReportStatsParametersReport processingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
  @JsonProperty("processing_result_id")
 @Pattern(regexp="^\\d+$")  public String getProcessingResultId() {
    return processingResultId;
  }
  public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }


  /**
   **/
  public CatalogsHotelReportStatsParametersReport reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("report_type")
  @NotNull
  public ReportTypeEnum getReportType() {
    return reportType;
  }
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }


  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   **/
  public CatalogsHotelReportStatsParametersReport catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelReportStatsParametersReport catalogsHotelReportStatsParametersReport = (CatalogsHotelReportStatsParametersReport) o;
    return Objects.equals(this.feedId, catalogsHotelReportStatsParametersReport.feedId) &&
        Objects.equals(this.processingResultId, catalogsHotelReportStatsParametersReport.processingResultId) &&
        Objects.equals(this.reportType, catalogsHotelReportStatsParametersReport.reportType) &&
        Objects.equals(this.catalogId, catalogsHotelReportStatsParametersReport.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, processingResultId, reportType, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelReportStatsParametersReport {\n");
    
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

