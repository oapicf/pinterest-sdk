package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.IntegrationLogClientError;
import org.openapitools.server.model.IntegrationLogClientRequest;
import org.openapitools.server.model.IntegrationLogEventType;
import org.openapitools.server.model.IntegrationLogLevel;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Schema for log sent from an integration application.
 */
public class IntegrationLog   {

    private String advertiserId;
    private String appVersionNumber;
    private Integer clientTimestamp;
    private IntegrationLogClientError error;
    private IntegrationLogEventType eventType;
    private String externalBusinessId;
    private String feedProfileId;
    private IntegrationLogLevel logLevel;
    private String merchantId;
    private String message;
    private String platformVersionNumber;
    private IntegrationLogClientRequest request;
    private String tagId;

    /**
     * Default constructor.
     */
    public IntegrationLog() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationLog.
     *
     * @param advertiserId advertiserId
     * @param appVersionNumber Version number of the integration application.
     * @param clientTimestamp Timestamp in milliseconds of when the log was executed at the client.
     * @param error error
     * @param eventType Log event type
     * @param externalBusinessId externalBusinessId
     * @param feedProfileId feedProfileId
     * @param logLevel Log level type
     * @param merchantId merchantId
     * @param message Explanation of the event that occured.
     * @param platformVersionNumber Version number of the platform the integration application is running on.
     * @param request request
     * @param tagId tagId
     */
    public IntegrationLog(
        String advertiserId, 
        String appVersionNumber, 
        Integer clientTimestamp, 
        IntegrationLogClientError error, 
        IntegrationLogEventType eventType, 
        String externalBusinessId, 
        String feedProfileId, 
        IntegrationLogLevel logLevel, 
        String merchantId, 
        String message, 
        String platformVersionNumber, 
        IntegrationLogClientRequest request, 
        String tagId
    ) {
        this.advertiserId = advertiserId;
        this.appVersionNumber = appVersionNumber;
        this.clientTimestamp = clientTimestamp;
        this.error = error;
        this.eventType = eventType;
        this.externalBusinessId = externalBusinessId;
        this.feedProfileId = feedProfileId;
        this.logLevel = logLevel;
        this.merchantId = merchantId;
        this.message = message;
        this.platformVersionNumber = platformVersionNumber;
        this.request = request;
        this.tagId = tagId;
    }



    /**
     * Get advertiserId
     * @return advertiserId
     */
    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }

    /**
     * Version number of the integration application.
     * @return appVersionNumber
     */
    public String getAppVersionNumber() {
        return appVersionNumber;
    }

    public void setAppVersionNumber(String appVersionNumber) {
        this.appVersionNumber = appVersionNumber;
    }

    /**
     * Timestamp in milliseconds of when the log was executed at the client.
     * @return clientTimestamp
     */
    public Integer getClientTimestamp() {
        return clientTimestamp;
    }

    public void setClientTimestamp(Integer clientTimestamp) {
        this.clientTimestamp = clientTimestamp;
    }

    /**
     * Get error
     * @return error
     */
    public IntegrationLogClientError getError() {
        return error;
    }

    public void setError(IntegrationLogClientError error) {
        this.error = error;
    }

    /**
     * Log event type
     * @return eventType
     */
    public IntegrationLogEventType getEventType() {
        return eventType;
    }

    public void setEventType(IntegrationLogEventType eventType) {
        this.eventType = eventType;
    }

    /**
     * Get externalBusinessId
     * @return externalBusinessId
     */
    public String getExternalBusinessId() {
        return externalBusinessId;
    }

    public void setExternalBusinessId(String externalBusinessId) {
        this.externalBusinessId = externalBusinessId;
    }

    /**
     * Get feedProfileId
     * @return feedProfileId
     */
    public String getFeedProfileId() {
        return feedProfileId;
    }

    public void setFeedProfileId(String feedProfileId) {
        this.feedProfileId = feedProfileId;
    }

    /**
     * Log level type
     * @return logLevel
     */
    public IntegrationLogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(IntegrationLogLevel logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * Get merchantId
     * @return merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * Explanation of the event that occured.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Version number of the platform the integration application is running on.
     * @return platformVersionNumber
     */
    public String getPlatformVersionNumber() {
        return platformVersionNumber;
    }

    public void setPlatformVersionNumber(String platformVersionNumber) {
        this.platformVersionNumber = platformVersionNumber;
    }

    /**
     * Get request
     * @return request
     */
    public IntegrationLogClientRequest getRequest() {
        return request;
    }

    public void setRequest(IntegrationLogClientRequest request) {
        this.request = request;
    }

    /**
     * Get tagId
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationLog {\n");
        
        sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
        sb.append("    appVersionNumber: ").append(toIndentedString(appVersionNumber)).append("\n");
        sb.append("    clientTimestamp: ").append(toIndentedString(clientTimestamp)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
        sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    platformVersionNumber: ").append(toIndentedString(platformVersionNumber)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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

