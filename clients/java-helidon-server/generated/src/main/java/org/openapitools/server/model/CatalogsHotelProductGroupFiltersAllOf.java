package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CatalogsHotelProductGroupFilterKeys;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsHotelProductGroupFiltersAllOf   {

    private List<CatalogsHotelProductGroupFilterKeys> allOf = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsHotelProductGroupFiltersAllOf() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelProductGroupFiltersAllOf.
     *
     * @param allOf allOf
     */
    public CatalogsHotelProductGroupFiltersAllOf(
        List<CatalogsHotelProductGroupFilterKeys> allOf
    ) {
        this.allOf = allOf;
    }



    /**
     * Get allOf
     * @return allOf
     */
    public List<CatalogsHotelProductGroupFilterKeys> getAllOf() {
        return allOf;
    }

    public void setAllOf(List<CatalogsHotelProductGroupFilterKeys> allOf) {
        this.allOf = allOf;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelProductGroupFiltersAllOf {\n");
        
        sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
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

