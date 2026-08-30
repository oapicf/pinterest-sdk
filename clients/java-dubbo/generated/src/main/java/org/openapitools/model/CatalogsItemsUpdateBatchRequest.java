package org.openapitools.model;

import org.openapitools.model.Country;
import org.openapitools.model.ItemUpdateBatchRecord;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object to update catalogs items
 */
public class CatalogsItemsUpdateBatchRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("country")
  private Country country;

  /**
   * Array with catalogs items
   */
  @JsonProperty("items")
  private List<ItemUpdateBatchRecord> items = new ArrayList<>();

  /**
   * We recommend using the CatalogsLocale values.
   */
  @JsonProperty("language")
  private String language;

  @JsonProperty("operation")
  private String operation;

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
  public List<ItemUpdateBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemUpdateBatchRecord> items) {
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
    CatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest = (CatalogsItemsUpdateBatchRequest) o;
    return Objects.equals(this.country, catalogsItemsUpdateBatchRequest.country) &&
        Objects.equals(this.items, catalogsItemsUpdateBatchRequest.items) &&
        Objects.equals(this.language, catalogsItemsUpdateBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsUpdateBatchRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, items, language, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsUpdateBatchRequest {\n");
    
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
