package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BidOptionsAgeBucketMultipliers;
import org.openapitools.server.model.BidOptionsAppTypeMultipliers;
import org.openapitools.server.model.BidOptionsAudienceMultipliers;
import org.openapitools.server.model.BidOptionsGenderMultipliers;
import org.openapitools.server.model.BidOptionsPlacementMultipliers;
import org.openapitools.server.model.ScheduleBidMultipliers;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The value of the scheduled adjustment.
 */
public class ScheduleDeltaValue   {

    private BidOptionsAgeBucketMultipliers ageBucketMultipliers;
    private BidOptionsAppTypeMultipliers appTypeMultipliers;
    private List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers = new ArrayList<>();
    private BidOptionsGenderMultipliers genderMultipliers;
    private BidOptionsPlacementMultipliers placementMultipliers;

    /**
     * Default constructor.
     */
    public ScheduleDeltaValue() {
    // JSON-B / Jackson
    }

    /**
     * Create ScheduleDeltaValue.
     *
     * @param ageBucketMultipliers ageBucketMultipliers
     * @param appTypeMultipliers appTypeMultipliers
     * @param audienceMultipliers audienceMultipliers
     * @param genderMultipliers genderMultipliers
     * @param placementMultipliers placementMultipliers
     */
    public ScheduleDeltaValue(
        BidOptionsAgeBucketMultipliers ageBucketMultipliers, 
        BidOptionsAppTypeMultipliers appTypeMultipliers, 
        List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers, 
        BidOptionsGenderMultipliers genderMultipliers, 
        BidOptionsPlacementMultipliers placementMultipliers
    ) {
        this.ageBucketMultipliers = ageBucketMultipliers;
        this.appTypeMultipliers = appTypeMultipliers;
        this.audienceMultipliers = audienceMultipliers;
        this.genderMultipliers = genderMultipliers;
        this.placementMultipliers = placementMultipliers;
    }



    /**
     * Get ageBucketMultipliers
     * @return ageBucketMultipliers
     */
    public BidOptionsAgeBucketMultipliers getAgeBucketMultipliers() {
        return ageBucketMultipliers;
    }

    public void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
        this.ageBucketMultipliers = ageBucketMultipliers;
    }

    /**
     * Get appTypeMultipliers
     * @return appTypeMultipliers
     */
    public BidOptionsAppTypeMultipliers getAppTypeMultipliers() {
        return appTypeMultipliers;
    }

    public void setAppTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
        this.appTypeMultipliers = appTypeMultipliers;
    }

    /**
     * Get audienceMultipliers
     * @return audienceMultipliers
     */
    public List<@Valid BidOptionsAudienceMultipliers> getAudienceMultipliers() {
        return audienceMultipliers;
    }

    public void setAudienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
        this.audienceMultipliers = audienceMultipliers;
    }

    /**
     * Get genderMultipliers
     * @return genderMultipliers
     */
    public BidOptionsGenderMultipliers getGenderMultipliers() {
        return genderMultipliers;
    }

    public void setGenderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
        this.genderMultipliers = genderMultipliers;
    }

    /**
     * Get placementMultipliers
     * @return placementMultipliers
     */
    public BidOptionsPlacementMultipliers getPlacementMultipliers() {
        return placementMultipliers;
    }

    public void setPlacementMultipliers(BidOptionsPlacementMultipliers placementMultipliers) {
        this.placementMultipliers = placementMultipliers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleDeltaValue {\n");
        
        sb.append("    ageBucketMultipliers: ").append(toIndentedString(ageBucketMultipliers)).append("\n");
        sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
        sb.append("    audienceMultipliers: ").append(toIndentedString(audienceMultipliers)).append("\n");
        sb.append("    genderMultipliers: ").append(toIndentedString(genderMultipliers)).append("\n");
        sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
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

