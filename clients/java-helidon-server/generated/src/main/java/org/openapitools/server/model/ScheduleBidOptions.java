package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ScheduleAgeBucketMultipliers;
import org.openapitools.server.model.ScheduleAppTypeMultipliers;
import org.openapitools.server.model.ScheduleAudienceMultipliers;
import org.openapitools.server.model.ScheduleBidOptionsGenderMultipliers;
import org.openapitools.server.model.ScheduleBidOptionsPlacementMultipliers;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing the schedule level bid level changes.
 */
public class ScheduleBidOptions   {

    private ScheduleAgeBucketMultipliers ageBucketMultipliers;
    private ScheduleAppTypeMultipliers appTypeMultipliers;
    private ScheduleAudienceMultipliers audienceMultipliers;
    private ScheduleBidOptionsGenderMultipliers genderMultipliers;
    private ScheduleBidOptionsPlacementMultipliers placementMultipliers;

    /**
     * Default constructor.
     */
    public ScheduleBidOptions() {
    // JSON-B / Jackson
    }

    /**
     * Create ScheduleBidOptions.
     *
     * @param ageBucketMultipliers ageBucketMultipliers
     * @param appTypeMultipliers appTypeMultipliers
     * @param audienceMultipliers audienceMultipliers
     * @param genderMultipliers genderMultipliers
     * @param placementMultipliers placementMultipliers
     */
    public ScheduleBidOptions(
        ScheduleAgeBucketMultipliers ageBucketMultipliers, 
        ScheduleAppTypeMultipliers appTypeMultipliers, 
        ScheduleAudienceMultipliers audienceMultipliers, 
        ScheduleBidOptionsGenderMultipliers genderMultipliers, 
        ScheduleBidOptionsPlacementMultipliers placementMultipliers
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
    public ScheduleAgeBucketMultipliers getAgeBucketMultipliers() {
        return ageBucketMultipliers;
    }

    public void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
        this.ageBucketMultipliers = ageBucketMultipliers;
    }

    /**
     * Get appTypeMultipliers
     * @return appTypeMultipliers
     */
    public ScheduleAppTypeMultipliers getAppTypeMultipliers() {
        return appTypeMultipliers;
    }

    public void setAppTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
        this.appTypeMultipliers = appTypeMultipliers;
    }

    /**
     * Get audienceMultipliers
     * @return audienceMultipliers
     */
    public ScheduleAudienceMultipliers getAudienceMultipliers() {
        return audienceMultipliers;
    }

    public void setAudienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
        this.audienceMultipliers = audienceMultipliers;
    }

    /**
     * Get genderMultipliers
     * @return genderMultipliers
     */
    public ScheduleBidOptionsGenderMultipliers getGenderMultipliers() {
        return genderMultipliers;
    }

    public void setGenderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
        this.genderMultipliers = genderMultipliers;
    }

    /**
     * Get placementMultipliers
     * @return placementMultipliers
     */
    public ScheduleBidOptionsPlacementMultipliers getPlacementMultipliers() {
        return placementMultipliers;
    }

    public void setPlacementMultipliers(ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
        this.placementMultipliers = placementMultipliers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleBidOptions {\n");
        
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

