package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Integration record
 */
public class IntegrationRecord   {

    private String additionalId1;
    private String connectedAdvertiserId;
    private String connectedLbaId;
    private String connectedMerchantId;
    private String connectedTagId;
    private String connectedUserId;
    private Integer createdTime;
    private String externalBusinessId;
    private String id;
    private String partnerAccessToken;
    private Integer partnerAccessTokenExpiry;
    private String partnerMetadata;
    private String partnerPrimaryEmail;
    private String partnerRefreshToken;
    private Integer partnerRefreshTokenExpiry;
    private String scopes;
    private Integer updatedTime;

    /**
     * Default constructor.
     */
    public IntegrationRecord() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationRecord.
     *
     * @param additionalId1 additionalId1
     * @param connectedAdvertiserId connectedAdvertiserId
     * @param connectedLbaId connectedLbaId
     * @param connectedMerchantId connectedMerchantId
     * @param connectedTagId connectedTagId
     * @param connectedUserId connectedUserId
     * @param createdTime createdTime
     * @param externalBusinessId externalBusinessId
     * @param id Integration record ID.
     * @param partnerAccessToken partnerAccessToken
     * @param partnerAccessTokenExpiry partnerAccessTokenExpiry
     * @param partnerMetadata partnerMetadata
     * @param partnerPrimaryEmail partnerPrimaryEmail
     * @param partnerRefreshToken partnerRefreshToken
     * @param partnerRefreshTokenExpiry partnerRefreshTokenExpiry
     * @param scopes scopes
     * @param updatedTime updatedTime
     */
    public IntegrationRecord(
        String additionalId1, 
        String connectedAdvertiserId, 
        String connectedLbaId, 
        String connectedMerchantId, 
        String connectedTagId, 
        String connectedUserId, 
        Integer createdTime, 
        String externalBusinessId, 
        String id, 
        String partnerAccessToken, 
        Integer partnerAccessTokenExpiry, 
        String partnerMetadata, 
        String partnerPrimaryEmail, 
        String partnerRefreshToken, 
        Integer partnerRefreshTokenExpiry, 
        String scopes, 
        Integer updatedTime
    ) {
        this.additionalId1 = additionalId1;
        this.connectedAdvertiserId = connectedAdvertiserId;
        this.connectedLbaId = connectedLbaId;
        this.connectedMerchantId = connectedMerchantId;
        this.connectedTagId = connectedTagId;
        this.connectedUserId = connectedUserId;
        this.createdTime = createdTime;
        this.externalBusinessId = externalBusinessId;
        this.id = id;
        this.partnerAccessToken = partnerAccessToken;
        this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
        this.partnerMetadata = partnerMetadata;
        this.partnerPrimaryEmail = partnerPrimaryEmail;
        this.partnerRefreshToken = partnerRefreshToken;
        this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
        this.scopes = scopes;
        this.updatedTime = updatedTime;
    }



    /**
     * Get additionalId1
     * @return additionalId1
     */
    public String getAdditionalId1() {
        return additionalId1;
    }

    public void setAdditionalId1(String additionalId1) {
        this.additionalId1 = additionalId1;
    }

    /**
     * Get connectedAdvertiserId
     * @return connectedAdvertiserId
     */
    public String getConnectedAdvertiserId() {
        return connectedAdvertiserId;
    }

    public void setConnectedAdvertiserId(String connectedAdvertiserId) {
        this.connectedAdvertiserId = connectedAdvertiserId;
    }

    /**
     * Get connectedLbaId
     * @return connectedLbaId
     */
    public String getConnectedLbaId() {
        return connectedLbaId;
    }

    public void setConnectedLbaId(String connectedLbaId) {
        this.connectedLbaId = connectedLbaId;
    }

    /**
     * Get connectedMerchantId
     * @return connectedMerchantId
     */
    public String getConnectedMerchantId() {
        return connectedMerchantId;
    }

    public void setConnectedMerchantId(String connectedMerchantId) {
        this.connectedMerchantId = connectedMerchantId;
    }

    /**
     * Get connectedTagId
     * @return connectedTagId
     */
    public String getConnectedTagId() {
        return connectedTagId;
    }

    public void setConnectedTagId(String connectedTagId) {
        this.connectedTagId = connectedTagId;
    }

    /**
     * Get connectedUserId
     * @return connectedUserId
     */
    public String getConnectedUserId() {
        return connectedUserId;
    }

    public void setConnectedUserId(String connectedUserId) {
        this.connectedUserId = connectedUserId;
    }

    /**
     * Get createdTime
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Get externalBusinessId
     * @return externalBusinessId
     */
    public String getExternalBusinessId() {
        return externalBusinessId;
    }

    public void setExternalBusinessId(String externalBusinessId) {
        this.externalBusinessId = externalBusinessId;
    }

    /**
     * Integration record ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get partnerAccessToken
     * @return partnerAccessToken
     */
    public String getPartnerAccessToken() {
        return partnerAccessToken;
    }

    public void setPartnerAccessToken(String partnerAccessToken) {
        this.partnerAccessToken = partnerAccessToken;
    }

    /**
     * Get partnerAccessTokenExpiry
     * @return partnerAccessTokenExpiry
     */
    public Integer getPartnerAccessTokenExpiry() {
        return partnerAccessTokenExpiry;
    }

    public void setPartnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
        this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    }

    /**
     * Get partnerMetadata
     * @return partnerMetadata
     */
    public String getPartnerMetadata() {
        return partnerMetadata;
    }

    public void setPartnerMetadata(String partnerMetadata) {
        this.partnerMetadata = partnerMetadata;
    }

    /**
     * Get partnerPrimaryEmail
     * @return partnerPrimaryEmail
     */
    public String getPartnerPrimaryEmail() {
        return partnerPrimaryEmail;
    }

    public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
        this.partnerPrimaryEmail = partnerPrimaryEmail;
    }

    /**
     * Get partnerRefreshToken
     * @return partnerRefreshToken
     */
    public String getPartnerRefreshToken() {
        return partnerRefreshToken;
    }

    public void setPartnerRefreshToken(String partnerRefreshToken) {
        this.partnerRefreshToken = partnerRefreshToken;
    }

    /**
     * Get partnerRefreshTokenExpiry
     * @return partnerRefreshTokenExpiry
     */
    public Integer getPartnerRefreshTokenExpiry() {
        return partnerRefreshTokenExpiry;
    }

    public void setPartnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
        this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    }

    /**
     * Get scopes
     * @return scopes
     */
    public String getScopes() {
        return scopes;
    }

    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    /**
     * Get updatedTime
     * @return updatedTime
     */
    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationRecord {\n");
        
        sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
        sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
        sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
        sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
        sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
        sb.append("    connectedUserId: ").append(toIndentedString(connectedUserId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
        sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
        sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
        sb.append("    partnerPrimaryEmail: ").append(toIndentedString(partnerPrimaryEmail)).append("\n");
        sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
        sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

