package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AdPinPreviewCreativeType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ad preview source from an existing Pin.
 */
public class AdPreviewSourcePinId   {

    private AdPinPreviewCreativeType creativeType;
    private String pinId;

    /**
     * Default constructor.
     */
    public AdPreviewSourcePinId() {
    // JSON-B / Jackson
    }

    /**
     * Create AdPreviewSourcePinId.
     *
     * @param creativeType Creative type of the ad preview.
     * @param pinId Pin ID.
     */
    public AdPreviewSourcePinId(
        AdPinPreviewCreativeType creativeType, 
        String pinId
    ) {
        this.creativeType = creativeType;
        this.pinId = pinId;
    }



    /**
     * Creative type of the ad preview.
     * @return creativeType
     */
    public AdPinPreviewCreativeType getCreativeType() {
        return creativeType;
    }

    public void setCreativeType(AdPinPreviewCreativeType creativeType) {
        this.creativeType = creativeType;
    }

    /**
     * Pin ID.
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
        sb.append("class AdPreviewSourcePinId {\n");
        
        sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
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

