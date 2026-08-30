package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.NullalbleMatchType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdGroupDeliveryEstimatesKeywordsItems   {

    private NullalbleMatchType matchType;
    private String value;

    /**
     * Default constructor.
     */
    public AdGroupDeliveryEstimatesKeywordsItems() {
    // JSON-B / Jackson
    }

    /**
     * Create AdGroupDeliveryEstimatesKeywordsItems.
     *
     * @param matchType matchType
     * @param value Keyword value (120 chars max).
     */
    public AdGroupDeliveryEstimatesKeywordsItems(
        NullalbleMatchType matchType, 
        String value
    ) {
        this.matchType = matchType;
        this.value = value;
    }



    /**
     * Get matchType
     * @return matchType
     */
    public NullalbleMatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(NullalbleMatchType matchType) {
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
        sb.append("class AdGroupDeliveryEstimatesKeywordsItems {\n");
        
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

