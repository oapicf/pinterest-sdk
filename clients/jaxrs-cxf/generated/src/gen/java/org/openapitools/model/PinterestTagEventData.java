package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.Currency;
import org.openapitools.model.LineItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }
 **/
@ApiModel(description="Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }")

public class PinterestTagEventData  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Currency currency;

  @ApiModelProperty(example = "Newsletter", value = "Promotion code. For example, \"Newsletter\".")
 /**
   * Promotion code. For example, \"Newsletter\".
  **/
  private String leadType;

  @ApiModelProperty(value = "")
  @Valid
  private LineItem lineItems;

  @ApiModelProperty(example = "X-151481", value = "Order ID. For example, \"X-151481\".")
 /**
   * Order ID. For example, \"X-151481\".
  **/
  private String orderId;

  @ApiModelProperty(example = "1", value = "Order quantity. For example, 1.")
 /**
   * Order quantity. For example, 1.
  **/
  private Integer orderQuantity;

  @ApiModelProperty(example = "Our Favorite Pins on Pinterest.", value = "Page name. For example, \"Our Favorite Pins on Pinterest\".")
 /**
   * Page name. For example, \"Our Favorite Pins on Pinterest\".
  **/
  private String pageName;

  @ApiModelProperty(example = "WINTER10", value = "Promotion code. For example, \"WINTER10\".")
 /**
   * Promotion code. For example, \"WINTER10\".
  **/
  private String promoCode;

  @ApiModelProperty(example = "Athleta", value = "Property. For example, \"Athleta\".")
 /**
   * Property. For example, \"Athleta\".
  **/
  private String property;

  @ApiModelProperty(example = "boots", value = "Search query string. For example, \"boots\".")
 /**
   * Search query string. For example, \"boots\".
  **/
  private String searchQuery;

  @ApiModelProperty(example = "199.98", value = "Product value. For example, \"199.98\"")
 /**
   * Product value. For example, \"199.98\"
  **/
  private String value;

  @ApiModelProperty(example = "How to style your Parker Boots", value = "Video title. For example, \"How to style your Parker Boots\".")
 /**
   * Video title. For example, \"How to style your Parker Boots\".
  **/
  private String videoTitle;
 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public PinterestTagEventData currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Promotion code. For example, \&quot;Newsletter\&quot;.
   * @return leadType
  **/
  @JsonProperty("lead_type")
  public String getLeadType() {
    return leadType;
  }

  public void setLeadType(String leadType) {
    this.leadType = leadType;
  }

  public PinterestTagEventData leadType(String leadType) {
    this.leadType = leadType;
    return this;
  }

 /**
   * Get lineItems
   * @return lineItems
  **/
  @JsonProperty("line_items")
  public LineItem getLineItems() {
    return lineItems;
  }

  public void setLineItems(LineItem lineItems) {
    this.lineItems = lineItems;
  }

  public PinterestTagEventData lineItems(LineItem lineItems) {
    this.lineItems = lineItems;
    return this;
  }

 /**
   * Order ID. For example, \&quot;X-151481\&quot;.
   * @return orderId
  **/
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PinterestTagEventData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Order quantity. For example, 1.
   * @return orderQuantity
  **/
  @JsonProperty("order_quantity")
  public Integer getOrderQuantity() {
    return orderQuantity;
  }

  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  public PinterestTagEventData orderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }

 /**
   * Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;.
   * @return pageName
  **/
  @JsonProperty("page_name")
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  public PinterestTagEventData pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

 /**
   * Promotion code. For example, \&quot;WINTER10\&quot;.
   * @return promoCode
  **/
  @JsonProperty("promo_code")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public PinterestTagEventData promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

 /**
   * Property. For example, \&quot;Athleta\&quot;.
   * @return property
  **/
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public PinterestTagEventData property(String property) {
    this.property = property;
    return this;
  }

 /**
   * Search query string. For example, \&quot;boots\&quot;.
   * @return searchQuery
  **/
  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  public PinterestTagEventData searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

 /**
   * Product value. For example, \&quot;199.98\&quot;
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public PinterestTagEventData value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Video title. For example, \&quot;How to style your Parker Boots\&quot;.
   * @return videoTitle
  **/
  @JsonProperty("video_title")
  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }

  public PinterestTagEventData videoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

