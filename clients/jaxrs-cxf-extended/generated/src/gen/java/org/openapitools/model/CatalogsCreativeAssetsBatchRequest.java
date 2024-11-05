package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsBatchItem;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object to update catalogs creative assets items
 */
@ApiModel(description="Request object to update catalogs creative assets items")

public class CatalogsCreativeAssetsBatchRequest  {
  
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsItemsRequestLanguage language;

 /**
  * Array with creative assets item operations
  */
  @ApiModelProperty(required = true, value = "Array with creative assets item operations")
  @Valid
  private List<@Valid CatalogsCreativeAssetsBatchItem> items = new ArrayList<>();

 /**
  * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
  private String catalogId;
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
  public CatalogsCreativeAssetsBatchRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public CatalogsCreativeAssetsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Get language
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public CatalogsCreativeAssetsBatchRequest language(CatalogsItemsRequestLanguage language) {
    this.language = language;
    return this;
  }

 /**
  * Array with creative assets item operations
  * @return items
  */
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid CatalogsCreativeAssetsBatchItem> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CatalogsCreativeAssetsBatchRequest items(List<@Valid CatalogsCreativeAssetsBatchItem> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CatalogsCreativeAssetsBatchRequest addItemsItem(CatalogsCreativeAssetsBatchItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  * @return catalogId
  */
  @JsonProperty("catalog_id")
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

