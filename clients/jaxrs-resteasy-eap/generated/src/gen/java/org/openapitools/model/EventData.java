package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Currency;
import org.openapitools.model.LineItem;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="    Optional for VISITOR `audience_type`.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated.     Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.     Examples per `event` type:     `pagevisit`     \"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }     `signup`     \"event_data\": { \"lead_type\": \"New release promotion\" }     `checkout`     \"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }     `addtocart`     \"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}     `watchvideo`     \"event_data\": { \"video_title\" : \"My Product Video 01\" }     `lead`     \"event_data\": { \"lead_type\": \"Newsletter\" }")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EventData   {
  
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
   * Currency. For example, &#39;USD&#39;.
   **/
  
  @ApiModelProperty(value = "Currency. For example, 'USD'.")
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Promotion code. For example, &#39;Newsletter&#39;.
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("line_items")
  public LineItem getLineItems() {
    return lineItems;
  }
  public void setLineItems(LineItem lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Order ID. For example, &#39;X-151481&#39;.
   **/
  
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
  
  @ApiModelProperty(example = "1", value = "Order quantity. For example, 1.")
  @JsonProperty("order_quantity")
  public Integer getOrderQuantity() {
    return orderQuantity;
  }
  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  /**
   * Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;.
   **/
  
  @ApiModelProperty(example = "Our Favorite Pins on Pinterest", value = "Page name. For example, 'Our Favorite Pins on Pinterest'.")
  @JsonProperty("page_name")
  public String getPageName() {
    return pageName;
  }
  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  /**
   * Promotion code. For example, &#39;WINTER10&#39;.
   **/
  
  @ApiModelProperty(example = "WINTER10", value = "Promotion code. For example, 'WINTER10'.")
  @JsonProperty("promo_code")
  public String getPromoCode() {
    return promoCode;
  }
  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  /**
   * Property. For example, &#39;Athleta&#39;.
   **/
  
  @ApiModelProperty(example = "Athleta", value = "Property. For example, 'Athleta'.")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   * Search query string. For example, &#39;boots&#39;.
   **/
  
  @ApiModelProperty(example = "boots", value = "Search query string. For example, 'boots'.")
  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }
  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  /**
   * Product value. For example, &#39;199.98&#39;.
   **/
  
  @ApiModelProperty(example = "199.98", value = "Product value. For example, '199.98'.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Video title. For example, &#39;How to style your Parker Boots&#39;.
   **/
  
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

