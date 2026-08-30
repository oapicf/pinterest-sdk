package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RelatedTermsRelatedTermsListItems   {

    private List<String> relatedTerms = new ArrayList<>();
    private String term;

    /**
     * Default constructor.
     */
    public RelatedTermsRelatedTermsListItems() {
    // JSON-B / Jackson
    }

    /**
     * Create RelatedTermsRelatedTermsListItems.
     *
     * @param relatedTerms relatedTerms
     * @param term term
     */
    public RelatedTermsRelatedTermsListItems(
        List<String> relatedTerms, 
        String term
    ) {
        this.relatedTerms = relatedTerms;
        this.term = term;
    }



    /**
     * Get relatedTerms
     * @return relatedTerms
     */
    public List<String> getRelatedTerms() {
        return relatedTerms;
    }

    public void setRelatedTerms(List<String> relatedTerms) {
        this.relatedTerms = relatedTerms;
    }

    /**
     * Get term
     * @return term
     */
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedTermsRelatedTermsListItems {\n");
        
        sb.append("    relatedTerms: ").append(toIndentedString(relatedTerms)).append("\n");
        sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

