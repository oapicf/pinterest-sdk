package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdgroupTrackingFeatureType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdgroupTrackingFeatures   {

    private List<AdgroupTrackingFeatureType> enabled = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AdgroupTrackingFeatures() {
    // JSON-B / Jackson
    }

    /**
     * Create AdgroupTrackingFeatures.
     *
     * @param enabled Tracking features. To clear this field, set to null.
     */
    public AdgroupTrackingFeatures(
        List<AdgroupTrackingFeatureType> enabled
    ) {
        this.enabled = enabled;
    }



    /**
     * Tracking features. To clear this field, set to null.
     * @return enabled
     */
    public List<AdgroupTrackingFeatureType> getEnabled() {
        return enabled;
    }

    public void setEnabled(List<AdgroupTrackingFeatureType> enabled) {
        this.enabled = enabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdgroupTrackingFeatures {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

