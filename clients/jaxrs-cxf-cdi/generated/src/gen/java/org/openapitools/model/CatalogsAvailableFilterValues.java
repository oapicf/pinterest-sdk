package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreativeAssetsAvailableFilterValues;
import org.openapitools.model.CatalogsCreativeAssetsFilterValuesMap;
import org.openapitools.model.CatalogsHotelAvailableFilterValues;
import org.openapitools.model.CatalogsRetailAvailableFilterValues;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object holding available filter values for each filter key
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Object holding available filter values for each filter key")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsAvailableFilterValues.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelAvailableFilterValues.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailAvailableFilterValues.class, name = "RETAIL"),
})

public class CatalogsAvailableFilterValues   {
  

public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


    private String value;

    CatalogTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CatalogTypeEnum catalogType;

  private CatalogsCreativeAssetsFilterValuesMap filterValues;

  /**
   **/
  public CatalogsAvailableFilterValues catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }


  /**
   **/
  public CatalogsAvailableFilterValues filterValues(CatalogsCreativeAssetsFilterValuesMap filterValues) {
    this.filterValues = filterValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filter_values")
  @NotNull
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
    return Objects.equals(this.catalogType, catalogsAvailableFilterValues.catalogType) &&
        Objects.equals(this.filterValues, catalogsAvailableFilterValues.filterValues);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

