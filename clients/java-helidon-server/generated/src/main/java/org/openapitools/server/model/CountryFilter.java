package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleCountriesCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CountryFilter   {

    private CatalogsProductGroupMultipleCountriesCriteria COUNTRY;

    /**
     * Default constructor.
     */
    public CountryFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create CountryFilter.
     *
     * @param COUNTRY COUNTRY
     */
    public CountryFilter(
        CatalogsProductGroupMultipleCountriesCriteria COUNTRY
    ) {
        this.COUNTRY = COUNTRY;
    }



    /**
     * Get COUNTRY
     * @return COUNTRY
     */
    public CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountryFilter {\n");
        
        sb.append("    COUNTRY: ").append(toIndentedString(COUNTRY)).append("\n");
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

