package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelReportStatsParameters;
import org.openapitools.model.CatalogsHotelReportStatsParametersReport;
import org.openapitools.model.CatalogsRetailReportStatsParameters;
import org.openapitools.model.CatalogsType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelReportStatsParameters.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailReportStatsParameters.class, name = "RETAIL"),
})
/**
 * Report stats parameters
 **/
@ApiModel(description = "Report stats parameters")
@JsonTypeName("reports_stats_parameters_parameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ReportsStatsParametersParameter   {
  private CatalogsType catalogType;
  private CatalogsHotelReportStatsParametersReport report;

  public ReportsStatsParametersParameter() {
  }

  @JsonCreator
  public ReportsStatsParametersParameter(
    @JsonProperty(required = true, value = "catalog_type") CatalogsType catalogType,
    @JsonProperty(required = true, value = "report") CatalogsHotelReportStatsParametersReport report
  ) {
    this.catalogType = catalogType;
    this.report = report;
  }

  /**
   **/
  public ReportsStatsParametersParameter catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "catalog_type")
  @NotNull public CatalogsType getCatalogType() {
    return catalogType;
  }

  @JsonProperty(required = true, value = "catalog_type")
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public ReportsStatsParametersParameter report(CatalogsHotelReportStatsParametersReport report) {
    this.report = report;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "report")
  @NotNull @Valid public CatalogsHotelReportStatsParametersReport getReport() {
    return report;
  }

  @JsonProperty(required = true, value = "report")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

