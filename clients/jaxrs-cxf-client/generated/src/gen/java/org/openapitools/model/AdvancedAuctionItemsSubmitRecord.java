package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.AdvancedAuctionItemsSubmitDeleteRecord;
import org.openapitools.model.AdvancedAuctionItemsSubmitUpsertRecord;
import org.openapitools.model.AdvancedAuctionOperation;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing an item bid option operation
 **/
@ApiModel(description="Object describing an item bid option operation")

public class AdvancedAuctionItemsSubmitRecord  {
  
  @ApiModelProperty(required = true, value = "")
  private AdvancedAuctionOperation operation;

  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
 /**
   * The catalog retail item id in the merchant namespace
  **/
  private String itemId;

  @ApiModelProperty(required = true, value = "")
  private Country country;

  @ApiModelProperty(required = true, value = "")
  private Language language;

  @ApiModelProperty(required = true, value = "")
  private AdvancedAuctionBidOptions bidOptions;

  @ApiModelProperty(example = "[BID, APP_TYPE_BID_MULTIPLIER_SET]", required = true, value = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
 /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  **/
  private List<UpdateMaskBidOptionField> updateMask;
 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public AdvancedAuctionOperation getOperation() {
    return operation;
  }

  public void setOperation(AdvancedAuctionOperation operation) {
    this.operation = operation;
  }

  public AdvancedAuctionItemsSubmitRecord operation(AdvancedAuctionOperation operation) {
    this.operation = operation;
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

  public AdvancedAuctionItemsSubmitRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

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

  public AdvancedAuctionItemsSubmitRecord country(Country country) {
    this.country = country;
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

  public AdvancedAuctionItemsSubmitRecord language(Language language) {
    this.language = language;
    return this;
  }

 /**
   * Get bidOptions
   * @return bidOptions
  **/
  @JsonProperty("bid_options")
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  public AdvancedAuctionItemsSubmitRecord bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

 /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.
   * @return updateMask
  **/
  @JsonProperty("update_mask")
  public List<UpdateMaskBidOptionField> getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
  }

  public AdvancedAuctionItemsSubmitRecord updateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public AdvancedAuctionItemsSubmitRecord addUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
    this.updateMask.add(updateMaskItem);
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
    AdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord = (AdvancedAuctionItemsSubmitRecord) o;
    return Objects.equals(this.operation, advancedAuctionItemsSubmitRecord.operation) &&
        Objects.equals(this.itemId, advancedAuctionItemsSubmitRecord.itemId) &&
        Objects.equals(this.country, advancedAuctionItemsSubmitRecord.country) &&
        Objects.equals(this.language, advancedAuctionItemsSubmitRecord.language) &&
        Objects.equals(this.bidOptions, advancedAuctionItemsSubmitRecord.bidOptions) &&
        Objects.equals(this.updateMask, advancedAuctionItemsSubmitRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, itemId, country, language, bidOptions, updateMask);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

