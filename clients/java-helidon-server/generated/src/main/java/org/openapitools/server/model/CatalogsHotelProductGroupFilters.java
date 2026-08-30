package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CatalogsHotelProductGroupFilterKeys;
import org.openapitools.server.model.CatalogsHotelProductGroupFiltersAllOf;
import org.openapitools.server.model.CatalogsHotelProductGroupFiltersAnyOf;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object holding a group of filters for a hotel product group
 */
public class CatalogsHotelProductGroupFilters   {

    private List<CatalogsHotelProductGroupFilterKeys> anyOf = new ArrayList<>();
    private List<CatalogsHotelProductGroupFilterKeys> allOf = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsHotelProductGroupFilters() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelProductGroupFilters.
     *
     * @param anyOf anyOf
     * @param allOf allOf
     */
    public CatalogsHotelProductGroupFilters(
        List<CatalogsHotelProductGroupFilterKeys> anyOf, 
        List<CatalogsHotelProductGroupFilterKeys> allOf
    ) {
        this.anyOf = anyOf;
        this.allOf = allOf;
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
        sb.append("class CatalogsHotelProductGroupFilters {\n");
        
        sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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

