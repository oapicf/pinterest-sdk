/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CatalogsCreativeAssetsBatchItem;
import org.openapitools.client.model.CatalogsItemsRequestLanguage;
import org.openapitools.client.model.Country;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request object to update catalogs creative assets items
 **/
@ApiModel(description = "Request object to update catalogs creative assets items")
public class CatalogsCreativeAssetsBatchRequest {
  
  public enum CatalogTypeEnum {
     CREATIVE_ASSETS, 
  };
  @SerializedName("catalog_type")
  private CatalogTypeEnum catalogType = null;
  @SerializedName("country")
  private Country country = null;
  @SerializedName("language")
  private CatalogsItemsRequestLanguage language = null;
  @SerializedName("items")
  private List<CatalogsCreativeAssetsBatchItem> items = null;
  @SerializedName("catalog_id")
  private String catalogId = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }
  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

  /**
   * Array with creative assets item operations
   **/
  @ApiModelProperty(required = true, value = "Array with creative assets item operations")
  public List<CatalogsCreativeAssetsBatchItem> getItems() {
    return items;
  }
  public void setItems(List<CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
  }

  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   **/
  @ApiModelProperty(value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
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
    return (this.catalogType == null ? catalogsCreativeAssetsBatchRequest.catalogType == null : this.catalogType.equals(catalogsCreativeAssetsBatchRequest.catalogType)) &&
        (this.country == null ? catalogsCreativeAssetsBatchRequest.country == null : this.country.equals(catalogsCreativeAssetsBatchRequest.country)) &&
        (this.language == null ? catalogsCreativeAssetsBatchRequest.language == null : this.language.equals(catalogsCreativeAssetsBatchRequest.language)) &&
        (this.items == null ? catalogsCreativeAssetsBatchRequest.items == null : this.items.equals(catalogsCreativeAssetsBatchRequest.items)) &&
        (this.catalogId == null ? catalogsCreativeAssetsBatchRequest.catalogId == null : this.catalogId.equals(catalogsCreativeAssetsBatchRequest.catalogId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.catalogType == null ? 0: this.catalogType.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.language == null ? 0: this.language.hashCode());
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    result = 31 * result + (this.catalogId == null ? 0: this.catalogId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsBatchRequest {\n");
    
    sb.append("  catalogType: ").append(catalogType).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  language: ").append(language).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  catalogId: ").append(catalogId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
