package apimodels;

import apimodels.ConversionEventsDataItemsCustomDataContentsItems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object containing other custom data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventsDataItemsCustomData   {
  @JsonProperty("content_brand")
  
  private String contentBrand;

  @JsonProperty("content_category")
  
  private String contentCategory;

  @JsonProperty("content_ids")
  
  private List<String> contentIds = null;

  @JsonProperty("content_name")
  
  private String contentName;

  @JsonProperty("contents")
  @Valid

  private List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents = null;

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

  public ConversionEventsDataItemsCustomData contentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
    return this;
  }

   /**
   * The brand of the content associated with the event.
   * @return contentBrand
  **/
  public String getContentBrand() {
    return contentBrand;
  }

  public void setContentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
  }

  public ConversionEventsDataItemsCustomData contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

   /**
   * The category of the content associated with the event.
   * @return contentCategory
  **/
  public String getContentCategory() {
    return contentCategory;
  }

  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  public ConversionEventsDataItemsCustomData contentIds(List<String> contentIds) {
    this.contentIds = contentIds;
    return this;
  }

  public ConversionEventsDataItemsCustomData addContentIdsItem(String contentIdsItem) {
    if (this.contentIds == null) {
      this.contentIds = new ArrayList<>();
    }
    this.contentIds.add(contentIdsItem);
    return this;
  }

   /**
   * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return contentIds
  **/
  public List<String> getContentIds() {
    return contentIds;
  }

  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }

  public ConversionEventsDataItemsCustomData contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * The name of the page or product associated with the event.
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public ConversionEventsDataItemsCustomData contents(List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents) {
    this.contents = contents;
    return this;
  }

  public ConversionEventsDataItemsCustomData addContentsItem(ConversionEventsDataItemsCustomDataContentsItems contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return contents
  **/
  public List<@Valid ConversionEventsDataItemsCustomDataContentsItems> getContents() {
    return contents;
  }

  public void setContents(List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents) {
    this.contents = contents;
  }

  public ConversionEventsDataItemsCustomData currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ConversionEventsDataItemsCustomData externalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
    return this;
  }

   /**
   * Only use when instructed.
   * @return externalMeasurementId
  **/
  public String getExternalMeasurementId() {
    return externalMeasurementId;
  }

  public void setExternalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
  }

  public ConversionEventsDataItemsCustomData externalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
    return this;
  }

   /**
   * Only use when instructed.
   * @return externalMeasurementVendorId
  **/
  public Integer getExternalMeasurementVendorId() {
    return externalMeasurementVendorId;
  }

  public void setExternalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
  }

  public ConversionEventsDataItemsCustomData np(String np) {
    this.np = np;
    return this;
  }

   /**
   * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
   * @return np
  **/
  public String getNp() {
    return np;
  }

  public void setNp(String np) {
    this.np = np;
  }

  public ConversionEventsDataItemsCustomData numItems(Long numItems) {
    this.numItems = numItems;
    return this;
  }

   /**
   * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
   * @return numItems
  **/
  public Long getNumItems() {
    return numItems;
  }

  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

  public ConversionEventsDataItemsCustomData optOutType(String optOutType) {
    this.optOutType = optOutType;
    return this;
  }

   /**
   * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
   * @return optOutType
  **/
  public String getOptOutType() {
    return optOutType;
  }

  public void setOptOutType(String optOutType) {
    this.optOutType = optOutType;
  }

  public ConversionEventsDataItemsCustomData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ConversionEventsDataItemsCustomData predictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
    return this;
  }

   /**
   * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
   * @return predictedLtv
  **/
  public String getPredictedLtv() {
    return predictedLtv;
  }

  public void setPredictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
  }

  public ConversionEventsDataItemsCustomData searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

   /**
   * The search string related to the user conversion event.
   * @return searchString
  **/
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public ConversionEventsDataItemsCustomData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
   * @return value
  **/
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
    return Objects.equals(contentBrand, conversionEventsDataItemsCustomData.contentBrand) &&
        Objects.equals(contentCategory, conversionEventsDataItemsCustomData.contentCategory) &&
        Objects.equals(contentIds, conversionEventsDataItemsCustomData.contentIds) &&
        Objects.equals(contentName, conversionEventsDataItemsCustomData.contentName) &&
        Objects.equals(contents, conversionEventsDataItemsCustomData.contents) &&
        Objects.equals(currency, conversionEventsDataItemsCustomData.currency) &&
        Objects.equals(externalMeasurementId, conversionEventsDataItemsCustomData.externalMeasurementId) &&
        Objects.equals(externalMeasurementVendorId, conversionEventsDataItemsCustomData.externalMeasurementVendorId) &&
        Objects.equals(np, conversionEventsDataItemsCustomData.np) &&
        Objects.equals(numItems, conversionEventsDataItemsCustomData.numItems) &&
        Objects.equals(optOutType, conversionEventsDataItemsCustomData.optOutType) &&
        Objects.equals(orderId, conversionEventsDataItemsCustomData.orderId) &&
        Objects.equals(predictedLtv, conversionEventsDataItemsCustomData.predictedLtv) &&
        Objects.equals(searchString, conversionEventsDataItemsCustomData.searchString) &&
        Objects.equals(value, conversionEventsDataItemsCustomData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentBrand, contentCategory, contentIds, contentName, contents, currency, externalMeasurementId, externalMeasurementVendorId, np, numItems, optOutType, orderId, predictedLtv, searchString, value);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

