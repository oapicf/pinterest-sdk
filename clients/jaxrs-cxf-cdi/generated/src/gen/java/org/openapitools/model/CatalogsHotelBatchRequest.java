package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelBatchItem;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object to update catalogs hotel items
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Request object to update catalogs hotel items")
public class CatalogsHotelBatchRequest   {
  
  private CatalogsType catalogType;

  private Country country;

  private Language language;

  private List<@Valid CatalogsHotelBatchItem> items = new ArrayList<>();

  private String catalogId;

  /**
   **/
  public CatalogsHotelBatchRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }


  /**
   **/
  public CatalogsHotelBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }


  /**
   **/
  public CatalogsHotelBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  @NotNull
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }


  /**
   * Array with catalogs item operations
   **/
  public CatalogsHotelBatchRequest items(List<@Valid CatalogsHotelBatchItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs item operations")
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid CatalogsHotelBatchItem> getItems() {
    return items;
  }
  public void setItems(List<@Valid CatalogsHotelBatchItem> items) {
    this.items = items;
  }

  public CatalogsHotelBatchRequest addItemsItem(CatalogsHotelBatchItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   **/
  public CatalogsHotelBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
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
    CatalogsHotelBatchRequest catalogsHotelBatchRequest = (CatalogsHotelBatchRequest) o;
    return Objects.equals(this.catalogType, catalogsHotelBatchRequest.catalogType) &&
        Objects.equals(this.country, catalogsHotelBatchRequest.country) &&
        Objects.equals(this.language, catalogsHotelBatchRequest.language) &&
        Objects.equals(this.items, catalogsHotelBatchRequest.items) &&
        Objects.equals(this.catalogId, catalogsHotelBatchRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, country, language, items, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelBatchRequest {\n");
    
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

