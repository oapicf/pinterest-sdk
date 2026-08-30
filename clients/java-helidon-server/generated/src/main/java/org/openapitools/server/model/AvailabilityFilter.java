package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AvailabilityFilter   {

    private CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

    /**
     * Default constructor.
     */
    public AvailabilityFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create AvailabilityFilter.
     *
     * @param AVAILABILITY AVAILABILITY
     */
    public AvailabilityFilter(
        CatalogsProductGroupMultipleStringCriteria AVAILABILITY
    ) {
        this.AVAILABILITY = AVAILABILITY;
    }



    /**
     * Get AVAILABILITY
     * @return AVAILABILITY
     */
    public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
        return AVAILABILITY;
    }

    public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
        this.AVAILABILITY = AVAILABILITY;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityFilter {\n");
        
        sb.append("    AVAILABILITY: ").append(toIndentedString(AVAILABILITY)).append("\n");
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

