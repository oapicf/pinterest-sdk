/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.CatalogsItemsCreateBatchRequest;
import org.openapitools.model.CatalogsItemsDeleteBatchRequest;
import org.openapitools.model.CatalogsItemsDeleteDiscontinuedBatchRequest;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.CatalogsItemsUpdateBatchRequest;
import org.openapitools.model.CatalogsItemsUpsertBatchRequest;
import org.openapitools.model.Country;
import org.openapitools.model.ItemDeleteBatchRecord;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object of catalogs items batch
 */
@ApiModel(description = "Request object of catalogs items batch")
@JsonPropertyOrder({
  CatalogsItemsBatchRequest.JSON_PROPERTY_COUNTRY,
  CatalogsItemsBatchRequest.JSON_PROPERTY_LANGUAGE,
  CatalogsItemsBatchRequest.JSON_PROPERTY_OPERATION,
  CatalogsItemsBatchRequest.JSON_PROPERTY_ITEMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsItemsCreateBatchRequest.class, name = "CREATE"),
  @JsonSubTypes.Type(value = CatalogsItemsDeleteBatchRequest.class, name = "DELETE"),
  @JsonSubTypes.Type(value = CatalogsItemsDeleteDiscontinuedBatchRequest.class, name = "DELETE_DISCONTINUED"),
  @JsonSubTypes.Type(value = CatalogsItemsUpdateBatchRequest.class, name = "UPDATE"),
  @JsonSubTypes.Type(value = CatalogsItemsUpsertBatchRequest.class, name = "UPSERT"),
})

public class CatalogsItemsBatchRequest   {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  private Country country;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  private CatalogsItemsRequestLanguage language;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  @JsonProperty(JSON_PROPERTY_OPERATION)
  private BatchOperation operation;

  public static final String JSON_PROPERTY_ITEMS = "items";
  @JsonProperty(JSON_PROPERTY_ITEMS)
  private List<@Valid ItemDeleteBatchRecord> items = new ArrayList<>();

  public CatalogsItemsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @JsonProperty(value = "country")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsItemsBatchRequest language(CatalogsItemsRequestLanguage language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   **/
  @JsonProperty(value = "language")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }

  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

  public CatalogsItemsBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   **/
  @JsonProperty(value = "operation")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public BatchOperation getOperation() {
    return operation;
  }

  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  public CatalogsItemsBatchRequest items(List<@Valid ItemDeleteBatchRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsBatchRequest addItemsItem(ItemDeleteBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array with catalogs items
   * @return items
   **/
  @JsonProperty(value = "items")
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @NotNull @Valid 
  public List<@Valid ItemDeleteBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid ItemDeleteBatchRecord> items) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

