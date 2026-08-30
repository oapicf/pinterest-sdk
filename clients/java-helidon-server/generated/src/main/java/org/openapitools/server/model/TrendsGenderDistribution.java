package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.TrendsGender;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
public class TrendsGenderDistribution extends HashMap<String, Double>  {

    private TrendsGender genderDistribution;

    /**
     * Default constructor.
     */
    public TrendsGenderDistribution() {
    // JSON-B / Jackson
    }

    /**
     * Create TrendsGenderDistribution.
     *
     * @param genderDistribution genderDistribution
     */
    public TrendsGenderDistribution(
        TrendsGender genderDistribution
    ) {
        this.genderDistribution = genderDistribution;
    }



    /**
     * Get genderDistribution
     * @return genderDistribution
     */
    public TrendsGender getGenderDistribution() {
        return genderDistribution;
    }

    public void setGenderDistribution(TrendsGender genderDistribution) {
        this.genderDistribution = genderDistribution;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendsGenderDistribution {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    genderDistribution: ").append(toIndentedString(genderDistribution)).append("\n");
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

