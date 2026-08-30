package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleGenderCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GenderFilter   {

    private CatalogsProductGroupMultipleGenderCriteria GENDER;

    /**
     * Default constructor.
     */
    public GenderFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create GenderFilter.
     *
     * @param GENDER GENDER
     */
    public GenderFilter(
        CatalogsProductGroupMultipleGenderCriteria GENDER
    ) {
        this.GENDER = GENDER;
    }



    /**
     * Get GENDER
     * @return GENDER
     */
    public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
        return GENDER;
    }

    public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
        this.GENDER = GENDER;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenderFilter {\n");
        
        sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
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

