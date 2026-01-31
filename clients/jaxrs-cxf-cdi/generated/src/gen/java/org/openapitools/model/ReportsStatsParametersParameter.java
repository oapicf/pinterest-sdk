package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

/**
 * Report stats parameters
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Report stats parameters")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelReportStatsParameters.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailReportStatsParameters.class, name = "RETAIL"),
})

public class ReportsStatsParametersParameter   {
  
  private CatalogsType catalogType;

  private CatalogsHotelReportStatsParametersReport report;

  /**
   **/
  public ReportsStatsParametersParameter catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }
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
  @JsonProperty("report")
  @NotNull
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

