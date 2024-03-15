package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 **/
@ApiModel(description="Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")

public class AdGroupCommonTrackingUrls  {
  
  @ApiModelProperty(value = "")
  private List<String> impression;

  @ApiModelProperty(value = "")
  private List<String> click;

  @ApiModelProperty(value = "")
  private List<String> engagement;

  @ApiModelProperty(value = "")
  private List<String> buyableButton;

  @ApiModelProperty(value = "")
  private List<String> audienceVerification;
 /**
   * Get impression
   * @return impression
  **/
  @JsonProperty("impression")
  public List<String> getImpression() {
    return impression;
  }

  public void setImpression(List<String> impression) {
    this.impression = impression;
  }

  public AdGroupCommonTrackingUrls impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  public AdGroupCommonTrackingUrls addImpressionItem(String impressionItem) {
    this.impression.add(impressionItem);
    return this;
  }

 /**
   * Get click
   * @return click
  **/
  @JsonProperty("click")
  public List<String> getClick() {
    return click;
  }

  public void setClick(List<String> click) {
    this.click = click;
  }

  public AdGroupCommonTrackingUrls click(List<String> click) {
    this.click = click;
    return this;
  }

  public AdGroupCommonTrackingUrls addClickItem(String clickItem) {
    this.click.add(clickItem);
    return this;
  }

 /**
   * Get engagement
   * @return engagement
  **/
  @JsonProperty("engagement")
  public List<String> getEngagement() {
    return engagement;
  }

  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  public AdGroupCommonTrackingUrls engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  public AdGroupCommonTrackingUrls addEngagementItem(String engagementItem) {
    this.engagement.add(engagementItem);
    return this;
  }

 /**
   * Get buyableButton
   * @return buyableButton
  **/
  @JsonProperty("buyable_button")
  public List<String> getBuyableButton() {
    return buyableButton;
  }

  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  public AdGroupCommonTrackingUrls buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  public AdGroupCommonTrackingUrls addBuyableButtonItem(String buyableButtonItem) {
    this.buyableButton.add(buyableButtonItem);
    return this;
  }

 /**
   * Get audienceVerification
   * @return audienceVerification
  **/
  @JsonProperty("audience_verification")
  public List<String> getAudienceVerification() {
    return audienceVerification;
  }

  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
  }

  public AdGroupCommonTrackingUrls audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  public AdGroupCommonTrackingUrls addAudienceVerificationItem(String audienceVerificationItem) {
    this.audienceVerification.add(audienceVerificationItem);
    return this;
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
    return Objects.equals(this.impression, adGroupCommonTrackingUrls.impression) &&
        Objects.equals(this.click, adGroupCommonTrackingUrls.click) &&
        Objects.equals(this.engagement, adGroupCommonTrackingUrls.engagement) &&
        Objects.equals(this.buyableButton, adGroupCommonTrackingUrls.buyableButton) &&
        Objects.equals(this.audienceVerification, adGroupCommonTrackingUrls.audienceVerification);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

