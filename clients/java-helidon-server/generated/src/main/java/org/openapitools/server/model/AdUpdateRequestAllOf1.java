package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdUpdateRequestAllOf1   {

    private String id;
    private String pinId;

    /**
     * Default constructor.
     */
    public AdUpdateRequestAllOf1() {
    // JSON-B / Jackson
    }

    /**
     * Create AdUpdateRequestAllOf1.
     *
     * @param id The ID of this ad.
     * @param pinId Pin ID. This field may only be updated for draft ads.
     */
    public AdUpdateRequestAllOf1(
        String id, 
        String pinId
    ) {
        this.id = id;
        this.pinId = pinId;
    }



    /**
     * The ID of this ad.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Pin ID. This field may only be updated for draft ads.
     * @return pinId
     */
    public String getPinId() {
        return pinId;
    }

    public void setPinId(String pinId) {
        this.pinId = pinId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdUpdateRequestAllOf1 {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

