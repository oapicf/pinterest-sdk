package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.CatalogsHotelReportParameters;
import org.openapitools.server.api.model.CatalogsHotelReportParametersReport;
import org.openapitools.server.api.model.CatalogsRetailReportParameters;
import org.openapitools.server.api.model.CatalogsType;

/**
 * Report parameters
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsReportParameters   {
  
  private CatalogsType catalogType;
  private CatalogsHotelReportParametersReport report;

  public CatalogsReportParameters () {

  }

  public CatalogsReportParameters (CatalogsType catalogType, CatalogsHotelReportParametersReport report) {
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
  public CatalogsHotelReportParametersReport getReport() {
    return report;
  }
  public void setReport(CatalogsHotelReportParametersReport report) {
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
    CatalogsReportParameters catalogsReportParameters = (CatalogsReportParameters) o;
    return Objects.equals(catalogType, catalogsReportParameters.catalogType) &&
        Objects.equals(report, catalogsReportParameters.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportParameters {\n");
    
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
