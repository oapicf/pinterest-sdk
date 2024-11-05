/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
 * Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\" , \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }
 */

@ApiModel(description = "Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\" , \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinterestTagEventData   {
  
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

  /**
   */
  public PinterestTagEventData currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Promotion code. For example, \"Newsletter\".
   */
  public PinterestTagEventData leadType(String leadType) {
    this.leadType = leadType;
    return this;
  }

  
  @ApiModelProperty(example = "Newsletter", value = "Promotion code. For example, \"Newsletter\".")
  @JsonProperty("lead_type")
  public String getLeadType() {
    return leadType;
  }
  public void setLeadType(String leadType) {
    this.leadType = leadType;
  }

  /**
   */
  public PinterestTagEventData lineItems(LineItem lineItems) {
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
   * Order ID. For example, \"X-151481\".
   */
  public PinterestTagEventData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(example = "X-151481", value = "Order ID. For example, \"X-151481\".")
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * Order quantity. For example, 1.
   */
  public PinterestTagEventData orderQuantity(Integer orderQuantity) {
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
   * Page name. For example, \"Our Favorite Pins on Pinterest\".
   */
  public PinterestTagEventData pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

  
  @ApiModelProperty(example = "Our Favorite Pins on Pinterest.", value = "Page name. For example, \"Our Favorite Pins on Pinterest\".")
  @JsonProperty("page_name")
  public String getPageName() {
    return pageName;
  }
  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  /**
   * Promotion code. For example, \"WINTER10\".
   */
  public PinterestTagEventData promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  
  @ApiModelProperty(example = "WINTER10", value = "Promotion code. For example, \"WINTER10\".")
  @JsonProperty("promo_code")
  public String getPromoCode() {
    return promoCode;
  }
  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  /**
   * Property. For example, \"Athleta\".
   */
  public PinterestTagEventData property(String property) {
    this.property = property;
    return this;
  }

  
  @ApiModelProperty(example = "Athleta", value = "Property. For example, \"Athleta\".")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   * Search query string. For example, \"boots\".
   */
  public PinterestTagEventData searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  
  @ApiModelProperty(example = "boots", value = "Search query string. For example, \"boots\".")
  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }
  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  /**
   * Product value. For example, \"199.98\"
   */
  public PinterestTagEventData value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "199.98", value = "Product value. For example, \"199.98\"")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Video title. For example, \"How to style your Parker Boots\".
   */
  public PinterestTagEventData videoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
    return this;
  }

  
  @ApiModelProperty(example = "How to style your Parker Boots", value = "Video title. For example, \"How to style your Parker Boots\".")
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

