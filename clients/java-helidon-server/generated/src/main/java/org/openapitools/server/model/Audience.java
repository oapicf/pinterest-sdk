package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AudienceRule;
import org.openapitools.server.model.AudienceStatus;
import org.openapitools.server.model.PinnerListType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Audience   {

    private String adAccountId;
    private PinnerListType audienceType;
    private String createdByCompanyName;
    private Integer createdTimestamp;
    private String description;
    private String id;
    private Boolean isNca;
    private String name;
    private AudienceRule rule;
    private Integer size;
    private AudienceStatus status;
    private String type;
    private Integer updatedTimestamp;

    /**
     * Default constructor.
     */
    public Audience() {
    // JSON-B / Jackson
    }

    /**
     * Create Audience.
     *
     * @param adAccountId Ad account ID.
     * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
     * @param createdByCompanyName The company that created this audience.
     * @param createdTimestamp Creation time. Unix timestamp in seconds.
     * @param description Audience description.
     * @param id Audience ID.
     * @param isNca Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
     * @param name Audience name.
     * @param rule rule
     * @param size Audience size.
     * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
     * @param type Always \&quot;audience\&quot;.
     * @param updatedTimestamp Last update time. Unix timestamp in seconds.
     */
    public Audience(
        String adAccountId, 
        PinnerListType audienceType, 
        String createdByCompanyName, 
        Integer createdTimestamp, 
        String description, 
        String id, 
        Boolean isNca, 
        String name, 
        AudienceRule rule, 
        Integer size, 
        AudienceStatus status, 
        String type, 
        Integer updatedTimestamp
    ) {
        this.adAccountId = adAccountId;
        this.audienceType = audienceType;
        this.createdByCompanyName = createdByCompanyName;
        this.createdTimestamp = createdTimestamp;
        this.description = description;
        this.id = id;
        this.isNca = isNca;
        this.name = name;
        this.rule = rule;
        this.size = size;
        this.status = status;
        this.type = type;
        this.updatedTimestamp = updatedTimestamp;
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
    public PinnerListType getAudienceType() {
        return audienceType;
    }

    public void setAudienceType(PinnerListType audienceType) {
        this.audienceType = audienceType;
    }

    /**
     * The company that created this audience.
     * @return createdByCompanyName
     */
    public String getCreatedByCompanyName() {
        return createdByCompanyName;
    }

    public void setCreatedByCompanyName(String createdByCompanyName) {
        this.createdByCompanyName = createdByCompanyName;
    }

    /**
     * Creation time. Unix timestamp in seconds.
     * @return createdTimestamp
     */
    public Integer getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Integer createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
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
     * Audience ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
     * @return isNca
     */
    public Boolean getIsNca() {
        return isNca;
    }

    public void setIsNca(Boolean isNca) {
        this.isNca = isNca;
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
    public AudienceRule getRule() {
        return rule;
    }

    public void setRule(AudienceRule rule) {
        this.rule = rule;
    }

    /**
     * Audience size.
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
     * @return status
     */
    public AudienceStatus getStatus() {
        return status;
    }

    public void setStatus(AudienceStatus status) {
        this.status = status;
    }

    /**
     * Always \"audience\".
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Last update time. Unix timestamp in seconds.
     * @return updatedTimestamp
     */
    public Integer getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(Integer updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Audience {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
        sb.append("    createdByCompanyName: ").append(toIndentedString(createdByCompanyName)).append("\n");
        sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isNca: ").append(toIndentedString(isNca)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

