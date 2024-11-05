package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.BatchOperation;
import org.openapitools.server.api.model.CatalogsItemsCreateBatchRequest;
import org.openapitools.server.api.model.CatalogsItemsDeleteBatchRequest;
import org.openapitools.server.api.model.CatalogsItemsDeleteDiscontinuedBatchRequest;
import org.openapitools.server.api.model.CatalogsItemsRequestLanguage;
import org.openapitools.server.api.model.CatalogsItemsUpdateBatchRequest;
import org.openapitools.server.api.model.CatalogsItemsUpsertBatchRequest;
import org.openapitools.server.api.model.Country;
import org.openapitools.server.api.model.ItemDeleteBatchRecord;

/**
 * Request object of catalogs items batch
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemsBatchRequest   {
  
  private Country country;
  private CatalogsItemsRequestLanguage language;
  private BatchOperation operation;
  private List<ItemDeleteBatchRecord> items = new ArrayList<>();

  public CatalogsItemsBatchRequest () {

  }

  public CatalogsItemsBatchRequest (Country country, CatalogsItemsRequestLanguage language, BatchOperation operation, List<ItemDeleteBatchRecord> items) {
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
    CatalogsItemsBatchRequest catalogsItemsBatchRequest = (CatalogsItemsBatchRequest) o;
    return Objects.equals(country, catalogsItemsBatchRequest.country) &&
        Objects.equals(language, catalogsItemsBatchRequest.language) &&
        Objects.equals(operation, catalogsItemsBatchRequest.operation) &&
        Objects.equals(items, catalogsItemsBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsBatchRequest {\n");
    
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
