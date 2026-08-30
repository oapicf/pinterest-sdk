package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CatalogsHotelProductGroupFilterKeys;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsHotelProductGroupFiltersAnyOf   {

    private List<CatalogsHotelProductGroupFilterKeys> anyOf = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsHotelProductGroupFiltersAnyOf() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelProductGroupFiltersAnyOf.
     *
     * @param anyOf anyOf
     */
    public CatalogsHotelProductGroupFiltersAnyOf(
        List<CatalogsHotelProductGroupFilterKeys> anyOf
    ) {
        this.anyOf = anyOf;
    }



    /**
     * Get anyOf
     * @return anyOf
     */
    public List<CatalogsHotelProductGroupFilterKeys> getAnyOf() {
        return anyOf;
    }

    public void setAnyOf(List<CatalogsHotelProductGroupFilterKeys> anyOf) {
        this.anyOf = anyOf;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelProductGroupFiltersAnyOf {\n");
        
        sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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

