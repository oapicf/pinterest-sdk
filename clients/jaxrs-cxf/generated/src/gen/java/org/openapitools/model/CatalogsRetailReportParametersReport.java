package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.model.CatalogsReportFeedIngestionFilter;
import org.openapitools.model.CatalogsRetailReportAllItemsFilter;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "report_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsRetailReportAllItemsFilter.class, name = "ALL_ITEMS"),
  @JsonSubTypes.Type(value = CatalogsReportDistributionIssueFilter.class, name = "DISTRIBUTION_ISSUES"),
  @JsonSubTypes.Type(value = CatalogsReportFeedIngestionFilter.class, name = "FEED_INGESTION_ISSUES"),
})

public class CatalogsRetailReportParametersReport  {
  
 /**
  * ID of the feed entity.
  */
  @ApiModelProperty(required = true, value = "ID of the feed entity.")

  private String feedId;

 /**
  * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
  */
  @ApiModelProperty(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")

  private String processingResultId;

public enum ReportTypeEnum {

ALL_ITEMS(String.valueOf("ALL_ITEMS"));


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

  @ApiModelProperty(required = true, value = "")

  private ReportTypeEnum reportType;

 /**
  * Unique identifier of a catalog. If not given, oldest catalog will be used
  */
  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")

  private String catalogId;

 /**
  * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
  */
  @ApiModelProperty(value = "Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.")

  private String productGroupId;
 /**
   * ID of the feed entity.
   * @return feedId
  **/
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsRetailReportParametersReport feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

 /**
   * Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
   * @return processingResultId
  **/
  @JsonProperty("processing_result_id")
 @Pattern(regexp="^\\d+$")  public String getProcessingResultId() {
    return processingResultId;
  }

  public void setProcessingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
  }

  public CatalogsRetailReportParametersReport processingResultId(String processingResultId) {
    this.processingResultId = processingResultId;
    return this;
  }

 /**
   * Get reportType
   * @return reportType
  **/
  @JsonProperty("report_type")
  @NotNull
  public String getReportType() {
    if (reportType == null) {
      return null;
    }
    return reportType.value();
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsRetailReportParametersReport reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

 /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailReportParametersReport catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
   * @return productGroupId
  **/
  @JsonProperty("product_group_id")
 @Pattern(regexp="^\\d+$")  public String getProductGroupId() {
    return productGroupId;
  }

  public void setProductGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
  }

  public CatalogsRetailReportParametersReport productGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

