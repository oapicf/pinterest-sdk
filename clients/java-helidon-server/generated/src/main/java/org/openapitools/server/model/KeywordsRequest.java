package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.KeywordsCommon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeywordsRequest   {

    private List<@Valid KeywordsCommon> keywords = new ArrayList<>();
    private String parentId;

    /**
     * Default constructor.
     */
    public KeywordsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordsRequest.
     *
     * @param keywords Keyword JSON array. Each array element has 3 fields
     * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
     */
    public KeywordsRequest(
        List<@Valid KeywordsCommon> keywords, 
        String parentId
    ) {
        this.keywords = keywords;
        this.parentId = parentId;
    }



    /**
     * Keyword JSON array. Each array element has 3 fields
     * @return keywords
     */
    public List<@Valid KeywordsCommon> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid KeywordsCommon> keywords) {
        this.keywords = keywords;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsRequest {\n");
        
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

