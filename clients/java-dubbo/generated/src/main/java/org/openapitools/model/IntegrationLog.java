package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;
import org.openapitools.model.IntegrationLogEventType;
import org.openapitools.model.IntegrationLogLevel;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Schema for log sent from an integration application.
 */
public class IntegrationLog implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("advertiser_id")
  private String advertiserId;

  /**
   * Version number of the integration application.
   */
  @JsonProperty("app_version_number")
  private String appVersionNumber;

  /**
   * Timestamp in milliseconds of when the log was executed at the client.
   */
  @JsonProperty("client_timestamp")
  private Integer clientTimestamp;

  @JsonProperty("error")
  private IntegrationLogClientError error;

  /**
   * Log event type
   */
  @JsonProperty("event_type")
  private IntegrationLogEventType eventType;

  @JsonProperty("external_business_id")
  private String externalBusinessId;

  @JsonProperty("feed_profile_id")
  private String feedProfileId;

  /**
   * Log level type
   */
  @JsonProperty("log_level")
  private IntegrationLogLevel logLevel;

  @JsonProperty("merchant_id")
  private String merchantId;

  /**
   * Explanation of the event that occured.
   */
  @JsonProperty("message")
  private String message;

  /**
   * Version number of the platform the integration application is running on.
   */
  @JsonProperty("platform_version_number")
  private String platformVersionNumber;

  @JsonProperty("request")
  private IntegrationLogClientRequest request;

  @JsonProperty("tag_id")
  private String tagId;

  /**
   * 
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
   * 
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
   * 
   * @return externalBusinessId
   */
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   * 
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
   * 
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
   * 
   * @return request
   */
  public IntegrationLogClientRequest getRequest() {
    return request;
  }

  public void setRequest(IntegrationLogClientRequest request) {
    this.request = request;
  }

  /**
   * 
   * @return tagId
   */
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
    return Objects.equals(this.advertiserId, integrationLog.advertiserId) &&
        Objects.equals(this.appVersionNumber, integrationLog.appVersionNumber) &&
        Objects.equals(this.clientTimestamp, integrationLog.clientTimestamp) &&
        Objects.equals(this.error, integrationLog.error) &&
        Objects.equals(this.eventType, integrationLog.eventType) &&
        Objects.equals(this.externalBusinessId, integrationLog.externalBusinessId) &&
        Objects.equals(this.feedProfileId, integrationLog.feedProfileId) &&
        Objects.equals(this.logLevel, integrationLog.logLevel) &&
        Objects.equals(this.merchantId, integrationLog.merchantId) &&
        Objects.equals(this.message, integrationLog.message) &&
        Objects.equals(this.platformVersionNumber, integrationLog.platformVersionNumber) &&
        Objects.equals(this.request, integrationLog.request) &&
        Objects.equals(this.tagId, integrationLog.tagId);
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
