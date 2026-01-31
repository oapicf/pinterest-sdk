package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdAccountCreateSubscriptionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdAccountCreateSubscriptionResponse {

  private @Nullable String adAccountId;

  private @Nullable String apiVersion;

  private @Nullable Integer createdTime;

  private JsonNullable<String> cryptographicAlgorithm = JsonNullable.<String>undefined();

  private JsonNullable<String> cryptographicKey = JsonNullable.<String>undefined();

  private @Nullable String id;

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> leadFormId = JsonNullable.<String>undefined();

  private @Nullable String userAccountId;

  private @Nullable String webhookUrl;

  public AdAccountCreateSubscriptionResponse adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885176", description = "The Ad Account ID that this lead form belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountCreateSubscriptionResponse apiVersion(@Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API version.
   * @return apiVersion
   */
  
  @Schema(name = "api_version", example = "v5", description = "API version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_version")
  public @Nullable String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public AdAccountCreateSubscriptionResponse createdTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Subscription creation time. Unix timestamp in milliseconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", example = "1699209842000", description = "Subscription creation time. Unix timestamp in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public @Nullable Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdAccountCreateSubscriptionResponse cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = JsonNullable.of(cryptographicAlgorithm);
    return this;
  }

  /**
   * Lead data encryption algorithm.
   * @return cryptographicAlgorithm
   */
  
  @Schema(name = "cryptographic_algorithm", example = "AES-256-GCM", description = "Lead data encryption algorithm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cryptographic_algorithm")
  public JsonNullable<String> getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  public void setCryptographicAlgorithm(JsonNullable<String> cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  public AdAccountCreateSubscriptionResponse cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = JsonNullable.of(cryptographicKey);
    return this;
  }

  /**
   * Base64 encoded key for client to decrypt lead data.
   * @return cryptographicKey
   */
  
  @Schema(name = "cryptographic_key", example = "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54", description = "Base64 encoded key for client to decrypt lead data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cryptographic_key")
  public JsonNullable<String> getCryptographicKey() {
    return cryptographicKey;
  }

  public void setCryptographicKey(JsonNullable<String> cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  public AdAccountCreateSubscriptionResponse id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Subscription ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "8078432025948590686", description = "Subscription ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public AdAccountCreateSubscriptionResponse leadFormId(String leadFormId) {
    this.leadFormId = JsonNullable.of(leadFormId);
    return this;
  }

  /**
   * Lead form ID.
   * @return leadFormId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "lead_form_id", example = "383791336903426390", description = "Lead form ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead_form_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(JsonNullable<String> leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdAccountCreateSubscriptionResponse userAccountId(@Nullable String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

  /**
   * User account used to subscribe lead data.
   * @return userAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "user_account_id", example = "549755885175", description = "User account used to subscribe lead data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_account_id")
  public @Nullable String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(@Nullable String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public AdAccountCreateSubscriptionResponse webhookUrl(@Nullable String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
   */
  
  @Schema(name = "webhook_url", example = "https://webhook.example.com/xyz", description = "Standard HTTPS webhook URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webhook_url")
  public @Nullable String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(@Nullable String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountCreateSubscriptionResponse adAccountCreateSubscriptionResponse = (AdAccountCreateSubscriptionResponse) o;
    return Objects.equals(this.adAccountId, adAccountCreateSubscriptionResponse.adAccountId) &&
        Objects.equals(this.apiVersion, adAccountCreateSubscriptionResponse.apiVersion) &&
        Objects.equals(this.createdTime, adAccountCreateSubscriptionResponse.createdTime) &&
        equalsNullable(this.cryptographicAlgorithm, adAccountCreateSubscriptionResponse.cryptographicAlgorithm) &&
        equalsNullable(this.cryptographicKey, adAccountCreateSubscriptionResponse.cryptographicKey) &&
        Objects.equals(this.id, adAccountCreateSubscriptionResponse.id) &&
        equalsNullable(this.leadFormId, adAccountCreateSubscriptionResponse.leadFormId) &&
        Objects.equals(this.userAccountId, adAccountCreateSubscriptionResponse.userAccountId) &&
        Objects.equals(this.webhookUrl, adAccountCreateSubscriptionResponse.webhookUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, apiVersion, createdTime, hashCodeNullable(cryptographicAlgorithm), hashCodeNullable(cryptographicKey), id, hashCodeNullable(leadFormId), userAccountId, webhookUrl);
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
    sb.append("class AdAccountCreateSubscriptionResponse {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    cryptographicAlgorithm: ").append(toIndentedString(cryptographicAlgorithm)).append("\n");
    sb.append("    cryptographicKey: ").append(toIndentedString(cryptographicKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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

