package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TrendingKeyword;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TrendingKeywordsResponse   {

    private List<@Valid TrendingKeyword> trends = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TrendingKeywordsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create TrendingKeywordsResponse.
     *
     * @param trends The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend.
     */
    public TrendingKeywordsResponse(
        List<@Valid TrendingKeyword> trends
    ) {
        this.trends = trends;
    }



    /**
     * The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend.
     * @return trends
     */
    public List<@Valid TrendingKeyword> getTrends() {
        return trends;
    }

    public void setTrends(List<@Valid TrendingKeyword> trends) {
        this.trends = trends;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendingKeywordsResponse {\n");
        
        sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
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

