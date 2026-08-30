package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The ID of the ad account.
 */
public class TermsOfService   {

    private String adAccountId;
    private Boolean hasAccepted;
    private String html;
    private String id;

    /**
     * Default constructor.
     */
    public TermsOfService() {
    // JSON-B / Jackson
    }

    /**
     * Create TermsOfService.
     *
     * @param adAccountId The ID of the ad account.
     * @param hasAccepted Whether the ad account has accepted terms of service.
     * @param html The terms of service content
     * @param id The ID of the terms of service
     */
    public TermsOfService(
        String adAccountId, 
        Boolean hasAccepted, 
        String html, 
        String id
    ) {
        this.adAccountId = adAccountId;
        this.hasAccepted = hasAccepted;
        this.html = html;
        this.id = id;
    }



    /**
     * The ID of the ad account.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Whether the ad account has accepted terms of service.
     * @return hasAccepted
     */
    public Boolean getHasAccepted() {
        return hasAccepted;
    }

    public void setHasAccepted(Boolean hasAccepted) {
        this.hasAccepted = hasAccepted;
    }

    /**
     * The terms of service content
     * @return html
     */
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * The ID of the terms of service
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TermsOfService {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    hasAccepted: ").append(toIndentedString(hasAccepted)).append("\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

