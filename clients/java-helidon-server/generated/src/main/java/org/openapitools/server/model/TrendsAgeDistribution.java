package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.TrendsAgeBucket;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
public class TrendsAgeDistribution extends HashMap<String, Double>  {

    private TrendsAgeBucket ageDistribution;

    /**
     * Default constructor.
     */
    public TrendsAgeDistribution() {
    // JSON-B / Jackson
    }

    /**
     * Create TrendsAgeDistribution.
     *
     * @param ageDistribution ageDistribution
     */
    public TrendsAgeDistribution(
        TrendsAgeBucket ageDistribution
    ) {
        this.ageDistribution = ageDistribution;
    }



    /**
     * Get ageDistribution
     * @return ageDistribution
     */
    public TrendsAgeBucket getAgeDistribution() {
        return ageDistribution;
    }

    public void setAgeDistribution(TrendsAgeBucket ageDistribution) {
        this.ageDistribution = ageDistribution;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendsAgeDistribution {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    ageDistribution: ").append(toIndentedString(ageDistribution)).append("\n");
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

