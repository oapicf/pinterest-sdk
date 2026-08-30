package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataItemsCustomDataContentsItems;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Object containing other custom data.
 **/
@ApiModel(description = "Object containing other custom data.")
@JsonTypeName("ConversionEventsDataItemsCustomData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventsDataItemsCustomData   {
  private String contentBrand;
  private String contentCategory;
  private @Valid List<String> contentIds = new ArrayList<>();
  private String contentName;
  private @Valid List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents = new ArrayList<>();
  private String currency;
  private String externalMeasurementId;
  private Integer externalMeasurementVendorId;
  private String np;
  private Long numItems;
  private String optOutType;
  private String orderId;
  private String predictedLtv;
  private String searchString;
  private String value;

  public ConversionEventsDataItemsCustomData() {
  }

  /**
   * The brand of the content associated with the event.
   **/
  public ConversionEventsDataItemsCustomData contentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
    return this;
  }

  
  @ApiModelProperty(value = "The brand of the content associated with the event.")
  @JsonProperty("content_brand")
  public String getContentBrand() {
    return contentBrand;
  }

  @JsonProperty("content_brand")
  public void setContentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
  }

  /**
   * The category of the content associated with the event.
   **/
  public ConversionEventsDataItemsCustomData contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

  
  @ApiModelProperty(value = "The category of the content associated with the event.")
  @JsonProperty("content_category")
  public String getContentCategory() {
    return contentCategory;
  }

  @JsonProperty("content_category")
  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  /**
   * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   **/
  public ConversionEventsDataItemsCustomData contentIds(List<String> contentIds) {
    this.contentIds = contentIds;
    return this;
  }

  
  @ApiModelProperty(value = "List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
  @JsonProperty("content_ids")
  public List<String> getContentIds() {
    return contentIds;
  }

  @JsonProperty("content_ids")
  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }

  public ConversionEventsDataItemsCustomData addContentIdsItem(String contentIdsItem) {
    if (this.contentIds == null) {
      this.contentIds = new ArrayList<>();
    }

    this.contentIds.add(contentIdsItem);
    return this;
  }

  public ConversionEventsDataItemsCustomData removeContentIdsItem(String contentIdsItem) {
    if (contentIdsItem != null && this.contentIds != null) {
      this.contentIds.remove(contentIdsItem);
    }

    return this;
  }
  /**
   * The name of the page or product associated with the event.
   **/
  public ConversionEventsDataItemsCustomData contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the page or product associated with the event.")
  @JsonProperty("content_name")
  public String getContentName() {
    return contentName;
  }

  @JsonProperty("content_name")
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   **/
  public ConversionEventsDataItemsCustomData contents(List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents) {
    this.contents = contents;
    return this;
  }

  
  @ApiModelProperty(value = "A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
  @JsonProperty("contents")
  @Valid public List<@Valid ConversionEventsDataItemsCustomDataContentsItems> getContents() {
    return contents;
  }

  @JsonProperty("contents")
  public void setContents(List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents) {
    this.contents = contents;
  }

  public ConversionEventsDataItemsCustomData addContentsItem(ConversionEventsDataItemsCustomDataContentsItems contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }

    this.contents.add(contentsItem);
    return this;
  }

  public ConversionEventsDataItemsCustomData removeContentsItem(ConversionEventsDataItemsCustomDataContentsItems contentsItem) {
    if (contentsItem != null && this.contents != null) {
      this.contents.remove(contentsItem);
    }

    return this;
  }
  /**
   * The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
   **/
  public ConversionEventsDataItemsCustomData currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Only use when instructed.
   **/
  public ConversionEventsDataItemsCustomData externalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
    return this;
  }

  
  @ApiModelProperty(value = "Only use when instructed.")
  @JsonProperty("external_measurement_id")
  public String getExternalMeasurementId() {
    return externalMeasurementId;
  }

  @JsonProperty("external_measurement_id")
  public void setExternalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
  }

  /**
   * Only use when instructed.
   **/
  public ConversionEventsDataItemsCustomData externalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
    return this;
  }

  
  @ApiModelProperty(value = "Only use when instructed.")
  @JsonProperty("external_measurement_vendor_id")
  public Integer getExternalMeasurementVendorId() {
    return externalMeasurementVendorId;
  }

  @JsonProperty("external_measurement_vendor_id")
  public void setExternalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
  }

  /**
   * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
   **/
  public ConversionEventsDataItemsCustomData np(String np) {
    this.np = np;
    return this;
  }

  
  @ApiModelProperty(value = "Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.")
  @JsonProperty("np")
  public String getNp() {
    return np;
  }

  @JsonProperty("np")
  public void setNp(String np) {
    this.np = np;
  }

  /**
   * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   **/
  public ConversionEventsDataItemsCustomData numItems(Long numItems) {
    this.numItems = numItems;
    return this;
  }

  
  @ApiModelProperty(value = "Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
  @JsonProperty("num_items")
  public Long getNumItems() {
    return numItems;
  }

  @JsonProperty("num_items")
  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

  /**
   * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
   **/
  public ConversionEventsDataItemsCustomData optOutType(String optOutType) {
    this.optOutType = optOutType;
    return this;
  }

  
  @ApiModelProperty(value = "Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.")
  @JsonProperty("opt_out_type")
  public String getOptOutType() {
    return optOutType;
  }

  @JsonProperty("opt_out_type")
  public void setOptOutType(String optOutType) {
    this.optOutType = optOutType;
  }

  /**
   * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
   **/
  public ConversionEventsDataItemsCustomData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(value = "The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.")
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }

  @JsonProperty("order_id")
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
   **/
  public ConversionEventsDataItemsCustomData predictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
    return this;
  }

  
  @ApiModelProperty(value = "Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.")
  @JsonProperty("predicted_ltv")
  public String getPredictedLtv() {
    return predictedLtv;
  }

  @JsonProperty("predicted_ltv")
  public void setPredictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
  }

  /**
   * The search string related to the user conversion event.
   **/
  public ConversionEventsDataItemsCustomData searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

  
  @ApiModelProperty(value = "The search string related to the user conversion event.")
  @JsonProperty("search_string")
  public String getSearchString() {
    return searchString;
  }

  @JsonProperty("search_string")
  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  /**
   * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
   **/
  public ConversionEventsDataItemsCustomData value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  @JsonProperty("value")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
