package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.Currency;
import org.openapitools.server.model.LineItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 *     Optional for VISITOR `audience_type`.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated.     Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.     Examples per `event` type:     `pagevisit`     \"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }     `signup`     \"event_data\": { \"lead_type\": \"New release promotion\" }     `checkout`     \"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }     `addtocart`     \"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}     `watchvideo`     \"event_data\": { \"video_title\" : \"My Product Video 01\" }     `lead`     \"event_data\": { \"lead_type\": \"Newsletter\" }
 */
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
     * Default constructor.
     */
    public EventData() {
    // JSON-B / Jackson
    }

    /**
     * Create EventData.
     *
     * @param currency Currency. For example, &#39;USD&#39;.
     * @param leadType Promotion code. For example, &#39;Newsletter&#39;.
     * @param lineItems lineItems
     * @param orderId Order ID. For example, &#39;X-151481&#39;.
     * @param orderQuantity Order quantity. For example, 1.
     * @param pageName Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;.
     * @param promoCode Promotion code. For example, &#39;WINTER10&#39;.
     * @param property Property. For example, &#39;Athleta&#39;.
     * @param searchQuery Search query string. For example, &#39;boots&#39;.
     * @param value Product value. For example, &#39;199.98&#39;.
     * @param videoTitle Video title. For example, &#39;How to style your Parker Boots&#39;.
     */
    public EventData(
        Currency currency, 
        String leadType, 
        LineItem lineItems, 
        String orderId, 
        Integer orderQuantity, 
        String pageName, 
        String promoCode, 
        String property, 
        String searchQuery, 
        String value, 
        String videoTitle
    ) {
        this.currency = currency;
        this.leadType = leadType;
        this.lineItems = lineItems;
        this.orderId = orderId;
        this.orderQuantity = orderQuantity;
        this.pageName = pageName;
        this.promoCode = promoCode;
        this.property = property;
        this.searchQuery = searchQuery;
        this.value = value;
        this.videoTitle = videoTitle;
    }



    /**
     * Currency. For example, 'USD'.
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * Promotion code. For example, 'Newsletter'.
     * @return leadType
     */
    public String getLeadType() {
        return leadType;
    }

    public void setLeadType(String leadType) {
        this.leadType = leadType;
    }

    /**
     * Get lineItems
     * @return lineItems
     */
    public LineItem getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Order ID. For example, 'X-151481'.
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
     * Page name. For example, 'Our Favorite Pins on Pinterest'.
     * @return pageName
     */
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    /**
     * Promotion code. For example, 'WINTER10'.
     * @return promoCode
     */
    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    /**
     * Property. For example, 'Athleta'.
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Search query string. For example, 'boots'.
     * @return searchQuery
     */
    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    /**
     * Product value. For example, '199.98'.
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Video title. For example, 'How to style your Parker Boots'.
     * @return videoTitle
     */
    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

