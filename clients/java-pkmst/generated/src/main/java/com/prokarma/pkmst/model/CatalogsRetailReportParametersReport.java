package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsReportDistributionIssueFilter;
import com.prokarma.pkmst.model.CatalogsReportFeedIngestionFilter;
import com.prokarma.pkmst.model.CatalogsRetailReportAllItemsFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsRetailReportParametersReport
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "report_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsRetailReportAllItemsFilter.class, name = "ALL_ITEMS"),
  @JsonSubTypes.Type(value = CatalogsReportDistributionIssueFilter.class, name = "DISTRIBUTION_ISSUES"),
  @JsonSubTypes.Type(value = CatalogsReportFeedIngestionFilter.class, name = "FEED_INGESTION_ISSUES"),
})

public class CatalogsRetailReportParametersReport   {
  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("processing_result_id")
  private String processingResultId;

  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    ALL_ITEMS("ALL_ITEMS");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTypeEnum fromValue(String text) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("report_type")
  private ReportTypeEnum reportType;

  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("product_group_id")
  private String productGroupId;

  public CatalogsRetailReportParametersReport feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * ID of the feed entity.
   * @return feedId
   */
  @ApiModelProperty(required = true, value = "ID of the feed entity.")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsRetailReportParametersReport processingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
    return this;
  }

  /**
   * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
   * @return processingResultId
   */
  @ApiModelProperty(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
  public String getProcessingResultId() {
    return processingResultId;
  }

  public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }

  public CatalogsRetailReportParametersReport reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Get reportType
   * @return reportType
   */
  @ApiModelProperty(required = true, value = "")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsRetailReportParametersReport catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   * @return catalogId
   */
  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailReportParametersReport productGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
    return this;
  }

  /**
   * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
   * @return productGroupId
   */
  @ApiModelProperty(value = "Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.")
  public String getProductGroupId() {
    return productGroupId;
  }

  public void setProductGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailReportParametersReport catalogsRetailReportParametersReport = (CatalogsRetailReportParametersReport) o;
    return Objects.equals(this.feedId, catalogsRetailReportParametersReport.feedId) &&
        Objects.equals(this.processingResultId, catalogsRetailReportParametersReport.processingResultId) &&
        Objects.equals(this.reportType, catalogsRetailReportParametersReport.reportType) &&
        Objects.equals(this.catalogId, catalogsRetailReportParametersReport.catalogId) &&
        Objects.equals(this.productGroupId, catalogsRetailReportParametersReport.productGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, processingResultId, reportType, catalogId, productGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailReportParametersReport {\n");
    
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    productGroupId: ").append(toIndentedString(productGroupId)).append("\n");
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

