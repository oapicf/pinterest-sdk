package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionOperationError;
import org.openapitools.model.Country;
import org.openapitools.model.Language;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object describing an item bid option deletion operation
 */
@ApiModel(description="Object describing an item bid option deletion operation")

public class AdvancedAuctionItemsSubmitDeleteRecord  {
  
  @ApiModelProperty(required = true, value = "")

  private Country country;

 /**
  * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  */
  @ApiModelProperty(value = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")

  private List<AdvancedAuctionOperationError> errors = new ArrayList<>();

 /**
  * The catalog retail item id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")

  private String itemId;

  @ApiModelProperty(required = true, value = "")

  private Language language;

public enum OperationEnum {

DELETE(String.valueOf("DELETE"));


    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private OperationEnum operation;
 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public AdvancedAuctionItemsSubmitDeleteRecord country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<AdvancedAuctionOperationError> getErrors() {
    return errors;
  }

  public void setErrors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }

  public AdvancedAuctionItemsSubmitDeleteRecord errors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
    return this;
  }

  public AdvancedAuctionItemsSubmitDeleteRecord addErrorsItem(AdvancedAuctionOperationError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * The catalog retail item id in the merchant namespace
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public AdvancedAuctionItemsSubmitDeleteRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public AdvancedAuctionItemsSubmitDeleteRecord language(Language language) {
    this.language = language;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public String getOperation() {
    if (operation == null) {
      return null;
    }
    return operation.value();
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public AdvancedAuctionItemsSubmitDeleteRecord operation(OperationEnum operation) {
    this.operation = operation;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

