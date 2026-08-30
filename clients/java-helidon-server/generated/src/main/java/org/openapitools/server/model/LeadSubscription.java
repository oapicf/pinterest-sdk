package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadSubscription   {

    private String adAccountId;
    private String apiVersion;
    private Integer createdTime;
    private String cryptographicAlgorithm;
    private String cryptographicKey;
    private String id;
    private String leadFormId;
    private String userAccountId;
    private String webhookUrl;

    /**
     * Default constructor.
     */
    public LeadSubscription() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadSubscription.
     *
     * @param adAccountId The Ad Account ID that this lead form belongs to.
     * @param apiVersion API version.
     * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
     * @param cryptographicAlgorithm Lead data encryption algorithm.
     * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
     * @param id Subscription ID.
     * @param leadFormId Lead form ID.
     * @param userAccountId User account used to subscribe lead data.
     * @param webhookUrl Standard HTTPS webhook URL.
     */
    public LeadSubscription(
        String adAccountId, 
        String apiVersion, 
        Integer createdTime, 
        String cryptographicAlgorithm, 
        String cryptographicKey, 
        String id, 
        String leadFormId, 
        String userAccountId, 
        String webhookUrl
    ) {
        this.adAccountId = adAccountId;
        this.apiVersion = apiVersion;
        this.createdTime = createdTime;
        this.cryptographicAlgorithm = cryptographicAlgorithm;
        this.cryptographicKey = cryptographicKey;
        this.id = id;
        this.leadFormId = leadFormId;
        this.userAccountId = userAccountId;
        this.webhookUrl = webhookUrl;
    }



    /**
     * The Ad Account ID that this lead form belongs to.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * API version.
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Subscription creation time. Unix timestamp in milliseconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Lead data encryption algorithm.
     * @return cryptographicAlgorithm
     */
    public String getCryptographicAlgorithm() {
        return cryptographicAlgorithm;
    }

    public void setCryptographicAlgorithm(String cryptographicAlgorithm) {
        this.cryptographicAlgorithm = cryptographicAlgorithm;
    }

    /**
     * Base64 encoded key for client to decrypt lead data.
     * @return cryptographicKey
     */
    public String getCryptographicKey() {
        return cryptographicKey;
    }

    public void setCryptographicKey(String cryptographicKey) {
        this.cryptographicKey = cryptographicKey;
    }

    /**
     * Subscription ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Lead form ID.
     * @return leadFormId
     */
    public String getLeadFormId() {
        return leadFormId;
    }

    public void setLeadFormId(String leadFormId) {
        this.leadFormId = leadFormId;
    }

    /**
     * User account used to subscribe lead data.
     * @return userAccountId
     */
    public String getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

    /**
     * Standard HTTPS webhook URL.
     * @return webhookUrl
     */
    public String getWebhookUrl() {
        return webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadSubscription {\n");
        
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

