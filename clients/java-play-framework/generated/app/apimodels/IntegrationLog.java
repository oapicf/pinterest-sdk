package apimodels;

import apimodels.IntegrationLogClientError;
import apimodels.IntegrationLogClientRequest;
import apimodels.IntegrationLogEventType;
import apimodels.IntegrationLogLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Schema for log sent from an integration application.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IntegrationLog   {
  @JsonProperty("advertiser_id")
  @Size(max=128)

  private String advertiserId;

  @JsonProperty("app_version_number")
  @Size(max=20)

  private String appVersionNumber;

  @JsonProperty("client_timestamp")
  @NotNull

  private Integer clientTimestamp;

  @JsonProperty("error")
  @Valid

  private IntegrationLogClientError error;

  @JsonProperty("event_type")
  @NotNull
@Valid

  private IntegrationLogEventType eventType;

  @JsonProperty("external_business_id")
  @Size(max=2048)

  private String externalBusinessId;

  @JsonProperty("feed_profile_id")
  @Size(max=128)

  private String feedProfileId;

  @JsonProperty("log_level")
  @NotNull
@Valid

  private IntegrationLogLevel logLevel;

  @JsonProperty("merchant_id")
  @Size(max=128)

  private String merchantId;

  @JsonProperty("message")
  @Size(max=8192)

  private String message;

  @JsonProperty("platform_version_number")
  @Size(max=20)

  private String platformVersionNumber;

  @JsonProperty("request")
  @Valid

  private IntegrationLogClientRequest request;

  @JsonProperty("tag_id")
  @Size(max=128)

  private String tagId;

  public IntegrationLog advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public IntegrationLog appVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
    return this;
  }

   /**
   * Version number of the integration application.
   * @return appVersionNumber
  **/
  public String getAppVersionNumber() {
    return appVersionNumber;
  }

  public void setAppVersionNumber(String appVersionNumber) {
    this.appVersionNumber = appVersionNumber;
  }

  public IntegrationLog clientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
    return this;
  }

   /**
   * Timestamp in milliseconds of when the log was executed at the client.
   * @return clientTimestamp
  **/
  public Integer getClientTimestamp() {
    return clientTimestamp;
  }

  public void setClientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
  }

  public IntegrationLog error(IntegrationLogClientError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public IntegrationLogClientError getError() {
    return error;
  }

  public void setError(IntegrationLogClientError error) {
    this.error = error;
  }

  public IntegrationLog eventType(IntegrationLogEventType eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Log event type
   * @return eventType
  **/
  public IntegrationLogEventType getEventType() {
    return eventType;
  }

  public void setEventType(IntegrationLogEventType eventType) {
    this.eventType = eventType;
  }

  public IntegrationLog externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

   /**
   * Get externalBusinessId
   * @return externalBusinessId
  **/
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationLog feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

   /**
   * Get feedProfileId
   * @return feedProfileId
  **/
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public IntegrationLog logLevel(IntegrationLogLevel logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Log level type
   * @return logLevel
  **/
  public IntegrationLogLevel getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(IntegrationLogLevel logLevel) {
    this.logLevel = logLevel;
  }

  public IntegrationLog merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public IntegrationLog message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Explanation of the event that occured.
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IntegrationLog platformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
    return this;
  }

   /**
   * Version number of the platform the integration application is running on.
   * @return platformVersionNumber
  **/
  public String getPlatformVersionNumber() {
    return platformVersionNumber;
  }

  public void setPlatformVersionNumber(String platformVersionNumber) {
    this.platformVersionNumber = platformVersionNumber;
  }

  public IntegrationLog request(IntegrationLogClientRequest request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  public IntegrationLogClientRequest getRequest() {
    return request;
  }

  public void setRequest(IntegrationLogClientRequest request) {
    this.request = request;
  }

  public IntegrationLog tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

