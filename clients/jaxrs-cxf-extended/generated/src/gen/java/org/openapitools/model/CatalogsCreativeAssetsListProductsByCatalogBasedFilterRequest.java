package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object to list products for a given creative assets catalog_id and product group filter.
 */
@ApiModel(description="Request object to list products for a given creative assets catalog_id and product group filter.")

public class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest  {
  
public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));

    private String value;

    CatalogTypeEnum (String v) {
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

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

 /**
  * Catalog id pertaining to the creative assets product group.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the creative assets product group.")
  private String catalogId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsCreativeAssetsProductGroupFilters filters;
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Catalog id pertaining to the creative assets product group.
  * @return catalogId
  */
  @JsonProperty("catalog_id")
  @NotNull
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
  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  @NotNull
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
 public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest filters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
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
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = (CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.catalogType) &&
        Objects.equals(this.catalogId, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.catalogId) &&
        Objects.equals(this.filters, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, catalogId, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

