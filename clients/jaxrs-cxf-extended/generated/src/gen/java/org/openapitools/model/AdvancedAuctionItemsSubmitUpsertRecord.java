package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing an item bid option upsert operation
 */
@ApiModel(description="Object describing an item bid option upsert operation")

public class AdvancedAuctionItemsSubmitUpsertRecord  {
  
 /**
  * The catalog retail item id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
  private String itemId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Language language;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AdvancedAuctionBidOptions bidOptions;

 /**
  * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  */
  @ApiModelProperty(example = "[\"BID\",\"APP_TYPE_BID_MULTIPLIER_SET\"]", required = true, value = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
  @Valid
  private List<UpdateMaskBidOptionField> updateMask;
 /**
  * The catalog retail item id in the merchant namespace
  * @return itemId
  */
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
 public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
  public AdvancedAuctionItemsSubmitUpsertRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public AdvancedAuctionItemsSubmitUpsertRecord country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Get language
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public Language getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public AdvancedAuctionItemsSubmitUpsertRecord language(Language language) {
    this.language = language;
    return this;
  }

 /**
  * Get bidOptions
  * @return bidOptions
  */
  @JsonProperty("bid_options")
  @NotNull
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }

  /**
   * Sets the <code>bidOptions</code> property.
   */
 public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  /**
   * Sets the <code>bidOptions</code> property.
   */
  public AdvancedAuctionItemsSubmitUpsertRecord bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

 /**
  * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.
  * @return updateMask
  */
  @JsonProperty("update_mask")
  @NotNull
  public List<UpdateMaskBidOptionField> getUpdateMask() {
    return updateMask;
  }

  /**
   * Sets the <code>updateMask</code> property.
   */
 public void setUpdateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
  }

  /**
   * Sets the <code>updateMask</code> property.
   */
  public AdvancedAuctionItemsSubmitUpsertRecord updateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  /**
   * Adds a new item to the <code>updateMask</code> list.
   */
  public AdvancedAuctionItemsSubmitUpsertRecord addUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
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
    AdvancedAuctionItemsSubmitUpsertRecord advancedAuctionItemsSubmitUpsertRecord = (AdvancedAuctionItemsSubmitUpsertRecord) o;
    return Objects.equals(this.itemId, advancedAuctionItemsSubmitUpsertRecord.itemId) &&
        Objects.equals(this.country, advancedAuctionItemsSubmitUpsertRecord.country) &&
        Objects.equals(this.language, advancedAuctionItemsSubmitUpsertRecord.language) &&
        Objects.equals(this.bidOptions, advancedAuctionItemsSubmitUpsertRecord.bidOptions) &&
        Objects.equals(this.updateMask, advancedAuctionItemsSubmitUpsertRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, country, language, bidOptions, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitUpsertRecord {\n");
    
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

