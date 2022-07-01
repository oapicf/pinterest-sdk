package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.Country;
import org.openapitools.model.ItemBatchRecord;
import org.openapitools.model.Language;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request object of catalogs items batch
 **/
@ApiModel(description = "Request object of catalogs items batch")
@JsonTypeName("CatalogsItemsBatchRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-07-01T12:01:13.464712Z[Etc/UTC]")public class CatalogsItemsBatchRequest   {
  
  private @Valid Country country;
  private @Valid Language language;
  private @Valid BatchOperation operation;
  private @Valid List<ItemBatchRecord> items = new ArrayList<ItemBatchRecord>();

  /**
   **/
  public CatalogsItemsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(Country country) {
    this.country = country;
  }

/**
   **/
  public CatalogsItemsBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }

  @JsonProperty("language")
  public void setLanguage(Language language) {
    this.language = language;
  }

/**
   **/
  public CatalogsItemsBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation")
  public BatchOperation getOperation() {
    return operation;
  }

  @JsonProperty("operation")
  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

/**
   * Array with catalogs items
   **/
  public CatalogsItemsBatchRequest items(List<ItemBatchRecord> items) {
    this.items = items;
    return this;
  }

  

  
  @ApiModelProperty(value = "Array with catalogs items")
  @JsonProperty("items")
  public List<ItemBatchRecord> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<ItemBatchRecord> items) {
    this.items = items;
  }

  public CatalogsItemsBatchRequest addItemsItem(ItemBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemBatchRecord>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public CatalogsItemsBatchRequest removeItemsItem(ItemBatchRecord itemsItem) {
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

