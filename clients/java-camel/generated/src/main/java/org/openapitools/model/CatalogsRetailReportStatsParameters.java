package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CatalogsRetailReportStatsParametersReport;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Parameters for retail report
 */

@Schema(name = "CatalogsRetailReportStatsParameters", description = "Parameters for retail report")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailReportStatsParameters implements CatalogsReportStatsParameters {

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private final String value;

    CatalogTypeEnum(String value) {
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
    public static CatalogTypeEnum fromValue(String value) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CatalogTypeEnum catalogType;

  private CatalogsRetailReportStatsParametersReport report;

  public CatalogsRetailReportStatsParameters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailReportStatsParameters(CatalogTypeEnum catalogType, CatalogsRetailReportStatsParametersReport report) {
    this.catalogType = catalogType;
    this.report = report;
  }

  public CatalogsRetailReportStatsParameters catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailReportStatsParameters report(CatalogsRetailReportStatsParametersReport report) {
    this.report = report;
    return this;
  }

  /**
   * Get report
   * @return report
   */
  @NotNull @Valid 
  @Schema(name = "report", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("report")
  public CatalogsRetailReportStatsParametersReport getReport() {
    return report;
  }

  public void setReport(CatalogsRetailReportStatsParametersReport report) {
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
    CatalogsRetailReportStatsParameters catalogsRetailReportStatsParameters = (CatalogsRetailReportStatsParameters) o;
    return Objects.equals(this.catalogType, catalogsRetailReportStatsParameters.catalogType) &&
        Objects.equals(this.report, catalogsRetailReportStatsParameters.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailReportStatsParameters {\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

