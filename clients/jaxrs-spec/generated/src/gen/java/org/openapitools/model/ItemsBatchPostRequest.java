package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.CatalogsItemsBatchRequest;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.CatalogsVerticalBatchRequest;
import org.openapitools.model.Country;
import org.openapitools.model.ItemDeleteBatchRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("items_batch_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-05-10T05:40:54.952063144Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ItemsBatchPostRequest   {
  private Country country;
  private CatalogsItemsRequestLanguage language;
  private BatchOperation operation;
  private @Valid List<@Valid ItemDeleteBatchRecord> items = new ArrayList<>();

  public ItemsBatchPostRequest() {
  }

  @JsonCreator
  public ItemsBatchPostRequest(
    @JsonProperty(required = true, value = "country") Country country,
    @JsonProperty(required = true, value = "language") CatalogsItemsRequestLanguage language,
    @JsonProperty(required = true, value = "operation") BatchOperation operation,
    @JsonProperty(required = true, value = "items") List<@Valid ItemDeleteBatchRecord> items,
    @JsonProperty(required = true, value = "catalog_type") CatalogTypeEnum catalogType
  ) {
    this.country = country;
    this.language = language;
    this.operation = operation;
    this.items = items;
  }

  /**
   **/
  public ItemsBatchPostRequest country(Country country) {
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
  public ItemsBatchPostRequest language(CatalogsItemsRequestLanguage language) {
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
  public ItemsBatchPostRequest operation(BatchOperation operation) {
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
  public ItemsBatchPostRequest items(List<@Valid ItemDeleteBatchRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid public List<@Valid ItemDeleteBatchRecord> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid ItemDeleteBatchRecord> items) {
    this.items = items;
  }

  public ItemsBatchPostRequest addItemsItem(ItemDeleteBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public ItemsBatchPostRequest removeItemsItem(ItemDeleteBatchRecord itemsItem) {
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
    ItemsBatchPostRequest itemsBatchPostRequest = (ItemsBatchPostRequest) o;
    return Objects.equals(this.country, itemsBatchPostRequest.country) &&
        Objects.equals(this.language, itemsBatchPostRequest.language) &&
        Objects.equals(this.operation, itemsBatchPostRequest.operation) &&
        Objects.equals(this.items, itemsBatchPostRequest.items);
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

