package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ConversionEventsDataItemsCustomDataContentsItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object containing other custom data.
 */
public class ConversionEventsDataItemsCustomData   {

    private String contentBrand;
    private String contentCategory;
    private List<String> contentIds = new ArrayList<>();
    private String contentName;
    private List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents = new ArrayList<>();
    private String currency;
    private String externalMeasurementId;
    private Integer externalMeasurementVendorId;
    private String np;
    private Long numItems;
    private String optOutType;
    private String orderId;
    private String predictedLtv;
    private String searchString;
    private String value;

    /**
     * Default constructor.
     */
    public ConversionEventsDataItemsCustomData() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEventsDataItemsCustomData.
     *
     * @param contentBrand The brand of the content associated with the event.
     * @param contentCategory The category of the content associated with the event.
     * @param contentIds List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @param contentName The name of the page or product associated with the event.
     * @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
     * @param externalMeasurementId Only use when instructed.
     * @param externalMeasurementVendorId Only use when instructed.
     * @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
     * @param numItems Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @param optOutType Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
     * @param orderId The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
     * @param predictedLtv Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
     * @param searchString The search string related to the user conversion event.
     * @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
     */
    public ConversionEventsDataItemsCustomData(
        String contentBrand, 
        String contentCategory, 
        List<String> contentIds, 
        String contentName, 
        List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents, 
        String currency, 
        String externalMeasurementId, 
        Integer externalMeasurementVendorId, 
        String np, 
        Long numItems, 
        String optOutType, 
        String orderId, 
        String predictedLtv, 
        String searchString, 
        String value
    ) {
        this.contentBrand = contentBrand;
        this.contentCategory = contentCategory;
        this.contentIds = contentIds;
        this.contentName = contentName;
        this.contents = contents;
        this.currency = currency;
        this.externalMeasurementId = externalMeasurementId;
        this.externalMeasurementVendorId = externalMeasurementVendorId;
        this.np = np;
        this.numItems = numItems;
        this.optOutType = optOutType;
        this.orderId = orderId;
        this.predictedLtv = predictedLtv;
        this.searchString = searchString;
        this.value = value;
    }



    /**
     * The brand of the content associated with the event.
     * @return contentBrand
     */
    public String getContentBrand() {
        return contentBrand;
    }

    public void setContentBrand(String contentBrand) {
        this.contentBrand = contentBrand;
    }

    /**
     * The category of the content associated with the event.
     * @return contentCategory
     */
    public String getContentCategory() {
        return contentCategory;
    }

    public void setContentCategory(String contentCategory) {
        this.contentCategory = contentCategory;
    }

    /**
     * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @return contentIds
     */
    public List<String> getContentIds() {
        return contentIds;
    }

    public void setContentIds(List<String> contentIds) {
        this.contentIds = contentIds;
    }

    /**
     * The name of the page or product associated with the event.
     * @return contentName
     */
    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    /**
     * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @return contents
     */
    public List<@Valid ConversionEventsDataItemsCustomDataContentsItems> getContents() {
        return contents;
    }

    public void setContents(List<@Valid ConversionEventsDataItemsCustomDataContentsItems> contents) {
        this.contents = contents;
    }

    /**
     * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Only use when instructed.
     * @return externalMeasurementId
     */
    public String getExternalMeasurementId() {
        return externalMeasurementId;
    }

    public void setExternalMeasurementId(String externalMeasurementId) {
        this.externalMeasurementId = externalMeasurementId;
    }

    /**
     * Only use when instructed.
     * @return externalMeasurementVendorId
     */
    public Integer getExternalMeasurementVendorId() {
        return externalMeasurementVendorId;
    }

    public void setExternalMeasurementVendorId(Integer externalMeasurementVendorId) {
        this.externalMeasurementVendorId = externalMeasurementVendorId;
    }

    /**
     * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
     * @return np
     */
    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    /**
     * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @return numItems
     */
    public Long getNumItems() {
        return numItems;
    }

    public void setNumItems(Long numItems) {
        this.numItems = numItems;
    }

    /**
     * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
     * @return optOutType
     */
    public String getOptOutType() {
        return optOutType;
    }

    public void setOptOutType(String optOutType) {
        this.optOutType = optOutType;
    }

    /**
     * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
     * @return predictedLtv
     */
    public String getPredictedLtv() {
        return predictedLtv;
    }

    public void setPredictedLtv(String predictedLtv) {
        this.predictedLtv = predictedLtv;
    }

    /**
     * The search string related to the user conversion event.
     * @return searchString
     */
    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

