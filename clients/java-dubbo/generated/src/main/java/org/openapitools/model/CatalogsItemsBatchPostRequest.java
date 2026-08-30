package org.openapitools.model;

import org.openapitools.model.CatalogsItemsBatchRequest;
import org.openapitools.model.CatalogsVerticalBatchRequest;
import org.openapitools.model.Country;
import org.openapitools.model.ItemDeleteBatchRecord;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsItemsBatchPostRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("country")
  private Country country;

  /**
   * Array with catalogs items
   */
  @JsonProperty("items")
  private List<ItemDeleteBatchRecord> items = new ArrayList<>();

  /**
   * We recommend using the CatalogsLocale values.
   */
  @JsonProperty("language")
  private String language;

  @JsonProperty("operation")
  private String operation;

  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * 
   * @return country
   */
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Array with catalogs items
   * @return items
   */
  public List<ItemDeleteBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemDeleteBatchRecord> items) {
    this.items = items;
  }

  /**
   * We recommend using the CatalogsLocale values.
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * 
   * @return operation
   */
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest = (CatalogsItemsBatchPostRequest) o;
    return Objects.equals(this.catalogId, catalogsItemsBatchPostRequest.catalogId) &&
        Objects.equals(this.catalogType, catalogsItemsBatchPostRequest.catalogType) &&
        Objects.equals(this.country, catalogsItemsBatchPostRequest.country) &&
        Objects.equals(this.items, catalogsItemsBatchPostRequest.items) &&
        Objects.equals(this.language, catalogsItemsBatchPostRequest.language) &&
        Objects.equals(this.operation, catalogsItemsBatchPostRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, items, language, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsBatchPostRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
