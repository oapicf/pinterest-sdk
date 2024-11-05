package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Schema for log sent from an integration application.
 */

@Schema(name = "IntegrationLog", description = "Schema for log sent from an integration application.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IntegrationLog {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
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

  private JsonNullable<@Size(max = 2048) String> externalBusinessId = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 128) String> advertiserId = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 128) String> merchantId = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 128) String> tagId = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 128) String> feedProfileId = JsonNullable.<String>undefined();

  private String message;

  private String appVersionNumber;

  private String platformVersionNumber;

  private IntegrationLogClientError error;

  private IntegrationLogClientRequest request;

  public IntegrationLog() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntegrationLog(Integer clientTimestamp, EventTypeEnum eventType, LogLevelEnum logLevel) {
    this.clientTimestamp = clientTimestamp;
    this.eventType = eventType;
    this.logLevel = logLevel;
  }

  public IntegrationLog clientTimestamp(Integer clientTimestamp) {
    this.clientTimestamp = clientTimestamp;
    return this;
  }

  /**
   * Timestamp in milliseconds of when the log was executed at the client.
   * @return clientTimestamp
   */
  @NotNull 
  @Schema(name = "client_timestamp", description = "Timestamp in milliseconds of when the log was executed at the client.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("client_timestamp")
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
   */
  @NotNull 
  @Schema(name = "event_type", description = "Log event type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_type")
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
   */
  @NotNull 
  @Schema(name = "log_level", description = "Log level type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("log_level")
  public LogLevelEnum getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  public IntegrationLog externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = JsonNullable.of(externalBusinessId);
    return this;
  }

  /**
   * Get externalBusinessId
   * @return externalBusinessId
   */
  @Size(max = 2048) 
  @Schema(name = "external_business_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_business_id")
  public JsonNullable<@Size(max = 2048) String> getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(JsonNullable<String> externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationLog advertiserId(String advertiserId) {
    this.advertiserId = JsonNullable.of(advertiserId);
    return this;
  }

  /**
   * Get advertiserId
   * @return advertiserId
   */
  @Size(max = 128) 
  @Schema(name = "advertiser_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advertiser_id")
  public JsonNullable<@Size(max = 128) String> getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(JsonNullable<String> advertiserId) {
    this.advertiserId = advertiserId;
  }

  public IntegrationLog merchantId(String merchantId) {
    this.merchantId = JsonNullable.of(merchantId);
    return this;
  }

  /**
   * Get merchantId
   * @return merchantId
   */
  @Size(max = 128) 
  @Schema(name = "merchant_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchant_id")
  public JsonNullable<@Size(max = 128) String> getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(JsonNullable<String> merchantId) {
    this.merchantId = merchantId;
  }

  public IntegrationLog tagId(String tagId) {
    this.tagId = JsonNullable.of(tagId);
    return this;
  }

  /**
   * Get tagId
   * @return tagId
   */
  @Size(max = 128) 
  @Schema(name = "tag_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag_id")
  public JsonNullable<@Size(max = 128) String> getTagId() {
    return tagId;
  }

  public void setTagId(JsonNullable<String> tagId) {
    this.tagId = tagId;
  }

  public IntegrationLog feedProfileId(String feedProfileId) {
    this.feedProfileId = JsonNullable.of(feedProfileId);
    return this;
  }

  /**
   * Get feedProfileId
   * @return feedProfileId
   */
  @Size(max = 128) 
  @Schema(name = "feed_profile_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feed_profile_id")
  public JsonNullable<@Size(max = 128) String> getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(JsonNullable<String> feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public IntegrationLog message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Explanation of the event that occured.
   * @return message
   */
  @Size(max = 2048) 
  @Schema(name = "message", description = "Explanation of the event that occured.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
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
   */
  @Size(max = 20) 
  @Schema(name = "app_version_number", description = "Version number of the integration application.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_version_number")
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
   */
  @Size(max = 20) 
  @Schema(name = "platform_version_number", description = "Version number of the platform the integration application is running on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform_version_number")
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
   */
  @Valid 
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
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
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.externalBusinessId, integrationLog.externalBusinessId) &&
        equalsNullable(this.advertiserId, integrationLog.advertiserId) &&
        equalsNullable(this.merchantId, integrationLog.merchantId) &&
        equalsNullable(this.tagId, integrationLog.tagId) &&
        equalsNullable(this.feedProfileId, integrationLog.feedProfileId) &&
        Objects.equals(this.message, integrationLog.message) &&
        Objects.equals(this.appVersionNumber, integrationLog.appVersionNumber) &&
        Objects.equals(this.platformVersionNumber, integrationLog.platformVersionNumber) &&
        Objects.equals(this.error, integrationLog.error) &&
        Objects.equals(this.request, integrationLog.request);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientTimestamp, eventType, logLevel, hashCodeNullable(externalBusinessId), hashCodeNullable(advertiserId), hashCodeNullable(merchantId), hashCodeNullable(tagId), hashCodeNullable(feedProfileId), message, appVersionNumber, platformVersionNumber, error, request);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

