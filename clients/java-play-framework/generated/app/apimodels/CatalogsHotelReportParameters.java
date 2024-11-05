package apimodels;

import apimodels.CatalogsHotelReportParametersReport;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Parameters for hotel report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsHotelReportParameters   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("catalog_type")
  @NotNull

  private CatalogTypeEnum catalogType;

  @JsonProperty("report")
  @NotNull
@Valid

  private CatalogsHotelReportParametersReport report;

  public CatalogsHotelReportParameters catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelReportParameters report(CatalogsHotelReportParametersReport report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
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
    CatalogsHotelReportParameters catalogsHotelReportParameters = (CatalogsHotelReportParameters) o;
    return Objects.equals(catalogType, catalogsHotelReportParameters.catalogType) &&
        Objects.equals(report, catalogsHotelReportParameters.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, report);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelReportParameters {\n");
    
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

