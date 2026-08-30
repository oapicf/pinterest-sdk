package org.openapitools.server.model;

import org.openapitools.server.model.TargetingTemplateAudienceSizingReachEstimate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
 */
public class TargetingTemplateAudienceSizing   {

    private TargetingTemplateAudienceSizingReachEstimate reachEstimate;

    /**
     * Default constructor.
     */
    public TargetingTemplateAudienceSizing() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingTemplateAudienceSizing.
     *
     * @param reachEstimate reachEstimate
     */
    public TargetingTemplateAudienceSizing(
        TargetingTemplateAudienceSizingReachEstimate reachEstimate
    ) {
        this.reachEstimate = reachEstimate;
    }



    /**
     * Get reachEstimate
     * @return reachEstimate
     */
    public TargetingTemplateAudienceSizingReachEstimate getReachEstimate() {
        return reachEstimate;
    }

    public void setReachEstimate(TargetingTemplateAudienceSizingReachEstimate reachEstimate) {
        this.reachEstimate = reachEstimate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingTemplateAudienceSizing {\n");
        
        sb.append("    reachEstimate: ").append(toIndentedString(reachEstimate)).append("\n");
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

