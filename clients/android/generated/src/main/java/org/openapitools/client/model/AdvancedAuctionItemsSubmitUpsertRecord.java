/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AdvancedAuctionBidOptions;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.Language;
import org.openapitools.client.model.UpdateMaskBidOptionField;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object describing an item bid option upsert operation
 **/
@ApiModel(description = "Object describing an item bid option upsert operation")
public class AdvancedAuctionItemsSubmitUpsertRecord {
  
  @SerializedName("item_id")
  private String itemId = null;
  @SerializedName("country")
  private Country country = null;
  @SerializedName("language")
  private Language language = null;
  @SerializedName("bid_options")
  private AdvancedAuctionBidOptions bidOptions = null;
  @SerializedName("update_mask")
  private List<UpdateMaskBidOptionField> updateMask = null;

  /**
   * The catalog retail item id in the merchant namespace
   **/
  @ApiModelProperty(required = true, value = "The catalog retail item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
   **/
  @ApiModelProperty(required = true, value = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
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
    return (this.itemId == null ? advancedAuctionItemsSubmitUpsertRecord.itemId == null : this.itemId.equals(advancedAuctionItemsSubmitUpsertRecord.itemId)) &&
        (this.country == null ? advancedAuctionItemsSubmitUpsertRecord.country == null : this.country.equals(advancedAuctionItemsSubmitUpsertRecord.country)) &&
        (this.language == null ? advancedAuctionItemsSubmitUpsertRecord.language == null : this.language.equals(advancedAuctionItemsSubmitUpsertRecord.language)) &&
        (this.bidOptions == null ? advancedAuctionItemsSubmitUpsertRecord.bidOptions == null : this.bidOptions.equals(advancedAuctionItemsSubmitUpsertRecord.bidOptions)) &&
        (this.updateMask == null ? advancedAuctionItemsSubmitUpsertRecord.updateMask == null : this.updateMask.equals(advancedAuctionItemsSubmitUpsertRecord.updateMask));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.itemId == null ? 0: this.itemId.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.language == null ? 0: this.language.hashCode());
    result = 31 * result + (this.bidOptions == null ? 0: this.bidOptions.hashCode());
    result = 31 * result + (this.updateMask == null ? 0: this.updateMask.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitUpsertRecord {\n");
    
    sb.append("  itemId: ").append(itemId).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  language: ").append(language).append("\n");
    sb.append("  bidOptions: ").append(bidOptions).append("\n");
    sb.append("  updateMask: ").append(updateMask).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
