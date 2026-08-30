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
import org.openapitools.model.AdvancedAuctionOperationError;
import org.openapitools.model.Country;
import org.openapitools.model.Language;



/**
 * Object describing an item bid option deletion operation
 **/

@ApiModel(description = "Object describing an item bid option deletion operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvancedAuctionItemsSubmitDeleteRecord   {
  @JsonProperty("country")
  private Country country;

  @JsonProperty("errors")
  private List<AdvancedAuctionOperationError> errors = null;

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("language")
  private Language language;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    DELETE("DELETE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation;

  /**
   **/
  public AdvancedAuctionItemsSubmitDeleteRecord country(Country country) {
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
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   **/
  public AdvancedAuctionItemsSubmitDeleteRecord errors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")
  @JsonProperty("errors")
  public List<AdvancedAuctionOperationError> getErrors() {
    return errors;
  }
  public void setErrors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }

  /**
   * The catalog retail item id in the merchant namespace
   **/
  public AdvancedAuctionItemsSubmitDeleteRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  public AdvancedAuctionItemsSubmitDeleteRecord language(Language language) {
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
  public AdvancedAuctionItemsSubmitDeleteRecord operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

