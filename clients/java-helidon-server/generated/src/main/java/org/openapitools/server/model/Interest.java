package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Interest   {

    private String canonicalUrl;
    private String id;
    private String key;
    private String name;

    /**
     * Default constructor.
     */
    public Interest() {
    // JSON-B / Jackson
    }

    /**
     * Create Interest.
     *
     * @param canonicalUrl canonicalUrl
     * @param id id
     * @param key key
     * @param name name
     */
    public Interest(
        String canonicalUrl, 
        String id, 
        String key, 
        String name
    ) {
        this.canonicalUrl = canonicalUrl;
        this.id = id;
        this.key = key;
        this.name = name;
    }



    /**
     * Get canonicalUrl
     * @return canonicalUrl
     */
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Get name
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
        sb.append("class Interest {\n");
        
        sb.append("    canonicalUrl: ").append(toIndentedString(canonicalUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

