package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pinterest marketing partner name.
 */
public class SSIOAccountPMPName   {

    private String id;
    private String name;

    /**
     * Default constructor.
     */
    public SSIOAccountPMPName() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOAccountPMPName.
     *
     * @param id Salesforce id for PMP
     * @param name Display name
     */
    public SSIOAccountPMPName(
        String id, 
        String name
    ) {
        this.id = id;
        this.name = name;
    }



    /**
     * Salesforce id for PMP
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Display name
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
        sb.append("class SSIOAccountPMPName {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

