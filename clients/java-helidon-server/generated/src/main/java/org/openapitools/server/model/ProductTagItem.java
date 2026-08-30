package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Product tag request item containing the pin_id of the product to tag.
 */
public class ProductTagItem   {

    private String pinId;

    /**
     * Default constructor.
     */
    public ProductTagItem() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductTagItem.
     *
     * @param pinId Pin ID of the product pin to tag onto the hero pin.
     */
    public ProductTagItem(
        String pinId
    ) {
        this.pinId = pinId;
    }



    /**
     * Pin ID of the product pin to tag onto the hero pin.
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
        sb.append("class ProductTagItem {\n");
        
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

