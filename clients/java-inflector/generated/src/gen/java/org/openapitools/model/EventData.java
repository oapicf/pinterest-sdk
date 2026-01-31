package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Currency;
import org.openapitools.model.LineItem;



/**
 *     Optional for VISITOR &#x60;audience_type&#x60;.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated.     Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.     Examples per &#x60;event&#x60; type:     &#x60;pagevisit&#x60;     \&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }     &#x60;signup&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }     &#x60;checkout&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }     &#x60;addtocart&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}     &#x60;watchvideo&#x60;     \&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }     &#x60;lead&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 **/

@ApiModel(description = "    Optional for VISITOR `audience_type`.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated.     Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.     Examples per `event` type:     `pagevisit`     \"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }     `signup`     \"event_data\": { \"lead_type\": \"New release promotion\" }     `checkout`     \"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }     `addtocart`     \"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}     `watchvideo`     \"event_data\": { \"video_title\": \"My Product Video 01\" }     `lead`     \"event_data\": { \"lead_type\": \"Newsletter\" }")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EventData   {
  @JsonProperty("currency")
  private Currency currency;

  @JsonProperty("lead_type")
  private String leadType;

  @JsonProperty("line_items")
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

  /**
   * Currency. For example, 'USD'.
   **/
  public EventData currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "Currency. For example, 'USD'.")
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Promotion code. For example, 'Newsletter'.
   **/
  public EventData leadType(String leadType) {
    this.leadType = leadType;
    return this;
  }

  
  @ApiModelProperty(example = "Newsletter", value = "Promotion code. For example, 'Newsletter'.")
  @JsonProperty("lead_type")
  public String getLeadType() {
    return leadType;
  }
  public void setLeadType(String leadType) {
    this.leadType = leadType;
  }

  /**
   **/
  public EventData lineItems(LineItem lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("line_items")
  public LineItem getLineItems() {
    return lineItems;
  }
  public void setLineItems(LineItem lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Order ID. For example, 'X-151481'.
   **/
  public EventData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(example = "X-151481", value = "Order ID. For example, 'X-151481'.")
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * Order quantity. For example, 1.
   **/
  public EventData orderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Order quantity. For example, 1.")
  @JsonProperty("order_quantity")
  public Integer getOrderQuantity() {
    return orderQuantity;
  }
  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  /**
   * Page name. For example, 'Our Favorite Pins on Pinterest'.
   **/
  public EventData pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

  
  @ApiModelProperty(example = "Our Favorite Pins on Pinterest", value = "Page name. For example, 'Our Favorite Pins on Pinterest'.")
  @JsonProperty("page_name")
  public String getPageName() {
    return pageName;
  }
  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  /**
   * Promotion code. For example, 'WINTER10'.
   **/
  public EventData promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  
  @ApiModelProperty(example = "WINTER10", value = "Promotion code. For example, 'WINTER10'.")
  @JsonProperty("promo_code")
  public String getPromoCode() {
    return promoCode;
  }
  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  /**
   * Property. For example, 'Athleta'.
   **/
  public EventData property(String property) {
    this.property = property;
    return this;
  }

  
  @ApiModelProperty(example = "Athleta", value = "Property. For example, 'Athleta'.")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   * Search query string. For example, 'boots'.
   **/
  public EventData searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  
  @ApiModelProperty(example = "boots", value = "Search query string. For example, 'boots'.")
  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }
  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  /**
   * Product value. For example, '199.98'.
   **/
  public EventData value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "199.98", value = "Product value. For example, '199.98'.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Video title. For example, 'How to style your Parker Boots'.
   **/
  public EventData videoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
    return this;
  }

  
  @ApiModelProperty(example = "How to style your Parker Boots", value = "Video title. For example, 'How to style your Parker Boots'.")
  @JsonProperty("video_title")
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
    return Objects.equals(currency, eventData.currency) &&
        Objects.equals(leadType, eventData.leadType) &&
        Objects.equals(lineItems, eventData.lineItems) &&
        Objects.equals(orderId, eventData.orderId) &&
        Objects.equals(orderQuantity, eventData.orderQuantity) &&
        Objects.equals(pageName, eventData.pageName) &&
        Objects.equals(promoCode, eventData.promoCode) &&
        Objects.equals(property, eventData.property) &&
        Objects.equals(searchQuery, eventData.searchQuery) &&
        Objects.equals(value, eventData.value) &&
        Objects.equals(videoTitle, eventData.videoTitle);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

