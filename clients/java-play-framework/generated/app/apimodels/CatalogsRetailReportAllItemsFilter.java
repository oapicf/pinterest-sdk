package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsRetailReportAllItemsFilter   {
  @JsonProperty("catalog_id")
  @Pattern(regexp="^\\d+$")

  private String catalogId;

  @JsonProperty("product_group_id")
  @Pattern(regexp="^\\d+$")

  private String productGroupId;

  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    ALL_ITEMS("ALL_ITEMS");

    private final String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTypeEnum fromValue(String value) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("report_type")
  @NotNull

  private ReportTypeEnum reportType;

  public CatalogsRetailReportAllItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   * @return catalogId
  **/
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailReportAllItemsFilter productGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
    return this;
  }

   /**
   * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
   * @return productGroupId
  **/
  public String getProductGroupId() {
    return productGroupId;
  }

  public void setProductGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
  }

  public CatalogsRetailReportAllItemsFilter reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailReportAllItemsFilter catalogsRetailReportAllItemsFilter = (CatalogsRetailReportAllItemsFilter) o;
    return Objects.equals(catalogId, catalogsRetailReportAllItemsFilter.catalogId) &&
        Objects.equals(productGroupId, catalogsRetailReportAllItemsFilter.productGroupId) &&
        Objects.equals(reportType, catalogsRetailReportAllItemsFilter.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, productGroupId, reportType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailReportAllItemsFilter {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    productGroupId: ").append(toIndentedString(productGroupId)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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

