package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelBatchItem;
import org.openapitools.model.CatalogsHotelBatchRequest;
import org.openapitools.model.CatalogsRetailBatchRequest;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.Language;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A request object that can have multiple operations on a single batch
 **/
@ApiModel(description="A request object that can have multiple operations on a single batch")

public class CatalogsVerticalBatchRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsType catalogType;

  @ApiModelProperty(required = true, value = "")
  private Country country;

  @ApiModelProperty(required = true, value = "")
  private Language language;

  @ApiModelProperty(required = true, value = "Array with catalogs item operations")
 /**
   * Array with catalogs item operations
  **/
  private List<CatalogsHotelBatchItem> items = new ArrayList<>();

  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
 /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  **/
  private String catalogId;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsVerticalBatchRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsVerticalBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public CatalogsVerticalBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

 /**
   * Array with catalogs item operations
   * @return items
  **/
  @JsonProperty("items")
  public List<CatalogsHotelBatchItem> getItems() {
    return items;
  }

  public void setItems(List<CatalogsHotelBatchItem> items) {
    this.items = items;
  }

  public CatalogsVerticalBatchRequest items(List<CatalogsHotelBatchItem> items) {
    this.items = items;
    return this;
  }

  public CatalogsVerticalBatchRequest addItemsItem(CatalogsHotelBatchItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsVerticalBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
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
    CatalogsVerticalBatchRequest catalogsVerticalBatchRequest = (CatalogsVerticalBatchRequest) o;
    return Objects.equals(this.catalogType, catalogsVerticalBatchRequest.catalogType) &&
        Objects.equals(this.country, catalogsVerticalBatchRequest.country) &&
        Objects.equals(this.language, catalogsVerticalBatchRequest.language) &&
        Objects.equals(this.items, catalogsVerticalBatchRequest.items) &&
        Objects.equals(this.catalogId, catalogsVerticalBatchRequest.catalogId);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

