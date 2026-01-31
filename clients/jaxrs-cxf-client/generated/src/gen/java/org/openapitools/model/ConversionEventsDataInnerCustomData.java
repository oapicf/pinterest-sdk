package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataInnerCustomDataContentsInner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing other custom data.
 */
@ApiModel(description="Object containing other custom data.")

public class ConversionEventsDataInnerCustomData  {
  
 /**
  * The brand of the content associated with the event.
  */
  @ApiModelProperty(example = "pinterest-brand", value = "The brand of the content associated with the event.")

  private String contentBrand;

 /**
  * The category of the content associated with the event.
  */
  @ApiModelProperty(example = "shirts", value = "The category of the content associated with the event.")

  private String contentCategory;

 /**
  * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  */
  @ApiModelProperty(example = "[\"product-id-001\",\"product-id-002\"]", value = "List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")

  private List<String> contentIds = new ArrayList<>();

 /**
  * The name of the page or product associated with the event.
  */
  @ApiModelProperty(example = "pinterest-themed-clothing", value = "The name of the page or product associated with the event.")

  private String contentName;

 /**
  * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  */
  @ApiModelProperty(example = "[{\"id\":\"product-id-001\",\"item_price\":\"14.99\",\"quantity\":3,\"item_name\":\"pinterest-shirt-girl\",\"item_category\":\"pinterest-clothing-shirts\",\"item_brand\":\"pinterest\"},{\"id\":\"product-id-002\",\"item_price\":\"13.71\",\"quantity\":2,\"item_name\":\"pinterest-shirt-men\",\"item_category\":\"pinterest-clothing-shirts\",\"item_brand\":\"pinterest\"}]", value = "A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")

  private List<ConversionEventsDataInnerCustomDataContentsInner> contents = new ArrayList<>();

 /**
  * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
  */
  @ApiModelProperty(example = "USD", value = "The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.")

  private String currency;

 /**
  * Only use when instructed.
  */
  @ApiModelProperty(example = "rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f", value = "Only use when instructed.")

  private String externalMeasurementId;

 /**
  * Only use when instructed.
  */
  @ApiModelProperty(example = "1", value = "Only use when instructed.")

  private Integer externalMeasurementVendorId;

 /**
  * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
  */
  @ApiModelProperty(example = "ss-company", value = "Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.")

  private String np;

 /**
  * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  */
  @ApiModelProperty(example = "5", value = "Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")

  private Long numItems;

 /**
  * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
  */
  @ApiModelProperty(example = "LDP", value = "Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.")

  private String optOutType;

 /**
  * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
  */
  @ApiModelProperty(example = "my_order_id", value = "The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.")

  private String orderId;

 /**
  * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
  */
  @ApiModelProperty(example = "2794.82", value = "Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.")

  private String predictedLtv;

 /**
  * The search string related to the user conversion event.
  */
  @ApiModelProperty(example = "sample string", value = "The search string related to the user conversion event.")

  private String searchString;

 /**
  * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
  */
  @ApiModelProperty(example = "72.39", value = "Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.")

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

  public ConversionEventsDataInnerCustomData contentBrand(String contentBrand) {
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

  public ConversionEventsDataInnerCustomData contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

 /**
   * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
   * @return contentIds
  **/
  @JsonProperty("content_ids")
  public List<String> getContentIds() {
    return contentIds;
  }

  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }

  public ConversionEventsDataInnerCustomData contentIds(List<String> contentIds) {
    this.contentIds = contentIds;
    return this;
  }

  public ConversionEventsDataInnerCustomData addContentIdsItem(String contentIdsItem) {
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

  public ConversionEventsDataInnerCustomData contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
   * @return contents
  **/
  @JsonProperty("contents")
  public List<ConversionEventsDataInnerCustomDataContentsInner> getContents() {
    return contents;
  }

  public void setContents(List<ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
  }

  public ConversionEventsDataInnerCustomData contents(List<ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
    return this;
  }

  public ConversionEventsDataInnerCustomData addContentsItem(ConversionEventsDataInnerCustomDataContentsInner contentsItem) {
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

  public ConversionEventsDataInnerCustomData currency(String currency) {
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

  public ConversionEventsDataInnerCustomData externalMeasurementId(String externalMeasurementId) {
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

  public ConversionEventsDataInnerCustomData externalMeasurementVendorId(Integer externalMeasurementVendorId) {
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

  public ConversionEventsDataInnerCustomData np(String np) {
    this.np = np;
    return this;
  }

 /**
   * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
   * @return numItems
  **/
  @JsonProperty("num_items")
  public Long getNumItems() {
    return numItems;
  }

  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

  public ConversionEventsDataInnerCustomData numItems(Long numItems) {
    this.numItems = numItems;
    return this;
  }

 /**
   * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;limited data processing&lt;/a&gt; and the developer&#39;s guide for &lt;a href&#x3D;\&quot;/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\&quot; target&#x3D;\&quot;_blank\&quot;&gt;tracking conversion events&lt;/a&gt; for help with using this parameter.
   * @return optOutType
  **/
  @JsonProperty("opt_out_type")
  public String getOptOutType() {
    return optOutType;
  }

  public void setOptOutType(String optOutType) {
    this.optOutType = optOutType;
  }

  public ConversionEventsDataInnerCustomData optOutType(String optOutType) {
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

  public ConversionEventsDataInnerCustomData orderId(String orderId) {
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

  public ConversionEventsDataInnerCustomData predictedLtv(String predictedLtv) {
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

  public ConversionEventsDataInnerCustomData searchString(String searchString) {
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

  public ConversionEventsDataInnerCustomData value(String value) {
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
    ConversionEventsDataInnerCustomData conversionEventsDataInnerCustomData = (ConversionEventsDataInnerCustomData) o;
    return Objects.equals(this.contentBrand, conversionEventsDataInnerCustomData.contentBrand) &&
        Objects.equals(this.contentCategory, conversionEventsDataInnerCustomData.contentCategory) &&
        Objects.equals(this.contentIds, conversionEventsDataInnerCustomData.contentIds) &&
        Objects.equals(this.contentName, conversionEventsDataInnerCustomData.contentName) &&
        Objects.equals(this.contents, conversionEventsDataInnerCustomData.contents) &&
        Objects.equals(this.currency, conversionEventsDataInnerCustomData.currency) &&
        Objects.equals(this.externalMeasurementId, conversionEventsDataInnerCustomData.externalMeasurementId) &&
        Objects.equals(this.externalMeasurementVendorId, conversionEventsDataInnerCustomData.externalMeasurementVendorId) &&
        Objects.equals(this.np, conversionEventsDataInnerCustomData.np) &&
        Objects.equals(this.numItems, conversionEventsDataInnerCustomData.numItems) &&
        Objects.equals(this.optOutType, conversionEventsDataInnerCustomData.optOutType) &&
        Objects.equals(this.orderId, conversionEventsDataInnerCustomData.orderId) &&
        Objects.equals(this.predictedLtv, conversionEventsDataInnerCustomData.predictedLtv) &&
        Objects.equals(this.searchString, conversionEventsDataInnerCustomData.searchString) &&
        Objects.equals(this.value, conversionEventsDataInnerCustomData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentBrand, contentCategory, contentIds, contentName, contents, currency, externalMeasurementId, externalMeasurementVendorId, np, numItems, optOutType, orderId, predictedLtv, searchString, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataInnerCustomData {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

