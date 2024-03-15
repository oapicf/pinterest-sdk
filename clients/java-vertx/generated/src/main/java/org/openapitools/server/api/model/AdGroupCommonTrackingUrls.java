package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupCommonTrackingUrls   {
  
  private List<String> impression;
  private List<String> click;
  private List<String> engagement;
  private List<String> buyableButton;
  private List<String> audienceVerification;

  public AdGroupCommonTrackingUrls () {

  }

  public AdGroupCommonTrackingUrls (List<String> impression, List<String> click, List<String> engagement, List<String> buyableButton, List<String> audienceVerification) {
    this.impression = impression;
    this.click = click;
    this.engagement = engagement;
    this.buyableButton = buyableButton;
    this.audienceVerification = audienceVerification;
  }

    
  @JsonProperty("impression")
  public List<String> getImpression() {
    return impression;
  }
  public void setImpression(List<String> impression) {
    this.impression = impression;
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

    
  @JsonProperty("buyable_button")
  public List<String> getBuyableButton() {
    return buyableButton;
  }
  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

    
  @JsonProperty("audience_verification")
  public List<String> getAudienceVerification() {
    return audienceVerification;
  }
  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCommonTrackingUrls adGroupCommonTrackingUrls = (AdGroupCommonTrackingUrls) o;
    return Objects.equals(impression, adGroupCommonTrackingUrls.impression) &&
        Objects.equals(click, adGroupCommonTrackingUrls.click) &&
        Objects.equals(engagement, adGroupCommonTrackingUrls.engagement) &&
        Objects.equals(buyableButton, adGroupCommonTrackingUrls.buyableButton) &&
        Objects.equals(audienceVerification, adGroupCommonTrackingUrls.audienceVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impression, click, engagement, buyableButton, audienceVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCommonTrackingUrls {\n");
    
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    engagement: ").append(toIndentedString(engagement)).append("\n");
    sb.append("    buyableButton: ").append(toIndentedString(buyableButton)).append("\n");
    sb.append("    audienceVerification: ").append(toIndentedString(audienceVerification)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
