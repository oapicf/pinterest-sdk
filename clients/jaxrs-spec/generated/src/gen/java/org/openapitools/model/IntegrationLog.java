package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;
import org.openapitools.model.IntegrationLogEventType;
import org.openapitools.model.IntegrationLogLevel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Schema for log sent from an integration application.
 **/
@ApiModel(description = "Schema for log sent from an integration application.")
@JsonTypeName("IntegrationLog")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public IntegrationLog() {
  }

  @JsonCreator
  public IntegrationLog(
    @JsonProperty(required = true, value = "client_timestamp") Integer clientTimestamp,
    @JsonProperty(required = true, value = "event_type") IntegrationLogEventType eventType,
    @JsonProperty(required = true, value = "log_level") IntegrationLogLevel logLevel
  ) {
    this.clientTimestamp = clientTimestamp;
    this.eventType = eventType;
    this.logLevel = logLevel;
  }

  /**
   **/
  public IntegrationLog advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("advertiser_id")
   @Size(max=128)public String getAdvertiserId() {
    return advertiserId;
  }

  @JsonProperty("advertiser_id")
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
   @Size(max=20)public String getAppVersionNumber() {
    return appVersionNumber;
  }

  @JsonProperty("app_version_number")
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
  @JsonProperty(required = true, value = "client_timestamp")
  @NotNull public Integer getClientTimestamp() {
    return clientTimestamp;
  }

  @JsonProperty(required = true, value = "client_timestamp")
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
  @Valid public IntegrationLogClientError getError() {
    return error;
  }

  @JsonProperty("error")
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
  @JsonProperty(required = true, value = "event_type")
  @NotNull public IntegrationLogEventType getEventType() {
    return eventType;
  }

  @JsonProperty(required = true, value = "event_type")
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
   @Size(max=2048)public String getExternalBusinessId() {
    return externalBusinessId;
  }

  @JsonProperty("external_business_id")
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
   @Size(max=128)public String getFeedProfileId() {
    return feedProfileId;
  }

  @JsonProperty("feed_profile_id")
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
  @JsonProperty(required = true, value = "log_level")
  @NotNull public IntegrationLogLevel getLogLevel() {
    return logLevel;
  }

  @JsonProperty(required = true, value = "log_level")
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
   @Size(max=128)public String getMerchantId() {
    return merchantId;
  }

  @JsonProperty("merchant_id")
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
   @Size(max=8192)public String getMessage() {
    return message;
  }

  @JsonProperty("message")
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
   @Size(max=20)public String getPlatformVersionNumber() {
    return platformVersionNumber;
  }

  @JsonProperty("platform_version_number")
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
  @Valid public IntegrationLogClientRequest getRequest() {
    return request;
  }

  @JsonProperty("request")
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
   @Size(max=128)public String getTagId() {
    return tagId;
  }

  @JsonProperty("tag_id")
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
