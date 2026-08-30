package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataItemsCustomDataContentsItems;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing other custom data.
 */
@ApiModel(description="Object containing other custom data.")

public class ConversionEventsDataItemsCustomData  {
  
 /**
  * The brand of the content associated with the event.
  */
  @ApiModelProperty(value = "The brand of the content associated with the event.")

  private String contentBrand;

 /**
  * The category of the content associated with the event.
  */
  @ApiModelProperty(value = "The category of the content associated with the event.")

  private String contentCategory;

 /**
  * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  */
  @ApiModelProperty(value = "List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")

  private List<String> contentIds = new ArrayList<>();

 /**
  * The name of the page or product associated with the event.
  */
  @ApiModelProperty(value = "The name of the page or product associated with the event.")

  private String contentName;

 /**
  * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  */
  @ApiModelProperty(value = "A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")

  private List<ConversionEventsDataItemsCustomDataContentsItems> contents = new ArrayList<>();

 /**
  * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
  */
  @ApiModelProperty(value = "The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.")

  private String currency;

 /**
  * Only use when instructed.
  */
  @ApiModelProperty(value = "Only use when instructed.")

  private String externalMeasurementId;

 /**
  * Only use when instructed.
  */
  @ApiModelProperty(value = "Only use when instructed.")

  private Integer externalMeasurementVendorId;

 /**
  * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
  */
  @ApiModelProperty(value = "Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.")

  private String np;

 /**
  * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  */
  @ApiModelProperty(value = "Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")

  private Long numItems;

 /**
  * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
  */
  @ApiModelProperty(value = "Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.")

  private String optOutType;

 /**
  * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
  */
  @ApiModelProperty(value = "The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.")

  private String orderId;

 /**
  * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
  */
  @ApiModelProperty(value = "Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.")

  private String predictedLtv;

 /**
  * The search string related to the user conversion event.
  */
  @ApiModelProperty(value = "The search string related to the user conversion event.")

  private String searchString;

 /**
  * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
  */
  @ApiModelProperty(value = "Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.")

  private String value;
 /**
   * The brand of the content associated with the event.
   * @return contentBrand
  **/
  @JsonProperty("content_brand")
  public String getContentBrand() {
    return contentBrand;
  }

  public void setContentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
  }

  public ConversionEventsDataItemsCustomData contentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
    return this;
  }

 /**
   * The category of the content associated with the event.
   * @return contentCategory
  **/
  @JsonProperty("content_category")
  public String getContentCategory() {
    return contentCategory;
  }

  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  public ConversionEventsDataItemsCustomData contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

 /**
   * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return contentIds
  **/
  @JsonProperty("content_ids")
  public List<String> getContentIds() {
    return contentIds;
  }

  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }

  public ConversionEventsDataItemsCustomData contentIds(List<String> contentIds) {
    this.contentIds = contentIds;
    return this;
  }

  public ConversionEventsDataItemsCustomData addContentIdsItem(String contentIdsItem) {
    this.contentIds.add(contentIdsItem);
    return this;
  }

 /**
   * The name of the page or product associated with the event.
   * @return contentName
  **/
  @JsonProperty("content_name")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public ConversionEventsDataItemsCustomData contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return contents
  **/
  @JsonProperty("contents")
  public List<ConversionEventsDataItemsCustomDataContentsItems> getContents() {
    return contents;
  }

  public void setContents(List<ConversionEventsDataItemsCustomDataContentsItems> contents) {
    this.contents = contents;
  }

  public ConversionEventsDataItemsCustomData contents(List<ConversionEventsDataItemsCustomDataContentsItems> contents) {
    this.contents = contents;
    return this;
  }

  public ConversionEventsDataItemsCustomData addContentsItem(ConversionEventsDataItemsCustomDataContentsItems contentsItem) {
    this.contents.add(contentsItem);
    return this;
  }

 /**
   * The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
   * @return currency
  **/
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ConversionEventsDataItemsCustomData currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Only use when instructed.
   * @return externalMeasurementId
  **/
  @JsonProperty("external_measurement_id")
  public String getExternalMeasurementId() {
    return externalMeasurementId;
  }

  public void setExternalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
  }

  public ConversionEventsDataItemsCustomData externalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
    return this;
  }

 /**
   * Only use when instructed.
   * @return externalMeasurementVendorId
  **/
  @JsonProperty("external_measurement_vendor_id")
  public Integer getExternalMeasurementVendorId() {
    return externalMeasurementVendorId;
  }

  public void setExternalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
  }

  public ConversionEventsDataItemsCustomData externalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
    return this;
  }

 /**
   * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
   * @return np
  **/
  @JsonProperty("np")
  public String getNp() {
    return np;
  }

  public void setNp(String np) {
    this.np = np;
  }

  public ConversionEventsDataItemsCustomData np(String np) {
    this.np = np;
    return this;
  }

 /**
   * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return numItems
  **/
  @JsonProperty("num_items")
  public Long getNumItems() {
    return numItems;
  }

  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

  public ConversionEventsDataItemsCustomData numItems(Long numItems) {
    this.numItems = numItems;
    return this;
  }

 /**
   * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
   * @return optOutType
  **/
  @JsonProperty("opt_out_type")
  public String getOptOutType() {
    return optOutType;
  }

  public void setOptOutType(String optOutType) {
    this.optOutType = optOutType;
  }

  public ConversionEventsDataItemsCustomData optOutType(String optOutType) {
    this.optOutType = optOutType;
    return this;
  }

 /**
   * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
   * @return orderId
  **/
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ConversionEventsDataItemsCustomData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
   * @return predictedLtv
  **/
  @JsonProperty("predicted_ltv")
  public String getPredictedLtv() {
    return predictedLtv;
  }

  public void setPredictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
  }

  public ConversionEventsDataItemsCustomData predictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
    return this;
  }

 /**
   * The search string related to the user conversion event.
   * @return searchString
  **/
  @JsonProperty("search_string")
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public ConversionEventsDataItemsCustomData searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

 /**
   * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ConversionEventsDataItemsCustomData value(String value) {
    this.value = value;
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
    ConversionEventsDataItemsCustomData conversionEventsDataItemsCustomData = (ConversionEventsDataItemsCustomData) o;
    return Objects.equals(this.contentBrand, conversionEventsDataItemsCustomData.contentBrand) &&
        Objects.equals(this.contentCategory, conversionEventsDataItemsCustomData.contentCategory) &&
        Objects.equals(this.contentIds, conversionEventsDataItemsCustomData.contentIds) &&
        Objects.equals(this.contentName, conversionEventsDataItemsCustomData.contentName) &&
        Objects.equals(this.contents, conversionEventsDataItemsCustomData.contents) &&
        Objects.equals(this.currency, conversionEventsDataItemsCustomData.currency) &&
        Objects.equals(this.externalMeasurementId, conversionEventsDataItemsCustomData.externalMeasurementId) &&
        Objects.equals(this.externalMeasurementVendorId, conversionEventsDataItemsCustomData.externalMeasurementVendorId) &&
        Objects.equals(this.np, conversionEventsDataItemsCustomData.np) &&
        Objects.equals(this.numItems, conversionEventsDataItemsCustomData.numItems) &&
        Objects.equals(this.optOutType, conversionEventsDataItemsCustomData.optOutType) &&
        Objects.equals(this.orderId, conversionEventsDataItemsCustomData.orderId) &&
        Objects.equals(this.predictedLtv, conversionEventsDataItemsCustomData.predictedLtv) &&
        Objects.equals(this.searchString, conversionEventsDataItemsCustomData.searchString) &&
        Objects.equals(this.value, conversionEventsDataItemsCustomData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentBrand, contentCategory, contentIds, contentName, contents, currency, externalMeasurementId, externalMeasurementVendorId, np, numItems, optOutType, orderId, predictedLtv, searchString, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataItemsCustomData {\n");
    
    sb.append("    contentBrand: ").append(toIndentedString(contentBrand)).append("\n");
    sb.append("    contentCategory: ").append(toIndentedString(contentCategory)).append("\n");
    sb.append("    contentIds: ").append(toIndentedString(contentIds)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    externalMeasurementId: ").append(toIndentedString(externalMeasurementId)).append("\n");
    sb.append("    externalMeasurementVendorId: ").append(toIndentedString(externalMeasurementVendorId)).append("\n");
    sb.append("    np: ").append(toIndentedString(np)).append("\n");
    sb.append("    numItems: ").append(toIndentedString(numItems)).append("\n");
    sb.append("    optOutType: ").append(toIndentedString(optOutType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    predictedLtv: ").append(toIndentedString(predictedLtv)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

