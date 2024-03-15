package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Schema for log sent from an integration application.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLog   {
  
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
  }

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

