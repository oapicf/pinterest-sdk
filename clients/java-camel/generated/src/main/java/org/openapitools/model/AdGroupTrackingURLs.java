package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 */

@Schema(name = "AdGroupTrackingURLs", description = "  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupTrackingURLs {

  @Valid
  private List<String> audienceVerification = new ArrayList<>();

  @Valid
  private List<String> buyableButton = new ArrayList<>();

  @Valid
  private List<String> click = new ArrayList<>();

  @Valid
  private List<String> engagement = new ArrayList<>();

  @Valid
  private List<String> impression = new ArrayList<>();

  public AdGroupTrackingURLs audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  public AdGroupTrackingURLs addAudienceVerificationItem(String audienceVerificationItem) {
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
  
  @Schema(name = "audience_verification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audience_verification")
  public List<String> getAudienceVerification() {
    return audienceVerification;
  }

  public void setAudienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
  }

  public AdGroupTrackingURLs buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  public AdGroupTrackingURLs addBuyableButtonItem(String buyableButtonItem) {
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
  
  @Schema(name = "buyable_button", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyable_button")
  public List<String> getBuyableButton() {
    return buyableButton;
  }

  public void setBuyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
  }

  public AdGroupTrackingURLs click(List<String> click) {
    this.click = click;
    return this;
  }

  public AdGroupTrackingURLs addClickItem(String clickItem) {
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
  
  @Schema(name = "click", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click")
  public List<String> getClick() {
    return click;
  }

  public void setClick(List<String> click) {
    this.click = click;
  }

  public AdGroupTrackingURLs engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  public AdGroupTrackingURLs addEngagementItem(String engagementItem) {
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
  
  @Schema(name = "engagement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement")
  public List<String> getEngagement() {
    return engagement;
  }

  public void setEngagement(List<String> engagement) {
    this.engagement = engagement;
  }

  public AdGroupTrackingURLs impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  public AdGroupTrackingURLs addImpressionItem(String impressionItem) {
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
  
  @Schema(name = "impression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

