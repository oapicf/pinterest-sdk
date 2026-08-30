package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.IntegrationLogClientError;
import org.openapitools.vertxweb.server.model.IntegrationLogClientRequest;
import org.openapitools.vertxweb.server.model.IntegrationLogEventType;
import org.openapitools.vertxweb.server.model.IntegrationLogLevel;

/**
 * Schema for log sent from an integration application.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public IntegrationLog () {

  }

  public IntegrationLog (String advertiserId, String appVersionNumber, Integer clientTimestamp, IntegrationLogClientError error, IntegrationLogEventType eventType, String externalBusinessId, String feedProfileId, IntegrationLogLevel logLevel, String merchantId, String message, String platformVersionNumber, IntegrationLogClientRequest request, String tagId) {
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

    
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

    
  @JsonProperty("app_version_number")
  public String getAppVersionNumber() {
    return appVersionNumber;
  }
  public void setAppVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
  }

    
  @JsonProperty("client_timestamp")
  public Integer getClientTimestamp() {
    return clientTimestamp;
  }
  public void setClientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
  }

    
  @JsonProperty("error")
  public IntegrationLogClientError getError() {
    return error;
  }
  public void setError(IntegrationLogClientError error) {
    this.error = error;
  }

    
  @JsonProperty("event_type")
  public IntegrationLogEventType getEventType() {
    return eventType;
  }
  public void setEventType(IntegrationLogEventType eventType) {
    this.eventType = eventType;
  }

    
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }
  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

    
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

    
  @JsonProperty("log_level")
  public IntegrationLogLevel getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(IntegrationLogLevel logLevel) {
    this.logLevel = logLevel;
  }

    
  @JsonProperty("merchant_id")
  public String getMerchantId() {
    return merchantId;
  }
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
  @JsonProperty("platform_version_number")
  public String getPlatformVersionNumber() {
    return platformVersionNumber;
  }
  public void setPlatformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
  }

    
  @JsonProperty("request")
  public IntegrationLogClientRequest getRequest() {
    return request;
  }
  public void setRequest(IntegrationLogClientRequest request) {
    this.request = request;
  }

    
  @JsonProperty("tag_id")
  public String getTagId() {
    return tagId;
  }
  public void setTagId(String tagId) {
    this.tagId = tagId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationLog integrationLog = (IntegrationLog) o;
    return Objects.equals(advertiserId, integrationLog.advertiserId) &&
        Objects.equals(appVersionNumber, integrationLog.appVersionNumber) &&
        Objects.equals(clientTimestamp, integrationLog.clientTimestamp) &&
        Objects.equals(error, integrationLog.error) &&
        Objects.equals(eventType, integrationLog.eventType) &&
        Objects.equals(externalBusinessId, integrationLog.externalBusinessId) &&
        Objects.equals(feedProfileId, integrationLog.feedProfileId) &&
        Objects.equals(logLevel, integrationLog.logLevel) &&
        Objects.equals(merchantId, integrationLog.merchantId) &&
        Objects.equals(message, integrationLog.message) &&
        Objects.equals(platformVersionNumber, integrationLog.platformVersionNumber) &&
        Objects.equals(request, integrationLog.request) &&
        Objects.equals(tagId, integrationLog.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appVersionNumber, clientTimestamp, error, eventType, externalBusinessId, feedProfileId, logLevel, merchantId, message, platformVersionNumber, request, tagId);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
