package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.BatchOperation;
import org.openapitools.server.api.model.Country;
import org.openapitools.server.api.model.ItemUpsertBatchRecord;
import org.openapitools.server.api.model.Language;

/**
 * Request object to upsert catalogs items
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemsUpsertBatchRequest   {
  
  private Country country;
  private Language language;
  private BatchOperation operation;
  private List<ItemUpsertBatchRecord> items = new ArrayList<>();

  public CatalogsItemsUpsertBatchRequest () {

  }

  public CatalogsItemsUpsertBatchRequest (Country country, Language language, BatchOperation operation, List<ItemUpsertBatchRecord> items) {
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
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
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
  public List<ItemUpsertBatchRecord> getItems() {
    return items;
  }
  public void setItems(List<ItemUpsertBatchRecord> items) {
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
    CatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest = (CatalogsItemsUpsertBatchRequest) o;
    return Objects.equals(country, catalogsItemsUpsertBatchRequest.country) &&
        Objects.equals(language, catalogsItemsUpsertBatchRequest.language) &&
        Objects.equals(operation, catalogsItemsUpsertBatchRequest.operation) &&
        Objects.equals(items, catalogsItemsUpsertBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsUpsertBatchRequest {\n");
    
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
