package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 */
@ApiModel(description="  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).")

public class AdGroupTrackingURLs  {
  
  @ApiModelProperty(value = "")

  private List<String> audienceVerification = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<String> buyableButton = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<String> click = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<String> engagement = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<String> impression = new ArrayList<>();
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

  public AdGroupTrackingURLs audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  public AdGroupTrackingURLs addAudienceVerificationItem(String audienceVerificationItem) {
    this.audienceVerification.add(audienceVerificationItem);
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

  public AdGroupTrackingURLs buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  public AdGroupTrackingURLs addBuyableButtonItem(String buyableButtonItem) {
    this.buyableButton.add(buyableButtonItem);
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

  public AdGroupTrackingURLs click(List<String> click) {
    this.click = click;
    return this;
  }

  public AdGroupTrackingURLs addClickItem(String clickItem) {
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

  public AdGroupTrackingURLs engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  public AdGroupTrackingURLs addEngagementItem(String engagementItem) {
    this.engagement.add(engagementItem);
    return this;
  }

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

  public AdGroupTrackingURLs impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  public AdGroupTrackingURLs addImpressionItem(String impressionItem) {
    this.impression.add(impressionItem);
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
    AdGroupTrackingURLs adGroupTrackingURLs = (AdGroupTrackingURLs) o;
    return Objects.equals(this.audienceVerification, adGroupTrackingURLs.audienceVerification) &&
        Objects.equals(this.buyableButton, adGroupTrackingURLs.buyableButton) &&
        Objects.equals(this.click, adGroupTrackingURLs.click) &&
        Objects.equals(this.engagement, adGroupTrackingURLs.engagement) &&
        Objects.equals(this.impression, adGroupTrackingURLs.impression);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

