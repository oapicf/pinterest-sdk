package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TargetingTemplateAudienceSizingReachEstimate   {

    private Long estimate;
    private Long lowerBound;
    private Long upperBound;

    /**
     * Default constructor.
     */
    public TargetingTemplateAudienceSizingReachEstimate() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingTemplateAudienceSizingReachEstimate.
     *
     * @param estimate estimate
     * @param lowerBound lowerBound
     * @param upperBound upperBound
     */
    public TargetingTemplateAudienceSizingReachEstimate(
        Long estimate, 
        Long lowerBound, 
        Long upperBound
    ) {
        this.estimate = estimate;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }



    /**
     * Get estimate
     * @return estimate
     */
    public Long getEstimate() {
        return estimate;
    }

    public void setEstimate(Long estimate) {
        this.estimate = estimate;
    }

    /**
     * Get lowerBound
     * @return lowerBound
     */
    public Long getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Long lowerBound) {
        this.lowerBound = lowerBound;
    }

    /**
     * Get upperBound
     * @return upperBound
     */
    public Long getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(Long upperBound) {
        this.upperBound = upperBound;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingTemplateAudienceSizingReachEstimate {\n");
        
        sb.append("    estimate: ").append(toIndentedString(estimate)).append("\n");
        sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
        sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
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

