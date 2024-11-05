package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.model.CatalogsReportFeedIngestionFilter;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "report_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsReportDistributionIssueFilter.class, name = "DISTRIBUTION_ISSUES"),
  @JsonSubTypes.Type(value = CatalogsReportFeedIngestionFilter.class, name = "FEED_INGESTION_ISSUES"),
})


@JsonTypeName("CatalogsHotelReportParameters_report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsHotelReportParametersReport   {
  public enum ReportTypeEnum {

    FEED_INGESTION_ISSUES(String.valueOf("FEED_INGESTION_ISSUES")), DISTRIBUTION_ISSUES(String.valueOf("DISTRIBUTION_ISSUES"));


    private String value;

    ReportTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ReportTypeEnum fromString(String s) {
        for (ReportTypeEnum b : ReportTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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
  private String feedId;
  private String processingResultId;
  private String catalogId;

  /**
   **/
  public CatalogsHotelReportParametersReport reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  @JsonProperty("report_type")
  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * ID of the feed entity.
   **/
  public CatalogsHotelReportParametersReport feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID of the feed entity.")
  @JsonProperty("feed_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getFeedId() {
    return feedId;
  }

  @JsonProperty("feed_id")
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
   **/
  public CatalogsHotelReportParametersReport processingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
  @JsonProperty("processing_result_id")
   @Pattern(regexp="^\\d+$")public String getProcessingResultId() {
    return processingResultId;
  }

  @JsonProperty("processing_result_id")
  public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }

  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   **/
  public CatalogsHotelReportParametersReport catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")
  @JsonProperty("catalog_id")
   @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
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
    CatalogsHotelReportParametersReport catalogsHotelReportParametersReport = (CatalogsHotelReportParametersReport) o;
    return Objects.equals(this.reportType, catalogsHotelReportParametersReport.reportType) &&
        Objects.equals(this.feedId, catalogsHotelReportParametersReport.feedId) &&
        Objects.equals(this.processingResultId, catalogsHotelReportParametersReport.processingResultId) &&
        Objects.equals(this.catalogId, catalogsHotelReportParametersReport.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, feedId, processingResultId, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelReportParametersReport {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

