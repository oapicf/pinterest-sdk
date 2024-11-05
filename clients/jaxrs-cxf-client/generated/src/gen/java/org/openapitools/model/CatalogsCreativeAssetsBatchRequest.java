package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsBatchItem;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.Country;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Request object to update catalogs creative assets items
 **/
@ApiModel(description="Request object to update catalogs creative assets items")

public class CatalogsCreativeAssetsBatchRequest  {
  
public enum CatalogTypeEnum {

CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


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

  @ApiModelProperty(required = true, value = "")
  private Country country;

  @ApiModelProperty(required = true, value = "")
  private CatalogsItemsRequestLanguage language;

  @ApiModelProperty(required = true, value = "Array with creative assets item operations")
 /**
   * Array with creative assets item operations
  **/
  private List<CatalogsCreativeAssetsBatchItem> items = new ArrayList<>();

  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
 /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  **/
  private String catalogId;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsBatchRequest catalogType(CatalogTypeEnum catalogType) {
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

  public CatalogsCreativeAssetsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }

  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

  public CatalogsCreativeAssetsBatchRequest language(CatalogsItemsRequestLanguage language) {
    this.language = language;
    return this;
  }

 /**
   * Array with creative assets item operations
   * @return items
  **/
  @JsonProperty("items")
  public List<CatalogsCreativeAssetsBatchItem> getItems() {
    return items;
  }

  public void setItems(List<CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
  }

  public CatalogsCreativeAssetsBatchRequest items(List<CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
    return this;
  }

  public CatalogsCreativeAssetsBatchRequest addItemsItem(CatalogsCreativeAssetsBatchItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsCreativeAssetsBatchRequest catalogId(String catalogId) {
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
    CatalogsCreativeAssetsBatchRequest catalogsCreativeAssetsBatchRequest = (CatalogsCreativeAssetsBatchRequest) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsBatchRequest.catalogType) &&
        Objects.equals(this.country, catalogsCreativeAssetsBatchRequest.country) &&
        Objects.equals(this.language, catalogsCreativeAssetsBatchRequest.language) &&
        Objects.equals(this.items, catalogsCreativeAssetsBatchRequest.items) &&
        Objects.equals(this.catalogId, catalogsCreativeAssetsBatchRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, country, language, items, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsBatchRequest {\n");
    
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

