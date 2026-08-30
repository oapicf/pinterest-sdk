package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdvancedAuctionItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvancedAuctionItem   {
  private AdvancedAuctionBidOptions bidOptions;
  private Country country;
  private String itemId;
  private Language language;

  public AdvancedAuctionItem() {
  }

  @JsonCreator
  public AdvancedAuctionItem(
    @JsonProperty(required = true, value = "bid_options") AdvancedAuctionBidOptions bidOptions,
    @JsonProperty(required = true, value = "country") Country country,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "language") Language language
  ) {
    this.bidOptions = bidOptions;
    this.country = country;
    this.itemId = itemId;
    this.language = language;
  }

  /**
   **/
  public AdvancedAuctionItem bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "bid_options")
  @NotNull @Valid public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }

  @JsonProperty(required = true, value = "bid_options")
  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  /**
   **/
  public AdvancedAuctionItem country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "country")
  @NotNull public Country getCountry() {
    return country;
  }

  @JsonProperty(required = true, value = "country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * The catalog retail item id in the merchant namespace
   **/
  public AdvancedAuctionItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  public AdvancedAuctionItem language(Language language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "language")
  @NotNull public Language getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
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
    return Objects.equals(this.bidOptions, advancedAuctionItem.bidOptions) &&
        Objects.equals(this.country, advancedAuctionItem.country) &&
        Objects.equals(this.itemId, advancedAuctionItem.itemId) &&
        Objects.equals(this.language, advancedAuctionItem.language);
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
