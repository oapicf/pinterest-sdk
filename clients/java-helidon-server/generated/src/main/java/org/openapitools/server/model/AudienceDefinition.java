package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Queryable audience representation.
 */
public class AudienceDefinition   {

    private String date;
    private String scope;
    private String type;

    /**
     * Default constructor.
     */
    public AudienceDefinition() {
    // JSON-B / Jackson
    }

    /**
     * Create AudienceDefinition.
     *
     * @param date Generation date
     * @param scope scope
     * @param type type
     */
    public AudienceDefinition(
        String date, 
        String scope, 
        String type
    ) {
        this.date = date;
        this.scope = scope;
        this.type = type;
    }



    /**
     * Generation date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Get scope
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudienceDefinition {\n");
        
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

