package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadSubscriptionCreate   {

    private String leadFormId;
    private String webhookUrl;

    /**
     * Default constructor.
     */
    public LeadSubscriptionCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadSubscriptionCreate.
     *
     * @param leadFormId Lead form ID.
     * @param webhookUrl Standard HTTPS webhook URL.
     */
    public LeadSubscriptionCreate(
        String leadFormId, 
        String webhookUrl
    ) {
        this.leadFormId = leadFormId;
        this.webhookUrl = webhookUrl;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadSubscriptionCreate {\n");
        
        sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
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

