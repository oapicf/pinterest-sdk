package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.CatalogsItemsCreateBatchRequest;
import org.openapitools.model.CatalogsItemsDeleteBatchRequest;
import org.openapitools.model.CatalogsItemsDeleteDiscontinuedBatchRequest;
import org.openapitools.model.CatalogsItemsUpdateBatchRequest;
import org.openapitools.model.CatalogsItemsUpsertBatchRequest;
import org.openapitools.model.Country;
import org.openapitools.model.ItemDeleteBatchRecord;
import org.openapitools.model.Language;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Request object of catalogs items batch
 **/
@ApiModel(description="Request object of catalogs items batch")

public class CatalogsItemsBatchRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private Country country;

  @ApiModelProperty(required = true, value = "")
  private Language language;

  @ApiModelProperty(required = true, value = "")
  private BatchOperation operation;

  @ApiModelProperty(required = true, value = "Array with catalogs items")
 /**
   * Array with catalogs items
  **/
  private List<ItemDeleteBatchRecord> items = new ArrayList<>();
 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsItemsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public CatalogsItemsBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public BatchOperation getOperation() {
    return operation;
  }

  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  public CatalogsItemsBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Array with catalogs items
   * @return items
  **/
  @JsonProperty("items")
  public List<ItemDeleteBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemDeleteBatchRecord> items) {
    this.items = items;
  }

  public CatalogsItemsBatchRequest items(List<ItemDeleteBatchRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsBatchRequest addItemsItem(ItemDeleteBatchRecord itemsItem) {
    this.items.add(itemsItem);
    return this;
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
    return Objects.equals(this.country, catalogsItemsBatchRequest.country) &&
        Objects.equals(this.language, catalogsItemsBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsBatchRequest.operation) &&
        Objects.equals(this.items, catalogsItemsBatchRequest.items);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

