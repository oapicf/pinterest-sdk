package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.GenderDemographics;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 */
public class ProductCategoriesDemographic   {

    private Map<String, BigDecimal> age = new HashMap<>();
    private GenderDemographics gender;

    /**
     * Default constructor.
     */
    public ProductCategoriesDemographic() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductCategoriesDemographic.
     *
     * @param age Age demographic distribution
     * @param gender gender
     */
    public ProductCategoriesDemographic(
        Map<String, BigDecimal> age, 
        GenderDemographics gender
    ) {
        this.age = age;
        this.gender = gender;
    }



    /**
     * Age demographic distribution
     * @return age
     */
    public Map<String, BigDecimal> getAge() {
        return age;
    }

    public void setAge(Map<String, BigDecimal> age) {
        this.age = age;
    }

    /**
     * Get gender
     * @return gender
     */
    public GenderDemographics getGender() {
        return gender;
    }

    public void setGender(GenderDemographics gender) {
        this.gender = gender;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductCategoriesDemographic {\n");
        
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

