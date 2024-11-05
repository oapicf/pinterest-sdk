package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.Country;
import org.openapitools.model.Language;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object uniquely identifying a retail catalog item
 **/
@ApiModel(description="Object uniquely identifying a retail catalog item")

public class AdvancedAuctionKey  {
  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
 /**
   * The catalog retail item id in the merchant namespace
  **/
  private String itemId;

  @ApiModelProperty(required = true, value = "")
  private Country country;

  @ApiModelProperty(required = true, value = "")
  private Language language;
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

  public AdvancedAuctionKey itemId(String itemId) {
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

  public AdvancedAuctionKey country(Country country) {
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

  public AdvancedAuctionKey language(Language language) {
    this.language = language;
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
    AdvancedAuctionKey advancedAuctionKey = (AdvancedAuctionKey) o;
    return Objects.equals(this.itemId, advancedAuctionKey.itemId) &&
        Objects.equals(this.country, advancedAuctionKey.country) &&
        Objects.equals(this.language, advancedAuctionKey.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, country, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionKey {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

