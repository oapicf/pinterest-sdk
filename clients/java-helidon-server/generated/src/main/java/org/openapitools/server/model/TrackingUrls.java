package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 */
public class TrackingUrls   {

    private List<String> audienceVerification = new ArrayList<>();
    private List<String> buyableButton = new ArrayList<>();
    private List<String> click = new ArrayList<>();
    private List<String> engagement = new ArrayList<>();
    private List<String> impression = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TrackingUrls() {
    // JSON-B / Jackson
    }

    /**
     * Create TrackingUrls.
     *
     * @param audienceVerification audienceVerification
     * @param buyableButton buyableButton
     * @param click click
     * @param engagement engagement
     * @param impression impression
     */
    public TrackingUrls(
        List<String> audienceVerification, 
        List<String> buyableButton, 
        List<String> click, 
        List<String> engagement, 
        List<String> impression
    ) {
        this.audienceVerification = audienceVerification;
        this.buyableButton = buyableButton;
        this.click = click;
        this.engagement = engagement;
        this.impression = impression;
    }



    /**
     * Get audienceVerification
     * @return audienceVerification
     */
    public List<String> getAudienceVerification() {
        return audienceVerification;
    }

    public void setAudienceVerification(List<String> audienceVerification) {
        this.audienceVerification = audienceVerification;
    }

    /**
     * Get buyableButton
     * @return buyableButton
     */
    public List<String> getBuyableButton() {
        return buyableButton;
    }

    public void setBuyableButton(List<String> buyableButton) {
        this.buyableButton = buyableButton;
    }

    /**
     * Get click
     * @return click
     */
    public List<String> getClick() {
        return click;
    }

    public void setClick(List<String> click) {
        this.click = click;
    }

    /**
     * Get engagement
     * @return engagement
     */
    public List<String> getEngagement() {
        return engagement;
    }

    public void setEngagement(List<String> engagement) {
        this.engagement = engagement;
    }

    /**
     * Get impression
     * @return impression
     */
    public List<String> getImpression() {
        return impression;
    }

    public void setImpression(List<String> impression) {
        this.impression = impression;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackingUrls {\n");
        
        sb.append("    audienceVerification: ").append(toIndentedString(audienceVerification)).append("\n");
        sb.append("    buyableButton: ").append(toIndentedString(buyableButton)).append("\n");
        sb.append("    click: ").append(toIndentedString(click)).append("\n");
        sb.append("    engagement: ").append(toIndentedString(engagement)).append("\n");
        sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
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

