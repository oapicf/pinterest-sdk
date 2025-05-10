package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsItemsPostFilters;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request object of catalogs items
 **/
@ApiModel(description = "Request object of catalogs items")
@JsonTypeName("CatalogsItemsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-05-10T05:40:54.952063144Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CatalogsItemsRequest   {
  private Country country;
  private CatalogsItemsRequestLanguage language;
  private CatalogsItemsPostFilters filters;

  public CatalogsItemsRequest() {
  }

  @JsonCreator
  public CatalogsItemsRequest(
    @JsonProperty(required = true, value = "country") Country country,
    @JsonProperty(required = true, value = "language") CatalogsItemsRequestLanguage language,
    @JsonProperty(required = true, value = "filters") CatalogsItemsPostFilters filters
  ) {
    this.country = country;
    this.language = language;
    this.filters = filters;
  }

  /**
   **/
  public CatalogsItemsRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "country")
  @NotNull public Country getCountry() {
    return country;
  }

  @JsonProperty(required = true, value = "country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  public CatalogsItemsRequest language(CatalogsItemsRequestLanguage language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

  /**
   **/
  public CatalogsItemsRequest filters(CatalogsItemsPostFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "filters")
  @NotNull @Valid public CatalogsItemsPostFilters getFilters() {
    return filters;
  }

  @JsonProperty(required = true, value = "filters")
  public void setFilters(CatalogsItemsPostFilters filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsRequest catalogsItemsRequest = (CatalogsItemsRequest) o;
    return Objects.equals(this.country, catalogsItemsRequest.country) &&
        Objects.equals(this.language, catalogsItemsRequest.language) &&
        Objects.equals(this.filters, catalogsItemsRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsRequest {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

