package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupTrackingURLs   {
  
  private List<String> audienceVerification = new ArrayList<>();
  private List<String> buyableButton = new ArrayList<>();
  private List<String> click = new ArrayList<>();
  private List<String> engagement = new ArrayList<>();
  private List<String> impression = new ArrayList<>();

  public AdGroupTrackingURLs () {

  }

  public AdGroupTrackingURLs (List<String> audienceVerification, List<String> buyableButton, List<String> click, List<String> engagement, List<String> impression) {
    this.audienceVerification = audienceVerification;
    this.buyableButton = buyableButton;
    this.click = click;
    this.engagement = engagement;
    this.impression = impression;
  }

    
  @JsonProperty("audience_verification")
  public List<String> getAudienceVerification() {
    return audienceVerification;
  }
  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
  }

    
  @JsonProperty("buyable_button")
  public List<String> getBuyableButton() {
    return buyableButton;
  }
  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

    
  @JsonProperty("click")
  public List<String> getClick() {
    return click;
  }
  public void setClick(List<String> click) {
    this.click = click;
  }

    
  @JsonProperty("engagement")
  public List<String> getEngagement() {
    return engagement;
  }
  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

    
  @JsonProperty("impression")
  public List<String> getImpression() {
    return impression;
  }
  public void setImpression(List<String> impression) {
    this.impression = impression;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTrackingURLs adGroupTrackingURLs = (AdGroupTrackingURLs) o;
    return Objects.equals(audienceVerification, adGroupTrackingURLs.audienceVerification) &&
        Objects.equals(buyableButton, adGroupTrackingURLs.buyableButton) &&
        Objects.equals(click, adGroupTrackingURLs.click) &&
        Objects.equals(engagement, adGroupTrackingURLs.engagement) &&
        Objects.equals(impression, adGroupTrackingURLs.impression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceVerification, buyableButton, click, engagement, impression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTrackingURLs {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
