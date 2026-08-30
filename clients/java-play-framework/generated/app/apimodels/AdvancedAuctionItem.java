package apimodels;

import apimodels.AdvancedAuctionBidOptions;
import apimodels.Country;
import apimodels.Language;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdvancedAuctionItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvancedAuctionItem   {
  @JsonProperty("bid_options")
  @NotNull
@Valid

  private AdvancedAuctionBidOptions bidOptions;

  @JsonProperty("country")
  @NotNull
@Valid

  private Country country;

  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  @JsonProperty("language")
  @NotNull
@Valid

  private Language language;

  public AdvancedAuctionItem bidOptions(AdvancedAuctionBidOptions bidOptions) {
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

  public AdvancedAuctionItem country(Country country) {
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

  public AdvancedAuctionItem itemId(String itemId) {
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

  public AdvancedAuctionItem language(Language language) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedAuctionItem advancedAuctionItem = (AdvancedAuctionItem) o;
    return Objects.equals(bidOptions, advancedAuctionItem.bidOptions) &&
        Objects.equals(country, advancedAuctionItem.country) &&
        Objects.equals(itemId, advancedAuctionItem.itemId) &&
        Objects.equals(language, advancedAuctionItem.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOptions, country, itemId, language);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItem {\n");
    
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

