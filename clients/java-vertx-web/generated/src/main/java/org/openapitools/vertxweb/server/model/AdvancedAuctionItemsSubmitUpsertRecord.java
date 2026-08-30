package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdvancedAuctionBidOptions;
import org.openapitools.vertxweb.server.model.AdvancedAuctionOperationError;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.Language;
import org.openapitools.vertxweb.server.model.UpdateMaskBidOptionField;

/**
 * Object describing an item bid option upsert operation
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionItemsSubmitUpsertRecord   {
  
  private AdvancedAuctionBidOptions bidOptions;
  private Country country;
  private List<AdvancedAuctionOperationError> errors = new ArrayList<>();
  private String itemId;
  private Language language;


  public enum OperationEnum {
    UPSERT("UPSERT");

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
  private List<UpdateMaskBidOptionField> updateMask;

  public AdvancedAuctionItemsSubmitUpsertRecord () {

  }

  public AdvancedAuctionItemsSubmitUpsertRecord (AdvancedAuctionBidOptions bidOptions, Country country, List<AdvancedAuctionOperationError> errors, String itemId, Language language, OperationEnum operation, List<UpdateMaskBidOptionField> updateMask) {
    this.bidOptions = bidOptions;
    this.country = country;
    this.errors = errors;
    this.itemId = itemId;
    this.language = language;
    this.operation = operation;
    this.updateMask = updateMask;
  }

    
  @JsonProperty("bid_options")
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
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

    
  @JsonProperty("update_mask")
  public List<UpdateMaskBidOptionField> getUpdateMask() {
    return updateMask;
  }
  public void setUpdateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
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
    return Objects.equals(bidOptions, advancedAuctionItemsSubmitUpsertRecord.bidOptions) &&
        Objects.equals(country, advancedAuctionItemsSubmitUpsertRecord.country) &&
        Objects.equals(errors, advancedAuctionItemsSubmitUpsertRecord.errors) &&
        Objects.equals(itemId, advancedAuctionItemsSubmitUpsertRecord.itemId) &&
        Objects.equals(language, advancedAuctionItemsSubmitUpsertRecord.language) &&
        Objects.equals(operation, advancedAuctionItemsSubmitUpsertRecord.operation) &&
        Objects.equals(updateMask, advancedAuctionItemsSubmitUpsertRecord.updateMask);
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
