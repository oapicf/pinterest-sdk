package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BatchOperation;
import org.openapitools.vertxweb.server.model.CatalogsItemsRequestLanguage;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.ItemDeleteDiscontinuedBatchRecord;

/**
 * Request object to discontinue catalogs items
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemsDeleteDiscontinuedBatchRequest   {
  
  private Country country;
  private CatalogsItemsRequestLanguage language;
  private BatchOperation operation;
  private List<ItemDeleteDiscontinuedBatchRecord> items = new ArrayList<>();

  public CatalogsItemsDeleteDiscontinuedBatchRequest () {

  }

  public CatalogsItemsDeleteDiscontinuedBatchRequest (Country country, CatalogsItemsRequestLanguage language, BatchOperation operation, List<ItemDeleteDiscontinuedBatchRecord> items) {
    this.country = country;
    this.language = language;
    this.operation = operation;
    this.items = items;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("language")
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }
  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

    
  @JsonProperty("operation")
  public BatchOperation getOperation() {
    return operation;
  }
  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

    
  @JsonProperty("items")
  public List<ItemDeleteDiscontinuedBatchRecord> getItems() {
    return items;
  }
  public void setItems(List<ItemDeleteDiscontinuedBatchRecord> items) {
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
    CatalogsItemsDeleteDiscontinuedBatchRequest catalogsItemsDeleteDiscontinuedBatchRequest = (CatalogsItemsDeleteDiscontinuedBatchRequest) o;
    return Objects.equals(country, catalogsItemsDeleteDiscontinuedBatchRequest.country) &&
        Objects.equals(language, catalogsItemsDeleteDiscontinuedBatchRequest.language) &&
        Objects.equals(operation, catalogsItemsDeleteDiscontinuedBatchRequest.operation) &&
        Objects.equals(items, catalogsItemsDeleteDiscontinuedBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsDeleteDiscontinuedBatchRequest {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
