package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Hotel product metadata entity
 */
public class CatalogsHotelProductMetadata   {

    private String hotelId;

    /**
     * Default constructor.
     */
    public CatalogsHotelProductMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelProductMetadata.
     *
     * @param hotelId The user-created unique ID that represents the hotel item.
     */
    public CatalogsHotelProductMetadata(
        String hotelId
    ) {
        this.hotelId = hotelId;
    }



    /**
     * The user-created unique ID that represents the hotel item.
     * @return hotelId
     */
    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelProductMetadata {\n");
        
        sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

