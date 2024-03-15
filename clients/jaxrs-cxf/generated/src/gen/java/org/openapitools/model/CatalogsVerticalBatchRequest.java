package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A request object that can have multiple operations on a single batch
 **/
@ApiModel(description="A request object that can have multiple operations on a single batch")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelBatchRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailBatchRequest.class, name = "RETAIL"),
})

public class CatalogsVerticalBatchRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Language language;

  @ApiModelProperty(required = true, value = "Array with catalogs item operations")
  @Valid
 /**
   * Array with catalogs item operations
  **/
  private List<@Valid CatalogsHotelBatchItem> items = new ArrayList<>();

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
  @NotNull
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
  @NotNull
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
  @NotNull
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
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid CatalogsHotelBatchItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid CatalogsHotelBatchItem> items) {
    this.items = items;
  }

  public CatalogsVerticalBatchRequest items(List<@Valid CatalogsHotelBatchItem> items) {
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
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
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

