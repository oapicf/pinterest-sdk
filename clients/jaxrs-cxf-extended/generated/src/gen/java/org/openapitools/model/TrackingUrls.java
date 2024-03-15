package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 */
@ApiModel(description="Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")

public class TrackingUrls  {
  
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
  */
  @JsonProperty("impression")
  public List<String> getImpression() {
    return impression;
  }

  /**
   * Sets the <code>impression</code> property.
   */
 public void setImpression(List<String> impression) {
    this.impression = impression;
  }

  /**
   * Sets the <code>impression</code> property.
   */
  public TrackingUrls impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  /**
   * Adds a new item to the <code>impression</code> list.
   */
  public TrackingUrls addImpressionItem(String impressionItem) {
    this.impression.add(impressionItem);
    return this;
  }

 /**
  * Get click
  * @return click
  */
  @JsonProperty("click")
  public List<String> getClick() {
    return click;
  }

  /**
   * Sets the <code>click</code> property.
   */
 public void setClick(List<String> click) {
    this.click = click;
  }

  /**
   * Sets the <code>click</code> property.
   */
  public TrackingUrls click(List<String> click) {
    this.click = click;
    return this;
  }

  /**
   * Adds a new item to the <code>click</code> list.
   */
  public TrackingUrls addClickItem(String clickItem) {
    this.click.add(clickItem);
    return this;
  }

 /**
  * Get engagement
  * @return engagement
  */
  @JsonProperty("engagement")
  public List<String> getEngagement() {
    return engagement;
  }

  /**
   * Sets the <code>engagement</code> property.
   */
 public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  /**
   * Sets the <code>engagement</code> property.
   */
  public TrackingUrls engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  /**
   * Adds a new item to the <code>engagement</code> list.
   */
  public TrackingUrls addEngagementItem(String engagementItem) {
    this.engagement.add(engagementItem);
    return this;
  }

 /**
  * Get buyableButton
  * @return buyableButton
  */
  @JsonProperty("buyable_button")
  public List<String> getBuyableButton() {
    return buyableButton;
  }

  /**
   * Sets the <code>buyableButton</code> property.
   */
 public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  /**
   * Sets the <code>buyableButton</code> property.
   */
  public TrackingUrls buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  /**
   * Adds a new item to the <code>buyableButton</code> list.
   */
  public TrackingUrls addBuyableButtonItem(String buyableButtonItem) {
    this.buyableButton.add(buyableButtonItem);
    return this;
  }

 /**
  * Get audienceVerification
  * @return audienceVerification
  */
  @JsonProperty("audience_verification")
  public List<String> getAudienceVerification() {
    return audienceVerification;
  }

  /**
   * Sets the <code>audienceVerification</code> property.
   */
 public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
  }

  /**
   * Sets the <code>audienceVerification</code> property.
   */
  public TrackingUrls audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  /**
   * Adds a new item to the <code>audienceVerification</code> list.
   */
  public TrackingUrls addAudienceVerificationItem(String audienceVerificationItem) {
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
    TrackingUrls trackingUrls = (TrackingUrls) o;
    return Objects.equals(this.impression, trackingUrls.impression) &&
        Objects.equals(this.click, trackingUrls.click) &&
        Objects.equals(this.engagement, trackingUrls.engagement) &&
        Objects.equals(this.buyableButton, trackingUrls.buyableButton) &&
        Objects.equals(this.audienceVerification, trackingUrls.audienceVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impression, click, engagement, buyableButton, audienceVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingUrls {\n");
    
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

