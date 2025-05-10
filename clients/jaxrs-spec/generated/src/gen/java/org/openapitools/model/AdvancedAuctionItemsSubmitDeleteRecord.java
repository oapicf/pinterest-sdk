package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * Object describing an item bid option deletion operation
 **/
@ApiModel(description = "Object describing an item bid option deletion operation")
@JsonTypeName("AdvancedAuctionItemsSubmitDeleteRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-05-10T05:40:54.952063144Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class AdvancedAuctionItemsSubmitDeleteRecord   {
  private String itemId;
  private Country country;
  private Language language;

  public AdvancedAuctionItemsSubmitDeleteRecord() {
  }

  @JsonCreator
  public AdvancedAuctionItemsSubmitDeleteRecord(
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "country") Country country,
    @JsonProperty(required = true, value = "language") Language language
  ) {
    this.itemId = itemId;
    this.country = country;
    this.language = language;
  }

  /**
   * The catalog retail item id in the merchant namespace
   **/
  public AdvancedAuctionItemsSubmitDeleteRecord itemId(String itemId) {
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
  public AdvancedAuctionItemsSubmitDeleteRecord country(Country country) {
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
   **/
  public AdvancedAuctionItemsSubmitDeleteRecord language(Language language) {
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
    AdvancedAuctionItemsSubmitDeleteRecord advancedAuctionItemsSubmitDeleteRecord = (AdvancedAuctionItemsSubmitDeleteRecord) o;
    return Objects.equals(this.itemId, advancedAuctionItemsSubmitDeleteRecord.itemId) &&
        Objects.equals(this.country, advancedAuctionItemsSubmitDeleteRecord.country) &&
        Objects.equals(this.language, advancedAuctionItemsSubmitDeleteRecord.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, country, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitDeleteRecord {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

