package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ScrollupGoalMetadata   {

    private String scrollupGoalValueInMicroCurrency;

    /**
     * Default constructor.
     */
    public ScrollupGoalMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create ScrollupGoalMetadata.
     *
     * @param scrollupGoalValueInMicroCurrency scrollupGoalValueInMicroCurrency
     */
    public ScrollupGoalMetadata(
        String scrollupGoalValueInMicroCurrency
    ) {
        this.scrollupGoalValueInMicroCurrency = scrollupGoalValueInMicroCurrency;
    }



    /**
     * Get scrollupGoalValueInMicroCurrency
     * @return scrollupGoalValueInMicroCurrency
     */
    public String getScrollupGoalValueInMicroCurrency() {
        return scrollupGoalValueInMicroCurrency;
    }

    public void setScrollupGoalValueInMicroCurrency(String scrollupGoalValueInMicroCurrency) {
        this.scrollupGoalValueInMicroCurrency = scrollupGoalValueInMicroCurrency;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScrollupGoalMetadata {\n");
        
        sb.append("    scrollupGoalValueInMicroCurrency: ").append(toIndentedString(scrollupGoalValueInMicroCurrency)).append("\n");
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

