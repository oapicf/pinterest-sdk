package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AdvancedAuctionBidOptions;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.Language;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionItem   {
  
  private AdvancedAuctionBidOptions bidOptions;
  private Country country;
  private String itemId;
  private Language language;

  public AdvancedAuctionItem () {

  }

  public AdvancedAuctionItem (AdvancedAuctionBidOptions bidOptions, Country country, String itemId, Language language) {
    this.bidOptions = bidOptions;
    this.country = country;
    this.itemId = itemId;
    this.language = language;
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
