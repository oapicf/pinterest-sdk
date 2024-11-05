package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CatalogsCreativeAssetsBatchItem;
import org.openapitools.server.api.model.CatalogsCreativeAssetsBatchRequest;
import org.openapitools.server.api.model.CatalogsHotelBatchRequest;
import org.openapitools.server.api.model.CatalogsItemsRequestLanguage;
import org.openapitools.server.api.model.CatalogsRetailBatchRequest;
import org.openapitools.server.api.model.Country;

/**
 * A request object that can have multiple operations on a single batch
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsVerticalBatchRequest   {
  


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
  private Country country;
  private CatalogsItemsRequestLanguage language;
  private List<CatalogsCreativeAssetsBatchItem> items = new ArrayList<>();
  private String catalogId;

  public CatalogsVerticalBatchRequest () {

  }

  public CatalogsVerticalBatchRequest (CatalogTypeEnum catalogType, Country country, CatalogsItemsRequestLanguage language, List<CatalogsCreativeAssetsBatchItem> items, String catalogId) {
    this.catalogType = catalogType;
    this.country = country;
    this.language = language;
    this.items = items;
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("language")
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }
  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

    
  @JsonProperty("items")
  public List<CatalogsCreativeAssetsBatchItem> getItems() {
    return items;
  }
  public void setItems(List<CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
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
    return Objects.equals(catalogType, catalogsVerticalBatchRequest.catalogType) &&
        Objects.equals(country, catalogsVerticalBatchRequest.country) &&
        Objects.equals(language, catalogsVerticalBatchRequest.language) &&
        Objects.equals(items, catalogsVerticalBatchRequest.items) &&
        Objects.equals(catalogId, catalogsVerticalBatchRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, country, language, items, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalBatchRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
