package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="Request object to update catalogs hotel items")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelBatchRequest   {
  
  private CatalogsType catalogType;
  private Country country;
  private Language language;
  private List<@Valid CatalogsHotelBatchItem> items = new ArrayList<>();
  private String catalogId;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  @Valid
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
  @Valid
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  @NotNull
  @Valid
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   * Array with catalogs item operations
   **/
  
  @ApiModelProperty(required = true, value = "Array with catalogs item operations")
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=1000)  @Valid
  public List<@Valid CatalogsHotelBatchItem> getItems() {
    return items;
  }
  public void setItems(List<@Valid CatalogsHotelBatchItem> items) {
    this.items = items;
  }

  /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   **/
  
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

