package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 **/
@ApiModel(description = "  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).")
@JsonTypeName("AdGroupTrackingURLs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupTrackingURLs   {
  private @Valid List<String> audienceVerification = new ArrayList<>();
  private @Valid List<String> buyableButton = new ArrayList<>();
  private @Valid List<String> click = new ArrayList<>();
  private @Valid List<String> engagement = new ArrayList<>();
  private @Valid List<String> impression = new ArrayList<>();

  public AdGroupTrackingURLs() {
  }

  /**
   **/
  public AdGroupTrackingURLs audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audience_verification")
  public List<String> getAudienceVerification() {
    return audienceVerification;
  }

  @JsonProperty("audience_verification")
  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
  }

  public AdGroupTrackingURLs addAudienceVerificationItem(String audienceVerificationItem) {
    if (this.audienceVerification == null) {
      this.audienceVerification = new ArrayList<>();
    }

    this.audienceVerification.add(audienceVerificationItem);
    return this;
  }

  public AdGroupTrackingURLs removeAudienceVerificationItem(String audienceVerificationItem) {
    if (audienceVerificationItem != null && this.audienceVerification != null) {
      this.audienceVerification.remove(audienceVerificationItem);
    }

    return this;
  }
  /**
   **/
  public AdGroupTrackingURLs buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buyable_button")
  public List<String> getBuyableButton() {
    return buyableButton;
  }

  @JsonProperty("buyable_button")
  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  public AdGroupTrackingURLs addBuyableButtonItem(String buyableButtonItem) {
    if (this.buyableButton == null) {
      this.buyableButton = new ArrayList<>();
    }

    this.buyableButton.add(buyableButtonItem);
    return this;
  }

  public AdGroupTrackingURLs removeBuyableButtonItem(String buyableButtonItem) {
    if (buyableButtonItem != null && this.buyableButton != null) {
      this.buyableButton.remove(buyableButtonItem);
    }

    return this;
  }
  /**
   **/
  public AdGroupTrackingURLs click(List<String> click) {
    this.click = click;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("click")
  public List<String> getClick() {
    return click;
  }

  @JsonProperty("click")
  public void setClick(List<String> click) {
    this.click = click;
  }

  public AdGroupTrackingURLs addClickItem(String clickItem) {
    if (this.click == null) {
      this.click = new ArrayList<>();
    }

    this.click.add(clickItem);
    return this;
  }

  public AdGroupTrackingURLs removeClickItem(String clickItem) {
    if (clickItem != null && this.click != null) {
      this.click.remove(clickItem);
    }

    return this;
  }
  /**
   **/
  public AdGroupTrackingURLs engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("engagement")
  public List<String> getEngagement() {
    return engagement;
  }

  @JsonProperty("engagement")
  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  public AdGroupTrackingURLs addEngagementItem(String engagementItem) {
    if (this.engagement == null) {
      this.engagement = new ArrayList<>();
    }

    this.engagement.add(engagementItem);
    return this;
  }

  public AdGroupTrackingURLs removeEngagementItem(String engagementItem) {
    if (engagementItem != null && this.engagement != null) {
      this.engagement.remove(engagementItem);
    }

    return this;
  }
  /**
   **/
  public AdGroupTrackingURLs impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("impression")
  public List<String> getImpression() {
    return impression;
  }

  @JsonProperty("impression")
  public void setImpression(List<String> impression) {
    this.impression = impression;
  }

  public AdGroupTrackingURLs addImpressionItem(String impressionItem) {
    if (this.impression == null) {
      this.impression = new ArrayList<>();
    }

    this.impression.add(impressionItem);
    return this;
  }

  public AdGroupTrackingURLs removeImpressionItem(String impressionItem) {
    if (impressionItem != null && this.impression != null) {
      this.impression.remove(impressionItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
