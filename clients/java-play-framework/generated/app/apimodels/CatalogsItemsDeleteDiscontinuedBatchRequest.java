package apimodels;

import apimodels.BatchOperation;
import apimodels.Country;
import apimodels.ItemDeleteDiscontinuedBatchRecord;
import apimodels.Language;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Request object to discontinue catalogs items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsItemsDeleteDiscontinuedBatchRequest   {
  @JsonProperty("country")
  @NotNull
@Valid

  private Country country;

  @JsonProperty("language")
  @NotNull
@Valid

  private Language language;

  @JsonProperty("operation")
  @NotNull
@Valid

  private BatchOperation operation;

  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid ItemDeleteDiscontinuedBatchRecord> items = new ArrayList<>();

  public CatalogsItemsDeleteDiscontinuedBatchRequest country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsItemsDeleteDiscontinuedBatchRequest language(Language language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public CatalogsItemsDeleteDiscontinuedBatchRequest operation(BatchOperation operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  public BatchOperation getOperation() {
    return operation;
  }

  public void setOperation(BatchOperation operation) {
    this.operation = operation;
  }

  public CatalogsItemsDeleteDiscontinuedBatchRequest items(List<@Valid ItemDeleteDiscontinuedBatchRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItemsDeleteDiscontinuedBatchRequest addItemsItem(ItemDeleteDiscontinuedBatchRecord itemsItem) {
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
  public List<@Valid ItemDeleteDiscontinuedBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid ItemDeleteDiscontinuedBatchRecord> items) {
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
    CatalogsItemsDeleteDiscontinuedBatchRequest catalogsItemsDeleteDiscontinuedBatchRequest = (CatalogsItemsDeleteDiscontinuedBatchRequest) o;
    return Objects.equals(country, catalogsItemsDeleteDiscontinuedBatchRequest.country) &&
        Objects.equals(language, catalogsItemsDeleteDiscontinuedBatchRequest.language) &&
        Objects.equals(operation, catalogsItemsDeleteDiscontinuedBatchRequest.operation) &&
        Objects.equals(items, catalogsItemsDeleteDiscontinuedBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, operation, items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsDeleteDiscontinuedBatchRequest {\n");
    
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

