package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Derived metrics for an ad campaign.
 */
public class CampaignDeliveryEstimatesDerivedMetrics   {

    private Float cpc;
    private Float cpcLower;
    private Float cpcUpper;
    private Float cpm;
    private Float cpmLower;
    private Float cpmUpper;
    private Float lifetimeFrequency;
    private Float lifetimeFrequencyLower;
    private Float lifetimeFrequencyUpper;
    private Float lifetimeImpression;
    private Float lifetimeImpressionLower;
    private Float lifetimeImpressionUpper;
    private Float lifetimeReach;
    private Float lifetimeReachLower;
    private Float lifetimeReachUpper;
    private Float weeklyClick;
    private Float weeklyClickLower;
    private Float weeklyClickUpper;
    private Float weeklyFrequency;
    private Float weeklyFrequencyLower;
    private Float weeklyFrequencyUpper;
    private Float weeklyImpression;
    private Float weeklyImpressionLower;
    private Float weeklyImpressionUpper;
    private Float weeklyReach;
    private Float weeklyReachLower;
    private Float weeklyReachUpper;

    /**
     * Default constructor.
     */
    public CampaignDeliveryEstimatesDerivedMetrics() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignDeliveryEstimatesDerivedMetrics.
     *
     * @param cpc Estimated cost per click.
     * @param cpcLower Lower estimate of the cost per click.
     * @param cpcUpper Upper estimate of the cost per click.
     * @param cpm Estimated cost per thousand impressions.
     * @param cpmLower Lower estimate of cost per thousand impressions.
     * @param cpmUpper Upper estimate of cost per thousand impressions.
     * @param lifetimeFrequency Estimated lifetime frequency.
     * @param lifetimeFrequencyLower Lower estimate of lifetime frequency.
     * @param lifetimeFrequencyUpper Upper estimate of lifetime frequency.
     * @param lifetimeImpression Estimated lifetime impressions.
     * @param lifetimeImpressionLower Lower estimate of lifetime impressions.
     * @param lifetimeImpressionUpper Upper estimate of lifetime impressions.
     * @param lifetimeReach Estimated lifetime reach.
     * @param lifetimeReachLower Lower estimate of lifetime reach.
     * @param lifetimeReachUpper Upper estimate of lifetime reach.
     * @param weeklyClick Estimated weekly clicks.
     * @param weeklyClickLower Lower estimate of weekly clicks.
     * @param weeklyClickUpper Upper estimate of weekly clicks.
     * @param weeklyFrequency Estimated weekly frequency.
     * @param weeklyFrequencyLower Lower estimate of weekly frequency.
     * @param weeklyFrequencyUpper Upper estimate of weekly frequency.
     * @param weeklyImpression Estimated weekly impressions.
     * @param weeklyImpressionLower Lower estimate of weekly impressions.
     * @param weeklyImpressionUpper Upper estimate of weekly impressions.
     * @param weeklyReach Estimated weekly reach.
     * @param weeklyReachLower Lower estimate of weekly reach.
     * @param weeklyReachUpper Upper estimate of weekly reach.
     */
    public CampaignDeliveryEstimatesDerivedMetrics(
        Float cpc, 
        Float cpcLower, 
        Float cpcUpper, 
        Float cpm, 
        Float cpmLower, 
        Float cpmUpper, 
        Float lifetimeFrequency, 
        Float lifetimeFrequencyLower, 
        Float lifetimeFrequencyUpper, 
        Float lifetimeImpression, 
        Float lifetimeImpressionLower, 
        Float lifetimeImpressionUpper, 
        Float lifetimeReach, 
        Float lifetimeReachLower, 
        Float lifetimeReachUpper, 
        Float weeklyClick, 
        Float weeklyClickLower, 
        Float weeklyClickUpper, 
        Float weeklyFrequency, 
        Float weeklyFrequencyLower, 
        Float weeklyFrequencyUpper, 
        Float weeklyImpression, 
        Float weeklyImpressionLower, 
        Float weeklyImpressionUpper, 
        Float weeklyReach, 
        Float weeklyReachLower, 
        Float weeklyReachUpper
    ) {
        this.cpc = cpc;
        this.cpcLower = cpcLower;
        this.cpcUpper = cpcUpper;
        this.cpm = cpm;
        this.cpmLower = cpmLower;
        this.cpmUpper = cpmUpper;
        this.lifetimeFrequency = lifetimeFrequency;
        this.lifetimeFrequencyLower = lifetimeFrequencyLower;
        this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
        this.lifetimeImpression = lifetimeImpression;
        this.lifetimeImpressionLower = lifetimeImpressionLower;
        this.lifetimeImpressionUpper = lifetimeImpressionUpper;
        this.lifetimeReach = lifetimeReach;
        this.lifetimeReachLower = lifetimeReachLower;
        this.lifetimeReachUpper = lifetimeReachUpper;
        this.weeklyClick = weeklyClick;
        this.weeklyClickLower = weeklyClickLower;
        this.weeklyClickUpper = weeklyClickUpper;
        this.weeklyFrequency = weeklyFrequency;
        this.weeklyFrequencyLower = weeklyFrequencyLower;
        this.weeklyFrequencyUpper = weeklyFrequencyUpper;
        this.weeklyImpression = weeklyImpression;
        this.weeklyImpressionLower = weeklyImpressionLower;
        this.weeklyImpressionUpper = weeklyImpressionUpper;
        this.weeklyReach = weeklyReach;
        this.weeklyReachLower = weeklyReachLower;
        this.weeklyReachUpper = weeklyReachUpper;
    }



    /**
     * Estimated cost per click.
     * @return cpc
     */
    public Float getCpc() {
        return cpc;
    }

    public void setCpc(Float cpc) {
        this.cpc = cpc;
    }

    /**
     * Lower estimate of the cost per click.
     * @return cpcLower
     */
    public Float getCpcLower() {
        return cpcLower;
    }

    public void setCpcLower(Float cpcLower) {
        this.cpcLower = cpcLower;
    }

    /**
     * Upper estimate of the cost per click.
     * @return cpcUpper
     */
    public Float getCpcUpper() {
        return cpcUpper;
    }

    public void setCpcUpper(Float cpcUpper) {
        this.cpcUpper = cpcUpper;
    }

    /**
     * Estimated cost per thousand impressions.
     * @return cpm
     */
    public Float getCpm() {
        return cpm;
    }

    public void setCpm(Float cpm) {
        this.cpm = cpm;
    }

    /**
     * Lower estimate of cost per thousand impressions.
     * @return cpmLower
     */
    public Float getCpmLower() {
        return cpmLower;
    }

    public void setCpmLower(Float cpmLower) {
        this.cpmLower = cpmLower;
    }

    /**
     * Upper estimate of cost per thousand impressions.
     * @return cpmUpper
     */
    public Float getCpmUpper() {
        return cpmUpper;
    }

    public void setCpmUpper(Float cpmUpper) {
        this.cpmUpper = cpmUpper;
    }

    /**
     * Estimated lifetime frequency.
     * @return lifetimeFrequency
     */
    public Float getLifetimeFrequency() {
        return lifetimeFrequency;
    }

    public void setLifetimeFrequency(Float lifetimeFrequency) {
        this.lifetimeFrequency = lifetimeFrequency;
    }

    /**
     * Lower estimate of lifetime frequency.
     * @return lifetimeFrequencyLower
     */
    public Float getLifetimeFrequencyLower() {
        return lifetimeFrequencyLower;
    }

    public void setLifetimeFrequencyLower(Float lifetimeFrequencyLower) {
        this.lifetimeFrequencyLower = lifetimeFrequencyLower;
    }

    /**
     * Upper estimate of lifetime frequency.
     * @return lifetimeFrequencyUpper
     */
    public Float getLifetimeFrequencyUpper() {
        return lifetimeFrequencyUpper;
    }

    public void setLifetimeFrequencyUpper(Float lifetimeFrequencyUpper) {
        this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
    }

    /**
     * Estimated lifetime impressions.
     * @return lifetimeImpression
     */
    public Float getLifetimeImpression() {
        return lifetimeImpression;
    }

    public void setLifetimeImpression(Float lifetimeImpression) {
        this.lifetimeImpression = lifetimeImpression;
    }

    /**
     * Lower estimate of lifetime impressions.
     * @return lifetimeImpressionLower
     */
    public Float getLifetimeImpressionLower() {
        return lifetimeImpressionLower;
    }

    public void setLifetimeImpressionLower(Float lifetimeImpressionLower) {
        this.lifetimeImpressionLower = lifetimeImpressionLower;
    }

    /**
     * Upper estimate of lifetime impressions.
     * @return lifetimeImpressionUpper
     */
    public Float getLifetimeImpressionUpper() {
        return lifetimeImpressionUpper;
    }

    public void setLifetimeImpressionUpper(Float lifetimeImpressionUpper) {
        this.lifetimeImpressionUpper = lifetimeImpressionUpper;
    }

    /**
     * Estimated lifetime reach.
     * @return lifetimeReach
     */
    public Float getLifetimeReach() {
        return lifetimeReach;
    }

    public void setLifetimeReach(Float lifetimeReach) {
        this.lifetimeReach = lifetimeReach;
    }

    /**
     * Lower estimate of lifetime reach.
     * @return lifetimeReachLower
     */
    public Float getLifetimeReachLower() {
        return lifetimeReachLower;
    }

    public void setLifetimeReachLower(Float lifetimeReachLower) {
        this.lifetimeReachLower = lifetimeReachLower;
    }

    /**
     * Upper estimate of lifetime reach.
     * @return lifetimeReachUpper
     */
    public Float getLifetimeReachUpper() {
        return lifetimeReachUpper;
    }

    public void setLifetimeReachUpper(Float lifetimeReachUpper) {
        this.lifetimeReachUpper = lifetimeReachUpper;
    }

    /**
     * Estimated weekly clicks.
     * @return weeklyClick
     */
    public Float getWeeklyClick() {
        return weeklyClick;
    }

    public void setWeeklyClick(Float weeklyClick) {
        this.weeklyClick = weeklyClick;
    }

    /**
     * Lower estimate of weekly clicks.
     * @return weeklyClickLower
     */
    public Float getWeeklyClickLower() {
        return weeklyClickLower;
    }

    public void setWeeklyClickLower(Float weeklyClickLower) {
        this.weeklyClickLower = weeklyClickLower;
    }

    /**
     * Upper estimate of weekly clicks.
     * @return weeklyClickUpper
     */
    public Float getWeeklyClickUpper() {
        return weeklyClickUpper;
    }

    public void setWeeklyClickUpper(Float weeklyClickUpper) {
        this.weeklyClickUpper = weeklyClickUpper;
    }

    /**
     * Estimated weekly frequency.
     * @return weeklyFrequency
     */
    public Float getWeeklyFrequency() {
        return weeklyFrequency;
    }

    public void setWeeklyFrequency(Float weeklyFrequency) {
        this.weeklyFrequency = weeklyFrequency;
    }

    /**
     * Lower estimate of weekly frequency.
     * @return weeklyFrequencyLower
     */
    public Float getWeeklyFrequencyLower() {
        return weeklyFrequencyLower;
    }

    public void setWeeklyFrequencyLower(Float weeklyFrequencyLower) {
        this.weeklyFrequencyLower = weeklyFrequencyLower;
    }

    /**
     * Upper estimate of weekly frequency.
     * @return weeklyFrequencyUpper
     */
    public Float getWeeklyFrequencyUpper() {
        return weeklyFrequencyUpper;
    }

    public void setWeeklyFrequencyUpper(Float weeklyFrequencyUpper) {
        this.weeklyFrequencyUpper = weeklyFrequencyUpper;
    }

    /**
     * Estimated weekly impressions.
     * @return weeklyImpression
     */
    public Float getWeeklyImpression() {
        return weeklyImpression;
    }

    public void setWeeklyImpression(Float weeklyImpression) {
        this.weeklyImpression = weeklyImpression;
    }

    /**
     * Lower estimate of weekly impressions.
     * @return weeklyImpressionLower
     */
    public Float getWeeklyImpressionLower() {
        return weeklyImpressionLower;
    }

    public void setWeeklyImpressionLower(Float weeklyImpressionLower) {
        this.weeklyImpressionLower = weeklyImpressionLower;
    }

    /**
     * Upper estimate of weekly impressions.
     * @return weeklyImpressionUpper
     */
    public Float getWeeklyImpressionUpper() {
        return weeklyImpressionUpper;
    }

    public void setWeeklyImpressionUpper(Float weeklyImpressionUpper) {
        this.weeklyImpressionUpper = weeklyImpressionUpper;
    }

    /**
     * Estimated weekly reach.
     * @return weeklyReach
     */
    public Float getWeeklyReach() {
        return weeklyReach;
    }

    public void setWeeklyReach(Float weeklyReach) {
        this.weeklyReach = weeklyReach;
    }

    /**
     * Lower estimate of weekly reach.
     * @return weeklyReachLower
     */
    public Float getWeeklyReachLower() {
        return weeklyReachLower;
    }

    public void setWeeklyReachLower(Float weeklyReachLower) {
        this.weeklyReachLower = weeklyReachLower;
    }

    /**
     * Upper estimate of weekly reach.
     * @return weeklyReachUpper
     */
    public Float getWeeklyReachUpper() {
        return weeklyReachUpper;
    }

    public void setWeeklyReachUpper(Float weeklyReachUpper) {
        this.weeklyReachUpper = weeklyReachUpper;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignDeliveryEstimatesDerivedMetrics {\n");
        
        sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
        sb.append("    cpcLower: ").append(toIndentedString(cpcLower)).append("\n");
        sb.append("    cpcUpper: ").append(toIndentedString(cpcUpper)).append("\n");
        sb.append("    cpm: ").append(toIndentedString(cpm)).append("\n");
        sb.append("    cpmLower: ").append(toIndentedString(cpmLower)).append("\n");
        sb.append("    cpmUpper: ").append(toIndentedString(cpmUpper)).append("\n");
        sb.append("    lifetimeFrequency: ").append(toIndentedString(lifetimeFrequency)).append("\n");
        sb.append("    lifetimeFrequencyLower: ").append(toIndentedString(lifetimeFrequencyLower)).append("\n");
        sb.append("    lifetimeFrequencyUpper: ").append(toIndentedString(lifetimeFrequencyUpper)).append("\n");
        sb.append("    lifetimeImpression: ").append(toIndentedString(lifetimeImpression)).append("\n");
        sb.append("    lifetimeImpressionLower: ").append(toIndentedString(lifetimeImpressionLower)).append("\n");
        sb.append("    lifetimeImpressionUpper: ").append(toIndentedString(lifetimeImpressionUpper)).append("\n");
        sb.append("    lifetimeReach: ").append(toIndentedString(lifetimeReach)).append("\n");
        sb.append("    lifetimeReachLower: ").append(toIndentedString(lifetimeReachLower)).append("\n");
        sb.append("    lifetimeReachUpper: ").append(toIndentedString(lifetimeReachUpper)).append("\n");
        sb.append("    weeklyClick: ").append(toIndentedString(weeklyClick)).append("\n");
        sb.append("    weeklyClickLower: ").append(toIndentedString(weeklyClickLower)).append("\n");
        sb.append("    weeklyClickUpper: ").append(toIndentedString(weeklyClickUpper)).append("\n");
        sb.append("    weeklyFrequency: ").append(toIndentedString(weeklyFrequency)).append("\n");
        sb.append("    weeklyFrequencyLower: ").append(toIndentedString(weeklyFrequencyLower)).append("\n");
        sb.append("    weeklyFrequencyUpper: ").append(toIndentedString(weeklyFrequencyUpper)).append("\n");
        sb.append("    weeklyImpression: ").append(toIndentedString(weeklyImpression)).append("\n");
        sb.append("    weeklyImpressionLower: ").append(toIndentedString(weeklyImpressionLower)).append("\n");
        sb.append("    weeklyImpressionUpper: ").append(toIndentedString(weeklyImpressionUpper)).append("\n");
        sb.append("    weeklyReach: ").append(toIndentedString(weeklyReach)).append("\n");
        sb.append("    weeklyReachLower: ").append(toIndentedString(weeklyReachLower)).append("\n");
        sb.append("    weeklyReachUpper: ").append(toIndentedString(weeklyReachUpper)).append("\n");
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

