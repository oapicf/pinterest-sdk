package apimodels;

import apimodels.CatalogsReportDistributionIssueFilter;
import apimodels.CatalogsReportFeedIngestionFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsHotelReportParametersReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsHotelReportParametersReport   {
  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES"),
    
    DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

    private final String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("report_type")
  
  private ReportTypeEnum reportType;

  @JsonProperty("feed_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String feedId;

  @JsonProperty("processing_result_id")
  @Pattern(regexp="^\\d+$")

  private String processingResultId;

  @JsonProperty("catalog_id")
  @Pattern(regexp="^\\d+$")

  private String catalogId;

  public CatalogsHotelReportParametersReport reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsHotelReportParametersReport feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * ID of the feed entity.
   * @return feedId
  **/
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsHotelReportParametersReport processingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
    return this;
  }

   /**
   * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
   * @return processingResultId
  **/
  public String getProcessingResultId() {
    return processingResultId;
  }

  public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }

  public CatalogsHotelReportParametersReport catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   * @return catalogId
  **/
  public String getCatalogId() {
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
    CatalogsHotelReportParametersReport catalogsHotelReportParametersReport = (CatalogsHotelReportParametersReport) o;
    return Objects.equals(reportType, catalogsHotelReportParametersReport.reportType) &&
        Objects.equals(feedId, catalogsHotelReportParametersReport.feedId) &&
        Objects.equals(processingResultId, catalogsHotelReportParametersReport.processingResultId) &&
        Objects.equals(catalogId, catalogsHotelReportParametersReport.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, feedId, processingResultId, catalogId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

