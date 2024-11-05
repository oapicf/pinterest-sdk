package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BatchOperation;
import org.openapitools.vertxweb.server.model.CatalogsItemsBatchRequest;
import org.openapitools.vertxweb.server.model.CatalogsItemsRequestLanguage;
import org.openapitools.vertxweb.server.model.CatalogsVerticalBatchRequest;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.ItemDeleteBatchRecord;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemsBatchPostRequest   {
  
  private Country country;
  private CatalogsItemsRequestLanguage language;
  private BatchOperation operation;
  private List<ItemDeleteBatchRecord> items = new ArrayList<>();

  public ItemsBatchPostRequest () {

  }

  public ItemsBatchPostRequest (Country country, CatalogsItemsRequestLanguage language, BatchOperation operation, List<ItemDeleteBatchRecord> items) {
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
  public List<ItemDeleteBatchRecord> getItems() {
    return items;
  }
  public void setItems(List<ItemDeleteBatchRecord> items) {
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
    ItemsBatchPostRequest itemsBatchPostRequest = (ItemsBatchPostRequest) o;
    return Objects.equals(country, itemsBatchPostRequest.country) &&
        Objects.equals(language, itemsBatchPostRequest.language) &&
        Objects.equals(operation, itemsBatchPostRequest.operation) &&
        Objects.equals(items, itemsBatchPostRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsBatchPostRequest {\n");
    
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
