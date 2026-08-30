package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BidFloorSpec;
import org.openapitools.server.model.TargetingSpecOptimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class BidFloorCreate   {

    private List<@Valid BidFloorSpec> bidFloorSpecs = new ArrayList<>();
    private TargetingSpecOptimal targetingSpec;

    /**
     * Default constructor.
     */
    public BidFloorCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create BidFloorCreate.
     *
     * @param bidFloorSpecs List of bid floor specifications.
     * @param targetingSpec Ad group targeting specification defining the ad group target audience.
     */
    public BidFloorCreate(
        List<@Valid BidFloorSpec> bidFloorSpecs, 
        TargetingSpecOptimal targetingSpec
    ) {
        this.bidFloorSpecs = bidFloorSpecs;
        this.targetingSpec = targetingSpec;
    }



    /**
     * List of bid floor specifications.
     * @return bidFloorSpecs
     */
    public List<@Valid BidFloorSpec> getBidFloorSpecs() {
        return bidFloorSpecs;
    }

    public void setBidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
        this.bidFloorSpecs = bidFloorSpecs;
    }

    /**
     * Ad group targeting specification defining the ad group target audience.
     * @return targetingSpec
     */
    public TargetingSpecOptimal getTargetingSpec() {
        return targetingSpec;
    }

    public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
        this.targetingSpec = targetingSpec;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BidFloorCreate {\n");
        
        sb.append("    bidFloorSpecs: ").append(toIndentedString(bidFloorSpecs)).append("\n");
        sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
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

