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
 */
@ApiModel(description = "Schema for log sent from an integration application.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

  public IntegrationLog clientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
    return this;
  }

   /**
   * Timestamp in milliseconds of when the log was executed at the client.
   * @return clientTimestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp in milliseconds of when the log was executed at the client.")
  public Integer getClientTimestamp() {
    return clientTimestamp;
  }

  public void setClientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
  }

  public IntegrationLog eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Log event type
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "Log event type")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public IntegrationLog logLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Log level type
   * @return logLevel
  **/
  @ApiModelProperty(required = true, value = "Log level type")
  public LogLevelEnum getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  public IntegrationLog externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

   /**
   * Get externalBusinessId
   * @return externalBusinessId
  **/
  @ApiModelProperty(value = "")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationLog advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @ApiModelProperty(value = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public IntegrationLog merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(value = "")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public IntegrationLog tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @ApiModelProperty(value = "")
  public String getTagId() {
    return tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  public IntegrationLog feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

   /**
   * Get feedProfileId
   * @return feedProfileId
  **/
  @ApiModelProperty(value = "")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public IntegrationLog message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Explanation of the event that occured.
   * @return message
  **/
  @ApiModelProperty(value = "Explanation of the event that occured.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IntegrationLog appVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
    return this;
  }

   /**
   * Version number of the integration application.
   * @return appVersionNumber
  **/
  @ApiModelProperty(value = "Version number of the integration application.")
  public String getAppVersionNumber() {
    return appVersionNumber;
  }

  public void setAppVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
  }

  public IntegrationLog platformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
    return this;
  }

   /**
   * Version number of the platform the integration application is running on.
   * @return platformVersionNumber
  **/
  @ApiModelProperty(value = "Version number of the platform the integration application is running on.")
  public String getPlatformVersionNumber() {
    return platformVersionNumber;
  }

  public void setPlatformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
  }

  public IntegrationLog error(IntegrationLogClientError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public IntegrationLogClientError getError() {
    return error;
  }

  public void setError(IntegrationLogClientError error) {
    this.error = error;
  }

  public IntegrationLog request(IntegrationLogClientRequest request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

