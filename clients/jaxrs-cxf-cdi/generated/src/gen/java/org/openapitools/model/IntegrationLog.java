package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Schema for log sent from an integration application.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Schema for log sent from an integration application.")
public class IntegrationLog   {
  
  private Integer clientTimestamp;


public enum EventTypeEnum {

    @JsonProperty("APP") APP(String.valueOf("APP")), @JsonProperty("API") API(String.valueOf("API"));


    private String value;

    EventTypeEnum(String v) {
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

  private EventTypeEnum eventType;


public enum LogLevelEnum {

    @JsonProperty("INFO") INFO(String.valueOf("INFO")), @JsonProperty("WARN") WARN(String.valueOf("WARN")), @JsonProperty("ERROR") ERROR(String.valueOf("ERROR"));


    private String value;

    LogLevelEnum(String v) {
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

  /**
   * Timestamp in milliseconds of when the log was executed at the client.
   **/
  public IntegrationLog clientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Timestamp in milliseconds of when the log was executed at the client.")
  @JsonProperty("client_timestamp")
  @NotNull
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
  @NotNull
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
  @NotNull
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
 @Size(max=2048)  public String getExternalBusinessId() {
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
 @Size(max=128)  public String getAdvertiserId() {
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
 @Size(max=128)  public String getMerchantId() {
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
 @Size(max=128)  public String getTagId() {
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
 @Size(max=128)  public String getFeedProfileId() {
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
 @Size(max=2048)  public String getMessage() {
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
 @Size(max=20)  public String getAppVersionNumber() {
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
 @Size(max=20)  public String getPlatformVersionNumber() {
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

