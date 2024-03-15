package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdAccountGetSubscriptionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdAccountGetSubscriptionResponse   {
  @JsonProperty("lead_form_id")
  @Pattern(regexp="^\\d+$")

  private String leadFormId;

  @JsonProperty("webhook_url")
  
  private String webhookUrl;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("user_account_id")
  @Pattern(regexp="^\\d+$")

  private String userAccountId;

  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("api_version")
  
  private String apiVersion;

  @JsonProperty("cryptographic_key")
  
  private String cryptographicKey;

  @JsonProperty("cryptographic_algorithm")
  
  private String cryptographicAlgorithm;

  @JsonProperty("created_time")
  
  private Integer createdTime;

  public AdAccountGetSubscriptionResponse leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

   /**
   * Lead form ID.
   * @return leadFormId
  **/
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdAccountGetSubscriptionResponse webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Standard HTTPS webhook URL.
   * @return webhookUrl
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(leadFormId, adAccountGetSubscriptionResponse.leadFormId) &&
        Objects.equals(webhookUrl, adAccountGetSubscriptionResponse.webhookUrl) &&
        Objects.equals(id, adAccountGetSubscriptionResponse.id) &&
        Objects.equals(userAccountId, adAccountGetSubscriptionResponse.userAccountId) &&
        Objects.equals(adAccountId, adAccountGetSubscriptionResponse.adAccountId) &&
        Objects.equals(apiVersion, adAccountGetSubscriptionResponse.apiVersion) &&
        Objects.equals(cryptographicKey, adAccountGetSubscriptionResponse.cryptographicKey) &&
        Objects.equals(cryptographicAlgorithm, adAccountGetSubscriptionResponse.cryptographicAlgorithm) &&
        Objects.equals(createdTime, adAccountGetSubscriptionResponse.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadFormId, webhookUrl, id, userAccountId, adAccountId, apiVersion, cryptographicKey, cryptographicAlgorithm, createdTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

