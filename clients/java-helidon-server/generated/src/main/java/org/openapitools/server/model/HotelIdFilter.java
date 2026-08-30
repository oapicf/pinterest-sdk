package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class HotelIdFilter   {

    private CatalogsProductGroupMultipleStringCriteria HOTEL_ID;

    /**
     * Default constructor.
     */
    public HotelIdFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create HotelIdFilter.
     *
     * @param HOTEL_ID HOTEL_ID
     */
    public HotelIdFilter(
        CatalogsProductGroupMultipleStringCriteria HOTEL_ID
    ) {
        this.HOTEL_ID = HOTEL_ID;
    }



    /**
     * Get HOTEL_ID
     * @return HOTEL_ID
     */
    public CatalogsProductGroupMultipleStringCriteria getHOTELID() {
        return HOTEL_ID;
    }

    public void setHOTELID(CatalogsProductGroupMultipleStringCriteria HOTEL_ID) {
        this.HOTEL_ID = HOTEL_ID;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotelIdFilter {\n");
        
        sb.append("    HOTEL_ID: ").append(toIndentedString(HOTEL_ID)).append("\n");
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

