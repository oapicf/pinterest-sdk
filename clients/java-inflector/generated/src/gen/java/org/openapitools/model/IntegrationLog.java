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
import org.openapitools.model.IntegrationLogEventType;
import org.openapitools.model.IntegrationLogLevel;



/**
 * Schema for log sent from an integration application.
 **/

@ApiModel(description = "Schema for log sent from an integration application.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationLog   {
  @JsonProperty("advertiser_id")
  private String advertiserId;

  @JsonProperty("app_version_number")
  private String appVersionNumber;

  @JsonProperty("client_timestamp")
  private Integer clientTimestamp;

  @JsonProperty("error")
  private IntegrationLogClientError error;

  @JsonProperty("event_type")
  private IntegrationLogEventType eventType;

  @JsonProperty("external_business_id")
  private String externalBusinessId;

  @JsonProperty("feed_profile_id")
  private String feedProfileId;

  @JsonProperty("log_level")
  private IntegrationLogLevel logLevel;

  @JsonProperty("merchant_id")
  private String merchantId;

  @JsonProperty("message")
  private String message;

  @JsonProperty("platform_version_number")
  private String platformVersionNumber;

  @JsonProperty("request")
  private IntegrationLogClientRequest request;

  @JsonProperty("tag_id")
  private String tagId;

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
   * Log event type
   **/
  public IntegrationLog eventType(IntegrationLogEventType eventType) {
    this.eventType = eventType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Log event type")
  @JsonProperty("event_type")
  public IntegrationLogEventType getEventType() {
    return eventType;
  }
  public void setEventType(IntegrationLogEventType eventType) {
    this.eventType = eventType;
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
   * Log level type
   **/
  public IntegrationLog logLevel(IntegrationLogLevel logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Log level type")
  @JsonProperty("log_level")
  public IntegrationLogLevel getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(IntegrationLogLevel logLevel) {
    this.logLevel = logLevel;
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

