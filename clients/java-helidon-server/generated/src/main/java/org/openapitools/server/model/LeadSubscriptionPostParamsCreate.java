package org.openapitools.server.model;

import org.openapitools.server.model.PartnerMetadata;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadSubscriptionPostParamsCreate   {

    private String leadFormId;
    private String webhookUrl;
    private String partnerAccessToken;
    private PartnerMetadata partnerMetadata;
    private String partnerRefreshToken;

    /**
     * Default constructor.
     */
    public LeadSubscriptionPostParamsCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadSubscriptionPostParamsCreate.
     *
     * @param leadFormId Lead form ID.
     * @param webhookUrl Standard HTTPS webhook URL.
     * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
     * @param partnerMetadata Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
     * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
     */
    public LeadSubscriptionPostParamsCreate(
        String leadFormId, 
        String webhookUrl, 
        String partnerAccessToken, 
        PartnerMetadata partnerMetadata, 
        String partnerRefreshToken
    ) {
        this.leadFormId = leadFormId;
        this.webhookUrl = webhookUrl;
        this.partnerAccessToken = partnerAccessToken;
        this.partnerMetadata = partnerMetadata;
        this.partnerRefreshToken = partnerRefreshToken;
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
     * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
     * @return partnerAccessToken
     */
    public String getPartnerAccessToken() {
        return partnerAccessToken;
    }

    public void setPartnerAccessToken(String partnerAccessToken) {
        this.partnerAccessToken = partnerAccessToken;
    }

    /**
     * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
     * @return partnerMetadata
     */
    public PartnerMetadata getPartnerMetadata() {
        return partnerMetadata;
    }

    public void setPartnerMetadata(PartnerMetadata partnerMetadata) {
        this.partnerMetadata = partnerMetadata;
    }

    /**
     * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
     * @return partnerRefreshToken
     */
    public String getPartnerRefreshToken() {
        return partnerRefreshToken;
    }

    public void setPartnerRefreshToken(String partnerRefreshToken) {
        this.partnerRefreshToken = partnerRefreshToken;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadSubscriptionPostParamsCreate {\n");
        
        sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
        sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
        sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
        sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
        sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
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

