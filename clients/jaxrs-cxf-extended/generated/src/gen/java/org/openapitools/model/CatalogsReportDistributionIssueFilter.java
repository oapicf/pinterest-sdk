package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsReportDistributionIssueFilter  {
  
public enum ReportTypeEnum {

    @JsonProperty("DISTRIBUTION_ISSUES") DISTRIBUTION_ISSUES(String.valueOf("DISTRIBUTION_ISSUES"));

    private String value;

    ReportTypeEnum (String v) {
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

  @ApiModelProperty(required = true, value = "")
  private ReportTypeEnum reportType;

 /**
  * Unique identifier of a catalog. If not given, oldest catalog will be used
  */
  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")
  private String catalogId;
 /**
  * Get reportType
  * @return reportType
  */
  @JsonProperty("report_type")
  @NotNull
  public String getReportType() {
    return reportType == null ? null : reportType.value();
  }

  /**
   * Sets the <code>reportType</code> property.
   */
 public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * Sets the <code>reportType</code> property.
   */
  public CatalogsReportDistributionIssueFilter reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

 /**
  * Unique identifier of a catalog. If not given, oldest catalog will be used
  * @return catalogId
  */
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsReportDistributionIssueFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
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
    CatalogsReportDistributionIssueFilter catalogsReportDistributionIssueFilter = (CatalogsReportDistributionIssueFilter) o;
    return Objects.equals(this.reportType, catalogsReportDistributionIssueFilter.reportType) &&
        Objects.equals(this.catalogId, catalogsReportDistributionIssueFilter.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportDistributionIssueFilter {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

