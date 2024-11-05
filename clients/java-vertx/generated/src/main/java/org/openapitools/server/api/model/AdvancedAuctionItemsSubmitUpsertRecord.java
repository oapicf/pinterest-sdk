package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.AdvancedAuctionBidOptions;
import org.openapitools.server.api.model.Country;
import org.openapitools.server.api.model.Language;
import org.openapitools.server.api.model.UpdateMaskBidOptionField;

/**
 * Object describing an item bid option upsert operation
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionItemsSubmitUpsertRecord   {
  
  private String itemId;
  private Country country;
  private Language language;
  private AdvancedAuctionBidOptions bidOptions;
  private List<UpdateMaskBidOptionField> updateMask;

  public AdvancedAuctionItemsSubmitUpsertRecord () {

  }

  public AdvancedAuctionItemsSubmitUpsertRecord (String itemId, Country country, Language language, AdvancedAuctionBidOptions bidOptions, List<UpdateMaskBidOptionField> updateMask) {
    this.itemId = itemId;
    this.country = country;
    this.language = language;
    this.bidOptions = bidOptions;
    this.updateMask = updateMask;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }

    
  @JsonProperty("bid_options")
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
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
    return Objects.equals(itemId, advancedAuctionItemsSubmitUpsertRecord.itemId) &&
        Objects.equals(country, advancedAuctionItemsSubmitUpsertRecord.country) &&
        Objects.equals(language, advancedAuctionItemsSubmitUpsertRecord.language) &&
        Objects.equals(bidOptions, advancedAuctionItemsSubmitUpsertRecord.bidOptions) &&
        Objects.equals(updateMask, advancedAuctionItemsSubmitUpsertRecord.updateMask);
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
