package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AgeBucketMultipliers;
import org.openapitools.server.model.AppTypeMultipliers;
import org.openapitools.server.model.CampaignAudienceMultipliers;
import org.openapitools.server.model.CampaignBidOptionsUpdateMaskItems;
import org.openapitools.server.model.FreqBidMultiplierTimeWindow;
import org.openapitools.server.model.FrequencyMultipliers;
import org.openapitools.server.model.GenderMultipliers;
import org.openapitools.server.model.PlacementMultipliers;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing an update to the campaign level bid multipliers.
 */
public class CampaignBidOptionsUpdate   {

    private AgeBucketMultipliers ageBucketMultipliers;
    private AppTypeMultipliers appTypeMultipliers;
    private CampaignAudienceMultipliers audienceMultipliers;
    private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;
    private FrequencyMultipliers frequencyMultipliers;
    private GenderMultipliers genderMultipliers;
    private PlacementMultipliers placementMultipliers;
    private List<CampaignBidOptionsUpdateMaskItems> updateMask = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CampaignBidOptionsUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignBidOptionsUpdate.
     *
     * @param ageBucketMultipliers Age bucket multipliers for bid adjustments.
     * @param appTypeMultipliers App type multipliers for bid adjustments.
     * @param audienceMultipliers Audience multipliers for bid adjustments.
     * @param freqBidMultiplierTimeWindow The time window for frequency bid multipliers.
     * @param frequencyMultipliers Frequency multipliers for bid adjustments.
     * @param genderMultipliers Gender multipliers for bid adjustments.
     * @param placementMultipliers Placement multipliers for bid adjustments.
     * @param updateMask List of fields to update. Only the fields in the list will be updated.
     */
    public CampaignBidOptionsUpdate(
        AgeBucketMultipliers ageBucketMultipliers, 
        AppTypeMultipliers appTypeMultipliers, 
        CampaignAudienceMultipliers audienceMultipliers, 
        FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow, 
        FrequencyMultipliers frequencyMultipliers, 
        GenderMultipliers genderMultipliers, 
        PlacementMultipliers placementMultipliers, 
        List<CampaignBidOptionsUpdateMaskItems> updateMask
    ) {
        this.ageBucketMultipliers = ageBucketMultipliers;
        this.appTypeMultipliers = appTypeMultipliers;
        this.audienceMultipliers = audienceMultipliers;
        this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
        this.frequencyMultipliers = frequencyMultipliers;
        this.genderMultipliers = genderMultipliers;
        this.placementMultipliers = placementMultipliers;
        this.updateMask = updateMask;
    }



    /**
     * Age bucket multipliers for bid adjustments.
     * @return ageBucketMultipliers
     */
    public AgeBucketMultipliers getAgeBucketMultipliers() {
        return ageBucketMultipliers;
    }

    public void setAgeBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
        this.ageBucketMultipliers = ageBucketMultipliers;
    }

    /**
     * App type multipliers for bid adjustments.
     * @return appTypeMultipliers
     */
    public AppTypeMultipliers getAppTypeMultipliers() {
        return appTypeMultipliers;
    }

    public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
        this.appTypeMultipliers = appTypeMultipliers;
    }

    /**
     * Audience multipliers for bid adjustments.
     * @return audienceMultipliers
     */
    public CampaignAudienceMultipliers getAudienceMultipliers() {
        return audienceMultipliers;
    }

    public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
        this.audienceMultipliers = audienceMultipliers;
    }

    /**
     * The time window for frequency bid multipliers.
     * @return freqBidMultiplierTimeWindow
     */
    public FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow() {
        return freqBidMultiplierTimeWindow;
    }

    public void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
        this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
    }

    /**
     * Frequency multipliers for bid adjustments.
     * @return frequencyMultipliers
     */
    public FrequencyMultipliers getFrequencyMultipliers() {
        return frequencyMultipliers;
    }

    public void setFrequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
        this.frequencyMultipliers = frequencyMultipliers;
    }

    /**
     * Gender multipliers for bid adjustments.
     * @return genderMultipliers
     */
    public GenderMultipliers getGenderMultipliers() {
        return genderMultipliers;
    }

    public void setGenderMultipliers(GenderMultipliers genderMultipliers) {
        this.genderMultipliers = genderMultipliers;
    }

    /**
     * Placement multipliers for bid adjustments.
     * @return placementMultipliers
     */
    public PlacementMultipliers getPlacementMultipliers() {
        return placementMultipliers;
    }

    public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
        this.placementMultipliers = placementMultipliers;
    }

    /**
     * List of fields to update. Only the fields in the list will be updated.
     * @return updateMask
     */
    public List<CampaignBidOptionsUpdateMaskItems> getUpdateMask() {
        return updateMask;
    }

    public void setUpdateMask(List<CampaignBidOptionsUpdateMaskItems> updateMask) {
        this.updateMask = updateMask;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignBidOptionsUpdate {\n");
        
        sb.append("    ageBucketMultipliers: ").append(toIndentedString(ageBucketMultipliers)).append("\n");
        sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
        sb.append("    audienceMultipliers: ").append(toIndentedString(audienceMultipliers)).append("\n");
        sb.append("    freqBidMultiplierTimeWindow: ").append(toIndentedString(freqBidMultiplierTimeWindow)).append("\n");
        sb.append("    frequencyMultipliers: ").append(toIndentedString(frequencyMultipliers)).append("\n");
        sb.append("    genderMultipliers: ").append(toIndentedString(genderMultipliers)).append("\n");
        sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
        sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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

