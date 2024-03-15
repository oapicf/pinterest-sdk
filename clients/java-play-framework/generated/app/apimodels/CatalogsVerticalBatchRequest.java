package apimodels;

import apimodels.CatalogsHotelBatchItem;
import apimodels.CatalogsHotelBatchRequest;
import apimodels.CatalogsRetailBatchRequest;
import apimodels.CatalogsType;
import apimodels.Country;
import apimodels.Language;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A request object that can have multiple operations on a single batch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsVerticalBatchRequest   {
  @JsonProperty("catalog_type")
  @NotNull
@Valid

  private CatalogsType catalogType;

  @JsonProperty("country")
  @NotNull
@Valid

  private Country country;

  @JsonProperty("language")
  @NotNull
@Valid

  private Language language;

  @JsonProperty("items")
  @NotNull
@Size(min=1,max=1000)
@Valid

  private List<@Valid CatalogsHotelBatchItem> items = new ArrayList<>();

  @JsonProperty("catalog_id")
  @Pattern(regexp="^\\d+$")

  private String catalogId;

  public CatalogsVerticalBatchRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsVerticalBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsVerticalBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public CatalogsVerticalBatchRequest items(List<@Valid CatalogsHotelBatchItem> items) {
    this.items = items;
    return this;
  }

  public CatalogsVerticalBatchRequest addItemsItem(CatalogsHotelBatchItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array with catalogs item operations
   * @return items
  **/
  public List<@Valid CatalogsHotelBatchItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid CatalogsHotelBatchItem> items) {
    this.items = items;
  }

  public CatalogsVerticalBatchRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   * @return catalogId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

