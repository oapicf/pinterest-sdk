package apimodels;

import apimodels.AdvancedAuctionBidOptions;
import apimodels.AdvancedAuctionItemsSubmitDeleteRecord;
import apimodels.AdvancedAuctionItemsSubmitUpsertRecord;
import apimodels.AdvancedAuctionOperation;
import apimodels.Country;
import apimodels.Language;
import apimodels.UpdateMaskBidOptionField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * Object describing an item bid option operation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvancedAuctionItemsSubmitRecord   {
  @JsonProperty("operation")
  @NotNull
@Valid

  private AdvancedAuctionOperation operation;

  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  @JsonProperty("country")
  @NotNull
@Valid

  private Country country;

  @JsonProperty("language")
  @NotNull
@Valid

  private Language language;

  @JsonProperty("bid_options")
  @NotNull
@Valid

  private AdvancedAuctionBidOptions bidOptions;

  @JsonProperty("update_mask")
  @NotNull
@Valid

  private List<UpdateMaskBidOptionField> updateMask = ;

  public AdvancedAuctionItemsSubmitRecord operation(AdvancedAuctionOperation operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  public AdvancedAuctionOperation getOperation() {
    return operation;
  }

  public void setOperation(AdvancedAuctionOperation operation) {
    this.operation = operation;
  }

  public AdvancedAuctionItemsSubmitRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The catalog retail item id in the merchant namespace
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public AdvancedAuctionItemsSubmitRecord country(Country country) {
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

  public AdvancedAuctionItemsSubmitRecord language(Language language) {
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

  public AdvancedAuctionItemsSubmitRecord bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

   /**
   * Get bidOptions
   * @return bidOptions
  **/
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  public AdvancedAuctionItemsSubmitRecord updateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public AdvancedAuctionItemsSubmitRecord addUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
    if (this.updateMask == null) {
      this.updateMask = new ArrayList<>();
    }
    this.updateMask.add(updateMaskItem);
    return this;
  }

   /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
   * @return updateMask
  **/
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
    AdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord = (AdvancedAuctionItemsSubmitRecord) o;
    return Objects.equals(operation, advancedAuctionItemsSubmitRecord.operation) &&
        Objects.equals(itemId, advancedAuctionItemsSubmitRecord.itemId) &&
        Objects.equals(country, advancedAuctionItemsSubmitRecord.country) &&
        Objects.equals(language, advancedAuctionItemsSubmitRecord.language) &&
        Objects.equals(bidOptions, advancedAuctionItemsSubmitRecord.bidOptions) &&
        Objects.equals(updateMask, advancedAuctionItemsSubmitRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, itemId, country, language, bidOptions, updateMask);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitRecord {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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

