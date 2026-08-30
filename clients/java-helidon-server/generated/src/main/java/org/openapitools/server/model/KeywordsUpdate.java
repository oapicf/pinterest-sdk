package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.KeywordUpdateItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model.
 */
public class KeywordsUpdate   {

    private List<@Valid KeywordUpdateItem> keywords = new ArrayList<>();

    /**
     * Default constructor.
     */
    public KeywordsUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordsUpdate.
     *
     * @param keywords Keywords
     */
    public KeywordsUpdate(
        List<@Valid KeywordUpdateItem> keywords
    ) {
        this.keywords = keywords;
    }



    /**
     * Keywords
     * @return keywords
     */
    public List<@Valid KeywordUpdateItem> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid KeywordUpdateItem> keywords) {
        this.keywords = keywords;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsUpdate {\n");
        
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

