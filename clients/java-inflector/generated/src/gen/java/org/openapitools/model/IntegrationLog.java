package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;



/**
 * Schema for log sent from an integration application.
 **/

@ApiModel(description = "Schema for log sent from an integration application.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLog   {
  @JsonProperty("client_timestamp")
  private Integer clientTimestamp;

  /**
   * Log event type
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("event_type")
  private EventTypeEnum eventType;

  /**
   * Log level type
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static LogLevelEnum fromValue(String text) {
      for (LogLevelEnum b : LogLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("log_level")
  private LogLevelEnum logLevel;

  @JsonProperty("external_business_id")
  private String externalBusinessId;

  @JsonProperty("advertiser_id")
  private String advertiserId;

  @JsonProperty("merchant_id")
  private String merchantId;

  @JsonProperty("tag_id")
  private String tagId;

  @JsonProperty("feed_profile_id")
  private String feedProfileId;

  @JsonProperty("message")
  private String message;

  @JsonProperty("app_version_number")
  private String appVersionNumber;

  @JsonProperty("platform_version_number")
  private String platformVersionNumber;

  @JsonProperty("error")
  private IntegrationLogClientError error;

  @JsonProperty("request")
  private IntegrationLogClientRequest request;

  /**
   * Timestamp in milliseconds of when the log was executed at the client.
   **/
  public IntegrationLog clientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Timestamp in milliseconds of when the log was executed at the client.")
  @JsonProperty("client_timestamp")
  public Integer getClientTimestamp() {
    return clientTimestamp;
  }
  public void setClientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
  }

  /**
   * Log event type
   **/
  public IntegrationLog eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Log event type")
  @JsonProperty("event_type")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  /**
   * Log level type
   **/
  public IntegrationLog logLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Log level type")
  @JsonProperty("log_level")
  public LogLevelEnum getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  /**
   **/
  public IntegrationLog externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }
  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   **/
  public IntegrationLog advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   **/
  public IntegrationLog merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("merchant_id")
  public String getMerchantId() {
    return merchantId;
  }
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   **/
  public IntegrationLog tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tag_id")
  public String getTagId() {
    return tagId;
  }
  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  /**
   **/
  public IntegrationLog feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  /**
   * Explanation of the event that occured.
   **/
  public IntegrationLog message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Explanation of the event that occured.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Version number of the integration application.
   **/
  public IntegrationLog appVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Version number of the integration application.")
  @JsonProperty("app_version_number")
  public String getAppVersionNumber() {
    return appVersionNumber;
  }
  public void setAppVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
  }

  /**
   * Version number of the platform the integration application is running on.
   **/
  public IntegrationLog platformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Version number of the platform the integration application is running on.")
  @JsonProperty("platform_version_number")
  public String getPlatformVersionNumber() {
    return platformVersionNumber;
  }
  public void setPlatformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
  }

  /**
   **/
  public IntegrationLog error(IntegrationLogClientError error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("error")
  public IntegrationLogClientError getError() {
    return error;
  }
  public void setError(IntegrationLogClientError error) {
    this.error = error;
  }

  /**
   **/
  public IntegrationLog request(IntegrationLogClientRequest request) {
    this.request = request;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

