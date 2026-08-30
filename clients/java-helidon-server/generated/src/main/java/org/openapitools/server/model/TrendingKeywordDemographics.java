package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.TrendsAgeDistribution;
import org.openapitools.server.model.TrendsGenderDistribution;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
 */
public class TrendingKeywordDemographics   {

    private TrendsAgeDistribution ageDistribution;
    private TrendsGenderDistribution genderDistribution;

    /**
     * Default constructor.
     */
    public TrendingKeywordDemographics() {
    // JSON-B / Jackson
    }

    /**
     * Create TrendingKeywordDemographics.
     *
     * @param ageDistribution ageDistribution
     * @param genderDistribution genderDistribution
     */
    public TrendingKeywordDemographics(
        TrendsAgeDistribution ageDistribution, 
        TrendsGenderDistribution genderDistribution
    ) {
        this.ageDistribution = ageDistribution;
        this.genderDistribution = genderDistribution;
    }



    /**
     * Get ageDistribution
     * @return ageDistribution
     */
    public TrendsAgeDistribution getAgeDistribution() {
        return ageDistribution;
    }

    public void setAgeDistribution(TrendsAgeDistribution ageDistribution) {
        this.ageDistribution = ageDistribution;
    }

    /**
     * Get genderDistribution
     * @return genderDistribution
     */
    public TrendsGenderDistribution getGenderDistribution() {
        return genderDistribution;
    }

    public void setGenderDistribution(TrendsGenderDistribution genderDistribution) {
        this.genderDistribution = genderDistribution;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendingKeywordDemographics {\n");
        
        sb.append("    ageDistribution: ").append(toIndentedString(ageDistribution)).append("\n");
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

