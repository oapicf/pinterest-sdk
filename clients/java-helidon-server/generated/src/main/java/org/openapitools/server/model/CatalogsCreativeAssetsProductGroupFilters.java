package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroupFilterKeys;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroupFiltersAllOf;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroupFiltersAnyOf;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object holding a group of filters for a creative assets product group
 */
public class CatalogsCreativeAssetsProductGroupFilters   {

    private List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf = new ArrayList<>();
    private List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsProductGroupFilters() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsProductGroupFilters.
     *
     * @param anyOf anyOf
     * @param allOf allOf
     */
    public CatalogsCreativeAssetsProductGroupFilters(
        List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf, 
        List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf
    ) {
        this.anyOf = anyOf;
        this.allOf = allOf;
    }



    /**
     * Get anyOf
     * @return anyOf
     */
    public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAnyOf() {
        return anyOf;
    }

    public void setAnyOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf) {
        this.anyOf = anyOf;
    }

    /**
     * Get allOf
     * @return allOf
     */
    public List<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf() {
        return allOf;
    }

    public void setAllOf(List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf) {
        this.allOf = allOf;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreativeAssetsProductGroupFilters {\n");
        
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

