package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailReportAllItemsFilter   {
  
  private String catalogId;
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
  }

  private ReportTypeEnum reportType;

  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   **/
  
  @ApiModelProperty(value = "Unique identifier of a catalog. If not given, oldest catalog will be used")
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
   **/
  
  @ApiModelProperty(value = "Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.")
  @JsonProperty("product_group_id")
 @Pattern(regexp="^\\d+$")  public String getProductGroupId() {
    return productGroupId;
  }
  public void setProductGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("report_type")
  @NotNull
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

