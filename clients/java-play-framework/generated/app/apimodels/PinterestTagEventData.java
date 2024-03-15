package apimodels;

import apimodels.Currency;
import apimodels.LineItem;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinterestTagEventData   {
  @JsonProperty("currency")
  @Valid

  private Currency currency;

  @JsonProperty("lead_type")
  
  private String leadType;

  @JsonProperty("line_items")
  @Valid

  private LineItem lineItems;

  @JsonProperty("order_id")
  
  private String orderId;

  @JsonProperty("order_quantity")
  
  private Integer orderQuantity;

  @JsonProperty("page_name")
  
  private String pageName;

  @JsonProperty("promo_code")
  
  private String promoCode;

  @JsonProperty("property")
  
  private String property;

  @JsonProperty("search_query")
  
  private String searchQuery;

  @JsonProperty("value")
  
  private String value;

  @JsonProperty("video_title")
  
  private String videoTitle;

  public PinterestTagEventData currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public PinterestTagEventData leadType(String leadType) {
    this.leadType = leadType;
    return this;
  }

   /**
   * Promotion code. For example, \"Newsletter\".
   * @return leadType
  **/
  public String getLeadType() {
    return leadType;
  }

  public void setLeadType(String leadType) {
    this.leadType = leadType;
  }

  public PinterestTagEventData lineItems(LineItem lineItems) {
    this.lineItems = lineItems;
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  public LineItem getLineItems() {
    return lineItems;
  }

  public void setLineItems(LineItem lineItems) {
    this.lineItems = lineItems;
  }

  public PinterestTagEventData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID. For example, \"X-151481\".
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PinterestTagEventData orderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }

   /**
   * Order quantity. For example, 1.
   * @return orderQuantity
  **/
  public Integer getOrderQuantity() {
    return orderQuantity;
  }

  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  public PinterestTagEventData pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

   /**
   * Page name. For example, \"Our Favorite Pins on Pinterest\".
   * @return pageName
  **/
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  public PinterestTagEventData promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * Promotion code. For example, \"WINTER10\".
   * @return promoCode
  **/
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public PinterestTagEventData property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Property. For example, \"Athleta\".
   * @return property
  **/
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public PinterestTagEventData searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

   /**
   * Search query string. For example, \"boots\".
   * @return searchQuery
  **/
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  public PinterestTagEventData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Product value. For example, \"199.98\"
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public PinterestTagEventData videoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
    return this;
  }

   /**
   * Video title. For example, \"How to style your Parker Boots\".
   * @return videoTitle
  **/
  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinterestTagEventData pinterestTagEventData = (PinterestTagEventData) o;
    return Objects.equals(currency, pinterestTagEventData.currency) &&
        Objects.equals(leadType, pinterestTagEventData.leadType) &&
        Objects.equals(lineItems, pinterestTagEventData.lineItems) &&
        Objects.equals(orderId, pinterestTagEventData.orderId) &&
        Objects.equals(orderQuantity, pinterestTagEventData.orderQuantity) &&
        Objects.equals(pageName, pinterestTagEventData.pageName) &&
        Objects.equals(promoCode, pinterestTagEventData.promoCode) &&
        Objects.equals(property, pinterestTagEventData.property) &&
        Objects.equals(searchQuery, pinterestTagEventData.searchQuery) &&
        Objects.equals(value, pinterestTagEventData.value) &&
        Objects.equals(videoTitle, pinterestTagEventData.videoTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, leadType, lineItems, orderId, orderQuantity, pageName, promoCode, property, searchQuery, value, videoTitle);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinterestTagEventData {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    leadType: ").append(toIndentedString(leadType)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderQuantity: ").append(toIndentedString(orderQuantity)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
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

