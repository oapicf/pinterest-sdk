package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsHotelBatchItem;
import org.openapitools.model.CatalogsHotelBatchRequest;
import org.openapitools.model.CatalogsRetailBatchRequest;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.Language;



/**
 * A request object that can have multiple operations on a single batch
 **/

@ApiModel(description = "A request object that can have multiple operations on a single batch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsVerticalBatchRequest   {
  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("items")
  private List<CatalogsHotelBatchItem> items = new ArrayList<>();

  @JsonProperty("catalog_id")
  private String catalogId;

  /**
   **/
  public CatalogsVerticalBatchRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsVerticalBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  public CatalogsVerticalBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   * Array with catalogs item operations
   **/
  public CatalogsVerticalBatchRequest items(List<CatalogsHotelBatchItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs item operations")
  @JsonProperty("items")
  public List<CatalogsHotelBatchItem> getItems() {
    return items;
  }
  public void setItems(List<CatalogsHotelBatchItem> items) {
    this.items = items;
  }

  /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   **/
  public CatalogsVerticalBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
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

