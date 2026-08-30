package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Keyword metrics JSON
 */
public class KeywordMetrics   {

    private String keywordQueryVolume;

    /**
     * Default constructor.
     */
    public KeywordMetrics() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordMetrics.
     *
     * @param keywordQueryVolume Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response
     */
    public KeywordMetrics(
        String keywordQueryVolume
    ) {
        this.keywordQueryVolume = keywordQueryVolume;
    }



    /**
     * Keyword's search frequency. This value is based on keyword frequency in pepsi client response
     * @return keywordQueryVolume
     */
    public String getKeywordQueryVolume() {
        return keywordQueryVolume;
    }

    public void setKeywordQueryVolume(String keywordQueryVolume) {
        this.keywordQueryVolume = keywordQueryVolume;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordMetrics {\n");
        
        sb.append("    keywordQueryVolume: ").append(toIndentedString(keywordQueryVolume)).append("\n");
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

