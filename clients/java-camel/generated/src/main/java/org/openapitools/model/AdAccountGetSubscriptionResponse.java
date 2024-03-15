package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdAccountGetSubscriptionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountGetSubscriptionResponse {

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> leadFormId = JsonNullable.<String>undefined();

  private String webhookUrl;

  private String id;

  private String userAccountId;

  private String adAccountId;

  private String apiVersion;

  private String cryptographicKey;

  private String cryptographicAlgorithm;

  private Integer createdTime;

  public AdAccountGetSubscriptionResponse leadFormId(String leadFormId) {
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

  public AdAccountGetSubscriptionResponse webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
  */
  
  @Schema(name = "webhook_url", example = "https://webhook.example.com/xyz", description = "Standard HTTPS webhook URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webhook_url")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public AdAccountGetSubscriptionResponse id(String id) {
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
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccountGetSubscriptionResponse userAccountId(String userAccountId) {
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
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public AdAccountGetSubscriptionResponse adAccountId(String adAccountId) {
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
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountGetSubscriptionResponse apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API version.
   * @return apiVersion
  */
  
  @Schema(name = "api_version", example = "v5", description = "API version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_version")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public AdAccountGetSubscriptionResponse cryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
    return this;
  }

  /**
   * Base64 encoded key for client to decrypt lead data.
   * @return cryptographicKey
  */
  
  @Schema(name = "cryptographic_key", example = "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54", description = "Base64 encoded key for client to decrypt lead data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cryptographic_key")
  public String getCryptographicKey() {
    return cryptographicKey;
  }

  public void setCryptographicKey(String cryptographicKey) {
    this.cryptographicKey = cryptographicKey;
  }

  public AdAccountGetSubscriptionResponse cryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
    return this;
  }

  /**
   * Lead data encryption algorithm.
   * @return cryptographicAlgorithm
  */
  
  @Schema(name = "cryptographic_algorithm", example = "AES-256-GCM", description = "Lead data encryption algorithm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cryptographic_algorithm")
  public String getCryptographicAlgorithm() {
    return cryptographicAlgorithm;
  }

  public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
    this.cryptographicAlgorithm = cryptographicAlgorithm;
  }

  public AdAccountGetSubscriptionResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Lead form creation time. Unix timestamp in milliseconds.
   * @return createdTime
  */
  
  @Schema(name = "created_time", example = "1699209842000", description = "Lead form creation time. Unix timestamp in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse = (AdAccountGetSubscriptionResponse) o;
    return equalsNullable(this.leadFormId, adAccountGetSubscriptionResponse.leadFormId) &&
        Objects.equals(this.webhookUrl, adAccountGetSubscriptionResponse.webhookUrl) &&
        Objects.equals(this.id, adAccountGetSubscriptionResponse.id) &&
        Objects.equals(this.userAccountId, adAccountGetSubscriptionResponse.userAccountId) &&
        Objects.equals(this.adAccountId, adAccountGetSubscriptionResponse.adAccountId) &&
        Objects.equals(this.apiVersion, adAccountGetSubscriptionResponse.apiVersion) &&
        Objects.equals(this.cryptographicKey, adAccountGetSubscriptionResponse.cryptographicKey) &&
        Objects.equals(this.cryptographicAlgorithm, adAccountGetSubscriptionResponse.cryptographicAlgorithm) &&
        Objects.equals(this.createdTime, adAccountGetSubscriptionResponse.createdTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(leadFormId), webhookUrl, id, userAccountId, adAccountId, apiVersion, cryptographicKey, cryptographicAlgorithm, createdTime);
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
    sb.append("class AdAccountGetSubscriptionResponse {\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    cryptographicKey: ").append(toIndentedString(cryptographicKey)).append("\n");
    sb.append("    cryptographicAlgorithm: ").append(toIndentedString(cryptographicAlgorithm)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

