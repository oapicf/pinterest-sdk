package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.Country;
import org.openapitools.model.ItemBatchRecord;
import org.openapitools.model.Language;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object of catalogs items batch
 */
@ApiModel(description="Request object of catalogs items batch")

public class CatalogsItemsBatchRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Country country;

  @ApiModelProperty(value = "")
  @Valid
  private Language language;

  @ApiModelProperty(value = "")
  @Valid
  private BatchOperation operation;

 /**
  * Array with catalogs items
  */
  @ApiModelProperty(value = "Array with catalogs items")
  @Valid
  private List<ItemBatchRecord> items = null;
 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
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
  public List<ItemBatchRecord> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<ItemBatchRecord> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CatalogsItemsBatchRequest items(List<ItemBatchRecord> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CatalogsItemsBatchRequest addItemsItem(ItemBatchRecord itemsItem) {
    this.items.add(itemsItem);
    return this;
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

