package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RelatedTermsRelatedTermsListItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RelatedTerms   {

    private String id;
    private Integer relatedTermCount;
    private List<@Valid RelatedTermsRelatedTermsListItems> relatedTermsList = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RelatedTerms() {
    // JSON-B / Jackson
    }

    /**
     * Create RelatedTerms.
     *
     * @param id First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;
     * @param relatedTermCount Total number of related terms returned
     * @param relatedTermsList The id of the advertiser.
     */
    public RelatedTerms(
        String id, 
        Integer relatedTermCount, 
        List<@Valid RelatedTermsRelatedTermsListItems> relatedTermsList
    ) {
        this.id = id;
        this.relatedTermCount = relatedTermCount;
        this.relatedTermsList = relatedTermsList;
    }



    /**
     * First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Total number of related terms returned
     * @return relatedTermCount
     */
    public Integer getRelatedTermCount() {
        return relatedTermCount;
    }

    public void setRelatedTermCount(Integer relatedTermCount) {
        this.relatedTermCount = relatedTermCount;
    }

    /**
     * The id of the advertiser.
     * @return relatedTermsList
     */
    public List<@Valid RelatedTermsRelatedTermsListItems> getRelatedTermsList() {
        return relatedTermsList;
    }

    public void setRelatedTermsList(List<@Valid RelatedTermsRelatedTermsListItems> relatedTermsList) {
        this.relatedTermsList = relatedTermsList;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedTerms {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    relatedTermCount: ").append(toIndentedString(relatedTermCount)).append("\n");
        sb.append("    relatedTermsList: ").append(toIndentedString(relatedTermsList)).append("\n");
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

