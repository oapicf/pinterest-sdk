package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataInnerCustomDataContentsInner;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object containing other custom data.
 */

@Schema(name = "ConversionEvents_data_inner_custom_data", description = "Object containing other custom data.")
@JsonTypeName("ConversionEvents_data_inner_custom_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionEventsDataInnerCustomData {

  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  private JsonNullable<String> value = JsonNullable.<String>undefined();

  @Valid
  private List<String> contentIds;

  private JsonNullable<String> contentName = JsonNullable.<String>undefined();

  private JsonNullable<String> contentCategory = JsonNullable.<String>undefined();

  private JsonNullable<String> contentBrand = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid ConversionEventsDataInnerCustomDataContentsInner> contents;

  private Long numItems;

  private JsonNullable<String> orderId = JsonNullable.<String>undefined();

  private JsonNullable<String> searchString = JsonNullable.<String>undefined();

  private JsonNullable<String> optOutType = JsonNullable.<String>undefined();

  private JsonNullable<String> np = JsonNullable.<String>undefined();

  public ConversionEventsDataInnerCustomData currency(String currency) {
    this.currency = JsonNullable.of(currency);
    return this;
  }

  /**
   * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
   * @return currency
  */
  
  @Schema(name = "currency", example = "USD", description = "The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public JsonNullable<String> getCurrency() {
    return currency;
  }

  public void setCurrency(JsonNullable<String> currency) {
    this.currency = currency;
  }

  public ConversionEventsDataInnerCustomData value(String value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
   * @return value
  */
  
  @Schema(name = "value", example = "72.39", description = "Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public JsonNullable<String> getValue() {
    return value;
  }

  public void setValue(JsonNullable<String> value) {
    this.value = value;
  }

  public ConversionEventsDataInnerCustomData contentIds(List<String> contentIds) {
    this.contentIds = contentIds;
    return this;
  }

  public ConversionEventsDataInnerCustomData addContentIdsItem(String contentIdsItem) {
    if (this.contentIds == null) {
      this.contentIds = new ArrayList<>();
    }
    this.contentIds.add(contentIdsItem);
    return this;
  }

  /**
   * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return contentIds
  */
  
  @Schema(name = "content_ids", example = "[\"red-pinterest-shirt-logo-1\",\"purple-pinterest-shirt-logo-3\"]", description = "List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content_ids")
  public List<String> getContentIds() {
    return contentIds;
  }

  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }

  public ConversionEventsDataInnerCustomData contentName(String contentName) {
    this.contentName = JsonNullable.of(contentName);
    return this;
  }

  /**
   * The name of the page or product associated with the event.
   * @return contentName
  */
  
  @Schema(name = "content_name", example = "pinterest-themed-clothing", description = "The name of the page or product associated with the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content_name")
  public JsonNullable<String> getContentName() {
    return contentName;
  }

  public void setContentName(JsonNullable<String> contentName) {
    this.contentName = contentName;
  }

  public ConversionEventsDataInnerCustomData contentCategory(String contentCategory) {
    this.contentCategory = JsonNullable.of(contentCategory);
    return this;
  }

  /**
   * The category of the content associated with the event.
   * @return contentCategory
  */
  
  @Schema(name = "content_category", example = "shirts", description = "The category of the content associated with the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content_category")
  public JsonNullable<String> getContentCategory() {
    return contentCategory;
  }

  public void setContentCategory(JsonNullable<String> contentCategory) {
    this.contentCategory = contentCategory;
  }

  public ConversionEventsDataInnerCustomData contentBrand(String contentBrand) {
    this.contentBrand = JsonNullable.of(contentBrand);
    return this;
  }

  /**
   * The brand of the content associated with the event.
   * @return contentBrand
  */
  
  @Schema(name = "content_brand", example = "pinterest-brand", description = "The brand of the content associated with the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content_brand")
  public JsonNullable<String> getContentBrand() {
    return contentBrand;
  }

  public void setContentBrand(JsonNullable<String> contentBrand) {
    this.contentBrand = contentBrand;
  }

  public ConversionEventsDataInnerCustomData contents(List<@Valid ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
    return this;
  }

  public ConversionEventsDataInnerCustomData addContentsItem(ConversionEventsDataInnerCustomDataContentsInner contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

  /**
   * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return contents
  */
  @Valid 
  @Schema(name = "contents", description = "A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contents")
  public List<@Valid ConversionEventsDataInnerCustomDataContentsInner> getContents() {
    return contents;
  }

  public void setContents(List<@Valid ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
  }

  public ConversionEventsDataInnerCustomData numItems(Long numItems) {
    this.numItems = numItems;
    return this;
  }

  /**
   * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return numItems
  */
  
  @Schema(name = "num_items", example = "2", description = "Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_items")
  public Long getNumItems() {
    return numItems;
  }

  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

  public ConversionEventsDataInnerCustomData orderId(String orderId) {
    this.orderId = JsonNullable.of(orderId);
    return this;
  }

  /**
   * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
   * @return orderId
  */
  
  @Schema(name = "order_id", example = "my_order_id", description = "The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_id")
  public JsonNullable<String> getOrderId() {
    return orderId;
  }

  public void setOrderId(JsonNullable<String> orderId) {
    this.orderId = orderId;
  }

  public ConversionEventsDataInnerCustomData searchString(String searchString) {
    this.searchString = JsonNullable.of(searchString);
    return this;
  }

  /**
   * The search string related to the user conversion event.
   * @return searchString
  */
  
  @Schema(name = "search_string", example = "sample string", description = "The search string related to the user conversion event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search_string")
  public JsonNullable<String> getSearchString() {
    return searchString;
  }

  public void setSearchString(JsonNullable<String> searchString) {
    this.searchString = searchString;
  }

  public ConversionEventsDataInnerCustomData optOutType(String optOutType) {
    this.optOutType = JsonNullable.of(optOutType);
    return this;
  }

  /**
   * Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
   * @return optOutType
  */
  
  @Schema(name = "opt_out_type", example = "LDP", description = "Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\" target=\"_blank\">dev site</a> for specific opt_out_type set up.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opt_out_type")
  public JsonNullable<String> getOptOutType() {
    return optOutType;
  }

  public void setOptOutType(JsonNullable<String> optOutType) {
    this.optOutType = optOutType;
  }

  public ConversionEventsDataInnerCustomData np(String np) {
    this.np = JsonNullable.of(np);
    return this;
  }

  /**
   * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
   * @return np
  */
  
  @Schema(name = "np", example = "ss-company", description = "Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("np")
  public JsonNullable<String> getNp() {
    return np;
  }

  public void setNp(JsonNullable<String> np) {
    this.np = np;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventsDataInnerCustomData conversionEventsDataInnerCustomData = (ConversionEventsDataInnerCustomData) o;
    return equalsNullable(this.currency, conversionEventsDataInnerCustomData.currency) &&
        equalsNullable(this.value, conversionEventsDataInnerCustomData.value) &&
        Objects.equals(this.contentIds, conversionEventsDataInnerCustomData.contentIds) &&
        equalsNullable(this.contentName, conversionEventsDataInnerCustomData.contentName) &&
        equalsNullable(this.contentCategory, conversionEventsDataInnerCustomData.contentCategory) &&
        equalsNullable(this.contentBrand, conversionEventsDataInnerCustomData.contentBrand) &&
        Objects.equals(this.contents, conversionEventsDataInnerCustomData.contents) &&
        Objects.equals(this.numItems, conversionEventsDataInnerCustomData.numItems) &&
        equalsNullable(this.orderId, conversionEventsDataInnerCustomData.orderId) &&
        equalsNullable(this.searchString, conversionEventsDataInnerCustomData.searchString) &&
        equalsNullable(this.optOutType, conversionEventsDataInnerCustomData.optOutType) &&
        equalsNullable(this.np, conversionEventsDataInnerCustomData.np);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(currency), hashCodeNullable(value), contentIds, hashCodeNullable(contentName), hashCodeNullable(contentCategory), hashCodeNullable(contentBrand), contents, numItems, hashCodeNullable(orderId), hashCodeNullable(searchString), hashCodeNullable(optOutType), hashCodeNullable(np));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataInnerCustomData {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    contentIds: ").append(toIndentedString(contentIds)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentCategory: ").append(toIndentedString(contentCategory)).append("\n");
    sb.append("    contentBrand: ").append(toIndentedString(contentBrand)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    numItems: ").append(toIndentedString(numItems)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    optOutType: ").append(toIndentedString(optOutType)).append("\n");
    sb.append("    np: ").append(toIndentedString(np)).append("\n");
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

