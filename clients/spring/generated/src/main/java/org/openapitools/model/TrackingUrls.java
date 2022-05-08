package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
 */

@Schema(name = "TrackingUrls", description = "Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-08T00:42:02.037116Z[Etc/UTC]")
public class TrackingUrls   {

  @JsonProperty("impression")
  @Valid
  private List<String> impression = null;

  @JsonProperty("click")
  @Valid
  private List<String> click = null;

  @JsonProperty("engagement")
  @Valid
  private List<String> engagement = null;

  @JsonProperty("buyable_button")
  @Valid
  private List<String> buyableButton = null;

  @JsonProperty("audience_verification")
  @Valid
  private List<String> audienceVerification = null;

  public TrackingUrls impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  public TrackingUrls addImpressionItem(String impressionItem) {
    if (this.impression == null) {
      this.impression = new ArrayList<>();
    }
    this.impression.add(impressionItem);
    return this;
  }

  /**
   * Get impression
   * @return impression
  */
  @Size(max = 3) 
  @Schema(name = "impression", required = false)
  public List<String> getImpression() {
    return impression;
  }

  public void setImpression(List<String> impression) {
    this.impression = impression;
  }

  public TrackingUrls click(List<String> click) {
    this.click = click;
    return this;
  }

  public TrackingUrls addClickItem(String clickItem) {
    if (this.click == null) {
      this.click = new ArrayList<>();
    }
    this.click.add(clickItem);
    return this;
  }

  /**
   * Get click
   * @return click
  */
  @Size(max = 3) 
  @Schema(name = "click", required = false)
  public List<String> getClick() {
    return click;
  }

  public void setClick(List<String> click) {
    this.click = click;
  }

  public TrackingUrls engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  public TrackingUrls addEngagementItem(String engagementItem) {
    if (this.engagement == null) {
      this.engagement = new ArrayList<>();
    }
    this.engagement.add(engagementItem);
    return this;
  }

  /**
   * Get engagement
   * @return engagement
  */
  @Size(max = 3) 
  @Schema(name = "engagement", required = false)
  public List<String> getEngagement() {
    return engagement;
  }

  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  public TrackingUrls buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  public TrackingUrls addBuyableButtonItem(String buyableButtonItem) {
    if (this.buyableButton == null) {
      this.buyableButton = new ArrayList<>();
    }
    this.buyableButton.add(buyableButtonItem);
    return this;
  }

  /**
   * Get buyableButton
   * @return buyableButton
  */
  @Size(max = 3) 
  @Schema(name = "buyable_button", required = false)
  public List<String> getBuyableButton() {
    return buyableButton;
  }

  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  public TrackingUrls audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  public TrackingUrls addAudienceVerificationItem(String audienceVerificationItem) {
    if (this.audienceVerification == null) {
      this.audienceVerification = new ArrayList<>();
    }
    this.audienceVerification.add(audienceVerificationItem);
    return this;
  }

  /**
   * Get audienceVerification
   * @return audienceVerification
  */
  @Size(max = 3) 
  @Schema(name = "audience_verification", required = false)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

