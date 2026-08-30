package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Integration metadata
 */
public class IntegrationMetadata   {

    private String additionalId1;
    private String connectedAdvertiserId;
    private String connectedLbaId;
    private String connectedMerchantId;
    private String connectedTagId;
    private String connectedUserId;
    private BigDecimal createdTimestamp;
    private String externalBusinessId;
    private String id;
    private BigDecimal partnerAccessTokenExpiry;
    private String partnerMetadata;
    private BigDecimal partnerRefreshTokenExpiry;
    private String scopes;
    private BigDecimal updatedTimestamp;

    /**
     * Default constructor.
     */
    public IntegrationMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationMetadata.
     *
     * @param additionalId1 additionalId1
     * @param connectedAdvertiserId connectedAdvertiserId
     * @param connectedLbaId connectedLbaId
     * @param connectedMerchantId connectedMerchantId
     * @param connectedTagId connectedTagId
     * @param connectedUserId connectedUserId
     * @param createdTimestamp createdTimestamp
     * @param externalBusinessId External business ID for the integration.
     * @param id id
     * @param partnerAccessTokenExpiry partnerAccessTokenExpiry
     * @param partnerMetadata partnerMetadata
     * @param partnerRefreshTokenExpiry partnerRefreshTokenExpiry
     * @param scopes scopes
     * @param updatedTimestamp updatedTimestamp
     */
    public IntegrationMetadata(
        String additionalId1, 
        String connectedAdvertiserId, 
        String connectedLbaId, 
        String connectedMerchantId, 
        String connectedTagId, 
        String connectedUserId, 
        BigDecimal createdTimestamp, 
        String externalBusinessId, 
        String id, 
        BigDecimal partnerAccessTokenExpiry, 
        String partnerMetadata, 
        BigDecimal partnerRefreshTokenExpiry, 
        String scopes, 
        BigDecimal updatedTimestamp
    ) {
        this.additionalId1 = additionalId1;
        this.connectedAdvertiserId = connectedAdvertiserId;
        this.connectedLbaId = connectedLbaId;
        this.connectedMerchantId = connectedMerchantId;
        this.connectedTagId = connectedTagId;
        this.connectedUserId = connectedUserId;
        this.createdTimestamp = createdTimestamp;
        this.externalBusinessId = externalBusinessId;
        this.id = id;
        this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
        this.partnerMetadata = partnerMetadata;
        this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
        this.scopes = scopes;
        this.updatedTimestamp = updatedTimestamp;
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
     * Get createdTimestamp
     * @return createdTimestamp
     */
    public BigDecimal getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(BigDecimal createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * External business ID for the integration.
     * @return externalBusinessId
     */
    public String getExternalBusinessId() {
        return externalBusinessId;
    }

    public void setExternalBusinessId(String externalBusinessId) {
        this.externalBusinessId = externalBusinessId;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * Get updatedTimestamp
     * @return updatedTimestamp
     */
    public BigDecimal getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(BigDecimal updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationMetadata {\n");
        
        sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
        sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
        sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
        sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
        sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
        sb.append("    connectedUserId: ").append(toIndentedString(connectedUserId)).append("\n");
        sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
        sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
        sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
        sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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

