package org.openapitools.server.model;

import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.QualityComponentDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Set of quality components, with each component containing a event coverage and details.
 */
public class QualityComponents   {

    private Map<String, QualityComponentDetails> advertiserExternalId = new HashMap<>();
    private Map<String, QualityComponentDetails> clickIdEpik = new HashMap<>();
    private Map<String, QualityComponentDetails> externalEventId = new HashMap<>();
    private Map<String, QualityComponentDetails> hashedEmail = new HashMap<>();
    private Map<String, QualityComponentDetails> hashedMaid = new HashMap<>();
    private Map<String, QualityComponentDetails> ipAddress = new HashMap<>();
    private Map<String, QualityComponentDetails> orderId = new HashMap<>();
    private Map<String, QualityComponentDetails> orderValue = new HashMap<>();
    private Map<String, QualityComponentDetails> productId = new HashMap<>();
    private Map<String, QualityComponentDetails> sourceUrl = new HashMap<>();
    private Map<String, QualityComponentDetails> userAgent = new HashMap<>();

    /**
     * Default constructor.
     */
    public QualityComponents() {
    // JSON-B / Jackson
    }

    /**
     * Create QualityComponents.
     *
     * @param advertiserExternalId advertiserExternalId
     * @param clickIdEpik clickIdEpik
     * @param externalEventId Dedup components.
     * @param hashedEmail User matching identifiers.
     * @param hashedMaid hashedMaid
     * @param ipAddress ipAddress
     * @param orderId orderId
     * @param orderValue orderValue
     * @param productId Product/event metadata.
     * @param sourceUrl sourceUrl
     * @param userAgent userAgent
     */
    public QualityComponents(
        Map<String, QualityComponentDetails> advertiserExternalId, 
        Map<String, QualityComponentDetails> clickIdEpik, 
        Map<String, QualityComponentDetails> externalEventId, 
        Map<String, QualityComponentDetails> hashedEmail, 
        Map<String, QualityComponentDetails> hashedMaid, 
        Map<String, QualityComponentDetails> ipAddress, 
        Map<String, QualityComponentDetails> orderId, 
        Map<String, QualityComponentDetails> orderValue, 
        Map<String, QualityComponentDetails> productId, 
        Map<String, QualityComponentDetails> sourceUrl, 
        Map<String, QualityComponentDetails> userAgent
    ) {
        this.advertiserExternalId = advertiserExternalId;
        this.clickIdEpik = clickIdEpik;
        this.externalEventId = externalEventId;
        this.hashedEmail = hashedEmail;
        this.hashedMaid = hashedMaid;
        this.ipAddress = ipAddress;
        this.orderId = orderId;
        this.orderValue = orderValue;
        this.productId = productId;
        this.sourceUrl = sourceUrl;
        this.userAgent = userAgent;
    }



    /**
     * Get advertiserExternalId
     * @return advertiserExternalId
     */
    public Map<String, QualityComponentDetails> getAdvertiserExternalId() {
        return advertiserExternalId;
    }

    public void setAdvertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
        this.advertiserExternalId = advertiserExternalId;
    }

    /**
     * Get clickIdEpik
     * @return clickIdEpik
     */
    public Map<String, QualityComponentDetails> getClickIdEpik() {
        return clickIdEpik;
    }

    public void setClickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
        this.clickIdEpik = clickIdEpik;
    }

    /**
     * Dedup components.
     * @return externalEventId
     */
    public Map<String, QualityComponentDetails> getExternalEventId() {
        return externalEventId;
    }

    public void setExternalEventId(Map<String, QualityComponentDetails> externalEventId) {
        this.externalEventId = externalEventId;
    }

    /**
     * User matching identifiers.
     * @return hashedEmail
     */
    public Map<String, QualityComponentDetails> getHashedEmail() {
        return hashedEmail;
    }

    public void setHashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
        this.hashedEmail = hashedEmail;
    }

    /**
     * Get hashedMaid
     * @return hashedMaid
     */
    public Map<String, QualityComponentDetails> getHashedMaid() {
        return hashedMaid;
    }

    public void setHashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
        this.hashedMaid = hashedMaid;
    }

    /**
     * Get ipAddress
     * @return ipAddress
     */
    public Map<String, QualityComponentDetails> getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(Map<String, QualityComponentDetails> ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Get orderId
     * @return orderId
     */
    public Map<String, QualityComponentDetails> getOrderId() {
        return orderId;
    }

    public void setOrderId(Map<String, QualityComponentDetails> orderId) {
        this.orderId = orderId;
    }

    /**
     * Get orderValue
     * @return orderValue
     */
    public Map<String, QualityComponentDetails> getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Map<String, QualityComponentDetails> orderValue) {
        this.orderValue = orderValue;
    }

    /**
     * Product/event metadata.
     * @return productId
     */
    public Map<String, QualityComponentDetails> getProductId() {
        return productId;
    }

    public void setProductId(Map<String, QualityComponentDetails> productId) {
        this.productId = productId;
    }

    /**
     * Get sourceUrl
     * @return sourceUrl
     */
    public Map<String, QualityComponentDetails> getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * Get userAgent
     * @return userAgent
     */
    public Map<String, QualityComponentDetails> getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(Map<String, QualityComponentDetails> userAgent) {
        this.userAgent = userAgent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityComponents {\n");
        
        sb.append("    advertiserExternalId: ").append(toIndentedString(advertiserExternalId)).append("\n");
        sb.append("    clickIdEpik: ").append(toIndentedString(clickIdEpik)).append("\n");
        sb.append("    externalEventId: ").append(toIndentedString(externalEventId)).append("\n");
        sb.append("    hashedEmail: ").append(toIndentedString(hashedEmail)).append("\n");
        sb.append("    hashedMaid: ").append(toIndentedString(hashedMaid)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderValue: ").append(toIndentedString(orderValue)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

