package org.openapitools.model;

import org.openapitools.model.Currency;
import org.openapitools.model.LineItem;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 *     Optional for VISITOR &#x60;audience_type&#x60;.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated.     Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.     Examples per &#x60;event&#x60; type:     &#x60;pagevisit&#x60;     \&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }     &#x60;signup&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }     &#x60;checkout&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }     &#x60;addtocart&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}     &#x60;watchvideo&#x60;     \&quot;event_data\&quot;: { \&quot;video_title\&quot; : \&quot;My Product Video 01\&quot; }     &#x60;lead&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 */
public class EventData implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Currency. For example, &#39;USD&#39;.
   */
  @JsonProperty("currency")
  private Currency currency;

  /**
   * Promotion code. For example, &#39;Newsletter&#39;.
   */
  @JsonProperty("lead_type")
  private String leadType;

  @JsonProperty("line_items")
  private LineItem lineItems;

  /**
   * Order ID. For example, &#39;X-151481&#39;.
   */
  @JsonProperty("order_id")
  private String orderId;

  /**
   * Order quantity. For example, 1.
   */
  @JsonProperty("order_quantity")
  private Integer orderQuantity;

  /**
   * Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;.
   */
  @JsonProperty("page_name")
  private String pageName;

  /**
   * Promotion code. For example, &#39;WINTER10&#39;.
   */
  @JsonProperty("promo_code")
  private String promoCode;

  /**
   * Property. For example, &#39;Athleta&#39;.
   */
  @JsonProperty("property")
  private String property;

  /**
   * Search query string. For example, &#39;boots&#39;.
   */
  @JsonProperty("search_query")
  private String searchQuery;

  /**
   * Product value. For example, &#39;199.98&#39;.
   */
  @JsonProperty("value")
  private String value;

  /**
   * Video title. For example, &#39;How to style your Parker Boots&#39;.
   */
  @JsonProperty("video_title")
  private String videoTitle;

  /**
   * Currency. For example, &#39;USD&#39;.
   * @return currency
   */
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Promotion code. For example, &#39;Newsletter&#39;.
   * @return leadType
   */
  public String getLeadType() {
    return leadType;
  }

  public void setLeadType(String leadType) {
    this.leadType = leadType;
  }

  /**
   * 
   * @return lineItems
   */
  public LineItem getLineItems() {
    return lineItems;
  }

  public void setLineItems(LineItem lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Order ID. For example, &#39;X-151481&#39;.
   * @return orderId
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * Order quantity. For example, 1.
   * @return orderQuantity
   */
  public Integer getOrderQuantity() {
    return orderQuantity;
  }

  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  /**
   * Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;.
   * @return pageName
   */
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  /**
   * Promotion code. For example, &#39;WINTER10&#39;.
   * @return promoCode
   */
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  /**
   * Property. For example, &#39;Athleta&#39;.
   * @return property
   */
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  /**
   * Search query string. For example, &#39;boots&#39;.
   * @return searchQuery
   */
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  /**
   * Product value. For example, &#39;199.98&#39;.
   * @return value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Video title. For example, &#39;How to style your Parker Boots&#39;.
   * @return videoTitle
   */
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
    EventData eventData = (EventData) o;
    return Objects.equals(this.currency, eventData.currency) &&
        Objects.equals(this.leadType, eventData.leadType) &&
        Objects.equals(this.lineItems, eventData.lineItems) &&
        Objects.equals(this.orderId, eventData.orderId) &&
        Objects.equals(this.orderQuantity, eventData.orderQuantity) &&
        Objects.equals(this.pageName, eventData.pageName) &&
        Objects.equals(this.promoCode, eventData.promoCode) &&
        Objects.equals(this.property, eventData.property) &&
        Objects.equals(this.searchQuery, eventData.searchQuery) &&
        Objects.equals(this.value, eventData.value) &&
        Objects.equals(this.videoTitle, eventData.videoTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, leadType, lineItems, orderId, orderQuantity, pageName, promoCode, property, searchQuery, value, videoTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventData {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
