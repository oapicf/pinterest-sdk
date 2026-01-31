package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsHotelReportStatsParameters;
import org.openapitools.vertxweb.server.model.CatalogsHotelReportStatsParametersReport;
import org.openapitools.vertxweb.server.model.CatalogsRetailReportStatsParameters;
import org.openapitools.vertxweb.server.model.CatalogsType;

/**
 * Report stats parameters
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportsStatsParametersParameter   {
  
  private CatalogsType catalogType;
  private CatalogsHotelReportStatsParametersReport report;

  public ReportsStatsParametersParameter () {

  }

  public ReportsStatsParametersParameter (CatalogsType catalogType, CatalogsHotelReportStatsParametersReport report) {
    this.catalogType = catalogType;
    this.report = report;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("report")
  public CatalogsHotelReportStatsParametersReport getReport() {
    return report;
  }
  public void setReport(CatalogsHotelReportStatsParametersReport report) {
    this.report = report;
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
    return Objects.equals(catalogType, reportsStatsParametersParameter.catalogType) &&
        Objects.equals(report, reportsStatsParametersParameter.report);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
