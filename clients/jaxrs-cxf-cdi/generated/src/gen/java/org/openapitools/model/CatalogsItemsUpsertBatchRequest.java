package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.Country;
import org.openapitools.model.ItemUpsertBatchRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object to upsert catalogs items
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Request object to upsert catalogs items")
public class CatalogsItemsUpsertBatchRequest   {
  
  private Country country;

  private CatalogsItemsRequestLanguage language;

  private BatchOperation operation;

  private List<@Valid ItemUpsertBatchRecord> items = new ArrayList<>();

  /**
   **/
  public CatalogsItemsUpsertBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }


  /**
   **/
  public CatalogsItemsUpsertBatchRequest language(CatalogsItemsRequestLanguage language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  @NotNull
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }
  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }


  /**
   **/
  public CatalogsItemsUpsertBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public BatchOperation getOperation() {
    return operation;
  }
  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }


  /**
   * Array with catalogs items
   **/
  public CatalogsItemsUpsertBatchRequest items(List<@Valid ItemUpsertBatchRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid ItemUpsertBatchRecord> getItems() {
    return items;
  }
  public void setItems(List<@Valid ItemUpsertBatchRecord> items) {
    this.items = items;
  }

  public CatalogsItemsUpsertBatchRequest addItemsItem(ItemUpsertBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
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
    CatalogsItemsUpsertBatchRequest catalogsItemsUpsertBatchRequest = (CatalogsItemsUpsertBatchRequest) o;
    return Objects.equals(this.country, catalogsItemsUpsertBatchRequest.country) &&
        Objects.equals(this.language, catalogsItemsUpsertBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsUpsertBatchRequest.operation) &&
        Objects.equals(this.items, catalogsItemsUpsertBatchRequest.items);
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

