package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AdAccountsAudienceRule;
import org.openapitools.server.model.AudienceType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class AdAccountsAudienceCreate   {

    private String adAccountId;
    private AudienceType audienceType;
    private String description;
    private String name;
    private AdAccountsAudienceRule rule;

    /**
     * Default constructor.
     */
    public AdAccountsAudienceCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create AdAccountsAudienceCreate.
     *
     * @param adAccountId Ad account ID.
     * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
     * @param description Audience description.
     * @param name Audience name.
     * @param rule rule
     */
    public AdAccountsAudienceCreate(
        String adAccountId, 
        AudienceType audienceType, 
        String description, 
        String name, 
        AdAccountsAudienceRule rule
    ) {
        this.adAccountId = adAccountId;
        this.audienceType = audienceType;
        this.description = description;
        this.name = name;
        this.rule = rule;
    }



    /**
     * Ad account ID.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
     * @return audienceType
     */
    public AudienceType getAudienceType() {
        return audienceType;
    }

    public void setAudienceType(AudienceType audienceType) {
        this.audienceType = audienceType;
    }

    /**
     * Audience description.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Audience name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get rule
     * @return rule
     */
    public AdAccountsAudienceRule getRule() {
        return rule;
    }

    public void setRule(AdAccountsAudienceRule rule) {
        this.rule = rule;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdAccountsAudienceCreate {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

