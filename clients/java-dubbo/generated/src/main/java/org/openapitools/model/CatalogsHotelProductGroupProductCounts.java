package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Product counts for a Hotel CatalogsProductGroup
 */
public class CatalogsHotelProductGroupProductCounts implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("total")
  private BigDecimal total;

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * 
   * @return total
   */
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelProductGroupProductCounts catalogsHotelProductGroupProductCounts = (CatalogsHotelProductGroupProductCounts) o;
    return Objects.equals(this.catalogType, catalogsHotelProductGroupProductCounts.catalogType) &&
        Objects.equals(this.total, catalogsHotelProductGroupProductCounts.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroupProductCounts {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
