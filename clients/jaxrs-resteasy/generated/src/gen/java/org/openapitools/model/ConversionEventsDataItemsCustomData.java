package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@ApiModel(description="Object containing other custom data.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventsDataItemsCustomData   {
  
  private String contentBrand;
  private String contentCategory;
  private List<String> contentIds = new ArrayList<>();
  private String contentName;
  private List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents = new ArrayList<>();
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

  /**
   * The brand of the content associated with the event.
   **/
  
  @ApiModelProperty(value = "The brand of the content associated with the event.")
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
  
  @ApiModelProperty(value = "The category of the content associated with the event.")
  @JsonProperty("content_category")
  public String getContentCategory() {
    return contentCategory;
  }
  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  /**
   * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   **/
  
  @ApiModelProperty(value = "List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
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
  
  @ApiModelProperty(value = "The name of the page or product associated with the event.")
  @JsonProperty("content_name")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   **/
  
  @ApiModelProperty(value = "A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
  @JsonProperty("contents")
  @Valid
  public List<@Valid ConversionEventsDataItemsCustomDataContentsItems> getContents() {
    return contents;
  }
  public void setContents(List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents) {
    this.contents = contents;
  }

  /**
   * The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
   **/
  
  @ApiModelProperty(value = "The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.")
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
  
  @ApiModelProperty(value = "Only use when instructed.")
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
  
  @ApiModelProperty(value = "Only use when instructed.")
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
  
  @ApiModelProperty(value = "Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.")
  @JsonProperty("np")
  public String getNp() {
    return np;
  }
  public void setNp(String np) {
    this.np = np;
  }

  /**
   * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   **/
  
  @ApiModelProperty(value = "Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).")
  @JsonProperty("num_items")
  public Long getNumItems() {
    return numItems;
  }
  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

  /**
   * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
   **/
  
  @ApiModelProperty(value = "Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.")
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
  
  @ApiModelProperty(value = "The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.")
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
  
  @ApiModelProperty(value = "Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.")
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
  
  @ApiModelProperty(value = "The search string related to the user conversion event.")
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
  
  @ApiModelProperty(value = "Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.")
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

