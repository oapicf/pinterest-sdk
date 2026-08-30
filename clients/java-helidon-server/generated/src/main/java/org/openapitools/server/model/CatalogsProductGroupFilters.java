package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CatalogsProductGroupFilterKeys;
import org.openapitools.server.model.CatalogsProductGroupFiltersAllOf;
import org.openapitools.server.model.CatalogsProductGroupFiltersAnyOf;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object holding a group of filters for a catalog product group
 */
public class CatalogsProductGroupFilters   {

    private List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();
    private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsProductGroupFilters() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupFilters.
     *
     * @param anyOf anyOf
     * @param allOf allOf
     */
    public CatalogsProductGroupFilters(
        List<CatalogsProductGroupFilterKeys> anyOf, 
        List<CatalogsProductGroupFilterKeys> allOf
    ) {
        this.anyOf = anyOf;
        this.allOf = allOf;
    }



    /**
     * Get anyOf
     * @return anyOf
     */
    public List<CatalogsProductGroupFilterKeys> getAnyOf() {
        return anyOf;
    }

    public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
        this.anyOf = anyOf;
    }

    /**
     * Get allOf
     * @return allOf
     */
    public List<CatalogsProductGroupFilterKeys> getAllOf() {
        return allOf;
    }

    public void setAllOf(List<CatalogsProductGroupFilterKeys> allOf) {
        this.allOf = allOf;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupFilters {\n");
        
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

