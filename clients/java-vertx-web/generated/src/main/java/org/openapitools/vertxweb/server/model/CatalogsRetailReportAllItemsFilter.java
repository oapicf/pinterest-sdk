package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailReportAllItemsFilter   {
  
  private String catalogId;
  private String productGroupId;


  public enum ReportTypeEnum {
    ALL_ITEMS("ALL_ITEMS");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ReportTypeEnum reportType;

  public CatalogsRetailReportAllItemsFilter () {

  }

  public CatalogsRetailReportAllItemsFilter (String catalogId, String productGroupId, ReportTypeEnum reportType) {
    this.catalogId = catalogId;
    this.productGroupId = productGroupId;
    this.reportType = reportType;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("product_group_id")
  public String getProductGroupId() {
    return productGroupId;
  }
  public void setProductGroupId(String productGroupId) {
    this.productGroupId = productGroupId;
  }

    
  @JsonProperty("report_type")
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
