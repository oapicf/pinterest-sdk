package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeywordUpdateItem   {

    private Boolean archived;
    private Integer bid;
    private String id;

    /**
     * Default constructor.
     */
    public KeywordUpdateItem() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordUpdateItem.
     *
     * @param archived archived
     * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @param id Keyword ID .
     */
    public KeywordUpdateItem(
        Boolean archived, 
        Integer bid, 
        String id
    ) {
        this.archived = archived;
        this.bid = bid;
        this.id = id;
    }



    /**
     * Get archived
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @return bid
     */
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * Keyword ID .
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordUpdateItem {\n");
        
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

