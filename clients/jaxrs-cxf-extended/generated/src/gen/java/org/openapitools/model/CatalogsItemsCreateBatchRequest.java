package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.Country;
import org.openapitools.model.ItemCreateBatchRecord;
import org.openapitools.model.Language;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object to create catalogs items
 */
@ApiModel(description="Request object to create catalogs items")

public class CatalogsItemsCreateBatchRequest  {
  
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
  private List<@Valid ItemCreateBatchRecord> items = new ArrayList<>();
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
  public CatalogsItemsCreateBatchRequest country(Country country) {
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
  public CatalogsItemsCreateBatchRequest language(Language language) {
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
  public CatalogsItemsCreateBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Array with catalogs items
  * @return items
  */
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid ItemCreateBatchRecord> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid ItemCreateBatchRecord> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CatalogsItemsCreateBatchRequest items(List<@Valid ItemCreateBatchRecord> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CatalogsItemsCreateBatchRequest addItemsItem(ItemCreateBatchRecord itemsItem) {
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
    CatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest = (CatalogsItemsCreateBatchRequest) o;
    return Objects.equals(this.country, catalogsItemsCreateBatchRequest.country) &&
        Objects.equals(this.language, catalogsItemsCreateBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsCreateBatchRequest.operation) &&
        Objects.equals(this.items, catalogsItemsCreateBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsCreateBatchRequest {\n");
    
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

