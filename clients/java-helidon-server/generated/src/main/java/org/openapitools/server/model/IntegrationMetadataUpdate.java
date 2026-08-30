package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model.
 */
public class IntegrationMetadataUpdate   {

    private String additionalId1;
    private String connectedAdvertiserId;
    private String connectedLbaId;
    private String connectedMerchantId;
    private String connectedTagId;
    private String partnerAccessToken;
    private BigDecimal partnerAccessTokenExpiry;
    private String partnerMetadata;
    private String partnerPrimaryEmail;
    private String partnerRefreshToken;
    private BigDecimal partnerRefreshTokenExpiry;
    private String scopes;

    /**
     * Default constructor.
     */
    public IntegrationMetadataUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationMetadataUpdate.
     *
     * @param additionalId1 additionalId1
     * @param connectedAdvertiserId connectedAdvertiserId
     * @param connectedLbaId connectedLbaId
     * @param connectedMerchantId connectedMerchantId
     * @param connectedTagId connectedTagId
     * @param partnerAccessToken partnerAccessToken
     * @param partnerAccessTokenExpiry partnerAccessTokenExpiry
     * @param partnerMetadata partnerMetadata
     * @param partnerPrimaryEmail partnerPrimaryEmail
     * @param partnerRefreshToken partnerRefreshToken
     * @param partnerRefreshTokenExpiry partnerRefreshTokenExpiry
     * @param scopes scopes
     */
    public IntegrationMetadataUpdate(
        String additionalId1, 
        String connectedAdvertiserId, 
        String connectedLbaId, 
        String connectedMerchantId, 
        String connectedTagId, 
        String partnerAccessToken, 
        BigDecimal partnerAccessTokenExpiry, 
        String partnerMetadata, 
        String partnerPrimaryEmail, 
        String partnerRefreshToken, 
        BigDecimal partnerRefreshTokenExpiry, 
        String scopes
    ) {
        this.additionalId1 = additionalId1;
        this.connectedAdvertiserId = connectedAdvertiserId;
        this.connectedLbaId = connectedLbaId;
        this.connectedMerchantId = connectedMerchantId;
        this.connectedTagId = connectedTagId;
        this.partnerAccessToken = partnerAccessToken;
        this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
        this.partnerMetadata = partnerMetadata;
        this.partnerPrimaryEmail = partnerPrimaryEmail;
        this.partnerRefreshToken = partnerRefreshToken;
        this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
        this.scopes = scopes;
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
    public BigDecimal getPartnerAccessTokenExpiry() {
        return partnerAccessTokenExpiry;
    }

    public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
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
    public BigDecimal getPartnerRefreshTokenExpiry() {
        return partnerRefreshTokenExpiry;
    }

    public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationMetadataUpdate {\n");
        
        sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
        sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
        sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
        sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
        sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
        sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
        sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
        sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
        sb.append("    partnerPrimaryEmail: ").append(toIndentedString(partnerPrimaryEmail)).append("\n");
        sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
        sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

