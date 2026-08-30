package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.")
public class CatalogsRetailReportAllItemsFilter   {
  
  private String catalogId;

  private String productGroupId;


public enum ReportTypeEnum {

    @JsonProperty("ALL_ITEMS") ALL_ITEMS(String.valueOf("ALL_ITEMS"));


    private String value;

    ReportTypeEnum(String v) {
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

  private ReportTypeEnum reportType;

  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   **/
  public CatalogsRetailReportAllItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
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
  public CatalogsRetailReportAllItemsFilter productGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
    return this;
  }

  
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
  public CatalogsRetailReportAllItemsFilter reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  
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

