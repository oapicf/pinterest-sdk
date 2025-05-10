package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.Country;
import org.openapitools.model.ItemDeleteDiscontinuedBatchRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request object to discontinue catalogs items
 **/
@ApiModel(description = "Request object to discontinue catalogs items")
@JsonTypeName("CatalogsItemsDeleteDiscontinuedBatchRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-05-10T05:40:54.952063144Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CatalogsItemsDeleteDiscontinuedBatchRequest   {
  private Country country;
  private CatalogsItemsRequestLanguage language;
  private BatchOperation operation;
  private @Valid List<@Valid ItemDeleteDiscontinuedBatchRecord> items = new ArrayList<>();

  public CatalogsItemsDeleteDiscontinuedBatchRequest() {
  }

  @JsonCreator
  public CatalogsItemsDeleteDiscontinuedBatchRequest(
    @JsonProperty(required = true, value = "country") Country country,
    @JsonProperty(required = true, value = "language") CatalogsItemsRequestLanguage language,
    @JsonProperty(required = true, value = "operation") BatchOperation operation,
    @JsonProperty(required = true, value = "items") List<@Valid ItemDeleteDiscontinuedBatchRecord> items
  ) {
    this.country = country;
    this.language = language;
    this.operation = operation;
    this.items = items;
  }

  /**
   **/
  public CatalogsItemsDeleteDiscontinuedBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "country")
  @NotNull public Country getCountry() {
    return country;
  }

  @JsonProperty(required = true, value = "country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  public CatalogsItemsDeleteDiscontinuedBatchRequest language(CatalogsItemsRequestLanguage language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

  /**
   **/
  public CatalogsItemsDeleteDiscontinuedBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation")
  @NotNull public BatchOperation getOperation() {
    return operation;
  }

  @JsonProperty(required = true, value = "operation")
  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  /**
   * Array with catalogs items
   **/
  public CatalogsItemsDeleteDiscontinuedBatchRequest items(List<@Valid ItemDeleteDiscontinuedBatchRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid public List<@Valid ItemDeleteDiscontinuedBatchRecord> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid ItemDeleteDiscontinuedBatchRecord> items) {
    this.items = items;
  }

  public CatalogsItemsDeleteDiscontinuedBatchRequest addItemsItem(ItemDeleteDiscontinuedBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public CatalogsItemsDeleteDiscontinuedBatchRequest removeItemsItem(ItemDeleteDiscontinuedBatchRecord itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

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
    CatalogsItemsDeleteDiscontinuedBatchRequest catalogsItemsDeleteDiscontinuedBatchRequest = (CatalogsItemsDeleteDiscontinuedBatchRequest) o;
    return Objects.equals(this.country, catalogsItemsDeleteDiscontinuedBatchRequest.country) &&
        Objects.equals(this.language, catalogsItemsDeleteDiscontinuedBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsDeleteDiscontinuedBatchRequest.operation) &&
        Objects.equals(this.items, catalogsItemsDeleteDiscontinuedBatchRequest.items);
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

