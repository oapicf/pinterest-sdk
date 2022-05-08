package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.Country;
import org.openapitools.model.ItemBatchRecord;
import org.openapitools.model.Language;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request object of catalogs items batch
 */

@Schema(name = "CatalogsItemsBatchRequest", description = "Request object of catalogs items batch")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-08T00:32:37.756477Z[Etc/UTC]")
public class CatalogsItemsBatchRequest   {

  @JsonProperty("country")
  private Country country;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("operation")
  private BatchOperation operation;

  @JsonProperty("items")
  @Valid
  private List<ItemBatchRecord> items = null;

  public CatalogsItemsBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @Valid 
  @Schema(name = "country", required = false)
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
  */
  @Valid 
  @Schema(name = "language", required = false)
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
  */
  @Valid 
  @Schema(name = "operation", required = false)
  public BatchOperation getOperation() {
    return operation;
  }

  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  public CatalogsItemsBatchRequest items(List<ItemBatchRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsBatchRequest addItemsItem(ItemBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemBatchRecord>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array with catalogs items
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Array with catalogs items", required = false)
  public List<ItemBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemBatchRecord> items) {
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

