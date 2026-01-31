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
 **/

@ApiModel(description = "Object containing other custom data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionEventsDataInnerCustomData   {
  @JsonProperty("content_brand")
  private String contentBrand;

  @JsonProperty("content_category")
  private String contentCategory;

  @JsonProperty("content_ids")
  private List<String> contentIds = null;

  @JsonProperty("content_name")
  private String contentName;

  @JsonProperty("contents")
  private List<ConversionEventsDataInnerCustomDataContentsInner> contents = null;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("external_measurement_id")
  private String externalMeasurementId;

  @JsonProperty("external_measurement_vendor_id")
  private Integer externalMeasurementVendorId;

  @JsonProperty("np")
  private String np;

  @JsonProperty("num_items")
  private Long numItems;

  @JsonProperty("opt_out_type")
  private String optOutType;

  @JsonProperty("order_id")
  private String orderId;

  @JsonProperty("predicted_ltv")
  private String predictedLtv;

  @JsonProperty("search_string")
  private String searchString;

  @JsonProperty("value")
  private String value;

  /**
   * The brand of the content associated with the event.
   **/
  public ConversionEventsDataInnerCustomData contentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
    return this;
  }

  
  @ApiModelProperty(example = "pinterest-brand", value = "The brand of the content associated with the event.")
  @JsonProperty("content_brand")
  public String getContentBrand() {
    return contentBrand;
  }
  public void setContentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
  }

  /**
   * The category of the content associated with the event.
   **/
  public ConversionEventsDataInnerCustomData contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

  
  @ApiModelProperty(example = "shirts", value = "The category of the content associated with the event.")
  @JsonProperty("content_category")
  public String getContentCategory() {
    return contentCategory;
  }
  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  /**
   * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   **/
  public ConversionEventsDataInnerCustomData contentIds(List<String> contentIds) {
    this.contentIds = contentIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"product-id-001\",\"product-id-002\"]", value = "List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
  @JsonProperty("content_ids")
  public List<String> getContentIds() {
    return contentIds;
  }
  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }

  /**
   * The name of the page or product associated with the event.
   **/
  public ConversionEventsDataInnerCustomData contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

  
  @ApiModelProperty(example = "pinterest-themed-clothing", value = "The name of the page or product associated with the event.")
  @JsonProperty("content_name")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   **/
  public ConversionEventsDataInnerCustomData contents(List<ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"id\":\"product-id-001\",\"item_price\":\"14.99\",\"quantity\":3,\"item_name\":\"pinterest-shirt-girl\",\"item_category\":\"pinterest-clothing-shirts\",\"item_brand\":\"pinterest\"},{\"id\":\"product-id-002\",\"item_price\":\"13.71\",\"quantity\":2,\"item_name\":\"pinterest-shirt-men\",\"item_category\":\"pinterest-clothing-shirts\",\"item_brand\":\"pinterest\"}]", value = "A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
  @JsonProperty("contents")
  public List<ConversionEventsDataInnerCustomDataContentsInner> getContents() {
    return contents;
  }
  public void setContents(List<ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
  }

  /**
   * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
   **/
  public ConversionEventsDataInnerCustomData currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(example = "USD", value = "The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Only use when instructed.
   **/
  public ConversionEventsDataInnerCustomData externalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
    return this;
  }

  
  @ApiModelProperty(example = "rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f", value = "Only use when instructed.")
  @JsonProperty("external_measurement_id")
  public String getExternalMeasurementId() {
    return externalMeasurementId;
  }
  public void setExternalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
  }

  /**
   * Only use when instructed.
   **/
  public ConversionEventsDataInnerCustomData externalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Only use when instructed.")
  @JsonProperty("external_measurement_vendor_id")
  public Integer getExternalMeasurementVendorId() {
    return externalMeasurementVendorId;
  }
  public void setExternalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
  }

  /**
   * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
   **/
  public ConversionEventsDataInnerCustomData np(String np) {
    this.np = np;
    return this;
  }

  
  @ApiModelProperty(example = "ss-company", value = "Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.")
  @JsonProperty("np")
  public String getNp() {
    return np;
  }
  public void setNp(String np) {
    this.np = np;
  }

  /**
   * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
   **/
  public ConversionEventsDataInnerCustomData numItems(Long numItems) {
    this.numItems = numItems;
    return this;
  }

  
  @ApiModelProperty(example = "5", value = "Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
  @JsonProperty("num_items")
  public Long getNumItems() {
    return numItems;
  }
  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

  /**
   * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
   **/
  public ConversionEventsDataInnerCustomData optOutType(String optOutType) {
    this.optOutType = optOutType;
    return this;
  }

  
  @ApiModelProperty(example = "LDP", value = "Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.")
  @JsonProperty("opt_out_type")
  public String getOptOutType() {
    return optOutType;
  }
  public void setOptOutType(String optOutType) {
    this.optOutType = optOutType;
  }

  /**
   * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
   **/
  public ConversionEventsDataInnerCustomData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(example = "my_order_id", value = "The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.")
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
   **/
  public ConversionEventsDataInnerCustomData predictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
    return this;
  }

  
  @ApiModelProperty(example = "2794.82", value = "Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.")
  @JsonProperty("predicted_ltv")
  public String getPredictedLtv() {
    return predictedLtv;
  }
  public void setPredictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
  }

  /**
   * The search string related to the user conversion event.
   **/
  public ConversionEventsDataInnerCustomData searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

  
  @ApiModelProperty(example = "sample string", value = "The search string related to the user conversion event.")
  @JsonProperty("search_string")
  public String getSearchString() {
    return searchString;
  }
  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  /**
   * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
   **/
  public ConversionEventsDataInnerCustomData value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "72.39", value = "Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
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
    return Objects.equals(contentBrand, conversionEventsDataInnerCustomData.contentBrand) &&
        Objects.equals(contentCategory, conversionEventsDataInnerCustomData.contentCategory) &&
        Objects.equals(contentIds, conversionEventsDataInnerCustomData.contentIds) &&
        Objects.equals(contentName, conversionEventsDataInnerCustomData.contentName) &&
        Objects.equals(contents, conversionEventsDataInnerCustomData.contents) &&
        Objects.equals(currency, conversionEventsDataInnerCustomData.currency) &&
        Objects.equals(externalMeasurementId, conversionEventsDataInnerCustomData.externalMeasurementId) &&
        Objects.equals(externalMeasurementVendorId, conversionEventsDataInnerCustomData.externalMeasurementVendorId) &&
        Objects.equals(np, conversionEventsDataInnerCustomData.np) &&
        Objects.equals(numItems, conversionEventsDataInnerCustomData.numItems) &&
        Objects.equals(optOutType, conversionEventsDataInnerCustomData.optOutType) &&
        Objects.equals(orderId, conversionEventsDataInnerCustomData.orderId) &&
        Objects.equals(predictedLtv, conversionEventsDataInnerCustomData.predictedLtv) &&
        Objects.equals(searchString, conversionEventsDataInnerCustomData.searchString) &&
        Objects.equals(value, conversionEventsDataInnerCustomData.value);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

