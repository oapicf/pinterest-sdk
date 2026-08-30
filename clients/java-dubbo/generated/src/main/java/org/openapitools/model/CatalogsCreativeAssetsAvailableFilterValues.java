package org.openapitools.model;

import org.openapitools.model.CatalogsCreativeAssetsFilterValuesMap;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsCreativeAssetsAvailableFilterValues implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("filter_values")
  private CatalogsCreativeAssetsFilterValuesMap filterValues;

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
   * @return filterValues
   */
  public CatalogsCreativeAssetsFilterValuesMap getFilterValues() {
    return filterValues;
  }

  public void setFilterValues(CatalogsCreativeAssetsFilterValuesMap filterValues) {
    this.filterValues = filterValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsAvailableFilterValues catalogsCreativeAssetsAvailableFilterValues = (CatalogsCreativeAssetsAvailableFilterValues) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsAvailableFilterValues.catalogType) &&
        Objects.equals(this.filterValues, catalogsCreativeAssetsAvailableFilterValues.filterValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, filterValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsAvailableFilterValues {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    filterValues: ").append(toIndentedString(filterValues)).append("\n");
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
