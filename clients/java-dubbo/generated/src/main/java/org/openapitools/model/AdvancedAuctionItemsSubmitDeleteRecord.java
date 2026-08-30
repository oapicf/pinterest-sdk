package org.openapitools.model;

import org.openapitools.model.AdvancedAuctionOperationError;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object describing an item bid option deletion operation
 */
public class AdvancedAuctionItemsSubmitDeleteRecord implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("country")
  private Country country;

  /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   */
  @JsonProperty("errors")
  private List<AdvancedAuctionOperationError> errors = new ArrayList<>();

  /**
   * The catalog retail item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("operation")
  private String operation;

  /**
   * 
   * @return country
   */
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   * @return errors
   */
  public List<AdvancedAuctionOperationError> getErrors() {
    return errors;
  }

  public void setErrors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }

  /**
   * The catalog retail item id in the merchant namespace
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * 
   * @return language
   */
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   * 
   * @return operation
   */
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedAuctionItemsSubmitDeleteRecord advancedAuctionItemsSubmitDeleteRecord = (AdvancedAuctionItemsSubmitDeleteRecord) o;
    return Objects.equals(this.country, advancedAuctionItemsSubmitDeleteRecord.country) &&
        Objects.equals(this.errors, advancedAuctionItemsSubmitDeleteRecord.errors) &&
        Objects.equals(this.itemId, advancedAuctionItemsSubmitDeleteRecord.itemId) &&
        Objects.equals(this.language, advancedAuctionItemsSubmitDeleteRecord.language) &&
        Objects.equals(this.operation, advancedAuctionItemsSubmitDeleteRecord.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, errors, itemId, language, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitDeleteRecord {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
