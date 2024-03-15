package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdCommonTrackingUrls
 */

@JsonTypeName("AdCommon_tracking_urls")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdCommonTrackingUrls {

  @Valid
  private List<String> impression;

  @Valid
  private List<String> click;

  @Valid
  private List<String> engagement;

  @Valid
  private List<String> buyableButton;

  @Valid
  private List<String> audienceVerification;

  public AdCommonTrackingUrls impression(List<String> impression) {
    this.impression = impression;
    return this;
  }

  public AdCommonTrackingUrls addImpressionItem(String impressionItem) {
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

  public AdCommonTrackingUrls click(List<String> click) {
    this.click = click;
    return this;
  }

  public AdCommonTrackingUrls addClickItem(String clickItem) {
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

  public AdCommonTrackingUrls engagement(List<String> engagement) {
    this.engagement = engagement;
    return this;
  }

  public AdCommonTrackingUrls addEngagementItem(String engagementItem) {
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

  public AdCommonTrackingUrls buyableButton(List<String> buyableButton) {
    this.buyableButton = buyableButton;
    return this;
  }

  public AdCommonTrackingUrls addBuyableButtonItem(String buyableButtonItem) {
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

  public AdCommonTrackingUrls audienceVerification(List<String> audienceVerification) {
    this.audienceVerification = audienceVerification;
    return this;
  }

  public AdCommonTrackingUrls addAudienceVerificationItem(String audienceVerificationItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdCommonTrackingUrls adCommonTrackingUrls = (AdCommonTrackingUrls) o;
    return Objects.equals(this.impression, adCommonTrackingUrls.impression) &&
        Objects.equals(this.click, adCommonTrackingUrls.click) &&
        Objects.equals(this.engagement, adCommonTrackingUrls.engagement) &&
        Objects.equals(this.buyableButton, adCommonTrackingUrls.buyableButton) &&
        Objects.equals(this.audienceVerification, adCommonTrackingUrls.audienceVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impression, click, engagement, buyableButton, audienceVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdCommonTrackingUrls {\n");
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

