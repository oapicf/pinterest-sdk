package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsAvailableFilterValues;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsFilterValuesMap;
import org.openapitools.vertxweb.server.model.CatalogsHotelAvailableFilterValues;
import org.openapitools.vertxweb.server.model.CatalogsRetailAvailableFilterValues;

/**
 * Object holding available filter values for each filter key
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsAvailableFilterValues   {
  


  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private CatalogsCreativeAssetsFilterValuesMap filterValues;

  public CatalogsAvailableFilterValues () {

  }

  public CatalogsAvailableFilterValues (CatalogTypeEnum catalogType, CatalogsCreativeAssetsFilterValuesMap filterValues) {
    this.catalogType = catalogType;
    this.filterValues = filterValues;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("filter_values")
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
    CatalogsAvailableFilterValues catalogsAvailableFilterValues = (CatalogsAvailableFilterValues) o;
    return Objects.equals(catalogType, catalogsAvailableFilterValues.catalogType) &&
        Objects.equals(filterValues, catalogsAvailableFilterValues.filterValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, filterValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsAvailableFilterValues {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
