package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.Country;
import org.openapitools.model.ItemUpdateBatchRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object to update catalogs items
 */
@ApiModel(description="Request object to update catalogs items")

public class CatalogsItemsUpdateBatchRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsItemsRequestLanguage language;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BatchOperation operation;

 /**
  * Array with catalogs items
  */
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @Valid
  private List<@Valid ItemUpdateBatchRecord> items = new ArrayList<>();
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
  public CatalogsItemsUpdateBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Get language
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public CatalogsItemsUpdateBatchRequest language(CatalogsItemsRequestLanguage language) {
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
  public CatalogsItemsUpdateBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Array with catalogs items
  * @return items
  */
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid ItemUpdateBatchRecord> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid ItemUpdateBatchRecord> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CatalogsItemsUpdateBatchRequest items(List<@Valid ItemUpdateBatchRecord> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CatalogsItemsUpdateBatchRequest addItemsItem(ItemUpdateBatchRecord itemsItem) {
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
    CatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest = (CatalogsItemsUpdateBatchRequest) o;
    return Objects.equals(this.country, catalogsItemsUpdateBatchRequest.country) &&
        Objects.equals(this.language, catalogsItemsUpdateBatchRequest.language) &&
        Objects.equals(this.operation, catalogsItemsUpdateBatchRequest.operation) &&
        Objects.equals(this.items, catalogsItemsUpdateBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsUpdateBatchRequest {\n");
    
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

