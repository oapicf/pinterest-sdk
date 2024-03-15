package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.IntegrationLogClientError;
import org.openapitools.server.api.model.IntegrationLogClientRequest;

/**
 * Schema for log sent from an integration application.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntegrationLog   {
  
  private Integer clientTimestamp;


  public enum EventTypeEnum {
    APP("APP"),
    API("API");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EventTypeEnum eventType;


  public enum LogLevelEnum {
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR");

    private String value;

    LogLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LogLevelEnum logLevel;
  private String externalBusinessId;
  private String advertiserId;
  private String merchantId;
  private String tagId;
  private String feedProfileId;
  private String message;
  private String appVersionNumber;
  private String platformVersionNumber;
  private IntegrationLogClientError error;
  private IntegrationLogClientRequest request;

  public IntegrationLog () {

  }

  public IntegrationLog (Integer clientTimestamp, EventTypeEnum eventType, LogLevelEnum logLevel, String externalBusinessId, String advertiserId, String merchantId, String tagId, String feedProfileId, String message, String appVersionNumber, String platformVersionNumber, IntegrationLogClientError error, IntegrationLogClientRequest request) {
    this.clientTimestamp = clientTimestamp;
    this.eventType = eventType;
    this.logLevel = logLevel;
    this.externalBusinessId = externalBusinessId;
    this.advertiserId = advertiserId;
    this.merchantId = merchantId;
    this.tagId = tagId;
    this.feedProfileId = feedProfileId;
    this.message = message;
    this.appVersionNumber = appVersionNumber;
    this.platformVersionNumber = platformVersionNumber;
    this.error = error;
    this.request = request;
  }

    
  @JsonProperty("client_timestamp")
  public Integer getClientTimestamp() {
    return clientTimestamp;
  }
  public void setClientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
  }

    
  @JsonProperty("event_type")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

    
  @JsonProperty("log_level")
  public LogLevelEnum getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

    
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }
  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

    
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

    
  @JsonProperty("merchant_id")
  public String getMerchantId() {
    return merchantId;
  }
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

    
  @JsonProperty("tag_id")
  public String getTagId() {
    return tagId;
  }
  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

    
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
  @JsonProperty("app_version_number")
  public String getAppVersionNumber() {
    return appVersionNumber;
  }
  public void setAppVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
  }

    
  @JsonProperty("platform_version_number")
  public String getPlatformVersionNumber() {
    return platformVersionNumber;
  }
  public void setPlatformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
  }

    
  @JsonProperty("error")
  public IntegrationLogClientError getError() {
    return error;
  }
  public void setError(IntegrationLogClientError error) {
    this.error = error;
  }

    
  @JsonProperty("request")
  public IntegrationLogClientRequest getRequest() {
    return request;
  }
  public void setRequest(IntegrationLogClientRequest request) {
    this.request = request;
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
    return Objects.equals(clientTimestamp, integrationLog.clientTimestamp) &&
        Objects.equals(eventType, integrationLog.eventType) &&
        Objects.equals(logLevel, integrationLog.logLevel) &&
        Objects.equals(externalBusinessId, integrationLog.externalBusinessId) &&
        Objects.equals(advertiserId, integrationLog.advertiserId) &&
        Objects.equals(merchantId, integrationLog.merchantId) &&
        Objects.equals(tagId, integrationLog.tagId) &&
        Objects.equals(feedProfileId, integrationLog.feedProfileId) &&
        Objects.equals(message, integrationLog.message) &&
        Objects.equals(appVersionNumber, integrationLog.appVersionNumber) &&
        Objects.equals(platformVersionNumber, integrationLog.platformVersionNumber) &&
        Objects.equals(error, integrationLog.error) &&
        Objects.equals(request, integrationLog.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientTimestamp, eventType, logLevel, externalBusinessId, advertiserId, merchantId, tagId, feedProfileId, message, appVersionNumber, platformVersionNumber, error, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLog {\n");
    
    sb.append("    clientTimestamp: ").append(toIndentedString(clientTimestamp)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    appVersionNumber: ").append(toIndentedString(appVersionNumber)).append("\n");
    sb.append("    platformVersionNumber: ").append(toIndentedString(platformVersionNumber)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
