package apimodels;

import apimodels.CatalogsHotelReportStatsParameters;
import apimodels.CatalogsHotelReportStatsParametersReport;
import apimodels.CatalogsRetailReportStatsParameters;
import apimodels.CatalogsType;
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
 * Report stats parameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReportsStatsParametersParameter   {
  @JsonProperty("catalog_type")
  @NotNull
@Valid

  private CatalogsType catalogType;

  @JsonProperty("report")
  @NotNull
@Valid

  private CatalogsHotelReportStatsParametersReport report;

  public ReportsStatsParametersParameter catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public ReportsStatsParametersParameter report(CatalogsHotelReportStatsParametersReport report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

