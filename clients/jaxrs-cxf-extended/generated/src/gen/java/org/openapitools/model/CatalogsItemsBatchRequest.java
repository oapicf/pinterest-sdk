package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsItemsCreateBatchRequest.class, name = "CREATE"),
  @JsonSubTypes.Type(value = CatalogsItemsDeleteBatchRequest.class, name = "DELETE"),
  @JsonSubTypes.Type(value = CatalogsItemsDeleteDiscontinuedBatchRequest.class, name = "DELETE_DISCONTINUED"),
  @JsonSubTypes.Type(value = CatalogsItemsUpdateBatchRequest.class, name = "UPDATE"),
  @JsonSubTypes.Type(value = CatalogsItemsUpsertBatchRequest.class, name = "UPSERT"),
})

/**
 * Request object of catalogs items batch
 */
@ApiModel(description="Request object of catalogs items batch")

public class CatalogsItemsBatchRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Language language;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BatchOperation operation;

 /**
  * Array with catalogs items
  */
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @Valid
  private List<@Valid ItemDeleteBatchRecord> items = new ArrayList<>();
 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public CatalogsItemsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Get language
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public Language getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public CatalogsItemsBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public BatchOperation getOperation() {
    return operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public CatalogsItemsBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Array with catalogs items
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid ItemDeleteBatchRecord> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid ItemDeleteBatchRecord> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CatalogsItemsBatchRequest items(List<@Valid ItemDeleteBatchRecord> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
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

