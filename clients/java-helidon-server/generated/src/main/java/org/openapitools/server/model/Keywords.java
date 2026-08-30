package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Keyword;
import org.openapitools.server.model.KeywordError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Keywords   {

    private List<@Valid KeywordError> errors = new ArrayList<>();
    private List<@Valid Keyword> keywords = new ArrayList<>();

    /**
     * Default constructor.
     */
    public Keywords() {
    // JSON-B / Jackson
    }

    /**
     * Create Keywords.
     *
     * @param errors Keyword error
     * @param keywords Keywords
     */
    public Keywords(
        List<@Valid KeywordError> errors, 
        List<@Valid Keyword> keywords
    ) {
        this.errors = errors;
        this.keywords = keywords;
    }



    /**
     * Keyword error
     * @return errors
     */
    public List<@Valid KeywordError> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid KeywordError> errors) {
        this.errors = errors;
    }

    /**
     * Keywords
     * @return keywords
     */
    public List<@Valid Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid Keyword> keywords) {
        this.keywords = keywords;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Keywords {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

