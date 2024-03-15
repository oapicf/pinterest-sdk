package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.BatchOperation;
import com.prokarma.pkmst.model.CatalogsItemsCreateBatchRequest;
import com.prokarma.pkmst.model.CatalogsItemsDeleteBatchRequest;
import com.prokarma.pkmst.model.CatalogsItemsDeleteDiscontinuedBatchRequest;
import com.prokarma.pkmst.model.CatalogsItemsUpdateBatchRequest;
import com.prokarma.pkmst.model.CatalogsItemsUpsertBatchRequest;
import com.prokarma.pkmst.model.Country;
import com.prokarma.pkmst.model.ItemDeleteBatchRecord;
import com.prokarma.pkmst.model.Language;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request object of catalogs items batch
 */
@ApiModel(description = "Request object of catalogs items batch")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsItemsCreateBatchRequest.class, name = "CREATE"),
  @JsonSubTypes.Type(value = CatalogsItemsDeleteBatchRequest.class, name = "DELETE"),
  @JsonSubTypes.Type(value = CatalogsItemsDeleteDiscontinuedBatchRequest.class, name = "DELETE_DISCONTINUED"),
  @JsonSubTypes.Type(value = CatalogsItemsUpdateBatchRequest.class, name = "UPDATE"),
  @JsonSubTypes.Type(value = CatalogsItemsUpsertBatchRequest.class, name = "UPSERT"),
})

public class CatalogsItemsBatchRequest   {
  @JsonProperty("country")
  private Country country;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("operation")
  private BatchOperation operation;

  @JsonProperty("items")
  
  private List<ItemDeleteBatchRecord> items = new ArrayList<>();

  public CatalogsItemsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsItemsBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(required = true, value = "")
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
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
  @ApiModelProperty(required = true, value = "")
  public BatchOperation getOperation() {
    return operation;
  }

  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  public CatalogsItemsBatchRequest items(List<ItemDeleteBatchRecord> items) {
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
  @ApiModelProperty(required = true, value = "Array with catalogs items")
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

