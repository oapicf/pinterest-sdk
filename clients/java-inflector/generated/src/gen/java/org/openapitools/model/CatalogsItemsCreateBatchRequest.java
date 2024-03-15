package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.Country;
import org.openapitools.model.ItemCreateBatchRecord;
import org.openapitools.model.Language;



/**
 * Request object to create catalogs items
 **/

@ApiModel(description = "Request object to create catalogs items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsItemsCreateBatchRequest   {
  @JsonProperty("country")
  private Country country;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("operation")
  private BatchOperation operation;

  @JsonProperty("items")
  private List<ItemCreateBatchRecord> items = new ArrayList<>();

  /**
   **/
  public CatalogsItemsCreateBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  public CatalogsItemsCreateBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   **/
  public CatalogsItemsCreateBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  public BatchOperation getOperation() {
    return operation;
  }
  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  /**
   * Array with catalogs items
   **/
  public CatalogsItemsCreateBatchRequest items(List<ItemCreateBatchRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with catalogs items")
  @JsonProperty("items")
  public List<ItemCreateBatchRecord> getItems() {
    return items;
  }
  public void setItems(List<ItemCreateBatchRecord> items) {
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
    CatalogsItemsCreateBatchRequest catalogsItemsCreateBatchRequest = (CatalogsItemsCreateBatchRequest) o;
    return Objects.equals(country, catalogsItemsCreateBatchRequest.country) &&
        Objects.equals(language, catalogsItemsCreateBatchRequest.language) &&
        Objects.equals(operation, catalogsItemsCreateBatchRequest.operation) &&
        Objects.equals(items, catalogsItemsCreateBatchRequest.items);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

