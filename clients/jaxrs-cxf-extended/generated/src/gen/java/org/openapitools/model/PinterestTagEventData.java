package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.Currency;
import org.openapitools.model.LineItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }
 */
@ApiModel(description="Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }")

public class PinterestTagEventData  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Currency currency;

 /**
  * Promotion code. For example, \"Newsletter\".
  */
  @ApiModelProperty(example = "Newsletter", value = "Promotion code. For example, \"Newsletter\".")
  private String leadType;

  @ApiModelProperty(value = "")
  @Valid
  private LineItem lineItems;

 /**
  * Order ID. For example, \"X-151481\".
  */
  @ApiModelProperty(example = "X-151481", value = "Order ID. For example, \"X-151481\".")
  private String orderId;

 /**
  * Order quantity. For example, 1.
  */
  @ApiModelProperty(example = "1", value = "Order quantity. For example, 1.")
  private Integer orderQuantity;

 /**
  * Page name. For example, \"Our Favorite Pins on Pinterest\".
  */
  @ApiModelProperty(example = "Our Favorite Pins on Pinterest.", value = "Page name. For example, \"Our Favorite Pins on Pinterest\".")
  private String pageName;

 /**
  * Promotion code. For example, \"WINTER10\".
  */
  @ApiModelProperty(example = "WINTER10", value = "Promotion code. For example, \"WINTER10\".")
  private String promoCode;

 /**
  * Property. For example, \"Athleta\".
  */
  @ApiModelProperty(example = "Athleta", value = "Property. For example, \"Athleta\".")
  private String property;

 /**
  * Search query string. For example, \"boots\".
  */
  @ApiModelProperty(example = "boots", value = "Search query string. For example, \"boots\".")
  private String searchQuery;

 /**
  * Product value. For example, \"199.98\"
  */
  @ApiModelProperty(example = "199.98", value = "Product value. For example, \"199.98\"")
  private String value;

 /**
  * Video title. For example, \"How to style your Parker Boots\".
  */
  @ApiModelProperty(example = "How to style your Parker Boots", value = "Video title. For example, \"How to style your Parker Boots\".")
  private String videoTitle;
 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public PinterestTagEventData currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
  * Promotion code. For example, \&quot;Newsletter\&quot;.
  * @return leadType
  */
  @JsonProperty("lead_type")
  public String getLeadType() {
    return leadType;
  }

  /**
   * Sets the <code>leadType</code> property.
   */
 public void setLeadType(String leadType) {
    this.leadType = leadType;
  }

  /**
   * Sets the <code>leadType</code> property.
   */
  public PinterestTagEventData leadType(String leadType) {
    this.leadType = leadType;
    return this;
  }

 /**
  * Get lineItems
  * @return lineItems
  */
  @JsonProperty("line_items")
  public LineItem getLineItems() {
    return lineItems;
  }

  /**
   * Sets the <code>lineItems</code> property.
   */
 public void setLineItems(LineItem lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Sets the <code>lineItems</code> property.
   */
  public PinterestTagEventData lineItems(LineItem lineItems) {
    this.lineItems = lineItems;
    return this;
  }

 /**
  * Order ID. For example, \&quot;X-151481\&quot;.
  * @return orderId
  */
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
 public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
  public PinterestTagEventData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
  * Order quantity. For example, 1.
  * @return orderQuantity
  */
  @JsonProperty("order_quantity")
  public Integer getOrderQuantity() {
    return orderQuantity;
  }

  /**
   * Sets the <code>orderQuantity</code> property.
   */
 public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  /**
   * Sets the <code>orderQuantity</code> property.
   */
  public PinterestTagEventData orderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }

 /**
  * Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;.
  * @return pageName
  */
  @JsonProperty("page_name")
  public String getPageName() {
    return pageName;
  }

  /**
   * Sets the <code>pageName</code> property.
   */
 public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  /**
   * Sets the <code>pageName</code> property.
   */
  public PinterestTagEventData pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

 /**
  * Promotion code. For example, \&quot;WINTER10\&quot;.
  * @return promoCode
  */
  @JsonProperty("promo_code")
  public String getPromoCode() {
    return promoCode;
  }

  /**
   * Sets the <code>promoCode</code> property.
   */
 public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  /**
   * Sets the <code>promoCode</code> property.
   */
  public PinterestTagEventData promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

 /**
  * Property. For example, \&quot;Athleta\&quot;.
  * @return property
  */
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  /**
   * Sets the <code>property</code> property.
   */
 public void setProperty(String property) {
    this.property = property;
  }

  /**
   * Sets the <code>property</code> property.
   */
  public PinterestTagEventData property(String property) {
    this.property = property;
    return this;
  }

 /**
  * Search query string. For example, \&quot;boots\&quot;.
  * @return searchQuery
  */
  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }

  /**
   * Sets the <code>searchQuery</code> property.
   */
 public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  /**
   * Sets the <code>searchQuery</code> property.
   */
  public PinterestTagEventData searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

 /**
  * Product value. For example, \&quot;199.98\&quot;
  * @return value
  */
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public PinterestTagEventData value(String value) {
    this.value = value;
    return this;
  }

 /**
  * Video title. For example, \&quot;How to style your Parker Boots\&quot;.
  * @return videoTitle
  */
  @JsonProperty("video_title")
  public String getVideoTitle() {
    return videoTitle;
  }

  /**
   * Sets the <code>videoTitle</code> property.
   */
 public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }

  /**
   * Sets the <code>videoTitle</code> property.
   */
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

