package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsCreativeAssetsBatchItem;
import com.prokarma.pkmst.model.CatalogsItemsRequestLanguage;
import com.prokarma.pkmst.model.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request object to update catalogs creative assets items
 */
@ApiModel(description = "Request object to update catalogs creative assets items")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsBatchRequest   {
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

  @JsonProperty("country")
  private Country country;

  @JsonProperty("language")
  private CatalogsItemsRequestLanguage language;

  @JsonProperty("items")
  
  private List<CatalogsCreativeAssetsBatchItem> items = new ArrayList<>();

  @JsonProperty("catalog_id")
  private String catalogId;

  public CatalogsCreativeAssetsBatchRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @ApiModelProperty(required = true, value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsCreativeAssetsBatchRequest language(CatalogsItemsRequestLanguage language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }

  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

  public CatalogsCreativeAssetsBatchRequest items(List<CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
    return this;
  }

  public CatalogsCreativeAssetsBatchRequest addItemsItem(CatalogsCreativeAssetsBatchItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array with creative assets item operations
   * @return items
   */
  @ApiModelProperty(required = true, value = "Array with creative assets item operations")
  public List<CatalogsCreativeAssetsBatchItem> getItems() {
    return items;
  }

  public void setItems(List<CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
  }

  public CatalogsCreativeAssetsBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
   */
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

