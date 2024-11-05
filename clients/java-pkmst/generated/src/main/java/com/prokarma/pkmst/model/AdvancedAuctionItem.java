package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AdvancedAuctionBidOptions;
import com.prokarma.pkmst.model.Country;
import com.prokarma.pkmst.model.Language;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdvancedAuctionItem
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItem   {
  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("bid_options")
  private AdvancedAuctionBidOptions bidOptions;

  public AdvancedAuctionItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog retail item id in the merchant namespace
   * @return itemId
   */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public AdvancedAuctionItem country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @ApiModelProperty(required = true, value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public AdvancedAuctionItem language(Language language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @ApiModelProperty(required = true, value = "")
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public AdvancedAuctionItem bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  /**
   * Get bidOptions
   * @return bidOptions
   */
  @ApiModelProperty(required = true, value = "")
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedAuctionItem advancedAuctionItem = (AdvancedAuctionItem) o;
    return Objects.equals(this.itemId, advancedAuctionItem.itemId) &&
        Objects.equals(this.country, advancedAuctionItem.country) &&
        Objects.equals(this.language, advancedAuctionItem.language) &&
        Objects.equals(this.bidOptions, advancedAuctionItem.bidOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, country, language, bidOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItem {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
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

