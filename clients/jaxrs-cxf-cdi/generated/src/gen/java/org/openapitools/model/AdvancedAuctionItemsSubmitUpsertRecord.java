package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object describing an item bid option upsert operation
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Object describing an item bid option upsert operation")
public class AdvancedAuctionItemsSubmitUpsertRecord   {
  
  private String itemId;

  private Country country;

  private Language language;

  private AdvancedAuctionBidOptions bidOptions;

  private List<UpdateMaskBidOptionField> updateMask;

  /**
   * The catalog retail item id in the merchant namespace
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  /**
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }


  /**
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord language(Language language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  @NotNull
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }


  /**
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bid_options")
  @NotNull
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }


  /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.
   **/
  public AdvancedAuctionItemsSubmitUpsertRecord updateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  
  @ApiModelProperty(example = "[\"BID\",\"APP_TYPE_BID_MULTIPLIER_SET\"]", required = true, value = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
  @JsonProperty("update_mask")
  @NotNull
  public List<UpdateMaskBidOptionField> getUpdateMask() {
    return updateMask;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

