package org.openapitools.model;

import org.openapitools.model.CatalogsHotelReportStatsParametersReport;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for hotel report
 */
@ApiModel(description="Parameters for hotel report")

public class CatalogsHotelReportStatsParameters  {
  
public enum CatalogTypeEnum {

HOTEL(String.valueOf("HOTEL"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private CatalogTypeEnum catalogType;

  @ApiModelProperty(required = true, value = "")

  private CatalogsHotelReportStatsParametersReport report;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelReportStatsParameters catalogType(CatalogTypeEnum catalogType) {
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

  public CatalogsHotelReportStatsParameters report(CatalogsHotelReportStatsParametersReport report) {
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
    CatalogsHotelReportStatsParameters catalogsHotelReportStatsParameters = (CatalogsHotelReportStatsParameters) o;
    return Objects.equals(this.catalogType, catalogsHotelReportStatsParameters.catalogType) &&
        Objects.equals(this.report, catalogsHotelReportStatsParameters.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelReportStatsParameters {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

