package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsRetailBatchRequestItemsInner;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.Language;



/**
 * A request object that can have multiple operations on a single retail batch
 **/

@ApiModel(description = "A request object that can have multiple operations on a single retail batch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsRetailBatchRequest   {
  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("items")
  private List<CatalogsRetailBatchRequestItemsInner> items = new ArrayList<>();

  /**
   **/
  public CatalogsRetailBatchRequest catalogType(CatalogsType catalogType) {
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
  public CatalogsRetailBatchRequest country(Country country) {
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
  public CatalogsRetailBatchRequest language(Language language) {
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
  public CatalogsRetailBatchRequest items(List<CatalogsRetailBatchRequestItemsInner> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs item operations")
  @JsonProperty("items")
  public List<CatalogsRetailBatchRequestItemsInner> getItems() {
    return items;
  }
  public void setItems(List<CatalogsRetailBatchRequestItemsInner> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailBatchRequest catalogsRetailBatchRequest = (CatalogsRetailBatchRequest) o;
    return Objects.equals(catalogType, catalogsRetailBatchRequest.catalogType) &&
        Objects.equals(country, catalogsRetailBatchRequest.country) &&
        Objects.equals(language, catalogsRetailBatchRequest.language) &&
        Objects.equals(items, catalogsRetailBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, country, language, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailBatchRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

