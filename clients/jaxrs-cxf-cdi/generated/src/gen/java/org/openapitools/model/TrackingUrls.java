package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
public class TrackingUrls   {
  
  private List<String> impression = null;

  private List<String> click = null;

  private List<String> engagement = null;

  private List<String> buyableButton = null;

  private List<String> audienceVerification = null;


  /**
   **/
  public TrackingUrls impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("impression")
 @Size(max=3)  public List<String> getImpression() {
    return impression;
  }
  public void setImpression(List<String> impression) {
    this.impression = impression;
  }

  public TrackingUrls addImpressionItem(String impressionItem) {
    if (this.impression == null) {
      this.impression = new ArrayList<String>();
    }
    this.impression.add(impressionItem);
    return this;
  }


  /**
   **/
  public TrackingUrls click(List<String> click) {
    this.click = click;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("click")
 @Size(max=3)  public List<String> getClick() {
    return click;
  }
  public void setClick(List<String> click) {
    this.click = click;
  }

  public TrackingUrls addClickItem(String clickItem) {
    if (this.click == null) {
      this.click = new ArrayList<String>();
    }
    this.click.add(clickItem);
    return this;
  }


  /**
   **/
  public TrackingUrls engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("engagement")
 @Size(max=3)  public List<String> getEngagement() {
    return engagement;
  }
  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  public TrackingUrls addEngagementItem(String engagementItem) {
    if (this.engagement == null) {
      this.engagement = new ArrayList<String>();
    }
    this.engagement.add(engagementItem);
    return this;
  }


  /**
   **/
  public TrackingUrls buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buyable_button")
 @Size(max=3)  public List<String> getBuyableButton() {
    return buyableButton;
  }
  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  public TrackingUrls addBuyableButtonItem(String buyableButtonItem) {
    if (this.buyableButton == null) {
      this.buyableButton = new ArrayList<String>();
    }
    this.buyableButton.add(buyableButtonItem);
    return this;
  }


  /**
   **/
  public TrackingUrls audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audience_verification")
 @Size(max=3)  public List<String> getAudienceVerification() {
    return audienceVerification;
  }
  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
  }

  public TrackingUrls addAudienceVerificationItem(String audienceVerificationItem) {
    if (this.audienceVerification == null) {
      this.audienceVerification = new ArrayList<String>();
    }
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
    return Objects.equals(impression, trackingUrls.impression) &&
        Objects.equals(click, trackingUrls.click) &&
        Objects.equals(engagement, trackingUrls.engagement) &&
        Objects.equals(buyableButton, trackingUrls.buyableButton) &&
        Objects.equals(audienceVerification, trackingUrls.audienceVerification);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

