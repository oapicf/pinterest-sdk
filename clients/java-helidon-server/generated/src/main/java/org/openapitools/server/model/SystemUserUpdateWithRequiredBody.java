package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
public class SystemUserUpdateWithRequiredBody   {

    private String name;

    /**
     * Default constructor.
     */
    public SystemUserUpdateWithRequiredBody() {
    // JSON-B / Jackson
    }

    /**
     * Create SystemUserUpdateWithRequiredBody.
     *
     * @param name New system user name
     */
    public SystemUserUpdateWithRequiredBody(
        String name
    ) {
        this.name = name;
    }



    /**
     * New system user name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemUserUpdateWithRequiredBody {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

