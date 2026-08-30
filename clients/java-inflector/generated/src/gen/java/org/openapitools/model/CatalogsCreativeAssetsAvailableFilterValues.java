package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreativeAssetsFilterValuesMap;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsCreativeAssetsAvailableFilterValues   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String text) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catalog_type")
  private CatalogTypeEnum catalogType;

  @JsonProperty("filter_values")
  private CatalogsCreativeAssetsFilterValuesMap filterValues;

  /**
   **/
  public CatalogsCreativeAssetsAvailableFilterValues catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsCreativeAssetsAvailableFilterValues filterValues(CatalogsCreativeAssetsFilterValuesMap filterValues) {
    this.filterValues = filterValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    CatalogsCreativeAssetsAvailableFilterValues catalogsCreativeAssetsAvailableFilterValues = (CatalogsCreativeAssetsAvailableFilterValues) o;
    return Objects.equals(catalogType, catalogsCreativeAssetsAvailableFilterValues.catalogType) &&
        Objects.equals(filterValues, catalogsCreativeAssetsAvailableFilterValues.filterValues);
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

