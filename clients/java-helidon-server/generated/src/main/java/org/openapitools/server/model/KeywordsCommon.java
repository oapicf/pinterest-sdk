package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.MatchTypeResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeywordsCommon   {

    private Integer bid;
    private MatchTypeResponse matchType;
    private String value;

    /**
     * Default constructor.
     */
    public KeywordsCommon() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordsCommon.
     *
     * @param bid &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @param matchType matchType
     * @param value Keyword value (120 chars max).
     */
    public KeywordsCommon(
        Integer bid, 
        MatchTypeResponse matchType, 
        String value
    ) {
        this.bid = bid;
        this.matchType = matchType;
        this.value = value;
    }



    /**
     * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @return bid
     */
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * Get matchType
     * @return matchType
     */
    public MatchTypeResponse getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchTypeResponse matchType) {
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
        sb.append("class KeywordsCommon {\n");
        
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

