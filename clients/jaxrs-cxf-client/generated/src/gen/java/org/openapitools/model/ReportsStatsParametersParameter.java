package org.openapitools.model;

import org.openapitools.model.CatalogsHotelReportStatsParameters;
import org.openapitools.model.CatalogsHotelReportStatsParametersReport;
import org.openapitools.model.CatalogsRetailReportStatsParameters;
import org.openapitools.model.CatalogsType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Report stats parameters
 */
@ApiModel(description="Report stats parameters")

public class ReportsStatsParametersParameter  {
  
  @ApiModelProperty(required = true, value = "")

  private CatalogsType catalogType;

  @ApiModelProperty(required = true, value = "")

  private CatalogsHotelReportStatsParametersReport report;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public ReportsStatsParametersParameter catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Get report
   * @return report
  **/
  @JsonProperty("report")
  public CatalogsHotelReportStatsParametersReport getReport() {
    return report;
  }

  public void setReport(CatalogsHotelReportStatsParametersReport report) {
    this.report = report;
  }

  public ReportsStatsParametersParameter report(CatalogsHotelReportStatsParametersReport report) {
    this.report = report;
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
    ReportsStatsParametersParameter reportsStatsParametersParameter = (ReportsStatsParametersParameter) o;
    return Objects.equals(this.catalogType, reportsStatsParametersParameter.catalogType) &&
        Objects.equals(this.report, reportsStatsParametersParameter.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsStatsParametersParameter {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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

