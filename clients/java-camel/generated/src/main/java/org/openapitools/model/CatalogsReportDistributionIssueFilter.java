package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsReportDistributionIssueFilter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsReportDistributionIssueFilter implements CatalogsHotelReportParametersReport {

  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ReportTypeEnum reportType;

  private String catalogId;

  public CatalogsReportDistributionIssueFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsReportDistributionIssueFilter(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsReportDistributionIssueFilter reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Get reportType
   * @return reportType
   */
  @NotNull 
  @Schema(name = "report_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("report_type")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public CatalogsReportDistributionIssueFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   * @return catalogId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", description = "Unique identifier of a catalog. If not given, oldest catalog will be used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_id")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

