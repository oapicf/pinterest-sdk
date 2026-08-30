package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 */
@ApiModel(description="ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.")

public class CatalogsRetailReportAllItemsFilter  {
  
 /**
  * Unique identifier of a catalog. If not given, oldest catalog will be used
  */
  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")
  private String catalogId;

 /**
  * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
  */
  @ApiModelProperty(value = "Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.")
  private String productGroupId;

public enum ReportTypeEnum {

    @JsonProperty("ALL_ITEMS") ALL_ITEMS(String.valueOf("ALL_ITEMS"));

    private String value;

    ReportTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportTypeEnum fromValue(String value) {
        for (ReportTypeEnum b : ReportTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private ReportTypeEnum reportType;
 /**
  * Unique identifier of a catalog. If not given, oldest catalog will be used
  * @return catalogId
  */
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsRetailReportAllItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
  * @return productGroupId
  */
  @JsonProperty("product_group_id")
 @Pattern(regexp="^\\d+$")  public String getProductGroupId() {
    return productGroupId;
  }

  /**
   * Sets the <code>productGroupId</code> property.
   */
 public void setProductGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
  }

  /**
   * Sets the <code>productGroupId</code> property.
   */
  public CatalogsRetailReportAllItemsFilter productGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
    return this;
  }

 /**
  * Get reportType
  * @return reportType
  */
  @JsonProperty("report_type")
  @NotNull
  public String getReportType() {
    return reportType == null ? null : reportType.value();
  }

  /**
   * Sets the <code>reportType</code> property.
   */
 public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  /**
   * Sets the <code>reportType</code> property.
   */
  public CatalogsRetailReportAllItemsFilter reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

