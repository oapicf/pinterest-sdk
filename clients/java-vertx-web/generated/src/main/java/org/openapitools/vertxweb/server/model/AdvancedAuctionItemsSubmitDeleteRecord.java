package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdvancedAuctionOperationError;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.Language;

/**
 * Object describing an item bid option deletion operation
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionItemsSubmitDeleteRecord   {
  
  private Country country;
  private List<AdvancedAuctionOperationError> errors = new ArrayList<>();
  private String itemId;
  private Language language;


  public enum OperationEnum {
    DELETE("DELETE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OperationEnum operation;

  public AdvancedAuctionItemsSubmitDeleteRecord () {

  }

  public AdvancedAuctionItemsSubmitDeleteRecord (Country country, List<AdvancedAuctionOperationError> errors, String itemId, Language language, OperationEnum operation) {
    this.country = country;
    this.errors = errors;
    this.itemId = itemId;
    this.language = language;
    this.operation = operation;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("errors")
  public List<AdvancedAuctionOperationError> getErrors() {
    return errors;
  }
  public void setErrors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }

    
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
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
    return Objects.equals(country, advancedAuctionItemsSubmitDeleteRecord.country) &&
        Objects.equals(errors, advancedAuctionItemsSubmitDeleteRecord.errors) &&
        Objects.equals(itemId, advancedAuctionItemsSubmitDeleteRecord.itemId) &&
        Objects.equals(language, advancedAuctionItemsSubmitDeleteRecord.language) &&
        Objects.equals(operation, advancedAuctionItemsSubmitDeleteRecord.operation);
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
