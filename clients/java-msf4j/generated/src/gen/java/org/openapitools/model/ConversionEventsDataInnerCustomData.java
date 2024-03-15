package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataInnerCustomDataContentsInner;

/**
 * Object containing other custom data.
 */
@ApiModel(description = "Object containing other custom data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionEventsDataInnerCustomData   {
  @JsonProperty("currency")
  private String currency;

  @JsonProperty("value")
  private String value;

  @JsonProperty("content_ids")
  private List<String> contentIds = null;

  @JsonProperty("content_name")
  private String contentName;

  @JsonProperty("content_category")
  private String contentCategory;

  @JsonProperty("content_brand")
  private String contentBrand;

  @JsonProperty("contents")
  private List<@Valid ConversionEventsDataInnerCustomDataContentsInner> contents = null;

  @JsonProperty("num_items")
  private Long numItems;

  @JsonProperty("order_id")
  private String orderId;

  @JsonProperty("search_string")
  private String searchString;

  @JsonProperty("opt_out_type")
  private String optOutType;

  @JsonProperty("np")
  private String np;

  public ConversionEventsDataInnerCustomData currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ConversionEventsDataInnerCustomData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
   * @return value
  **/
  @ApiModelProperty(example = "72.39", value = "Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ConversionEventsDataInnerCustomData contentIds(List<String> contentIds) {
    this.contentIds = contentIds;
    return this;
  }

  public ConversionEventsDataInnerCustomData addContentIdsItem(String contentIdsItem) {
    if (this.contentIds == null) {
      this.contentIds = ;
    }
    this.contentIds.add(contentIdsItem);
    return this;
  }

   /**
   * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return contentIds
  **/
  @ApiModelProperty(example = "[\"red-pinterest-shirt-logo-1\",\"purple-pinterest-shirt-logo-3\"]", value = "List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
  public List<String> getContentIds() {
    return contentIds;
  }

  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }

  public ConversionEventsDataInnerCustomData contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * The name of the page or product associated with the event.
   * @return contentName
  **/
  @ApiModelProperty(example = "pinterest-themed-clothing", value = "The name of the page or product associated with the event.")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public ConversionEventsDataInnerCustomData contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

   /**
   * The category of the content associated with the event.
   * @return contentCategory
  **/
  @ApiModelProperty(example = "shirts", value = "The category of the content associated with the event.")
  public String getContentCategory() {
    return contentCategory;
  }

  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  public ConversionEventsDataInnerCustomData contentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
    return this;
  }

   /**
   * The brand of the content associated with the event.
   * @return contentBrand
  **/
  @ApiModelProperty(example = "pinterest-brand", value = "The brand of the content associated with the event.")
  public String getContentBrand() {
    return contentBrand;
  }

  public void setContentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
  }

  public ConversionEventsDataInnerCustomData contents(List<@Valid ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
    return this;
  }

  public ConversionEventsDataInnerCustomData addContentsItem(ConversionEventsDataInnerCustomDataContentsInner contentsItem) {
    if (this.contents == null) {
      this.contents = ;
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   * @return contents
  **/
  @ApiModelProperty(value = "A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
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
  **/
  @ApiModelProperty(example = "2", value = "Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
  public Long getNumItems() {
    return numItems;
  }

  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

  public ConversionEventsDataInnerCustomData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
   * @return orderId
  **/
  @ApiModelProperty(example = "my_order_id", value = "The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ConversionEventsDataInnerCustomData searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

   /**
   * The search string related to the user conversion event.
   * @return searchString
  **/
  @ApiModelProperty(example = "sample string", value = "The search string related to the user conversion event.")
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public ConversionEventsDataInnerCustomData optOutType(String optOutType) {
    this.optOutType = optOutType;
    return this;
  }

   /**
   * Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
   * @return optOutType
  **/
  @ApiModelProperty(example = "LDP", value = "Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\" target=\"_blank\">dev site</a> for specific opt_out_type set up.")
  public String getOptOutType() {
    return optOutType;
  }

  public void setOptOutType(String optOutType) {
    this.optOutType = optOutType;
  }

  public ConversionEventsDataInnerCustomData np(String np) {
    this.np = np;
    return this;
  }

   /**
   * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
   * @return np
  **/
  @ApiModelProperty(example = "ss-company", value = "Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.")
  public String getNp() {
    return np;
  }

  public void setNp(String np) {
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
    return Objects.equals(this.currency, conversionEventsDataInnerCustomData.currency) &&
        Objects.equals(this.value, conversionEventsDataInnerCustomData.value) &&
        Objects.equals(this.contentIds, conversionEventsDataInnerCustomData.contentIds) &&
        Objects.equals(this.contentName, conversionEventsDataInnerCustomData.contentName) &&
        Objects.equals(this.contentCategory, conversionEventsDataInnerCustomData.contentCategory) &&
        Objects.equals(this.contentBrand, conversionEventsDataInnerCustomData.contentBrand) &&
        Objects.equals(this.contents, conversionEventsDataInnerCustomData.contents) &&
        Objects.equals(this.numItems, conversionEventsDataInnerCustomData.numItems) &&
        Objects.equals(this.orderId, conversionEventsDataInnerCustomData.orderId) &&
        Objects.equals(this.searchString, conversionEventsDataInnerCustomData.searchString) &&
        Objects.equals(this.optOutType, conversionEventsDataInnerCustomData.optOutType) &&
        Objects.equals(this.np, conversionEventsDataInnerCustomData.np);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value, contentIds, contentName, contentCategory, contentBrand, contents, numItems, orderId, searchString, optOutType, np);
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

