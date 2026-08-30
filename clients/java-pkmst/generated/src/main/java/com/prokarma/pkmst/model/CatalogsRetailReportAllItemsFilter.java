package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 */
@ApiModel(description = "ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailReportAllItemsFilter   {
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("product_group_id")
  private String productGroupId;

  /**
   * Gets or Sets reportType
   */
  public enum ReportTypeEnum {
    ALL_ITEMS("ALL_ITEMS");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportTypeEnum fromValue(String text) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("report_type")
  private ReportTypeEnum reportType;

  public CatalogsRetailReportAllItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   * @return catalogId
   */
  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")
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
   */
  @ApiModelProperty(value = "Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.")
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
   */
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.catalogId, catalogsRetailReportAllItemsFilter.catalogId) &&
        Objects.equals(this.productGroupId, catalogsRetailReportAllItemsFilter.productGroupId) &&
        Objects.equals(this.reportType, catalogsRetailReportAllItemsFilter.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, productGroupId, reportType);
  }

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

