package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsProductGroupFilters;

/**
 * Request object to list products for a given creative assets catalog_id and product group filter.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest   {
  


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
  private String catalogId;
  private CatalogsCreativeAssetsProductGroupFilters filters;

  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest () {

  }

  public CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest (CatalogTypeEnum catalogType, String catalogId, CatalogsCreativeAssetsProductGroupFilters filters) {
    this.catalogType = catalogType;
    this.catalogId = catalogId;
    this.filters = filters;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("filters")
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
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
    return Objects.equals(catalogType, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.catalogType) &&
        Objects.equals(catalogId, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.catalogId) &&
        Objects.equals(filters, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.filters);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
