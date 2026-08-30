package org.openapitools.model;

import org.openapitools.model.CatalogsCreativeAssetsBatchItem;
import org.openapitools.model.CatalogsCreativeAssetsBatchRequest;
import org.openapitools.model.CatalogsHotelBatchRequest;
import org.openapitools.model.CatalogsRetailBatchRequest;
import org.openapitools.model.Country;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A request object that can have multiple operations on a single batch
 */
public class CatalogsVerticalBatchRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("country")
  private Country country;

  /**
   * Array with creative assets item operations
   */
  @JsonProperty("items")
  private List<CatalogsCreativeAssetsBatchItem> items = new ArrayList<>();

  /**
   * We recommend using the CatalogsLocale values.
   */
  @JsonProperty("language")
  private String language;

  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

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
   * @return country
   */
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Array with creative assets item operations
   * @return items
   */
  public List<CatalogsCreativeAssetsBatchItem> getItems() {
    return items;
  }

  public void setItems(List<CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
  }

  /**
   * We recommend using the CatalogsLocale values.
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsVerticalBatchRequest catalogsVerticalBatchRequest = (CatalogsVerticalBatchRequest) o;
    return Objects.equals(this.catalogId, catalogsVerticalBatchRequest.catalogId) &&
        Objects.equals(this.catalogType, catalogsVerticalBatchRequest.catalogType) &&
        Objects.equals(this.country, catalogsVerticalBatchRequest.country) &&
        Objects.equals(this.items, catalogsVerticalBatchRequest.items) &&
        Objects.equals(this.language, catalogsVerticalBatchRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, items, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalBatchRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
