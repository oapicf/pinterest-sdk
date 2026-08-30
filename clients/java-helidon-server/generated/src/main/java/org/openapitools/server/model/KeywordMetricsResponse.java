package org.openapitools.server.model;

import org.openapitools.server.model.KeywordMetrics;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeywordMetricsResponse   {

    private String keyword;
    private KeywordMetrics metrics;

    /**
     * Default constructor.
     */
    public KeywordMetricsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordMetricsResponse.
     *
     * @param keyword Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot;
     * @param metrics metrics
     */
    public KeywordMetricsResponse(
        String keyword, 
        KeywordMetrics metrics
    ) {
        this.keyword = keyword;
        this.metrics = metrics;
    }



    /**
     * Keyword name, e.g., \"keyword\":\"fashion outfits\"
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public KeywordMetrics getMetrics() {
        return metrics;
    }

    public void setMetrics(KeywordMetrics metrics) {
        this.metrics = metrics;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordMetricsResponse {\n");
        
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

