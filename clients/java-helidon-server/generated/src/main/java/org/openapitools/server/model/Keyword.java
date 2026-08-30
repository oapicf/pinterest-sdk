package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.MatchType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Keyword   {

    private Boolean archived;
    private Integer bid;
    private String id;
    private MatchType matchType;
    private String parentId;
    private String parentType;
    private String type;
    private String value;

    /**
     * Default constructor.
     */
    public Keyword() {
    // JSON-B / Jackson
    }

    /**
     * Create Keyword.
     *
     * @param archived archived
     * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @param id Keyword ID .
     * @param matchType Keyword [match type](/docs/api-features/targeting-overview/)
     * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
     * @param parentType Parent entity type (advertiser, campaign, ad group).
     * @param type Always keyword
     * @param value Keyword value (120 chars max).
     */
    public Keyword(
        Boolean archived, 
        Integer bid, 
        String id, 
        MatchType matchType, 
        String parentId, 
        String parentType, 
        String type, 
        String value
    ) {
        this.archived = archived;
        this.bid = bid;
        this.id = id;
        this.matchType = matchType;
        this.parentId = parentId;
        this.parentType = parentType;
        this.type = type;
        this.value = value;
    }



    /**
     * Get archived
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @return bid
     */
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * Keyword ID .
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Keyword [match type](/docs/api-features/targeting-overview/)
     * @return matchType
     */
    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    /**
     * Keyword parent entity ID (advertiser, campaign, ad group).
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * Parent entity type (advertiser, campaign, ad group).
     * @return parentType
     */
    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    /**
     * Always keyword
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Keyword value (120 chars max).
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Keyword {\n");
        
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

