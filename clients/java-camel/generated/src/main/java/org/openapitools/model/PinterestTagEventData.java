package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Currency;
import org.openapitools.model.LineItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot; , \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 */

@Schema(name = "PinterestTagEventData", description = "Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\" , \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinterestTagEventData {

  private Currency currency;

  private String leadType;

  private LineItem lineItems;

  private String orderId;

  private Integer orderQuantity;

  private String pageName;

  private String promoCode;

  private String property;

  private String searchQuery;

  private String value;

  private String videoTitle;

  public PinterestTagEventData currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
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
   */
  
  @Schema(name = "lead_type", example = "Newsletter", description = "Promotion code. For example, \"Newsletter\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead_type")
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
   */
  @Valid 
  @Schema(name = "line_items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line_items")
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
   */
  
  @Schema(name = "order_id", example = "X-151481", description = "Order ID. For example, \"X-151481\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_id")
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
   */
  
  @Schema(name = "order_quantity", example = "1", description = "Order quantity. For example, 1.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_quantity")
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
   */
  
  @Schema(name = "page_name", example = "Our Favorite Pins on Pinterest.", description = "Page name. For example, \"Our Favorite Pins on Pinterest\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page_name")
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
   */
  
  @Schema(name = "promo_code", example = "WINTER10", description = "Promotion code. For example, \"WINTER10\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promo_code")
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
   */
  
  @Schema(name = "property", example = "Athleta", description = "Property. For example, \"Athleta\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property")
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
   */
  
  @Schema(name = "search_query", example = "boots", description = "Search query string. For example, \"boots\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search_query")
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
   */
  
  @Schema(name = "value", example = "199.98", description = "Product value. For example, \"199.98\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
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
   */
  
  @Schema(name = "video_title", example = "How to style your Parker Boots", description = "Video title. For example, \"How to style your Parker Boots\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PinterestTagEventData pinterestTagEventData = (PinterestTagEventData) o;
    return Objects.equals(this.currency, pinterestTagEventData.currency) &&
        Objects.equals(this.leadType, pinterestTagEventData.leadType) &&
        Objects.equals(this.lineItems, pinterestTagEventData.lineItems) &&
        Objects.equals(this.orderId, pinterestTagEventData.orderId) &&
        Objects.equals(this.orderQuantity, pinterestTagEventData.orderQuantity) &&
        Objects.equals(this.pageName, pinterestTagEventData.pageName) &&
        Objects.equals(this.promoCode, pinterestTagEventData.promoCode) &&
        Objects.equals(this.property, pinterestTagEventData.property) &&
        Objects.equals(this.searchQuery, pinterestTagEventData.searchQuery) &&
        Objects.equals(this.value, pinterestTagEventData.value) &&
        Objects.equals(this.videoTitle, pinterestTagEventData.videoTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, leadType, lineItems, orderId, orderQuantity, pageName, promoCode, property, searchQuery, value, videoTitle);
  }

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

