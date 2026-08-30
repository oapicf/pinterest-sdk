package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.AdvancedAuctionOperationError;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Object describing an item bid option upsert operation
 **/
@ApiModel(description = "Object describing an item bid option upsert operation")
@JsonTypeName("AdvancedAuctionItemsSubmitUpsertRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvancedAuctionItemsSubmitUpsertRecord   {
  private AdvancedAuctionBidOptions bidOptions;
  private Country country;
  private @Valid List<@Valid AdvancedAuctionOperationError> errors = new ArrayList<>();
  private String itemId;
  private Language language;
  public enum OperationEnum {

    UPSERT(String.valueOf("UPSERT"));


    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OperationEnum fromString(String s) {
        for (OperationEnum b : OperationEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private OperationEnum operation;
  private @Valid List<UpdateMaskBidOptionField> updateMask;

  public AdvancedAuctionItemsSubmitUpsertRecord() {
  }

  @JsonCreator
  public AdvancedAuctionItemsSubmitUpsertRecord(
    @JsonProperty(required = true, value = "bid_options") AdvancedAuctionBidOptions bidOptions,
    @JsonProperty(required = true, value = "country") Country country,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "language") Language language,
    @JsonProperty(required = true, value = "operation") OperationEnum operation,
    @JsonProperty(required = true, value = "update_mask") List<UpdateMaskBidOptionField> updateMask
  ) {
    this.bidOptions = bidOptions;
    this.country = country;
    this.itemId = itemId;
    this.language = language;
    this.operation = operation;
    this.updateMask = updateMask;
  }

  /**
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "bid_options")
  @NotNull @Valid public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }

  @JsonProperty(required = true, value = "bid_options")
  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  /**
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "country")
  @NotNull public Country getCountry() {
    return country;
  }

  @JsonProperty(required = true, value = "country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord errors(List<@Valid AdvancedAuctionOperationError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")
  @JsonProperty("errors")
  @Valid public List<@Valid AdvancedAuctionOperationError> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord addErrorsItem(AdvancedAuctionOperationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord removeErrorsItem(AdvancedAuctionOperationError errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
  /**
   * The catalog retail item id in the merchant namespace
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord language(Language language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "language")
  @NotNull public Language getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation")
  @NotNull public OperationEnum getOperation() {
    return operation;
  }

  @JsonProperty(required = true, value = "operation")
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord updateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  
  @ApiModelProperty(example = "[\"BID\",\"APP_TYPE_BID_MULTIPLIER_SET\"]", required = true, value = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
  @JsonProperty(required = true, value = "update_mask")
  @NotNull public List<UpdateMaskBidOptionField> getUpdateMask() {
    return updateMask;
  }

  @JsonProperty(required = true, value = "update_mask")
  public void setUpdateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord addUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
    if (this.updateMask == null) {
      this.updateMask = new ArrayList<>();
    }

    this.updateMask.add(updateMaskItem);
    return this;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord removeUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
    if (updateMaskItem != null && this.updateMask != null) {
      this.updateMask.remove(updateMaskItem);
    }

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
    AdvancedAuctionItemsSubmitUpsertRecord advancedAuctionItemsSubmitUpsertRecord = (AdvancedAuctionItemsSubmitUpsertRecord) o;
    return Objects.equals(this.bidOptions, advancedAuctionItemsSubmitUpsertRecord.bidOptions) &&
        Objects.equals(this.country, advancedAuctionItemsSubmitUpsertRecord.country) &&
        Objects.equals(this.errors, advancedAuctionItemsSubmitUpsertRecord.errors) &&
        Objects.equals(this.itemId, advancedAuctionItemsSubmitUpsertRecord.itemId) &&
        Objects.equals(this.language, advancedAuctionItemsSubmitUpsertRecord.language) &&
        Objects.equals(this.operation, advancedAuctionItemsSubmitUpsertRecord.operation) &&
        Objects.equals(this.updateMask, advancedAuctionItemsSubmitUpsertRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOptions, country, errors, itemId, language, operation, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitUpsertRecord {\n");
    
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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
