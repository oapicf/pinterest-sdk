package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdvancedAuctionItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItem {

  private String itemId;

  private Country country;

  private Language language;

  private AdvancedAuctionBidOptions bidOptions;

  public AdvancedAuctionItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvancedAuctionItem(String itemId, Country country, Language language, AdvancedAuctionBidOptions bidOptions) {
    this.itemId = itemId;
    this.country = country;
    this.language = language;
    this.bidOptions = bidOptions;
  }

  public AdvancedAuctionItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog retail item id in the merchant namespace
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", example = "DS0294-M", description = "The catalog retail item id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
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
  @NotNull @Valid 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
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
  @NotNull @Valid 
  @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
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
  @NotNull @Valid 
  @Schema(name = "bid_options", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bid_options")
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

