package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CatalogsProductGroupFilterKeys;
import org.openapitools.server.model.CatalogsProductGroupFiltersRequestAnyOfItems0;
import org.openapitools.server.model.CatalogsProductGroupFiltersRequestAnyOfItems1;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 */
public class CatalogsProductGroupFiltersRequest   {

    private List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();
    private List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsProductGroupFiltersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupFiltersRequest.
     *
     * @param anyOf anyOf
     * @param allOf allOf
     */
    public CatalogsProductGroupFiltersRequest(
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
        sb.append("class CatalogsProductGroupFiltersRequest {\n");
        
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

