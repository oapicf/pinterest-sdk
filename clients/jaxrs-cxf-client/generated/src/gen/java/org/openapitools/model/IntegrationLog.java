package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Schema for log sent from an integration application.
 **/
@ApiModel(description="Schema for log sent from an integration application.")

public class IntegrationLog  {
  
  @ApiModelProperty(required = true, value = "Timestamp in milliseconds of when the log was executed at the client.")
 /**
   * Timestamp in milliseconds of when the log was executed at the client.
  **/
  private Integer clientTimestamp;

public enum EventTypeEnum {

APP(String.valueOf("APP")), API(String.valueOf("API"));


    private String value;

    EventTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
        for (EventTypeEnum b : EventTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "Log event type")
 /**
   * Log event type
  **/
  private EventTypeEnum eventType;

public enum LogLevelEnum {

INFO(String.valueOf("INFO")), WARN(String.valueOf("WARN")), ERROR(String.valueOf("ERROR"));


    private String value;

    LogLevelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LogLevelEnum fromValue(String value) {
        for (LogLevelEnum b : LogLevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "Log level type")
 /**
   * Log level type
  **/
  private LogLevelEnum logLevel;

  @ApiModelProperty(value = "")
  private String externalBusinessId;

  @ApiModelProperty(value = "")
  private String advertiserId;

  @ApiModelProperty(value = "")
  private String merchantId;

  @ApiModelProperty(value = "")
  private String tagId;

  @ApiModelProperty(value = "")
  private String feedProfileId;

  @ApiModelProperty(value = "Explanation of the event that occured.")
 /**
   * Explanation of the event that occured.
  **/
  private String message;

  @ApiModelProperty(value = "Version number of the integration application.")
 /**
   * Version number of the integration application.
  **/
  private String appVersionNumber;

  @ApiModelProperty(value = "Version number of the platform the integration application is running on.")
 /**
   * Version number of the platform the integration application is running on.
  **/
  private String platformVersionNumber;

  @ApiModelProperty(value = "")
  private IntegrationLogClientError error;

  @ApiModelProperty(value = "")
  private IntegrationLogClientRequest request;
 /**
   * Timestamp in milliseconds of when the log was executed at the client.
   * @return clientTimestamp
  **/
  @JsonProperty("client_timestamp")
  public Integer getClientTimestamp() {
    return clientTimestamp;
  }

  public void setClientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
  }

  public IntegrationLog clientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
    return this;
  }

 /**
   * Log event type
   * @return eventType
  **/
  @JsonProperty("event_type")
  public String getEventType() {
    if (eventType == null) {
      return null;
    }
    return eventType.value();
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public IntegrationLog eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

 /**
   * Log level type
   * @return logLevel
  **/
  @JsonProperty("log_level")
  public String getLogLevel() {
    if (logLevel == null) {
      return null;
    }
    return logLevel.value();
  }

  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  public IntegrationLog logLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
    return this;
  }

 /**
   * Get externalBusinessId
   * @return externalBusinessId
  **/
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationLog externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

 /**
   * Get advertiserId
   * @return advertiserId
  **/
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public IntegrationLog advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

 /**
   * Get merchantId
   * @return merchantId
  **/
  @JsonProperty("merchant_id")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public IntegrationLog merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

 /**
   * Get tagId
   * @return tagId
  **/
  @JsonProperty("tag_id")
  public String getTagId() {
    return tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  public IntegrationLog tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

 /**
   * Get feedProfileId
   * @return feedProfileId
  **/
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public IntegrationLog feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

 /**
   * Explanation of the event that occured.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IntegrationLog message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Version number of the integration application.
   * @return appVersionNumber
  **/
  @JsonProperty("app_version_number")
  public String getAppVersionNumber() {
    return appVersionNumber;
  }

  public void setAppVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
  }

  public IntegrationLog appVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
    return this;
  }

 /**
   * Version number of the platform the integration application is running on.
   * @return platformVersionNumber
  **/
  @JsonProperty("platform_version_number")
  public String getPlatformVersionNumber() {
    return platformVersionNumber;
  }

  public void setPlatformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
  }

  public IntegrationLog platformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public IntegrationLogClientError getError() {
    return error;
  }

  public void setError(IntegrationLogClientError error) {
    this.error = error;
  }

  public IntegrationLog error(IntegrationLogClientError error) {
    this.error = error;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public IntegrationLogClientRequest getRequest() {
    return request;
  }

  public void setRequest(IntegrationLogClientRequest request) {
    this.request = request;
  }

  public IntegrationLog request(IntegrationLogClientRequest request) {
    this.request = request;
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
    IntegrationLog integrationLog = (IntegrationLog) o;
    return Objects.equals(this.clientTimestamp, integrationLog.clientTimestamp) &&
        Objects.equals(this.eventType, integrationLog.eventType) &&
        Objects.equals(this.logLevel, integrationLog.logLevel) &&
        Objects.equals(this.externalBusinessId, integrationLog.externalBusinessId) &&
        Objects.equals(this.advertiserId, integrationLog.advertiserId) &&
        Objects.equals(this.merchantId, integrationLog.merchantId) &&
        Objects.equals(this.tagId, integrationLog.tagId) &&
        Objects.equals(this.feedProfileId, integrationLog.feedProfileId) &&
        Objects.equals(this.message, integrationLog.message) &&
        Objects.equals(this.appVersionNumber, integrationLog.appVersionNumber) &&
        Objects.equals(this.platformVersionNumber, integrationLog.platformVersionNumber) &&
        Objects.equals(this.error, integrationLog.error) &&
        Objects.equals(this.request, integrationLog.request);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

