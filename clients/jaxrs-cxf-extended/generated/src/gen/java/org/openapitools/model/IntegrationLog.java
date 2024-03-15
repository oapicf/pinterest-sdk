package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Schema for log sent from an integration application.
 */
@ApiModel(description="Schema for log sent from an integration application.")

public class IntegrationLog  {
  
 /**
  * Timestamp in milliseconds of when the log was executed at the client.
  */
  @ApiModelProperty(required = true, value = "Timestamp in milliseconds of when the log was executed at the client.")
  private Integer clientTimestamp;

public enum EventTypeEnum {

    @JsonProperty("APP") APP(String.valueOf("APP")),
    @JsonProperty("API") API(String.valueOf("API"));

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

 /**
  * Log event type
  */
  @ApiModelProperty(required = true, value = "Log event type")
  private EventTypeEnum eventType;

public enum LogLevelEnum {

    @JsonProperty("INFO") INFO(String.valueOf("INFO")),
    @JsonProperty("WARN") WARN(String.valueOf("WARN")),
    @JsonProperty("ERROR") ERROR(String.valueOf("ERROR"));

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

 /**
  * Log level type
  */
  @ApiModelProperty(required = true, value = "Log level type")
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

 /**
  * Explanation of the event that occured.
  */
  @ApiModelProperty(value = "Explanation of the event that occured.")
  private String message;

 /**
  * Version number of the integration application.
  */
  @ApiModelProperty(value = "Version number of the integration application.")
  private String appVersionNumber;

 /**
  * Version number of the platform the integration application is running on.
  */
  @ApiModelProperty(value = "Version number of the platform the integration application is running on.")
  private String platformVersionNumber;

  @ApiModelProperty(value = "")
  @Valid
  private IntegrationLogClientError error;

  @ApiModelProperty(value = "")
  @Valid
  private IntegrationLogClientRequest request;
 /**
  * Timestamp in milliseconds of when the log was executed at the client.
  * @return clientTimestamp
  */
  @JsonProperty("client_timestamp")
  @NotNull
  public Integer getClientTimestamp() {
    return clientTimestamp;
  }

  /**
   * Sets the <code>clientTimestamp</code> property.
   */
 public void setClientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
  }

  /**
   * Sets the <code>clientTimestamp</code> property.
   */
  public IntegrationLog clientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
    return this;
  }

 /**
  * Log event type
  * @return eventType
  */
  @JsonProperty("event_type")
  @NotNull
  public String getEventType() {
    return eventType == null ? null : eventType.value();
  }

  /**
   * Sets the <code>eventType</code> property.
   */
 public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  /**
   * Sets the <code>eventType</code> property.
   */
  public IntegrationLog eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

 /**
  * Log level type
  * @return logLevel
  */
  @JsonProperty("log_level")
  @NotNull
  public String getLogLevel() {
    return logLevel == null ? null : logLevel.value();
  }

  /**
   * Sets the <code>logLevel</code> property.
   */
 public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  /**
   * Sets the <code>logLevel</code> property.
   */
  public IntegrationLog logLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
    return this;
  }

 /**
  * Get externalBusinessId
  * @return externalBusinessId
  */
  @JsonProperty("external_business_id")
 @Size(max=2048)  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  /**
   * Sets the <code>externalBusinessId</code> property.
   */
 public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   * Sets the <code>externalBusinessId</code> property.
   */
  public IntegrationLog externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

 /**
  * Get advertiserId
  * @return advertiserId
  */
  @JsonProperty("advertiser_id")
 @Size(max=128)  public String getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Sets the <code>advertiserId</code> property.
   */
 public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   * Sets the <code>advertiserId</code> property.
   */
  public IntegrationLog advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

 /**
  * Get merchantId
  * @return merchantId
  */
  @JsonProperty("merchant_id")
 @Size(max=128)  public String getMerchantId() {
    return merchantId;
  }

  /**
   * Sets the <code>merchantId</code> property.
   */
 public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * Sets the <code>merchantId</code> property.
   */
  public IntegrationLog merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

 /**
  * Get tagId
  * @return tagId
  */
  @JsonProperty("tag_id")
 @Size(max=128)  public String getTagId() {
    return tagId;
  }

  /**
   * Sets the <code>tagId</code> property.
   */
 public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  /**
   * Sets the <code>tagId</code> property.
   */
  public IntegrationLog tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

 /**
  * Get feedProfileId
  * @return feedProfileId
  */
  @JsonProperty("feed_profile_id")
 @Size(max=128)  public String getFeedProfileId() {
    return feedProfileId;
  }

  /**
   * Sets the <code>feedProfileId</code> property.
   */
 public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  /**
   * Sets the <code>feedProfileId</code> property.
   */
  public IntegrationLog feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

 /**
  * Explanation of the event that occured.
  * @return message
  */
  @JsonProperty("message")
 @Size(max=2048)  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public IntegrationLog message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Version number of the integration application.
  * @return appVersionNumber
  */
  @JsonProperty("app_version_number")
 @Size(max=20)  public String getAppVersionNumber() {
    return appVersionNumber;
  }

  /**
   * Sets the <code>appVersionNumber</code> property.
   */
 public void setAppVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
  }

  /**
   * Sets the <code>appVersionNumber</code> property.
   */
  public IntegrationLog appVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
    return this;
  }

 /**
  * Version number of the platform the integration application is running on.
  * @return platformVersionNumber
  */
  @JsonProperty("platform_version_number")
 @Size(max=20)  public String getPlatformVersionNumber() {
    return platformVersionNumber;
  }

  /**
   * Sets the <code>platformVersionNumber</code> property.
   */
 public void setPlatformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
  }

  /**
   * Sets the <code>platformVersionNumber</code> property.
   */
  public IntegrationLog platformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
    return this;
  }

 /**
  * Get error
  * @return error
  */
  @JsonProperty("error")
  public IntegrationLogClientError getError() {
    return error;
  }

  /**
   * Sets the <code>error</code> property.
   */
 public void setError(IntegrationLogClientError error) {
    this.error = error;
  }

  /**
   * Sets the <code>error</code> property.
   */
  public IntegrationLog error(IntegrationLogClientError error) {
    this.error = error;
    return this;
  }

 /**
  * Get request
  * @return request
  */
  @JsonProperty("request")
  public IntegrationLogClientRequest getRequest() {
    return request;
  }

  /**
   * Sets the <code>request</code> property.
   */
 public void setRequest(IntegrationLogClientRequest request) {
    this.request = request;
  }

  /**
   * Sets the <code>request</code> property.
   */
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

