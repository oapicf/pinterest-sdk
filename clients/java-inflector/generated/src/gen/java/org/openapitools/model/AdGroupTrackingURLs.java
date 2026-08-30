package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 **/

@ApiModel(description = "  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupTrackingURLs   {
  @JsonProperty("audience_verification")
  private List<String> audienceVerification = null;

  @JsonProperty("buyable_button")
  private List<String> buyableButton = null;

  @JsonProperty("click")
  private List<String> click = null;

  @JsonProperty("engagement")
  private List<String> engagement = null;

  @JsonProperty("impression")
  private List<String> impression = null;

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
  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
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
  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
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
  public void setClick(List<String> click) {
    this.click = click;
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
  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
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

