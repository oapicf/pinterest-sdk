package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.KeywordCreateItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class KeywordsCreate   {

    private List<@Valid KeywordCreateItem> keywords = new ArrayList<>();
    private String parentId;

    /**
     * Default constructor.
     */
    public KeywordsCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordsCreate.
     *
     * @param keywords Keywords
     * @param parentId Keyword data
     */
    public KeywordsCreate(
        List<@Valid KeywordCreateItem> keywords, 
        String parentId
    ) {
        this.keywords = keywords;
        this.parentId = parentId;
    }



    /**
     * Keywords
     * @return keywords
     */
    public List<@Valid KeywordCreateItem> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid KeywordCreateItem> keywords) {
        this.keywords = keywords;
    }

    /**
     * Keyword data
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsCreate {\n");
        
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

