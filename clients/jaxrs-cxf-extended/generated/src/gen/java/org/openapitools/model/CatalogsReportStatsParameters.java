package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CatalogsHotelReportStatsParameters;
import org.openapitools.model.CatalogsHotelReportStatsParametersReport;
import org.openapitools.model.CatalogsRetailReportStatsParameters;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelReportStatsParameters.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailReportStatsParameters.class, name = "RETAIL"),
})

/**
 * Report stats parameters
 */
@ApiModel(description="Report stats parameters")

public class CatalogsReportStatsParameters  {
  
public enum CatalogTypeEnum {

    @JsonProperty("HOTEL") HOTEL(String.valueOf("HOTEL"));

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
  @Valid
  private CatalogsHotelReportStatsParametersReport report;
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsReportStatsParameters catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get report
  * @return report
  */
  @JsonProperty("report")
  @NotNull
  public CatalogsHotelReportStatsParametersReport getReport() {
    return report;
  }

  /**
   * Sets the <code>report</code> property.
   */
 public void setReport(CatalogsHotelReportStatsParametersReport report) {
    this.report = report;
  }

  /**
   * Sets the <code>report</code> property.
   */
  public CatalogsReportStatsParameters report(CatalogsHotelReportStatsParametersReport report) {
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
    CatalogsReportStatsParameters catalogsReportStatsParameters = (CatalogsReportStatsParameters) o;
    return Objects.equals(this.catalogType, catalogsReportStatsParameters.catalogType) &&
        Objects.equals(this.report, catalogsReportStatsParameters.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsReportStatsParameters {\n");
    
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

