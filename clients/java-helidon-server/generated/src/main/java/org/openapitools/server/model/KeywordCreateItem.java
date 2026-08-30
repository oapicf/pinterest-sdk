package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.MatchType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeywordCreateItem   {

    private Integer bid;
    private MatchType matchType;
    private String value;

    /**
     * Default constructor.
     */
    public KeywordCreateItem() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordCreateItem.
     *
     * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @param matchType Keyword [match type](/docs/api-features/targeting-overview/)
     * @param value Keyword value (120 chars max).
     */
    public KeywordCreateItem(
        Integer bid, 
        MatchType matchType, 
        String value
    ) {
        this.bid = bid;
        this.matchType = matchType;
        this.value = value;
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
        sb.append("class KeywordCreateItem {\n");
        
        sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

